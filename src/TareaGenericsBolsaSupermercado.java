import telcel.curso.bolsassupermercado.dominio.*;

public class TareaGenericsBolsaSupermercado {

    public static void main(String [] args){

        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();

        bolsaFruta.addProductos(new Fruta(100, "Rojo", "Manzana Roja", 40) );
        bolsaFruta.addProductos(new Fruta(200, "Amarillo", "mango", 30) );

        bolsaLimpieza.addProductos(new Limpieza("2",1,"Fabuloso", 20));
        bolsaLimpieza.addProductos(new Limpieza("antibacterial",1.5,"Cloralex", 30));

        bolsaLacteo.addProductos(new Lacteo(3,25,"Leche de chocolate", 25));
        bolsaLacteo.addProductos(new Lacteo(5,50,"queso", 45));

        bolsaNoPerecible.addProductos(new NoPerecible(15, 500, "Arroz de Grano", 30));
        bolsaNoPerecible.addProductos(new NoPerecible(180, 180, "Atun aleta Amarilla", 21));

        System.out.println("========= Frutas =========");
        for (Fruta fruta : bolsaFruta.getProductos()){
            System.out.println("========= " + fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso(gr): " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());

        }

        System.out.println("========= Limpieza =========");
        for (Limpieza limpieza : bolsaLimpieza.getProductos()){
            System.out.println("========= " + limpieza.getNombre());
            System.out.println("Precio : " + limpieza.getPrecio());
            System.out.println("componentes : " + limpieza.getComponentes());
            System.out.println("litros : " + limpieza.getLitros());

        }

        System.out.println("========= Lacteo =========");
        for (Lacteo lacteo : bolsaLacteo.getProductos()){
            System.out.println("========= " + lacteo.getNombre());
            System.out.println("Precio : " + lacteo.getPrecio());
            System.out.println("Cantidad : " + lacteo.getCantidad());
            System.out.println("Proteinas : " + lacteo.getProteinas());

        }

        System.out.println("========= No Perecible  =========");
        for (NoPerecible noPerecibleProd : bolsaNoPerecible.getProductos()){
            System.out.println("========= " + noPerecibleProd.getNombre());
            System.out.println("Precio : " + noPerecibleProd.getPrecio());
            System.out.println("Calorias : " + noPerecibleProd.getCalorias());
            System.out.println("Contenido(gr) : " + noPerecibleProd.getContenido());

        }


    }

}
