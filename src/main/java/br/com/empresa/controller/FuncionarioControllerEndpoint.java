package br.com.empresa.controller;

import br.com.empresa.dto.FuncionarioDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FuncionarioControllerEndpoint {

    ResponseEntity<List<FuncionarioDTO>> buscaFuncionariosList();

    ResponseEntity<FuncionarioDTO> buscaFuncionario(Long codigoFuncionario);

    ResponseEntity<Void> adicionaFuncionario(FuncionarioDTO associado);

    ResponseEntity<Void> atualizaFuncionario(Long codigoFuncionario, FuncionarioDTO funcionario);

}
