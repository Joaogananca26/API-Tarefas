package br.com.estudos.APITarefas.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObterTarefaRequest {

    @NotBlank
    private String nomeTarefa;

    @NotBlank
    private String descricaoTarefa;

    @NotBlank
    private String nomeUsuarioTarefa;

    @NotBlank
    private String prioridadeTarefa;

    @NotNull
    private int dia;

    @NotNull
    private int mes;

    @NotNull
    private int ano;
}
