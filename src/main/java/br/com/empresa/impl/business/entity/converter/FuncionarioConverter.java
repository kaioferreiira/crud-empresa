package br.com.empresa.impl.business.entity.converter;

import java.util.Objects;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import br.com.empresa.impl.business.dto.FuncionarioDTOV2;
import br.com.empresa.impl.business.entity.V1.Funcionario;
import br.com.empresa.impl.business.entity.V2.FuncionarioV2;
import br.com.empresa.impl.business.exception.exceptions.ValidationException;
import br.com.empresa.impl.business.exception.FuncionarioExceptionMessage;

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
        return new FuncionarioV2(funcionarioDTOV2.getId(), funcionarioDTOV2.getNome(), funcionarioDTOV2.getEmail(), funcionarioDTOV2.getCelular(), funcionarioDTOV2.getIdade(), funcionarioDTOV2.getNovoParametro1());
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
                .novoParametro1("Novo Parametro v2")
                .build();
    }

}
