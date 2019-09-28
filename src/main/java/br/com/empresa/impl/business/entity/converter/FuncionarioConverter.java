package br.com.empresa.impl.business.entity.converter;

import br.com.empresa.impl.business.dto.*;
import br.com.empresa.impl.business.entity.V1.Funcionario;
import br.com.empresa.impl.business.entity.V2.FuncionarioV2;
import br.com.empresa.impl.business.entity.V3.FuncionarioV3;
import br.com.empresa.impl.business.entity.V4.FuncionarioV4;
import br.com.empresa.impl.business.entity.V5.FuncionarioV5;
import br.com.empresa.impl.business.exception.FuncionarioExceptionMessage;
import br.com.empresa.impl.business.exception.exceptions.ValidationException;

import java.util.Objects;


public class FuncionarioConverter {

    public static Funcionario toEntity(FuncionarioDTOV1 funcionarioDTOV1) {
        if (Objects.isNull(funcionarioDTOV1)) {
            throw new ValidationException(FuncionarioExceptionMessage.ERRO_DADOS_INVALIDOS_ASSOCIADO);
        }
        return new Funcionario(funcionarioDTOV1.getId(), funcionarioDTOV1.getNome(), funcionarioDTOV1.getEmail(), funcionarioDTOV1.getCelular(), funcionarioDTOV1.getIdade());
    }

    public static FuncionarioV2 toEntityV2(FuncionarioDTOV2 funcionarioDTOV2) {
        if (Objects.isNull(funcionarioDTOV2)) {
            throw new ValidationException(FuncionarioExceptionMessage.ERRO_DADOS_INVALIDOS_ASSOCIADO);
        }
        return new FuncionarioV2(funcionarioDTOV2.getId(),
                funcionarioDTOV2.getNome(),
                funcionarioDTOV2.getEmail(),
                funcionarioDTOV2.getCelular(),
                funcionarioDTOV2.getIdade(),
                funcionarioDTOV2.getNovoParametro1());
    }

    public static FuncionarioV3 toEntityV3(FuncionarioDTOV3 funcionarioDTOV3) {
        if (Objects.isNull(funcionarioDTOV3)) {
            throw new ValidationException(FuncionarioExceptionMessage.ERRO_DADOS_INVALIDOS_ASSOCIADO);
        }
        return new FuncionarioV3(funcionarioDTOV3.getId(),
                    funcionarioDTOV3.getNome(),
                    funcionarioDTOV3.getEmail(),
                    funcionarioDTOV3.getCelular(),
                    funcionarioDTOV3.getIdade(),
                    funcionarioDTOV3.getNovoParametro1(),
                    funcionarioDTOV3.getNovoParametro2());
    }


    public static FuncionarioV4 toEntityV4(FuncionarioDTOV4 funcionarioDTOV4) {
        if (Objects.isNull(funcionarioDTOV4)) {
            throw new ValidationException(FuncionarioExceptionMessage.ERRO_DADOS_INVALIDOS_ASSOCIADO);
        }
        return new FuncionarioV4(funcionarioDTOV4.getId(),
                funcionarioDTOV4.getNome(),
                funcionarioDTOV4.getEmail(),
                funcionarioDTOV4.getCelular(),
                funcionarioDTOV4.getIdade(),
                funcionarioDTOV4.getNovoParametro1(),
                funcionarioDTOV4.getNovoParametro2(),
                funcionarioDTOV4.getNovoParametro3());
    }


    public static FuncionarioV5 toEntityV5(FuncionarioDTOV5 funcionarioDTOV5) {
        if (Objects.isNull(funcionarioDTOV5)) {
            throw new ValidationException(FuncionarioExceptionMessage.ERRO_DADOS_INVALIDOS_ASSOCIADO);
        }
        return new FuncionarioV5(funcionarioDTOV5.getId(),
                funcionarioDTOV5.getNome(),
                funcionarioDTOV5.getEmail(),
                funcionarioDTOV5.getCelular(),
                funcionarioDTOV5.getIdade(),
                funcionarioDTOV5.getNovoParametro1(),
                funcionarioDTOV5.getNovoParametro2(),
                funcionarioDTOV5.getNovoParametro3(),
                funcionarioDTOV5.getNovoParametro4());
    }


    public static FuncionarioDTOV1 toDTO(Funcionario funcionario){
        if(Objects.isNull(funcionario)){
            return null;
        }
        return new FuncionarioDTOV1()
                .builder()
                .id(funcionario.getId())
                .nome(funcionario.getNome())
                .email(funcionario.getEmail())
                .idade(funcionario.getIdade())
                .celular(funcionario.getCelular())
                .build();
    }

    public static FuncionarioDTOV2 toDTOV2(FuncionarioV2 funcionario){
        if(Objects.isNull(funcionario)){
            return null;
        }
        return new FuncionarioDTOV2()
                .builder()
                .id(funcionario.getId())
                .nome(funcionario.getNome())
                .email(funcionario.getEmail())
                .idade(funcionario.getIdade())
                .celular(funcionario.getCelular())
                .novoParametro1(funcionario.getNovoParametro1())
                .build();
    }

    public static FuncionarioDTOV3 toDTOV3(FuncionarioV3 funcionario){
        if(Objects.isNull(funcionario)){
            return null;
        }
        return new FuncionarioDTOV3()
                .builder()
                .id(funcionario.getId())
                .nome(funcionario.getNome())
                .email(funcionario.getEmail())
                .idade(funcionario.getIdade())
                .celular(funcionario.getCelular())
                .novoParametro1(funcionario.getNovoParametro1())
                .novoParametro2(funcionario.getNovoParametro2())
                .build();
    }

    public static FuncionarioDTOV4 toDTOV4(FuncionarioV4 funcionario){
        if(Objects.isNull(funcionario)){
            return null;
        }
        return new FuncionarioDTOV4()
                .builder()
                .id(funcionario.getId())
                .nome(funcionario.getNome())
                .email(funcionario.getEmail())
                .idade(funcionario.getIdade())
                .celular(funcionario.getCelular())
                .novoParametro1(funcionario.getNovoParametro1())
                .novoParametro2(funcionario.getNovoParametro2())
                .novoParametro3(funcionario.getNovoParametro3())
                .build();
    }


    public static FuncionarioDTOV5 toDTOV5(FuncionarioV5 funcionario){
        if(Objects.isNull(funcionario)){
            return null;
        }
        return new FuncionarioDTOV5()
                .builder()
                .id(funcionario.getId())
                .nome(funcionario.getNome())
                .email(funcionario.getEmail())
                .idade(funcionario.getIdade())
                .celular(funcionario.getCelular())
                .novoParametro1(funcionario.getNovoParametro1())
                .novoParametro2(funcionario.getNovoParametro2())
                .novoParametro3(funcionario.getNovoParametro3())
                .novoParametro4(funcionario.getNovoParametro4())
                .build();
    }

}
