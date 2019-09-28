package br.com.empresa.impl.api.V5;

import br.com.empresa.impl.business.dto.FuncionarioDTOV5;
import br.com.empresa.impl.business.service.V5.FuncionarioServiceV5;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping({"/v5/funcionarios"})
public class FuncionarioRestV5 implements FuncionarioRestEndpointV5 {


    private FuncionarioServiceV5 funcionarioService;

    @Autowired
    public FuncionarioRestV5(FuncionarioServiceV5 funcionarioService) {
        this.funcionarioService = funcionarioService;
    }


    @Override
    @GetMapping(path = "/findAll",
//            headers = "Accept=application/empresa.funcionarios-v5+json",
            produces = "application/vnd.empresa.funcionarios-v5+json"
    )
    @ApiOperation(value = "Retorna todos funcionários", response = FuncionarioDTOV5.class)
    public ResponseEntity<List<FuncionarioDTOV5>> buscaFuncionariosList() {

        ResponseEntity<List<FuncionarioDTOV5>> response = ResponseEntity.ok(funcionarioService.buscaFuncionariosList());
        if (Objects.isNull(response.getBody())) {
            response = ResponseEntity.noContent().build();
        }
        return response;
    }



}
