public class Casa {
    Porta portass = new Porta();
    String cor;
    String porta1;
    String porta2;
    String porta3;

    void pinta(String s) {
        cor = s;
        System.out.println("Cor modificada para: " + s);

    }
}