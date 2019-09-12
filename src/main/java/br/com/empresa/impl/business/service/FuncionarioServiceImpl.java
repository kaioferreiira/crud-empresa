package br.com.empresa.impl.business.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.empresa.impl.business.dto.FuncionarioDTO;
import br.com.empresa.impl.business.entity.Funcionario;
import br.com.empresa.impl.business.entity.converter.FuncionarioConverter;
import br.com.empresa.impl.business.exception.exceptions.ObjectNotFoundException;
import br.com.empresa.impl.business.exception.FuncionarioExceptionMessage;
import br.com.empresa.impl.business.repository.FuncionarioRepository;
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
    public void adicionaFuncionario(FuncionarioDTO funcionarioDTO) {
        saveEntity(FuncionarioConverter.toEntity(funcionarioDTO));
    }

    @Override
    public List<FuncionarioDTO> buscaFuncionariosList() {
        List<Funcionario> listaFuncionarios = funcionarioRepository.findAll();
        List<FuncionarioDTO> listFuncionarioDTO = listaFuncionarios.stream().map(FuncionarioConverter::toDTO).collect(Collectors.toList());
        return listFuncionarioDTO;
    }

    @Override
    public Optional<FuncionarioDTO> buscaFuncionario(Long codigoFuncionario) {
         return funcionarioRepository.findById(codigoFuncionario).map(FuncionarioConverter::toDTO);
    }

    @Override
    public void atualizaFuncionario(Long codigoFuncionario, FuncionarioDTO funcionarioDTO) {

        funcionarioRepository.findById(codigoFuncionario).orElseThrow(() -> new ObjectNotFoundException(FuncionarioExceptionMessage.ERRO_ENCONTRAR_DADOS_DO_FUNCIONARIO));

        Funcionario  funcionarioEntity = FuncionarioConverter.toEntity(funcionarioDTO);
        funcionarioEntity.setId(codigoFuncionario);
        saveEntity(funcionarioEntity);
    }

    private void saveEntity(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

}
