package test.java.org.kr.mapper;

import main.java.org.kr.mapper.Contato;
import main.java.org.kr.mapper.ContatoMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContatoTest {

    @Test
    public void deveConverterContatoParaContatoDTOcomSucesso() {
        var contato = Contato.builder().id(1L).nome("eu").telefone("98765-4321").build();
        var contatoDTO = ContatoMapper.INSTANCE.convert(contato);

        // validando cada atributo
        assertEquals(contato.getId(), contatoDTO.getId());
        assertEquals(contato.getNome(), contatoDTO.getNome());
        assertEquals(contato.getTelefone(), contatoDTO.getTelefone());

        // validando a inclusao de novos atributos
        assertEquals(contato.toString(), contatoDTO.toString().replaceFirst("ContatoDTO", "Contato"));
    }
}
