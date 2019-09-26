package br.com.empresa.impl.business.service.v3;

import br.com.empresa.impl.business.dto.FuncionarioDTOV3;

import java.util.List;

public interface FuncionarioServiceV3 {


    List<FuncionarioDTOV3> buscaFuncionariosList();

//    Optional<FuncionarioDTOV3> buscaFuncionario(Long codigoFuncionario);
//
    void adicionaFuncionario(FuncionarioDTOV3 associado);

//    void atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV3 funcionario);
//
//

}
