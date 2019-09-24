package br.com.empresa.impl.business.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FuncionarioDTOV2 {

    private Long id;
    private String nome;
    private String email;
    private String celular;
    private Integer idade;
    private String novoParametro1;

}
