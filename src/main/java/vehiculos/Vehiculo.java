package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
    static ArrayList<Vehiculo> lvehiculos = new ArrayList<>();

    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;
    static int CantidadVehiculos = 0;
    
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.CantidadVehiculos += 1;
        Vehiculo.lvehiculos.add(this);

    }

    public Vehiculo (){}

    public static String vehiculosPorTipo(){
        int camiones = Camion.cantCamiones();
        int camionetas = Camioneta.cantCamionetas();
        int Automoviles = Automovil.cantAutomoviles();
        return "Automoviles: " + Automoviles + "\nCamionetas: " + camionetas + "\nCamiones: " + camiones;
    }

    public static int getCantidadVehiculos (){
        return Vehiculo.CantidadVehiculos;
    }

    public static void setCantidadVehiculos (int cantidad){
        Vehiculo.CantidadVehiculos = cantidad;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return this.placa;
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    public int getPuertas(){
        return this.puertas;
    }

    public void setTraccion(String traccion){
        this.traccion = traccion;
    }
    public String getTraccion(){
        return this.traccion;
    }

    public void setVelocidadMaxima(int vel){
        this.velocidadMaxima = vel;
    }
    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio (){
        return this.precio;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getPeso(){
        return this.peso;
    }

    public void setFabricante(Fabricante fabricante){
        this.fabricante = fabricante;
    }
    public Fabricante getFabricante (){
        return this.fabricante;
    }
}
