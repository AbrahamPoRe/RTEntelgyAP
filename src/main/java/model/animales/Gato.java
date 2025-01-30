package model.animales;

import model.AnimalBase;

public class Gato extends AnimalBase
{
    public Gato(String nombre)
    {
        super(nombre, "TERRESTRE", "Miau miau");
    }
    
    @Override
    public String emitirSonido()
    {
        return getOnomatopeya();
    }
}