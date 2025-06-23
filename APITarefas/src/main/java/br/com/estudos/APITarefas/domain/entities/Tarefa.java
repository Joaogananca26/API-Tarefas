package br.com.estudos.APITarefas.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_Tarefas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_tarefa")
    private String idTarefa;

    @Column(name = "nome_tarefa")
    private String nomeTarefa;

    @Column(name = "descricao_tarefa")
    private String descricaoTarefa;

    @Column(name = "nome_usuario_tarefa")
    private String nomeUsuarioTarefa;

    @Column(name = "prioridade_tarefa")
    private String prioridadeTarefa;

    @Column(name = "data_tarefa")
    private LocalDateTime dataCriacaoTarefa;

    @Column(name = "prazo_tarefa")
    private LocalDate prazoTarefa;
}
