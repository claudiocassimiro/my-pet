import java.util.ArrayList;
import java.util.List;

class Jogador {
    private List<AnimalDeEstimacao> mascotes;

    public Jogador() {
        mascotes = new ArrayList<>();
    }

    public void adquirirMascote(AnimalDeEstimacao mascote) {
        mascotes.add(mascote);
    }

    public void listarComportamentos() {
        for (AnimalDeEstimacao mascote : mascotes) {
            System.out.print("Comportamento de " + mascote.nome + ": ");
            if (mascote instanceof Andar) {
                System.out.print("pode andar ");
            }
            if (mascote instanceof Voar) {
                System.out.print("pode voar ");
            }
            if (mascote instanceof Nadar) {
                System.out.print("pode nadar ");
            }
            System.out.println();
        }
    }
}
