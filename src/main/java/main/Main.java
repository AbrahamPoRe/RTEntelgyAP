package main;

import config.AppConfig;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import model.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ServiceAnimal;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ServiceAnimal serviceAnimal = context.getBean(ServiceAnimal.class);
        
        List<Animal> animales = serviceAnimal.crearAnimales(args);
        
        // Agrupacion de animales por tipo
        Map<String, List<Animal>> animalesPorTipo = animales.stream()
                .sorted(Comparator.comparing(Animal::getNombre))
                .collect(Collectors.groupingBy(Animal::getTipo));
        
        // Impresion del resultado
        for (String tipo : animalesPorTipo.keySet())
        {
            System.out.println("Animales " + tipo + ":");
            for (Animal animal : animalesPorTipo.get(tipo))
            {
                System.out.println("- " + animal.getNombre() +  ": " + animal.emitirSonido());
            }
        }
    }
}
