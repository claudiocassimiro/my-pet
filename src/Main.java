public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();

        AnimalDeEstimacao m1 = new Gato("Gato");
        AnimalDeEstimacao m2 = new Pato("Pato");
        AnimalDeEstimacao m3 = new Lagarto("Lagarto");
        AnimalDeEstimacao m4 = new Falcao("Falcão");
        AnimalDeEstimacao m5 = new Morcego("Morcego");

        jogador.adquirirMascote(m1);
        jogador.adquirirMascote(m2);

        System.out.println("O jogador tem os seguintes mascotes:");
        jogador.listarComportamentos();
    }
}
