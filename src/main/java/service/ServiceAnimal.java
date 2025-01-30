package service;

import java.util.ArrayList;
import java.util.List;
import model.*;
import model.animales.*;

public class ServiceAnimal
{
    public List<Animal> crearAnimales(String[] args)
    {
        try
        {
            List<Animal> animales = new ArrayList<>();
            for (String arg : args)
            {
                String[] partes = arg.split("\\|");
                String nombre = partes[0];
                String tipo = partes[1];
                String onomatopeya = partes[2];
                
                switch (tipo) {
                    case "TERRESTRE":
                        switch (nombre)
                        {
                            case "gallo":
                                animales.add(new Gallo(nombre));
                                break;
                            case "perro":
                                animales.add(new Perro(nombre));
                                break;
                            case "gato":
                                animales.add(new Gato(nombre));
                                break;
                            default:
                                System.out.println("El animal no se encuentra en la data.");
                                break;
                        }
                        break;
                    case "VOLADOR":
                        switch (nombre)
                        {
                            case "cuervo":
                                animales.add(new Cuervo(nombre));
                                break;
                            case "pato":
                                animales.add(new Pato(nombre));
                                break;
                            default:
                                System.out.println("El animal no se encuentra en la data.");
                                break;
                        }
                        break;
                    case "ACUATICO":
                        switch (nombre)
                        {
                            case "delfin":
                                animales.add(new Delfin(nombre));
                                break;
                            case "ranaacuatica":
                                animales.add(new RanaAcuatica(nombre));
                                break;
                            default:
                                System.out.println("El animal no se encuentra en la data.");
                                break;
                        }
                        break;
                    default:
                        System.out.println("No existe dicha categoría de animales");
                        break;
                }
            }
            
            return animales;
        }
        catch (Exception ex)
        {
            System.out.println("Error al agrupar los animales - " + ex.getLocalizedMessage());
            return null;
        }
    }
}

