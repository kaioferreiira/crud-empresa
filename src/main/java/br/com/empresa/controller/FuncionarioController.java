package br.com.empresa.controller;

import java.util.List;

import br.com.empresa.dto.FuncionarioDTO;
import br.com.empresa.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/funcionarios"})
public class FuncionarioController implements FuncionarioControllerEndpoint {


    private FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Void> adicionaFuncionario(FuncionarioDTO funcionarioDTO) {

        funcionarioService.adicionaFuncionario(funcionarioDTO);

        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/{codigoFuncionario}")
    public ResponseEntity<FuncionarioDTO> buscaFuncionario(@PathVariable Long codigoFuncionario) {

        ResponseEntity<FuncionarioDTO> funcionarioDTOResponseEntity = funcionarioService.buscaFuncionario(codigoFuncionario)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());

        return funcionarioDTOResponseEntity;
    }

    @Override
    public ResponseEntity<List<FuncionarioDTO>> buscaFuncionariosList() {
        return null;
    }

    @Override
    public ResponseEntity<Void> atualizaFuncionario(Long codigoFuncionario, FuncionarioDTO funcionario) {
        return null;
    }



}
