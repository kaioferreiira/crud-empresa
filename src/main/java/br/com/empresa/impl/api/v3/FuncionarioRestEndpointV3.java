package br.com.empresa.impl.api.v3;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import br.com.empresa.impl.business.dto.FuncionarioDTOV3;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FuncionarioRestEndpointV3 {

    ResponseEntity<List<FuncionarioDTOV3>> buscaFuncionariosList();

//    ResponseEntity<FuncionarioDTOV3> buscaFuncionario(Long codigoFuncionario);
//
//    ResponseEntity<Void> adicionaFuncionario(FuncionarioDTOV3 associado);
//
//    ResponseEntity<Void> atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV3 funcionario);

}
