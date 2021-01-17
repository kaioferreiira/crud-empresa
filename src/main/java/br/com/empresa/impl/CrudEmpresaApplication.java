package br.com.empresa.impl;

import br.com.empresa.impl.business.dto.*;
import br.com.empresa.impl.business.service.v1.FuncionarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudEmpresaApplication implements CommandLineRunner {


    private FuncionarioServiceImpl funcionarioService;

    @Autowired
    public CrudEmpresaApplication(FuncionarioServiceImpl funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

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

    }
}
