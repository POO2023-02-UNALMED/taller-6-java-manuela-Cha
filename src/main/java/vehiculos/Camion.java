package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;
    private static int numCamiones = 0;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        Camion.numCamiones += 1;
    }
    public Camion(){}

    public void setEjes (int ejes){
        this.ejes = ejes;
    }
    public int getEjes(){
        return this.ejes;
    }

    public static int cantCamiones (){
        return numCamiones;
    }

}
