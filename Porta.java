public class Porta {

    Boolean aberta;
    String cor;
    String dimensaoX;
    String dimensaoY;
    String dimensaoZ;


    void abre(String s) {
        System.out.println("Porta aberta!");
        aberta = true;

    }
    void fecha(){
        System.out.println("Porta fechada!");
        aberta = true;

    }
    void pinta(String s) {
        System.out.println("Cor modificada para: "+ s);
        cor = s;

    }
    Boolean	estaAberta() {
        if (aberta == true) {
            System.out.println("A porta está aberta");
            return true;


        } else {
            System.out.println("A porta está fechada");
            return false;
        }


    }
}
