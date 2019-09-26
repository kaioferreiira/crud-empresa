package br.com.empresa.impl.business.service.v4;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import br.com.empresa.impl.business.dto.FuncionarioDTOV3;
import br.com.empresa.impl.business.dto.FuncionarioDTOV4;
import br.com.empresa.impl.business.entity.V1.Funcionario;
import br.com.empresa.impl.business.entity.V3.FuncionarioV3;
import br.com.empresa.impl.business.entity.V4.FuncionarioV4;
import br.com.empresa.impl.business.entity.converter.FuncionarioConverter;
import br.com.empresa.impl.business.exception.FuncionarioExceptionMessage;
import br.com.empresa.impl.business.exception.exceptions.ObjectNotFoundException;
import br.com.empresa.impl.business.repository.V1.FuncionarioRepository;
import br.com.empresa.impl.business.repository.V4.FuncionarioRepositoryV4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FuncionarioServiceImplV4 implements FuncionarioServiceV4 {


    private FuncionarioRepositoryV4 funcionarioRepository;

    @Autowired
    public FuncionarioServiceImplV4(FuncionarioRepositoryV4 funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public List<FuncionarioDTOV4> buscaFuncionariosList() {
        List<FuncionarioV4> listaFuncionarios = funcionarioRepository.findAll();
        List<FuncionarioDTOV4> listFuncionarioDTOV4 = listaFuncionarios.stream().map(FuncionarioConverter::toDTOV4).collect(Collectors.toList());
        return listFuncionarioDTOV4;
    }


    @Override
    public void adicionaFuncionario(FuncionarioDTOV4 funcionarioDTOV4) {
        saveEntity(FuncionarioConverter.toEntityV4(funcionarioDTOV4));
    }

    private void saveEntity(FuncionarioV4 funcionario) {
        funcionarioRepository.save(funcionario);
    }


}
