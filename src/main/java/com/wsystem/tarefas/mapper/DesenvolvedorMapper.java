package com.wsystem.tarefas.mapper;

import com.wsystem.tarefas.domain.Desenvolvedor;
import com.wsystem.tarefas.requests.DesenvolvedorPostRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DesenvolvedorMapper {
    DesenvolvedorMapper INSTANCE = Mappers.getMapper(DesenvolvedorMapper.class);
    Desenvolvedor toDesenvolvedor(DesenvolvedorPostRequestBody desenvolvedorPostRequestBody);
}
