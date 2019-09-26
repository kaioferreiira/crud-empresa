package br.com.empresa.impl.business.service.v3;

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
import br.com.empresa.impl.business.repository.V3.FuncionarioRepositoryV3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FuncionarioServiceImplV3 implements FuncionarioServiceV3 {


    private FuncionarioRepositoryV3 funcionarioRepository;

    @Autowired
    public FuncionarioServiceImplV3(FuncionarioRepositoryV3 funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public List<FuncionarioDTOV3> buscaFuncionariosList() {
        List<FuncionarioV3> listaFuncionarios = funcionarioRepository.findAll();
        List<FuncionarioDTOV3> listFuncionarioDTOV3 = listaFuncionarios.stream().map(FuncionarioConverter::toDTOV3).collect(Collectors.toList());
        return listFuncionarioDTOV3;
    }


    @Override
    public void adicionaFuncionario(FuncionarioDTOV3 funcionarioDTOV3) {
        saveEntity(FuncionarioConverter.toEntityV3(funcionarioDTOV3));
    }

    private void saveEntity(FuncionarioV3 funcionario) {
        funcionarioRepository.save(funcionario);
    }



}
