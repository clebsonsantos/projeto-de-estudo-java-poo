package entities;

public class MensagemParaAlguem extends Mensagem {
  private String emailDestinatario;

  public String getEmailDestinatario(){
    return this.emailDestinatario;
  }

  public MensagemParaAlguem(String texto, String emailDestinatario, boolean anonima) {
    super(texto, "meu-email@email.com", anonima);
    this.emailDestinatario = emailDestinatario;
  }
  public String getTextoCompletoAExibir() {
    return "Mensagem de: " + super.getEmailRemetente() + " Para: " + this.emailDestinatario + ". Texto: " + super.getTexto();
  }

}