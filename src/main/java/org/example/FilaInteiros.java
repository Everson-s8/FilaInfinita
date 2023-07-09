package org.example;


public class FilaInteiros extends FilaSequencial<Integer>{
    public FilaInteiros(int capacidadeMax) {
        super(capacidadeMax);
    }

    @Override
    public void incluir(Integer valor) throws FilaCheiaException {
        super.incluir(valor);
    }
    @Override
    public Integer remover() throws FilaVaziaException {
        return super.remover();
    }

    @Override
    public int getQtd() {
        return super.getQtd();
    }

    @Override
    public int getQtdMaxSuportada() {
        return super.getQtdMaxSuportada();
    }

    @Override
    public boolean estaVazia() {
        return super.estaVazia();
    }

    @Override
    public void limpar() {
        super.limpar();
    }

    @Override
    public void returnlist() {
        super.returnlist();
    }
}

