package com.wsystem.tarefas.repository;

import com.wsystem.tarefas.domain.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
