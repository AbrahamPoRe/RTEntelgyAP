package test;

import java.util.List;
import model.Animal;
import model.animales.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import service.ServiceAnimal;

public class ServiceAnimalTest 
{
    @Test
    public void crearAnimalesTest()
    {
        ServiceAnimal service = new ServiceAnimal();
        String[] args = {"perro|TERRESTRE|Guau guau", "cuervo|VOLADOR|Crac-crack"};
        
        List<Animal> animales = service.crearAnimales(args);
        
        assertEquals(2, animales.size());
        
        assertTrue(animales.stream().anyMatch(animal -> animal instanceof Perro));
        assertTrue(animales.stream().anyMatch(animal -> animal instanceof Cuervo));
    }
    
    @Test
    public void crearAnimalesInvalidoTest()
    {
        ServiceAnimal service = new ServiceAnimal();
        String[] args = {"dragon|MITICO|Roar"};
        
        List<Animal> animales = service.crearAnimales(args);
        
        assertEquals(0, animales.size());
    }
}
