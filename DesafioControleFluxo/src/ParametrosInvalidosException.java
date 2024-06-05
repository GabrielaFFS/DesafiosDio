

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super("O parâmetro dois deve ser maior que o primeiro");
    }
}