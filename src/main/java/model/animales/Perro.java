package model.animales;

import model.AnimalBase;

public class Perro extends AnimalBase
{
    public Perro(String nombre)
    {
        super(nombre, "VOLADOR", "Guau guau");
    }
    
    @Override
    public String emitirSonido()
    {
        return getOnomatopeya();
    }
}