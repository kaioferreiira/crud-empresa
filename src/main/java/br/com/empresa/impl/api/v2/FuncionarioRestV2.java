package br.com.empresa.impl.api.v2;

import java.util.List;
import java.util.Objects;

import br.com.empresa.impl.business.dto.FuncionarioDTOV2;
import br.com.empresa.impl.business.service.v2.FuncionarioServiceV2;
import br.com.empresa.impl.config.annotation.EmpresaSwaggerAPI;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Exemplo implementação pelo Header
@RestController
@EmpresaSwaggerAPI(basePath = FuncionarioRestV2.BASE_PATH, title = "API - Funcionarios empresa V2", version = "v2")
@RequestMapping(path = FuncionarioRestV2.BASE_PATH)
public class FuncionarioRestV2 implements FuncionarioRestEndpointV2 {

    public static final String BASE_PATH = "/funcionarios";

    private FuncionarioServiceV2 funcionarioServiceV2;

    @Autowired
    public FuncionarioRestV2(FuncionarioServiceV2 funcionarioServiceV2) {
        this.funcionarioServiceV2 = funcionarioServiceV2;
    }


    @Override
    @GetMapping(path = "/findAll",
            headers = "Accept=application/vnd.empresa.funcionarios-v2+json",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiOperation(value = "Retorna todos funcionários", response = FuncionarioDTOV2.class)
    public ResponseEntity<List<FuncionarioDTOV2>> buscaFuncionariosList() {

        ResponseEntity<List<FuncionarioDTOV2>> response = ResponseEntity.ok(funcionarioServiceV2.buscaFuncionariosList());
        if (Objects.isNull(response.getBody())) {
            response = ResponseEntity.noContent().build();
    }
        return response;
    }



}
