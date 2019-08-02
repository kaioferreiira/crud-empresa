package br.com.empresa;

import br.com.empresa.dto.FuncionarioDTO;
import br.com.empresa.entity.Funcionario;
import br.com.empresa.repository.FuncionarioRepository;
import br.com.empresa.service.FuncionarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudEmpresaApplication implements CommandLineRunner {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private FuncionarioServiceImpl funcionarioService;

	public static void main(String[] args) {
		SpringApplication.run(CrudEmpresaApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        Funcionario funcionario = new Funcionario().builder()
                .id(null)
                .nome("teste")
                .email("teste@teste.com.br")
                .idade(26)
                .celular("8299-8985")
                .build();

        System.out.println("Salvando funcionario: "  +  funcionario);
        funcionarioRepository.save(funcionario);

        FuncionarioDTO funcionarioDTO = new FuncionarioDTO()
                .builder()
                .nome("teste 2")
                .email("teste2@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .build();

        funcionarioService.adicionaFuncionario(funcionarioDTO);

    }
}
