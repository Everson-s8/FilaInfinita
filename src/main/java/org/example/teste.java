package org.example;

public class teste {

    public static void main(String[] args) throws FilaCheiaException, FilaVaziaException {
        FilaInteiros fila = new FilaInteiros(5);

        for (int i = 0; i < 6 ; i++) {
            fila.incluir(i);
        }

        fila.returnlist();


    }
}
