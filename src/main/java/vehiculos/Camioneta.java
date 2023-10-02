package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    private static int numCamionetas = 0;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        Camioneta.numCamionetas += 1;
    }
    public Camioneta(){}

    public void setVolco (boolean volco){
        this.volco = volco;
    }
    public boolean isVolco(){
        return this.volco;
    }

    public static int cantCamionetas (){
        return numCamionetas;
    }
}
