package Model;

import Interface.Terrestre;

public class Motocicleta implements Terrestre {
    public void andar() {
        System.out.println(this.getClass().getName().substring(6) + " está andando");
    }
}
