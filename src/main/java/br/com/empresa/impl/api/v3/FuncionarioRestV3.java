package br.com.empresa.impl.api.v3;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import br.com.empresa.impl.business.service.v1.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping({"/v3/funcionarios"})
public class FuncionarioRestV3 implements FuncionarioRestEndpointV3 {


    private FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioRestV3(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Void> adicionaFuncionario(FuncionarioDTOV1 funcionarioDTOV1) {

        funcionarioService.adicionaFuncionario(funcionarioDTOV1);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/{codigoFuncionario}")
    public ResponseEntity<FuncionarioDTOV1> buscaFuncionario(@PathVariable Long codigoFuncionario) {

        ResponseEntity<FuncionarioDTOV1> funcionarioDTOResponseEntity = funcionarioService.buscaFuncionario(codigoFuncionario)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());

        return funcionarioDTOResponseEntity;
    }

    @Override
    @GetMapping("/findAll")
    public ResponseEntity<List<FuncionarioDTOV1>> buscaFuncionariosList() {

        ResponseEntity<List<FuncionarioDTOV1>> response = ResponseEntity.ok(funcionarioService.buscaFuncionariosList());
        if (Objects.isNull(response.getBody())) {
            response = ResponseEntity.noContent().build();
        }
        return response;
    }

    @Override
    @PutMapping("/{codigoFuncionario}")
    public ResponseEntity<Void> atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV1 funcionarioDTOV1) {

        funcionarioService.atualizaFuncionario(codigoFuncionario, funcionarioDTOV1);

        return null;
    }



}
