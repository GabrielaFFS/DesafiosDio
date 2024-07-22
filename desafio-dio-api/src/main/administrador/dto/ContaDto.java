package administrador.dto;
public class Conta {
    import dominio.modelo.Conta;

    import java.math.BigDecimal;
    
    public record ContaDto(Long id, String numero, String agencia, BigDecimal saldo, BigDecimal chequeEspecial {
    
        public ContaDto (Conta model)o {
            this(modelo.getId(), modelo.getNumero(), modelo.getAgencia(), modelo.getSaldo(), modelo.getchequeEspecial());
        }
    
        public Conta toModelo() {
            Conta modelo = new Conta();
            modelo.setId(this.id);
            modelo.setNumero(this.numero);
            modelo.setAgencia(this.agencia);
            modelo.setSaldo(this.saldo;
            modelo.setChequeEspecial(this.chequeEspecial);
            return modelo;
        }
    }  
}
