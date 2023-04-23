package Model;

import Interface.Aquatico;

public class Submarino implements Aquatico {
    @Override
    public void flutuar() {
        System.out.println(this.getClass().getName().substring(6) + " está flutuando");
    }

    @Override
    public void mergulhar() {
        System.out.println(this.getClass().getName().substring(6) + " está mergulhando");
    }
}
