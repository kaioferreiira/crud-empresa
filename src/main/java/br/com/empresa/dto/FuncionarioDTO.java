package br.com.empresa.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FuncionarioDTO {

    private Long id;
    private String nome;
    private String email;
    private String celular;
    private Integer idade;

}
