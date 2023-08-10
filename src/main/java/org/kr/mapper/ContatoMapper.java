package main.java.org.kr.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContatoMapper {

    ContatoMapper INSTANCE = Mappers.getMapper(ContatoMapper.class);

    @Mapping(source = "contato.id", target = "id")
    @Mapping(source = "contato.nome", target = "nome")
    @Mapping(source = "telefone", target = "telefone")
    ContatoDTO convert(final Contato contato);
}
