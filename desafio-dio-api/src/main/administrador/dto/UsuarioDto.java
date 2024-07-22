package administrador.dto;
import dominio.modelo.Usuario;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;

public record UsarioDto(
        Long id,
        String nome,
        ContaDto conta,
        CartaoDto cartao,
        List<ItemDto> item,
        List<NovidadesDto> novidades) {

    public Usuarioto(Usuario modelo) {
        this(
                modelo.getId(),
                modelo.getNome(),
                ofNullable(modelo.getConta()).map(ContaDto::new).orElse(null),
                ofNullable(modelo.getCartao()).map(CartaoDto::new).orElse(null),
                ofNullable(modelo.getItem()).orElse(emptyList()).stream().map(Item::new).collect(toList()),
                ofNullable(modelo.getNovidades()).orElse(emptyList()).stream().map(Novidades::new).collect(toList())
        );
    }

    public Usuario toModelo() {
        Usuario modelo = new Usuario();
        modelo.setId(this.id);
        modelo.setNome(this.name);
        modelo.setConta(ofNullable(this.conta).map(ContaDto::toModelo).orElse(null));
        modelo.setCartao(ofNullable(this.cartao).map(CartaoDto::toModelo).orElse(null));
        modelo.setItem(ofNullable(this.item).orElse(emptyList()).stream().map(ItemDto::toModelo).collect(toList()));
        modelo.setNovidades(ofNullable(this.Novidades).orElse(emptyList()).stream().map(NovidadesDto::toModelo).collect(toList()));
        return modelo;
    }

