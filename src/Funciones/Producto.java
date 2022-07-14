package Funciones;

public class Producto {

    public static void main(String[] args){
         int resultado = operacion(700);
        System.out.println(resultado);
    }

    static int operacion(int precio){
        int iva = 19;
        int res = (precio * iva /100) + precio;
        return res;
    }


}
