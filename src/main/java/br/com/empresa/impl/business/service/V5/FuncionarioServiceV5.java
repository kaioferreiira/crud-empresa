package br.com.empresa.impl.business.service.V5;

import br.com.empresa.impl.business.dto.FuncionarioDTOV4;
import br.com.empresa.impl.business.dto.FuncionarioDTOV5;

import java.util.List;

public interface FuncionarioServiceV5 {

    List<FuncionarioDTOV5> buscaFuncionariosList();

    void adicionaFuncionario(FuncionarioDTOV5 associado);

}
