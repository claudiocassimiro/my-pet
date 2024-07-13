class Falcao extends AnimalDeEstimacao implements Voar, Andar {

    public Falcao(String nome) {
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
    public void voar() {
        System.out.println(nome + " está voando.");
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando.");
    }
}