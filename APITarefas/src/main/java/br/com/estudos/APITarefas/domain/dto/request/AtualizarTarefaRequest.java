package br.com.estudos.APITarefas.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtualizarTarefaRequest {

    @NotBlank
    private String nomeTarefa;

    @NotBlank
    private String descricaoTarefa;

    @NotBlank
    private String nomeUsuarioTarefa;

    @NotBlank
    private String prioridadeTarefa;

    @NotBlank
    private int dia;

    @NotBlank
    private int mes;

    @NotBlank
    private int ano;
}
