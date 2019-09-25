package br.com.empresa.impl.api.v1;

import java.util.List;
import java.util.Objects;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import br.com.empresa.impl.business.service.v1.FuncionarioService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Exemplo implementação pelo Header
@RestController
//@EmpresaSwaggerAPI(basePath = FuncionarioRestV1.BASE_PATH, title = "API - Funcionarios empresa V1", version = "v1")
@RequestMapping(path = FuncionarioRest.BASE_PATH)
public class FuncionarioRest implements FuncionarioRestEndpointV1 {

    public static final String BASE_PATH = "/funcionarios";

    private FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioRest(FuncionarioService funcionarioService) {
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
    @GetMapping(path = "/findAll",
            headers = "Accept=application/empresa.funcionarios-v1+json",
            produces = "application/vnd.empresa.funcionarios-v1+json"
    )
    @ApiOperation(value = "Retorna todos funcionários", response = String.class)
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
