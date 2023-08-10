package main.java.org.kr.mapper;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class ContatoDTO {
    private Long id;
    private String nome;
    private String telefone;
}
