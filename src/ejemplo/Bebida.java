/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author CETECOM
 */
public class Bebida extends Producto{
    private int cc;
    
    
    public Bebida() {
        super();
    }

    public Bebida(int cc, int codigo, String descripcion, int precioUnitario) {
        super(codigo, descripcion, precioUnitario);
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("CC: "+cc);
    }
    
    
}
