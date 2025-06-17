package br.com.estudos.APITarefas.controller;

import br.com.estudos.APITarefas.domain.dto.request.CadastrarTarefaRequest;
import br.com.estudos.APITarefas.domain.dto.response.CadastrarTarefaResponse;
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
    public ResponseEntity<CadastrarTarefaResponse> cadastrarTarefa(@RequestBody CadastrarTarefaRequest dto) {
        Tarefa tarefa = mapper.map(dto, Tarefa.class);
        Tarefa tarefaSalva = service.cadastrarTarefa(tarefa);

        CadastrarTarefaResponse response = mapper.map(tarefaSalva, CadastrarTarefaResponse.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<CadastrarTarefaResponse> listarTarefas() {
        List<Tarefa> tarefas = service.listarTarefas();
        return tarefas.stream()
                .map(tarefa -> mapper.map(tarefa, CadastrarTarefaResponse.class))
                .toList();
    }

}
