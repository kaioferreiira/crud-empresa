package br.com.empresa.impl.business.service.V5;

import br.com.empresa.impl.business.dto.FuncionarioDTOV5;
import br.com.empresa.impl.business.entity.V5.FuncionarioV5;
import br.com.empresa.impl.business.entity.converter.FuncionarioConverter;
import br.com.empresa.impl.business.repository.V5.FuncionarioRepositoryV5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FuncionarioServiceImplV5 implements FuncionarioServiceV5 {


    private FuncionarioRepositoryV5 funcionarioRepository;

    @Autowired
    public FuncionarioServiceImplV5(FuncionarioRepositoryV5 funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public List<FuncionarioDTOV5> buscaFuncionariosList() {
        List<FuncionarioV5> listaFuncionarios = funcionarioRepository.findAll();
        List<FuncionarioDTOV5> listFuncionarioDTOV5 = listaFuncionarios.stream().map(FuncionarioConverter::toDTOV5).collect(Collectors.toList());
        return listFuncionarioDTOV5;
    }


    @Override
    public void adicionaFuncionario(FuncionarioDTOV5 funcionarioDTOV5) {
        saveEntity(FuncionarioConverter.toEntityV5(funcionarioDTOV5));
    }

    private void saveEntity(FuncionarioV5 funcionario) {
        funcionarioRepository.save(funcionario);
    }


}
