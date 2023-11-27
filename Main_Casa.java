public class Main_Casa {
    public static void main(String[] args){
        Casa minhaCasa = new Casa();
        Porta portas = new Porta();

        minhaCasa.pinta("Vermelha");
        minhaCasa.porta1 = "Porta da sala";
        minhaCasa.porta2 = "Porta da cozinha";
        minhaCasa.porta3 = "Porta do quintal";

        portas.abre(minhaCasa.porta2);
        portas.abre(minhaCasa.porta1);
        portas.abre(minhaCasa.porta3);

        System.out.println("3portas abertas");






    }
}
