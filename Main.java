import entities.User;
import entities.MensagemParaAlguem;

class Main {
  public static void main(String[] args) {
    User user = new User(2l, "Cleb", "clebsants", "Math");
    System.out.println(user.getName());
    System.out.println(user.getCurso());

    MensagemParaAlguem mensagem = new MensagemParaAlguem("Corpo do email", "email-destino@email.com", false); 
    System.out.println(mensagem.ehAnonima());
    System.out.println(mensagem.getTextoCompletoAExibir());
  }
}