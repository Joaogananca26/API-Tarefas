package br.com.estudos.APITarefas.repository;

import br.com.estudos.APITarefas.domain.entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, String> {
}
