package br.com.estudos.APITarefas.controller;

import br.com.estudos.APITarefas.domain.dto.request.ObterTarefaRequest;
import br.com.estudos.APITarefas.domain.dto.response.ObterTarefaResponse;
import br.com.estudos.APITarefas.domain.entities.Tarefa;
import br.com.estudos.APITarefas.service.TarefaService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
@AllArgsConstructor
public class TarefaController {

    private TarefaService service;
    private ModelMapper mapper;

    @PostMapping("/Adicionar")
    public ResponseEntity<ObterTarefaResponse> cadastrarTarefa(@RequestBody ObterTarefaRequest dto) {
        Tarefa tarefa = mapper.map(dto, Tarefa.class);
        Tarefa tarefaSalva = service.cadastrarTarefa(tarefa);

        ObterTarefaResponse response = mapper.map(tarefaSalva, ObterTarefaResponse.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<ObterTarefaResponse> listarTarefas() {
        List<Tarefa> tarefas = service.listarTarefas();
        return tarefas.stream()
                .map(tarefa -> mapper.map(tarefa, ObterTarefaResponse.class))
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ObterTarefaResponse> listarTarefaPorId(@PathVariable String id) {
        Tarefa tarefa = service.listarTarefaPorId(id);

        ObterTarefaResponse tarefaResponse = mapper.map(tarefa, ObterTarefaResponse.class);

        return ResponseEntity.status(HttpStatus.OK).body(tarefaResponse);
    }



}
