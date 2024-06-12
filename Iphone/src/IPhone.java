

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
public void tocar() {
    System.out.println("Reproduzindo música.");
}

public void pausar() {
    System.out.println("Música pausada.");
}

public void selecionarMusica(String musica) {
    System.out.println("Selecionando a música: " + musica);
}

public void ligar(String numero) {
    System.out.println("Ligando para: " + numero);
}

public void atender() {
    System.out.println("Atendendo a chamada.");
}

public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz.");
}

public void exibirPagina(String url) {
    System.out.println("Exibindo a página: " + url);
}

public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba.");
}

public void atualizarPagina() {
    System.out.println("Atualizando a página.");
}

public static void main(String[] args) {
    IPhone meuIPhone= new IPhone();
    
    meuIPhone.selecionarMusica("Minha Música Favorita");
    meuIPhone.tocar();
    meuIPhone.pausar();
    
    meuIPhone.ligar("13 989789909");
    meuIPhone.atender();
    meuIPhone.iniciarCorreioVoz();
    
    meuIPhone.exibirPagina("https://github.com/GabrielaFFS");
    meuIPhone.adicionarNovaAba();
    meuIPhone.atualizarPagina();
}
}
    

