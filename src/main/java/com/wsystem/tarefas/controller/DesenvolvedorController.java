package com.wsystem.tarefas.controller;

import com.wsystem.tarefas.domain.Desenvolvedor;
import com.wsystem.tarefas.mapper.DesenvolvedorMapper;
import com.wsystem.tarefas.requests.DesenvolvedorPostRequestBody;
import com.wsystem.tarefas.service.DesenvolvedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "desenvolvedores")
@RequiredArgsConstructor
public class DesenvolvedorController {
    private final DesenvolvedorService desenvolvedorService;
    @GetMapping
    public ResponseEntity<List<Desenvolvedor>> listAll(){
        return ResponseEntity.ok(desenvolvedorService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Desenvolvedor> findById(@PathVariable long id){
        return ResponseEntity.ok(desenvolvedorService.finById(id));
    }

    @PostMapping
    public ResponseEntity<Desenvolvedor> create(
            @RequestBody DesenvolvedorPostRequestBody desenvolvedorPostRequestBody
    ){
        return new ResponseEntity<>(
                desenvolvedorService.create(desenvolvedorPostRequestBody),
                HttpStatus.CREATED
        );
    }
}
