package src.oop.parcial.animales;

public class Pato extends Animal implements AnimalQueVuela,AnimalQueNada,AnimaQueCamina{

    @Override
    public  String toString(){
        return "Pato";
    }

    @Override
    public void caminar(){

    }

    @Override
    public void nadar() {

    }

    @Override
    public void volar() {

    }
}
