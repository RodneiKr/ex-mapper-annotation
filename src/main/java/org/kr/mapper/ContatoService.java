package main.java.org.kr.mapper;

import java.util.List;
import java.util.stream.Collectors;

public class ContatoService {

    public List<ContatoDTO> findAll() {
        final List<Contato> contatos = List.of(
                Contato.builder().id(1L).nome("fulano A").telefone("98765-4321").build(),
                Contato.builder().id(2L).nome("fulano BB").telefone("97531-8642").build(),
                Contato.builder().id(3L).nome("fulano CCC").telefone("24680-1357").build()
        );
        return contatos.stream().map(m -> ContatoMapper.INSTANCE.convert(m)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        final ContatoService service = new ContatoService();
        service.findAll().forEach(System.out::println);
    }
}
