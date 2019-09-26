package br.com.empresa.impl.api.v4;

import java.util.List;
import java.util.Objects;

import br.com.empresa.impl.business.dto.FuncionarioDTOV4;
import br.com.empresa.impl.business.service.v4.FuncionarioServiceV4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/v4/funcionarios"})
public class FuncionarioRestV4 implements FuncionarioRestEndpointV4 {


    private FuncionarioServiceV4 funcionarioService;

    @Autowired
    public FuncionarioRestV4(FuncionarioServiceV4 funcionarioService) {
        this.funcionarioService = funcionarioService;
    }


    @Override
    @GetMapping("/findAll")
    public ResponseEntity<List<FuncionarioDTOV4>> buscaFuncionariosList() {

        ResponseEntity<List<FuncionarioDTOV4>> response = ResponseEntity.ok(funcionarioService.buscaFuncionariosList());
        if (Objects.isNull(response.getBody())) {
            response = ResponseEntity.noContent().build();
        }
        return response;
    }



}
