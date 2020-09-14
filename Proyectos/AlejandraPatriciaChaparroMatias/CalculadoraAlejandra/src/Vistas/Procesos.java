/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.Scanner;

/**
 *
 * @author ale-g
 */
public class Procesos {
    
    public float ObtenerNumero(String texto)
    {
        float a = 0;
        boolean valorValido =  false;
        
        while (!valorValido) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Dame "+ texto +" numero: ");
            String aa = sc.nextLine();

            try {
                a = Float.parseFloat(aa);
                valorValido = true;
            } catch (Exception e) {

                System.out.println("Numero invalido");
                valorValido = false;
            }
        }
        
        return a;
                
    }
    
    public void MostrarResultado(Modelos.DatosOperacion datos)
    {
        System.out.println("Suma: " + datos.getResultadoSuma());
        System.out.println("Resta: " + datos.getResultadoResta());
        System.out.println("Multiplicacion: " + datos.getResultadoMultiplicacion());
        
        if (datos.getMensajeError().equals("")) {
          System.out.println("Division: " + datos.getResultadoDivision());  
        } else
        {
            System.out.println("Division: " + datos.getMensajeError());
        }
        
    }
    
}
