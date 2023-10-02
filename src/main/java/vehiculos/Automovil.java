package vehiculos;
public class Automovil extends Vehiculo{

    private int puestos;
    private static int numAutomoviles = 0; 
    
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante );
        this.puestos = puestos;
        Automovil.numAutomoviles += 1;
    }

    public void setPuestos (int puestos){
        this.puestos = puestos;
    }
    public int getPuestos (){
        return puestos;
    }

    public static int cantAutomoviles(){
        return Automovil.numAutomoviles;
    }
}
