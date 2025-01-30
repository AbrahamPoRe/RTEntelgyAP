package model;

public abstract class AnimalBase implements Animal{
    private String nombre;
    private String tipo;
    private String onomatopeya;
    
    public AnimalBase(String nombre, String tipo, String onomatopeya)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.onomatopeya = onomatopeya;
    }
    
    @Override
    public String getNombre()
    {
        return nombre;
    }
    
    @Override
    public String getTipo()
    {
        return tipo;
    }
    
    @Override
    public String getOnomatopeya()
    {
        return onomatopeya;
    }
}
