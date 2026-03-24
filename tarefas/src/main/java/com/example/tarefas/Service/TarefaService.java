package com.example.tarefas.Service;

import com.example.tarefas.Model.TarefaModel;
import com.example.tarefas.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<TarefaModel> findAll(){
        return tarefaRepository.findAll();
    }

    public Optional<TarefaModel> buscarPorId(Long id){
        return tarefaRepository.findById(id);
    }

    public TarefaModel criarTarefa(TarefaModel tarefa){
        return tarefaRepository.save(tarefa);
    }

    public void deletarTarefa(Long id){
        tarefaRepository.deleteById(id);
    }
}