package br.com.estudos.APITarefas.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObterTarefaResponse {

    private String idTarefa;
    private String nomeTarefa;
    private String descricaoTarefa;
    private String nomeUsuarioTarefa;
    private String prioridadeTarefa;
    private Date dataTarefa;
}
