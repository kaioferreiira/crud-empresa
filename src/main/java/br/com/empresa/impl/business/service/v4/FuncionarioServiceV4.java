package br.com.empresa.impl.business.service.v4;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import br.com.empresa.impl.business.dto.FuncionarioDTOV4;

import java.util.List;
import java.util.Optional;

public interface FuncionarioServiceV4 {


    List<FuncionarioDTOV4> buscaFuncionariosList();

//    Optional<FuncionarioDTOV1> buscaFuncionario(Long codigoFuncionario);
//
    void adicionaFuncionario(FuncionarioDTOV4 associado);

//    void atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV1 funcionario);



}
