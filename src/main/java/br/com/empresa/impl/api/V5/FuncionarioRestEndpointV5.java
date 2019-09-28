package br.com.empresa.impl.api.V5;

import br.com.empresa.impl.business.dto.FuncionarioDTOV5;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FuncionarioRestEndpointV5 {

    ResponseEntity<List<FuncionarioDTOV5>> buscaFuncionariosList();

//    ResponseEntity<FuncionarioDTOV1> buscaFuncionario(Long codigoFuncionario);
//
//    ResponseEntity<Void> adicionaFuncionario(FuncionarioDTOV1 associado);
//
//    ResponseEntity<Void> atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV1 funcionario);

}
