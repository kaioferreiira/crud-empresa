package br.com.empresa.impl.api.v2;

import br.com.empresa.impl.business.dto.FuncionarioDTOV2;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FuncionarioRestEndpointV2 {

    ResponseEntity<List<FuncionarioDTOV2>> buscaFuncionariosList();

//    ResponseEntity<FuncionarioDTOV1> buscaFuncionario(Long codigoFuncionario);
//
//    ResponseEntity<Void> adicionaFuncionario(FuncionarioDTOV1 associado);
//
//    ResponseEntity<Void> atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV1 funcionario);

}
