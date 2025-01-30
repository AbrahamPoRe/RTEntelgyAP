package model.animales;

import model.AnimalBase;

public class Cuervo extends AnimalBase
{
    public Cuervo(String nombre)
    {
        super(nombre, "VOLADOR", "Crac-crack");
    }
    
    @Override
    public String emitirSonido()
    {
        return getOnomatopeya();
    }
}