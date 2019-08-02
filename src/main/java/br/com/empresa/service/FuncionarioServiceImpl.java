package br.com.empresa.service;

import java.util.List;
import java.util.Optional;

import br.com.empresa.dto.FuncionarioDTO;
import br.com.empresa.entity.Funcionario;
import br.com.empresa.entity.converter.FuncionarioConverter;
import br.com.empresa.repository.FuncionarioRepository;
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

        return null;
    }

    @Override
    public Optional<FuncionarioDTO> buscaFuncionario(Long codigoFuncionario) {
         return funcionarioRepository.findById(codigoFuncionario).map(FuncionarioConverter::toDTO);
    }

    @Override
    public void atualizaFuncionario(Long codigoFuncionario, FuncionarioDTO funcionario) {

    }

    private void saveEntity(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

}
