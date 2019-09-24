package br.com.empresa.impl.business.service.v4;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;

import java.util.List;
import java.util.Optional;

public interface FuncionarioServiceV4 {


    List<FuncionarioDTOV1> buscaFuncionariosList();

    Optional<FuncionarioDTOV1> buscaFuncionario(Long codigoFuncionario);

    void adicionaFuncionario(FuncionarioDTOV1 associado);

    void atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV1 funcionario);



}
