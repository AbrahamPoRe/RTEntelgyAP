package model.animales;

import model.AnimalBase;

public class RanaAcuatica extends AnimalBase
{
    public RanaAcuatica(String nombre)
    {
        super(nombre, "VOLADOR", "Croac croac");
    }
    
    @Override
    public String emitirSonido()
    {
        return getOnomatopeya();
    }
}