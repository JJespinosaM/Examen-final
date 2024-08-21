package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //SALPICREMAS TE CONTRATA PARA CONSTRUIR
        //UN SOFTWARE QUE GESTIONE EL INVENTARIO DE LA TIENDA
        //1. MENU DE OPCIONES EN JAVA
        //(REGISTAR/MOSTRAR EL INVENTARIO/BUSCAR UN PRODUCTO/MODIFICAR LA INFO DE UN PRODUCTO
        //PERMITIR EL REGISTRO DE HASTA 100 PRODUCTOS

        Scanner lea = new Scanner(System.in);
        //MENU DE OPCIONES
        System.out.println("SALPICREMAS SAS");
        System.out.println("***++********");
        System.out.println("1. Ingresar producto ");
        System.out.println("2. Ver inventario ");
        System.out.println("3. Buscar producto ");
        System.out.println("4. Modificar producto ");
        System.out.println("0 para salir ");
        System.out.println("***++********");


        //CREANDO UN MENU DE OPCIONES EN JAVA
        int opcionElegida;
        ArrayList<HashMap<String, Object>> productos = new ArrayList<>();
        do {
            HashMap<String, Object> producto = new HashMap<>();
            System.out.println("Digite una opcion: ");
            opcionElegida=lea.nextInt();
            lea.nextLine();
            if (opcionElegida==1){
                System.out.println("Ingresando un producto");
                System.out.print("Ingresa el nombre del producto");
                String nombreProducto = lea.nextLine();
                System.out.print("Ingresa la descripcion del producto");
                String descripcionProducto = lea.nextLine();
                System.out.println("Ingresa el precio del prodcuto");
                int precioProducto= lea.nextInt();
                int idProducto= new Random().nextInt(100);

                //LLENANDO EL OBJETO (HASMAP)

                producto.put("nombre", nombreProducto);
                producto.put("precio", precioProducto);
                producto.put("descripcion", descripcionProducto);
                producto.put("id", idProducto);

                //LLENANDO EL ARREGLO

                productos.add(producto);



            } else if (opcionElegida==2) {
                System.out.println("Mostrando el inventario");
                for (HashMap<String, Object> productoAuxiliar: productos){
                    System.out.println(productoAuxiliar);
                }
            } else if (opcionElegida==3) {
                System.out.println("Buscando producto");
                //PARA BUSCAR EN UN ARREGLO NECESITO EL INDICE QUE ESTOY BUSCANDO
                System.out.println("Digita el nombre del producto que quieres buscar");
                String nombreProductosAbuscar= lea.nextLine();

                //RECORRIENDO EL ARREGLO PARA BUSCAR
                for (HashMap<String, Object> productoAuxiliar:productos){
                    //COMPARAR SI EL NOMBRE QUE ENCONTRO EL AXULIAR ES EL MISMO DIGITADO
                    if (nombreProductosAbuscar.equals(productoAuxiliar.get("nombre"))){
                        System.out.println("Pelicula encontrada");
                        //MOSTRA LA INFORMACION DEL PRODUCTO QUE SE ENCONTRO
                        System.out.println(productoAuxiliar);

                        //COMO ENCONTRA EL INDICE DEL PRODUCTO AUXILIAR

                    }
                }


            } else if (opcionElegida==4) {
                System.out.println("Modificando producto");
            } else if (opcionElegida==0){
                System.out.println("Saliendo....");
            } else {
                System.out.println("Opcion invalida");
            }

        }while (opcionElegida!=0);
    }
}



