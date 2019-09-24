package br.com.empresa.impl.business.service.v2;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import br.com.empresa.impl.business.dto.FuncionarioDTOV2;

import java.util.List;
import java.util.Optional;

public interface FuncionarioServiceV2 {


    List<FuncionarioDTOV2> buscaFuncionariosList();

//    Optional<FuncionarioDTOV2> buscaFuncionario(Long codigoFuncionario);
//
    void adicionaFuncionario(FuncionarioDTOV2 associado);

//    void atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV2 funcionario);



}
