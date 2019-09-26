package br.com.empresa.impl.api.v3;

import br.com.empresa.impl.business.dto.FuncionarioDTOV3;
import br.com.empresa.impl.business.service.v3.FuncionarioServiceV3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping({"/v3/funcionarios"})
public class FuncionarioRestV3 implements FuncionarioRestEndpointV3 {


    private FuncionarioServiceV3 funcionarioService;

    @Autowired
    public FuncionarioRestV3(FuncionarioServiceV3 funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @Override
    @GetMapping("/findAll")
    public ResponseEntity<List<FuncionarioDTOV3>> buscaFuncionariosList() {

        ResponseEntity<List<FuncionarioDTOV3>> response = ResponseEntity.ok(funcionarioService.buscaFuncionariosList());
        if (Objects.isNull(response.getBody())) {
            response = ResponseEntity.noContent().build();
        }
        return response;
    }


}
