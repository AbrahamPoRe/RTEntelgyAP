package model.animales;

import model.AnimalBase;

public class Gallo extends AnimalBase
{
    public Gallo(String nombre)
    {
        super(nombre, "TERRESTRE", "Kikiriki");
    }
    
    @Override
    public String emitirSonido()
    {
        return getOnomatopeya();
    }
}