/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author CETECOM
 */
public class Arroz extends Producto{
    private int g;

    public Arroz() {
        super();
    }

    public Arroz(int g, int codigo, String descripcion, int precioUnitario) {
        super(codigo, descripcion, precioUnitario);
        this.g = g;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void mostrarDatosArroz(){
        super.mostrarDatos();
        System.out.println("Gramos: "+g);
    }
    
}
