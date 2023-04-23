package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {

        Aviao aviao = new Aviao();
        aviao.voar();

        Motocicleta motocicleta = new Motocicleta();
        motocicleta.andar();

        Submarino submarino = new Submarino();
        submarino.mergulhar();
        submarino.flutuar();
    }
}