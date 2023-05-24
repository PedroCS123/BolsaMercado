package telcel.curso.bolsassupermercado.dominio;

public class Fruta extends Producto{

    private double peso;

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    private String color;


    public Fruta(double peso, String color, String nombre, double precio) {
        super(nombre, precio);
        this.color = color;
        this.peso = peso;
    }


}
