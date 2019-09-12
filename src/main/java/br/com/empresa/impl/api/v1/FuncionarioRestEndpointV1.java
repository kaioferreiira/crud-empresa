package br.com.empresa.impl.api.v1;

import java.util.List;

import br.com.empresa.impl.business.dto.FuncionarioDTO;
import org.springframework.http.ResponseEntity;

public interface FuncionarioRestEndpointV1 {

    ResponseEntity<List<FuncionarioDTO>> buscaFuncionariosList();

    ResponseEntity<FuncionarioDTO> buscaFuncionario(Long codigoFuncionario);

    ResponseEntity<Void> adicionaFuncionario(FuncionarioDTO associado);

    ResponseEntity<Void> atualizaFuncionario(Long codigoFuncionario, FuncionarioDTO funcionario);

}
