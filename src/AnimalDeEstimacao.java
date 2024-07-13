abstract class AnimalDeEstimacao {
    protected String nome;

    public AnimalDeEstimacao(String nome) {
        this.nome = nome;
    }

    public abstract void comer();
    public abstract void dormir();
    public abstract void treinar();
}
