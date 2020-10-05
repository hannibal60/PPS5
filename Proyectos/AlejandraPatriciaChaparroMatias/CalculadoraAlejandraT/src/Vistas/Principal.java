/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author ale-g
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelos.DatosOperacion datos = new Modelos.DatosOperacion();
        Vistas.Procesos procesos = new Vistas.Procesos();
        Controladores.Operaciones operaciones = new Controladores.Operaciones();
        
        datos.setA(procesos.ObtenerNumero(" primer "));
        datos.setB(procesos.ObtenerNumero(" segundo "));
        
        operaciones.GeneraOperaciones(datos);
        
        procesos.MostrarResultado(datos);
    }
    
}
