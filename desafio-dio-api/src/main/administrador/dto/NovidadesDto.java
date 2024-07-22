package administrador.dto;

import dominio.modelo.Novidade;

public record NovidadesDto(Long id, String icone, String descricao) {

    public NovidadesDto(Novidades modelo) {
        this(modelo.getId(), modelo.getIcone(), modelo.getDescricao());
    }

    public Novidades toModelo() {
        Novidades modelo = new Novidades();
        modelo.setId(this.id);
        modelo.setIcone(this.icon);
        modelo.setDescricao(this.descricao);
        return modelo;
    }
}
