package br.com.empresa.entity.converter;

import static br.com.empresa.exception.FuncionarioExceptionMessage.ERRO_DADOS_INVALIDOS_ASSOCIADO;

import java.util.Objects;

import br.com.empresa.dto.FuncionarioDTO;
import br.com.empresa.entity.Funcionario;
import br.com.empresa.exception.ValidationException;

public class FuncionarioConverter {

    public static Funcionario toEntity(FuncionarioDTO funcionarioDTO) {
        if (Objects.isNull(funcionarioDTO)) {
            throw new ValidationException(ERRO_DADOS_INVALIDOS_ASSOCIADO);
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
