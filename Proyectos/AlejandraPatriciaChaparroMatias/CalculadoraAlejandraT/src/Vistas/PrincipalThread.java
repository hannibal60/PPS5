/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.OperacionesThread;
import java.time.Duration;
import java.time.Instant;
import java.lang.Thread;

/**
 *
 * @author ale-g
 */
public class PrincipalThread {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Modelos.DatosOperacion datos = new Modelos.DatosOperacion();
        Vistas.Procesos procesos = new Vistas.Procesos();
        Controladores.OperacionesThread operacionesThread = new Controladores.OperacionesThread();
        
        datos.setA(procesos.ObtenerNumero(" primer "));
        datos.setB(procesos.ObtenerNumero(" segundo "));
        
       Runnable tareaSuma = () -> {
			try {
                            operacionesThread.Suma(datos, 1000);
                            
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
       
       Runnable tareaResta = () -> {
			try {
                            operacionesThread.Resta(datos, 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
       
       Runnable tareaMultiplicacion = () -> {
			try {
                            operacionesThread.Multiplicacion(datos, 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
       
       Runnable tareaDivision = () -> {
			try {
                            operacionesThread.Division(datos, 2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
       
       		Thread hiloSuma = new Thread(tareaSuma);
                Thread hiloResta = new Thread(tareaResta);
                Thread hiloMultiplicacion = new Thread(tareaMultiplicacion);
                Thread hiloDivision = new Thread(tareaDivision);
                
                hiloSuma.start();
                hiloResta.start();
                hiloMultiplicacion.start();
                hiloDivision.start();
                hiloSuma.join();
                hiloResta.join();
                hiloMultiplicacion.join();
                hiloDivision.join();
                
                procesos.MostrarResultado(datos);
                    
       
    }
    
}
