public class TorreHanoi {
    private int movimentos;

    public TorreHanoi() {
        this.movimentos = 0;
    }

    public int getMovimentos() {
        return movimentos;
    }

    public void resolverHanoi(int numeroDeDiscos, String origem, String destino, String auxiliar) {
        if (numeroDeDiscos > 0) {
            resolverHanoi(numeroDeDiscos - 1, origem, auxiliar, destino);
            moverDisco(numeroDeDiscos, origem, destino);
            resolverHanoi(numeroDeDiscos - 1, auxiliar, destino, origem);
        }
    }

    private void moverDisco(int disco, String origem, String destino) {
        System.out.println("Mova disco " + disco + " de " + origem + " para " + destino);
        movimentos++;
    }
}
