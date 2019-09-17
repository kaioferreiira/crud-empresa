package br.com.empresa.impl.api.v1;

import java.util.List;
import java.util.Objects;

import br.com.empresa.impl.business.dto.FuncionarioDTO;
import br.com.empresa.impl.business.service.FuncionarioService;
import br.com.empresa.impl.config.annotation.EmpresaSwaggerAPI;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EmpresaSwaggerAPI(basePath = FuncionarioRestV1.BASE_PATH, title = "API - Funcionarios empresa V1", version = "v1")
@RequestMapping(path = FuncionarioRestV1.BASE_PATH)
public class FuncionarioRestV1 implements FuncionarioRestEndpointV1 {

    public static final String BASE_PATH = "/v1/funcionarios";

    private FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioRestV1(FuncionarioService funcionarioService) {
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
    @GetMapping(path = "/findAll",
            headers = "Accept=application/empresa.funcionarios-v1+json",
            produces = "application/empresa.funcionarios-v1+json"
    )
    @ApiOperation(value = "Retorna todos funcionários", response = String.class)
    public ResponseEntity<List<FuncionarioDTO>> buscaFuncionariosList() {

        ResponseEntity<List<FuncionarioDTO>> response = ResponseEntity.ok(funcionarioService.buscaFuncionariosList());
        if (Objects.isNull(response.getBody())) {
            response = ResponseEntity.noContent().build();
        }
        return response;
    }

    @Override
    @PutMapping("/{codigoFuncionario}")
    public ResponseEntity<Void> atualizaFuncionario(Long codigoFuncionario, FuncionarioDTO funcionarioDTO) {

        funcionarioService.atualizaFuncionario(codigoFuncionario, funcionarioDTO);

        return null;
    }



}
