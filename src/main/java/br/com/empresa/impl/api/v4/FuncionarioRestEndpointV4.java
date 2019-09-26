package br.com.empresa.impl.api.v4;

import br.com.empresa.impl.business.dto.FuncionarioDTOV4;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FuncionarioRestEndpointV4 {

    ResponseEntity<List<FuncionarioDTOV4>> buscaFuncionariosList();

//    ResponseEntity<FuncionarioDTOV1> buscaFuncionario(Long codigoFuncionario);
//
//    ResponseEntity<Void> adicionaFuncionario(FuncionarioDTOV1 associado);
//
//    ResponseEntity<Void> atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV1 funcionario);

}
