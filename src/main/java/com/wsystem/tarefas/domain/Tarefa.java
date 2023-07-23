package com.wsystem.tarefas.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descricao;

    @Column(name = "data_criacao", nullable = false)
    private String dataCriacao;

    @Column(name = "previsao_entrega", nullable = false)
    private String previsaoEntrega;

    @Column(name = "data_inicio_producao")
    private String dataInicioProducao;

    @Column(name = "hora_inicio_producao")
    private String horaInicioProducao;

    @Column(name = "data_finalizacao")
    private String dataFinalizacao;

    @Column(name = "hora_finalizacao")
    private String horaFinalizacao;

    @ManyToOne
    private Desenvolvedor desenvolvedor;

}
