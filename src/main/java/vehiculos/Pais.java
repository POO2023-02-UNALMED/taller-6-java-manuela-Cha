package vehiculos;
import java.util.*;

public class Pais {
    private String nombre;
    //static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    //static Map<Fabricante, Integer> countMap = new HashMap<>();
    static Map<Pais, Integer> mapaContador = new HashMap<>();
    static ArrayList<Pais> paises = new ArrayList<>();

    public Pais (String nombre){
        this.nombre = nombre;
    }
    
    public Pais (){}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }

    public String toString (){
        return nombre;
    }
    
    public static Pais paisMasVendedor (){
        Pais masRepetido = null;
        int maximoContador = 0;

        for (Fabricante fabricante : Fabricante.fabricantes){
            Pais.paises.add(fabricante.getPais());
        } 
        for (Pais pais : paises){
            Pais.mapaContador.put(pais, mapaContador.getOrDefault(pais, 0) + 1);
        }

        for (Map.Entry<Pais, Integer> entry : mapaContador.entrySet()) {
            if (entry.getValue() > maximoContador) {
                maximoContador = entry.getValue();
                masRepetido = entry.getKey();
            }
        }
        return masRepetido;
        //System.out.println("el pais mas vendedor es: " + masRepetido);
        //System.out.println("desde Pais: " + Fabricante.fabricantes);
        //System.out.println("desde Pais: " + paises);
        
    }

}
