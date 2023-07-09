package org.example;


public class FilaSequencial<T> implements IFila<T> {

    T[] vetor;

    private int capacidade;

    private int ultimo;

    private int tamanho;

    private int primeiro;

    public FilaSequencial(int capacidadeMax){
        vetor = (T[]) new Object[capacidadeMax];
        capacidade = capacidadeMax;
    }
    @Override
    public void incluir(T valor) throws FilaCheiaException {
        if (tamanho == capacidade){
            throw new FilaCheiaException("a fila está cheia");
        }
        ultimo = ultimo % capacidade;
        vetor[ultimo] = valor;
        ultimo++;
        tamanho++;
    }

    @Override
    public T remover() throws FilaVaziaException {
        if (estaVazia()){
            throw new FilaVaziaException("a fila está vazia");
        }
        primeiro = primeiro%capacidade;
        T numo = vetor[primeiro];
        vetor[primeiro] = null;
        primeiro++;
        tamanho--;
        return numo;
     }

    @Override
    public int getQtd() {
        return tamanho;
    }

    @Override
    public int getQtdMaxSuportada() {
        return capacidade;
    }

    @Override
    public boolean estaVazia() {
        if (tamanho == 0){
            return  true;
        }
        return false;
    }

    @Override
    public void limpar() {
        this.vetor = null;
        tamanho = 0;
    }

    public void returnlist(){
        for (int i = 0; i < capacidade ; i++) {
            System.out.println(vetor[i]);
        }
    }

    public void aumentarCapacidade(){
        if (tamanho == vetor.length){
            T []vetorAux = (T[]) new Object[vetor.length*2];
            for (int i = 0; i < vetor.length; i++) {
                vetorAux[i] = vetor[i];
            }
            this.vetor = vetorAux;
            capacidade = capacidade*2;
        }
    }

    public T visualizarProximo() throws FilaVaziaException{
        if (estaVazia()){
            throw new FilaVaziaException("a fila está vazia");
        }
        primeiro = primeiro%capacidade;
        T pox = vetor[primeiro];
        return pox;
    }

}
