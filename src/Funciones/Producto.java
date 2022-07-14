package Funciones;

public class Producto {

    public static void main(String[] args){
        int resultado = operacion(700);
        System.out.println(resultado);
    }

    static int operacion(int precio){
        int iva = 19;
        int res = (precio * iva /100) + precio;
        System.out.println("Precio Producto: " + precio + "\n" + "Valor del iva: " + iva + "\n" + "Total iva incluido: " + res );
        return res;
    }


}
