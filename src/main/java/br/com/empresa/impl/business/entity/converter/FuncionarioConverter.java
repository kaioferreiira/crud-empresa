package br.com.empresa.impl.business.entity.converter;

import java.util.Objects;

import br.com.empresa.impl.business.dto.FuncionarioDTO;
import br.com.empresa.impl.business.entity.Funcionario;
import br.com.empresa.impl.business.exception.exceptions.ValidationException;
import br.com.empresa.impl.business.exception.FuncionarioExceptionMessage;

public class FuncionarioConverter {

    public static Funcionario toEntity(FuncionarioDTO funcionarioDTO) {
        if (Objects.isNull(funcionarioDTO)) {
            throw new ValidationException(FuncionarioExceptionMessage.ERRO_DADOS_INVALIDOS_ASSOCIADO);
        }
        return new Funcionario(funcionarioDTO.getId(), funcionarioDTO.getNome(),funcionarioDTO.getEmail(), funcionarioDTO.getCelular(),funcionarioDTO.getIdade());
    }

    public static FuncionarioDTO toDTO(Funcionario funcionario){
        if(Objects.isNull(funcionario)){
            return null;
        }
        return new FuncionarioDTO()
                .builder()
                .id(funcionario.getId())
                .nome(funcionario.getNome())
                .email(funcionario.getEmail())
                .idade(funcionario.getIdade())
                .celular(funcionario.getCelular())
                .build();
    }

}
