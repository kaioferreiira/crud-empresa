package br.com.empresa.impl.business.entity.converter;

import br.com.empresa.impl.business.dto.*;
import br.com.empresa.impl.business.entity.V1.Funcionario;
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

}
