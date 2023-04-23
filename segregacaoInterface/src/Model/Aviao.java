package Model;

import Interface.Aereo;
import Interface.Terrestre;

public class Aviao implements Aereo, Terrestre {

    @Override
    public void voar() {
        System.out.println(this.getClass().getName().substring(6) + " está voando");
    }

    @Override
    public void andar() {
        System.out.println(this.getClass().getName().substring(6) + " está andando");
    }
}
