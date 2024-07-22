package administrador.dto;

import dominio.modelo.Item;

public record ItemDto(Long id, String icone, String descricao) {

    public ItemDto(Item modelo) {
        this(modelo.getId(), modelo.getIcone(), modelo.getDescricao());
    }

    public Item toModelo() {
        Item modelo = new Item();
        modelo.setId(this.id);
        modelo.setIcone(this.icone);
        modelo.setDescricao(this.descricao);
        return modelo;
    }
}
