package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante 
{
    private String nombre;
    private Pais pais;
    static Map<Fabricante, Integer> countMap = new HashMap<>();

    public Fabricante (String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
    }
    public Fabricante (){}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setPais(Pais p){
        this.pais = p;
    }
    public Pais getPais(){
        return this.pais;
    }
    public String toString(){
        return nombre;
    }

    public static Fabricante fabricaMayorVentas(){
        for (Vehiculo vehiculo : Vehiculo.lvehiculos){
            Pais.fabricantes.add(vehiculo.getFabricante());
        } 
        
        for (Fabricante fabricante : Pais.fabricantes){
            Pais.countMap.put(fabricante, countMap.getOrDefault(fabricante, 0) + 1);
        }

        Fabricante masRepetido = null;
        int maximoContador = 0;

        for (Map.Entry<Fabricante, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maximoContador) {
                maximoContador = entry.getValue();
                masRepetido = entry.getKey();
            }
        }
        return masRepetido;
    }
}
