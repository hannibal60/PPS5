/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.DatosOperacion;

/**
 *
 * @author ale-g
 */
public class OperacionesThread {
    
    public void Suma(DatosOperacion datos, int miliSegundos) throws InterruptedException 
    {
        this.BucleMiliSegundos(miliSegundos, " Suma ");
        datos.setResultadoSuma(datos.getA()+datos.getB());
    }
    
    public void Resta(DatosOperacion datos, int miliSegundos) throws InterruptedException 
    {
        this.BucleMiliSegundos(miliSegundos, " Resta ");
         datos.setResultadoResta(datos.getA()-datos.getB());
    }
    
    public void Multiplicacion(DatosOperacion datos, int miliSegundos) throws InterruptedException
    {
        this.BucleMiliSegundos(miliSegundos, " Multiplicacion ");
         datos.setResultadoMultiplicacion(datos.getA()*datos.getB());   
    }
     
      public void Division(DatosOperacion datos, int miliSegundos) throws InterruptedException 
    {
        this.BucleMiliSegundos(miliSegundos, " Division ");
        datos.setMensajeError("");
        
        datos.setResultadoDivision(0);
        
        if (datos.getB() == 0) 
        {
            datos.setMensajeError("Division entre 0, no valido");
            
        }else
        {
            datos.setResultadoDivision(datos.getA()/datos.getB());
        }
    }    
    
      private void BucleMiliSegundos(int miliSegundos, String operacion) throws InterruptedException
      {
          for (int i = 0; i < miliSegundos ; i++) {
            System.out.println("miliSegundos "+ operacion +": " + i);
            Thread.sleep(1);
        }
      }
}
