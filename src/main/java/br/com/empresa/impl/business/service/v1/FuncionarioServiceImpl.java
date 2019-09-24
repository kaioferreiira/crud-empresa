package br.com.empresa.impl.business.service.v1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import br.com.empresa.impl.business.entity.V1.Funcionario;
import br.com.empresa.impl.business.entity.converter.FuncionarioConverter;
import br.com.empresa.impl.business.exception.exceptions.ObjectNotFoundException;
import br.com.empresa.impl.business.exception.FuncionarioExceptionMessage;
import br.com.empresa.impl.business.repository.V1.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl  implements FuncionarioService{


    private FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioServiceImpl(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public void adicionaFuncionario(FuncionarioDTOV1 funcionarioDTOV1) {
        saveEntity(FuncionarioConverter.toEntity(funcionarioDTOV1));
    }

    @Override
    public List<FuncionarioDTOV1> buscaFuncionariosList() {
        List<Funcionario> listaFuncionarios = funcionarioRepository.findAll();
        List<FuncionarioDTOV1> listFuncionarioDTOV1 = listaFuncionarios.stream().map(FuncionarioConverter::toDTO).collect(Collectors.toList());
        return listFuncionarioDTOV1;
    }

    @Override
    public Optional<FuncionarioDTOV1> buscaFuncionario(Long codigoFuncionario) {
         return funcionarioRepository.findById(codigoFuncionario).map(FuncionarioConverter::toDTO);
    }

    @Override
    public void atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV1 funcionarioDTOV1) {

        funcionarioRepository.findById(codigoFuncionario).orElseThrow(() -> new ObjectNotFoundException(FuncionarioExceptionMessage.ERRO_ENCONTRAR_DADOS_DO_FUNCIONARIO));

        Funcionario  funcionarioEntity = FuncionarioConverter.toEntity(funcionarioDTOV1);
        funcionarioEntity.setId(codigoFuncionario);
        saveEntity(funcionarioEntity);
    }

    private void saveEntity(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

}
