package com.wsystem.tarefas.controller;

import com.wsystem.tarefas.domain.Tarefa;
import com.wsystem.tarefas.service.TarefaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "tarefas")
@RequiredArgsConstructor
public class TarefaController {
    private final TarefaService tarefaService;
//    @GetMapping
//    public ResponseEntity<Tarefa> findByDesenvolvedorId(){
//        return ResponseEntity.ok(tarefaService.findByDesenvolvedorId());
//    }
}
