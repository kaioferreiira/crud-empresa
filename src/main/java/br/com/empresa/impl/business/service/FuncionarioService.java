package br.com.empresa.impl.business.service;

import br.com.empresa.impl.business.dto.FuncionarioDTO;

import java.util.List;
import java.util.Optional;

public interface FuncionarioService {


    List<FuncionarioDTO> buscaFuncionariosList();

    Optional<FuncionarioDTO> buscaFuncionario(Long codigoFuncionario);

    void adicionaFuncionario(FuncionarioDTO associado);

    void atualizaFuncionario(Long codigoFuncionario, FuncionarioDTO funcionario);



}
