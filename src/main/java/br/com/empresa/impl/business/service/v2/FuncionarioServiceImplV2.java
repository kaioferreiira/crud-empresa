package br.com.empresa.impl.business.service.v2;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import br.com.empresa.impl.business.dto.FuncionarioDTOV2;
import br.com.empresa.impl.business.entity.V1.Funcionario;
import br.com.empresa.impl.business.entity.V2.FuncionarioV2;
import br.com.empresa.impl.business.entity.converter.FuncionarioConverter;
import br.com.empresa.impl.business.repository.V1.FuncionarioRepository;
import br.com.empresa.impl.business.repository.V2.FuncionarioRepositoryV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FuncionarioServiceImplV2 implements FuncionarioServiceV2 {


    private FuncionarioRepositoryV2 funcionarioRepositoryV2;

    @Autowired
    public FuncionarioServiceImplV2(FuncionarioRepositoryV2 funcionarioRepository) {
        this.funcionarioRepositoryV2 = funcionarioRepository;
    }

    @Override
    public List<FuncionarioDTOV2> buscaFuncionariosList() {
        List<FuncionarioV2> listaFuncionarios = funcionarioRepositoryV2.findAll();
        List<FuncionarioDTOV2> listFuncionarioDTOV2 = listaFuncionarios.stream().map(FuncionarioConverter::toDTOV2).collect(Collectors.toList());
        return listFuncionarioDTOV2;
    }


    @Override
    public void adicionaFuncionario(FuncionarioDTOV2 funcionarioDTOV2) {
        saveEntity(FuncionarioConverter.toEntityV2(funcionarioDTOV2));
    }
    private void saveEntity(FuncionarioV2 funcionarioV2) {
        funcionarioRepositoryV2.save(funcionarioV2);
    }
}


