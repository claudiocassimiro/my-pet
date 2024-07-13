class Gato extends AnimalDeEstimacao implements Andar {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    @Override
    public void treinar() {
        System.out.println(nome + " está sendo treinado.");
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando.");
    }
}