package br.com.empresa.service;

import br.com.empresa.dto.FuncionarioDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface FuncionarioService {


    List<FuncionarioDTO> buscaFuncionariosList();

    Optional<FuncionarioDTO> buscaFuncionario(Long codigoFuncionario);

    void adicionaFuncionario(FuncionarioDTO associado);

    void atualizaFuncionario(Long codigoFuncionario, FuncionarioDTO funcionario);



}
