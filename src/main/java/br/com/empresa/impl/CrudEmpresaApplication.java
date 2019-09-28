package br.com.empresa.impl;

import br.com.empresa.impl.business.dto.*;
import br.com.empresa.impl.business.repository.V1.FuncionarioRepository;
import br.com.empresa.impl.business.repository.V2.FuncionarioRepositoryV2;
import br.com.empresa.impl.business.repository.V3.FuncionarioRepositoryV3;
import br.com.empresa.impl.business.service.V5.FuncionarioServiceImplV5;
import br.com.empresa.impl.business.service.v1.FuncionarioServiceImpl;
import br.com.empresa.impl.business.service.v2.FuncionarioServiceImplV2;
import br.com.empresa.impl.business.service.v3.FuncionarioServiceImplV3;
import br.com.empresa.impl.business.service.v4.FuncionarioServiceImplV4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudEmpresaApplication implements CommandLineRunner {


    private FuncionarioServiceImpl funcionarioService;
    private FuncionarioServiceImplV2 funcionarioServiceImplV2;
    private FuncionarioServiceImplV3 funcionarioServiceImplV3;
    private FuncionarioServiceImplV4 funcionarioServiceImplV4;
    private FuncionarioServiceImplV5 funcionarioServiceImplV5;

    @Autowired
    public CrudEmpresaApplication(FuncionarioServiceImpl funcionarioService,
                                  FuncionarioServiceImplV2 funcionarioServiceImplV2,
                                  FuncionarioServiceImplV3 funcionarioServiceImplV3,
                                  FuncionarioServiceImplV4 funcionarioServiceImplV4,
                                  FuncionarioServiceImplV5 funcionarioServiceImplV5) {
        this.funcionarioService = funcionarioService;
        this.funcionarioServiceImplV2 = funcionarioServiceImplV2;
        this.funcionarioServiceImplV3 = funcionarioServiceImplV3;
        this.funcionarioServiceImplV4 = funcionarioServiceImplV4;
        this.funcionarioServiceImplV5 = funcionarioServiceImplV5;
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

        //v3
        FuncionarioDTOV3 funcionarioDTOV31 = new FuncionarioDTOV3()
                .builder()
                .nome("1 -Funcionario V3")
                .email("1funcionariov3@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .novoParametro1("Novo Parametro 1 v3")
                .novoParametro2("Novo Parametro 2 v3")
                .build();

        FuncionarioDTOV3 funcionarioDTOV32 = new FuncionarioDTOV3()
                .builder()
                .nome("2 -Funcionario V3")
                .email("2funcionariov3@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .novoParametro1("Novo Parametro 1 v3")
                .novoParametro2("Novo Parametro 2 v3")
                .build();

        funcionarioServiceImplV3.adicionaFuncionario(funcionarioDTOV31);
        funcionarioServiceImplV3.adicionaFuncionario(funcionarioDTOV32);

        //v4
        FuncionarioDTOV4 funcionarioDTOV41 = new FuncionarioDTOV4()
                .builder()
                .nome("1 -Funcionario V4")
                .email("1funcionariov4@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .novoParametro1("Novo Parametro 1 v4")
                .novoParametro2("Novo Parametro 2 v4")
                .novoParametro3("Novo Parametro 3 v4")
                .build();

        FuncionarioDTOV4 funcionarioDTOV42 = new FuncionarioDTOV4()
                .builder()
                .nome("2 -Funcionario V4")
                .email("2funcionariov4@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .novoParametro1("Novo Parametro 1 v4")
                .novoParametro2("Novo Parametro 2 v4")
                .novoParametro3("Novo Parametro 3 v4")
                .build();

        funcionarioServiceImplV4.adicionaFuncionario(funcionarioDTOV41);
        funcionarioServiceImplV4.adicionaFuncionario(funcionarioDTOV42);


        //v4
        FuncionarioDTOV5 funcionarioDTOV51 = new FuncionarioDTOV5()
                .builder()
                .nome("1 -Funcionario V5")
                .email("1funcionariov5@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .novoParametro1("Novo Parametro 1 v5")
                .novoParametro2("Novo Parametro 2 v5")
                .novoParametro3("Novo Parametro 3 v5")
                .novoParametro4("Novo Parametro 4 v5")
                .build();

        FuncionarioDTOV5 funcionarioDTOV52 = new FuncionarioDTOV5()
                .builder()
                .nome("2 -Funcionario V5")
                .email("2funcionariov5@teste.com.br")
                .idade(22)
                .celular("3242-8985")
                .novoParametro1("Novo Parametro 1 v5")
                .novoParametro2("Novo Parametro 2 v5")
                .novoParametro3("Novo Parametro 3 v5")
                .novoParametro4("Novo Parametro 4 v5")
                .build();

        funcionarioServiceImplV5.adicionaFuncionario(funcionarioDTOV51);
        funcionarioServiceImplV5.adicionaFuncionario(funcionarioDTOV52);
    }
}
