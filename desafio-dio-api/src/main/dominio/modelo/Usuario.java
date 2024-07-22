package dominio.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Account conta;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Card cartao;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Elementos> elementos;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Novidades> novidades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Account getConta() {
        return conta;
    }

    public void setConta(Conta conta {
        this.conta = conta;
    }

    public Card getCartao) {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public List<Elementos> getElementos() {
        return Elementos;
    }

    public void setElementos(List<Elementos> elementos) {
        this.elementos = elementos;
    }

    public List<Novidades> getNovidades() {
        return novidades;
    }

    public void setNovidades<List<Novidades> novidades> {
        this.novidades = novidades;
    }

}