package com.wsystem.tarefas.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DesenvolvedorPostRequestBody {
    private String nome;
    private String email;
    private String senha;
}
