/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author CETECOM
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Bebida bebida = new Bebida();
        Arroz arroz = new Arroz();
        
        int opcion = 0;
        int codigo = 0;
        int PrecioUnitario = 0;
        String Descripcion = "";
        int cc = 0;
        int gr = 0;
        
        
        do {            
            System.out.println("MENU");
            System.out.println("1. Agregar producto liquido");
            System.out.println("2. Agregar producto");
            System.out.println("3. Salir");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese codigo");
                    codigo = teclado.nextInt();
                    bebida.setCodigo(codigo);
                    System.out.println("Ingrese precio");
                    PrecioUnitario = teclado.nextInt();
                    bebida.setPrecioUnitario(PrecioUnitario);
                    System.out.println("Ingrese cc");
                    cc = teclado.nextInt();
                    bebida.setCc(cc);
                    teclado.nextLine();
                    System.out.println("Ingrese Descripcion");
                    Descripcion = teclado.nextLine();
                    bebida.setDescripcion(Descripcion);
                    System.out.println("----------------------------------------------");
                    bebida.mostrarDatos();
                    break;
                case 2:
                    System.out.println("Ingrese codigo");
                    codigo = teclado.nextInt();
                    arroz.setCodigo(codigo);
                    System.out.println("Ingrese precio");
                    PrecioUnitario = teclado.nextInt();
                    arroz.setPrecioUnitario(PrecioUnitario);
                    System.out.println("Ingrese gr");
                    gr = teclado.nextInt();
                    arroz.setG(gr);
                    teclado.nextLine();
                    System.out.println("Ingrese Descripcion");
                    Descripcion = teclado.nextLine();
                    arroz.setDescripcion(Descripcion);
                    System.out.println("----------------------------------------------");
                    arroz.mostrarDatosArroz();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Ingrese una opción válido");
            }
        } while (opcion != 3);
        System.out.println("Programa Finalizado!");
    }
    
}
