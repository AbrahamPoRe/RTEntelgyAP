package model.animales;

import model.AnimalBase;

public class Delfin extends AnimalBase
{
    public Delfin(String nombre)
    {
        super(nombre, "ACUATICO", "Iiii iiii");
    }
    
    @Override
    public String emitirSonido()
    {
        return getOnomatopeya();
    }
}
