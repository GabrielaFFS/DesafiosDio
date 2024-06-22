package ContaBanco;
public class Cliente {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	 System.out.println("Digite o valor para depositar na Conta Corrente:");
        double valorDeposito = scanner.nextDouble();
        contaCorrente.depositar(valorDeposito);
        System.out.println("Depósito realizado com sucesso!");

        System.out.println("Digite o valor para sacar da Conta Corrente:");
        double valorSaque = scanner.nextDouble();
        contaCorrente.sacar(valorSaque);
        System.out.println("Saque realizado com sucesso!");

        System.out.println("Digite o valor para transferir da Conta Corrente para a Conta Poupança:");
        double valorTransferencia = scanner.nextDouble();
        contaCorrente.transferir(valorTransferencia, contaPoupanca);
        System.out.println("Transferência realizada com sucesso!");
}