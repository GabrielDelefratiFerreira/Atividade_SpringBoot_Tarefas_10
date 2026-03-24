package com.example.tarefas.Controller;

import com.example.tarefas.Model.TarefaModel;
import com.example.tarefas.Service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<TarefaModel> findAll(){
        return tarefaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TarefaModel> buscarPorId(@PathVariable Long id){
        return tarefaService.buscarPorId(id);
    }

    @PostMapping
    public TarefaModel criarTarefa(@RequestBody TarefaModel tarefa){
        return tarefaService.criarTarefa(tarefa);
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id){
        tarefaService.deletarTarefa(id);
    }
}