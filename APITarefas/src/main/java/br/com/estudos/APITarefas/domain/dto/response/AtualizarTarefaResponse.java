package br.com.estudos.APITarefas.domain.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtualizarTarefaResponse {
    private String idTarefa;
    private String nomeTarefa;
    private String descricaoTarefa;
    private String nomeUsuarioTarefa;
    private String prioridadeTarefa;
    private LocalDate prazoTarefa;
    private LocalDateTime dataTarefa;
}
