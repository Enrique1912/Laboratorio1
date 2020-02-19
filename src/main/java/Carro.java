public class Carro {


    private String marca;
    private String id;
    private String color;
    private double cantFabricados;

    public Carro(){
        marca="Indeterminado";
        id="Indeterminado";
        color="Indeterminado";
        cantFabricados=0.0;
    }
    public Carro(String a,String b,String c,int d){
        marca=a;
        id=b;
        color=c;
        cantFabricados=d;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getCantFabricados() {
        return cantFabricados;
    }

    public void setCantFabricados(double cantFabricados) {
        this.cantFabricados = cantFabricados;
    }
    public String encender(){
        return"El carro esta encendido";
    }

    public String apagar(){
        return"El carro esta apagado";
    }
    public String muestraVelocidadMaxima(){
        return "Este carro es comun y corriente pero tiene una velocidad maxima de 20 km/h";
    }

}
