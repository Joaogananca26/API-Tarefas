package br.com.estudos.APITarefas.service;

import br.com.estudos.APITarefas.domain.dto.request.ObterTarefaRequest;
import br.com.estudos.APITarefas.domain.entities.Tarefa;
import br.com.estudos.APITarefas.exceptions.TarefaNaoEncontradaException;
import br.com.estudos.APITarefas.repository.TarefaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TarefaService {

    private TarefaRepository repository;

    public Tarefa cadastrarTarefa(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return repository.findAll();
    }

    public Tarefa listarTarefaPorId(String id) {
        return repository.findById(id).orElseThrow(() -> new TarefaNaoEncontradaException("Tarefa não encontrada!"));
    }

    public void deletarTarefaPorId(String id) {
        repository.deleteById(id);
    }

    @Transactional
    public Tarefa atualizarTarefa(String id, @Valid ObterTarefaRequest dto) {
        Tarefa tarefa = listarTarefaPorId(id);

        tarefa.setNomeTarefa(dto.getNomeTarefa());
        tarefa.setDescricaoTarefa(dto.getDescricaoTarefa());
        tarefa.setNomeUsuarioTarefa(dto.getNomeUsuarioTarefa());
        tarefa.setPrioridadeTarefa(dto.getPrioridadeTarefa());

        return tarefa;
    }

}
