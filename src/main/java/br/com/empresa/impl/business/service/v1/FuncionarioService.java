package br.com.empresa.impl.business.service.v1;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;

import java.util.List;
import java.util.Optional;

public interface FuncionarioService {


    List<FuncionarioDTOV1> buscaFuncionariosList();

    Optional<FuncionarioDTOV1> buscaFuncionario(Long codigoFuncionario);

    void adicionaFuncionario(FuncionarioDTOV1 associado);

    void atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV1 funcionario);



}
