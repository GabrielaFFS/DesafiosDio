package administrador.dto;
import dominio.modelo.Cartao;

import java.math.BigDecimal;

public record CartaoDto(Long id, String numero, BigDecimal limite) {

    public CartaoDto(Cartao modelo) {
        this(modelo.getId(), modelo.getNumero(), modelo.getLimite());
    }

    public Card toModel() {
        Card model = new Card();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setLimit(this.limit);
        return model;
    }
}