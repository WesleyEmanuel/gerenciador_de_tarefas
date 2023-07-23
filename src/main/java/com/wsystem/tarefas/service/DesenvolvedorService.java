package com.wsystem.tarefas.service;

import com.wsystem.tarefas.domain.Desenvolvedor;
import com.wsystem.tarefas.mapper.DesenvolvedorMapper;
import com.wsystem.tarefas.repository.DesenvolvedorRepository;
import com.wsystem.tarefas.requests.DesenvolvedorPostRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DesenvolvedorService {
    private final DesenvolvedorRepository desenvolvedorRepository;
    public Desenvolvedor create(DesenvolvedorPostRequestBody desenvolvedorPostRequestBody) {
        return desenvolvedorRepository.save(
                DesenvolvedorMapper.INSTANCE.toDesenvolvedor(desenvolvedorPostRequestBody)
        );
    }

    public List<Desenvolvedor> listAll() {
        return desenvolvedorRepository.findAll();
    }

    public Desenvolvedor finById(long id) {
        return desenvolvedorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.BAD_REQUEST, "Desenvolvedor não encontrado"
                ));
    }
}
