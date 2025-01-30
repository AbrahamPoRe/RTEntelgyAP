package model.animales;

import model.AnimalBase;

public class Pato extends AnimalBase
{
    public Pato(String nombre)
    {
        super(nombre, "VOLADOR", "Cuac cuac");
    }
    
    @Override
    public String emitirSonido()
    {
        return getOnomatopeya();
    }
}