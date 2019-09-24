package br.com.empresa.impl;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import br.com.empresa.impl.business.dto.FuncionarioDTOV2;
import br.com.empresa.impl.business.repository.V1.FuncionarioRepository;
import br.com.empresa.impl.business.repository.V2.FuncionarioRepositoryV2;
import br.com.empresa.impl.business.service.v1.FuncionarioServiceImpl;
import br.com.empresa.impl.business.service.v2.FuncionarioServiceImplV2;
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

    @Autowired
    private FuncionarioRepositoryV2 funcionarioRepositoryV2;

    @Autowired
    private FuncionarioServiceImplV2 funcionarioServiceImplV2;


	public static void main(String[] args) {
		SpringApplication.run(CrudEmpresaApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

	    //v1
        FuncionarioDTOV1 funcionarioDTOV1 = new FuncionarioDTOV1()
                .builder()
                .nome("1 -Funcionario V1")
                .email("1funcionariov1@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .build();


        FuncionarioDTOV1 funcionarioDTOV2 = new FuncionarioDTOV1()
                .builder()
                .nome("2 -Funcionario V1")
                .email("2funcionariov1@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .build();

        funcionarioService.adicionaFuncionario(funcionarioDTOV1);
        funcionarioService.adicionaFuncionario(funcionarioDTOV2);

        //v2
        FuncionarioDTOV2 funcionarioDTOV21 = new FuncionarioDTOV2()
                .builder()
                .nome("1 -Funcionario V2")
                .email("1funcionariov1@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .novoParametro1("Novo Parametro v2")
                .build();


        FuncionarioDTOV2 funcionarioDTOV22 = new FuncionarioDTOV2()
                .builder()
                .nome("2 -Funcionario V2")
                .email("2funcionariov1@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .novoParametro1("Novo Parametro v2")
                .build();


        funcionarioServiceImplV2.adicionaFuncionario(funcionarioDTOV21);
        funcionarioServiceImplV2.adicionaFuncionario(funcionarioDTOV22);




    }
}
