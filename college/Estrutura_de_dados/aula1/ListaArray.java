package util;

public class ListaArray {

    //
    // CONSTANTES
    //
    public final static int TAMANHO_INICIAL = 3;
    public final static int FATOR_CRESCIMENTO = 5;

    //
    // ATRIBUTOS
    //
    private Object[] arrayInterno;
    private int numElementos;

    //
    // METODOS
    //
    public ListaArray() {
        this.numElementos = 0;
        this.arrayInterno = new Object[TAMANHO_INICIAL];
    }

    private void verificarNessecidadeDeCrescimento() {
        int tamanho = this.arrayInterno.length;
        if (tamanho == this.numElementos) {
            Object[] novoArray = new Object[tamanho + FATOR_CRESCIMENTO];
            for (int i = 0; i < tamanho; i++) {
                novoArray[i] = this.arrayInterno[i];
            }
            this.arrayInterno = novoArray;
        }
    }

    public boolean adicionar(Object elementos) {
        this.verificarNessecidadeDeCrescimento();
        this.arrayInterno[this.numElementos] = elementos;
        this.numElementos++;
        return true;
    }
}
