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
public class Operaciones {
    
     public void Suma(DatosOperacion datos)
    {
        datos.setResultadoSuma(datos.getA()+datos.getB());
    }
    
    public void Resta(DatosOperacion datos)
    {
         datos.setResultadoResta(datos.getA()-datos.getB());
    }
    
    public void Multiplicacion(DatosOperacion datos)
    {
         datos.setResultadoMultiplicacion(datos.getA()*datos.getB());   
    }
     
      public void Division(DatosOperacion datos)
    {
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
      
      public void GeneraOperaciones(DatosOperacion datos)
      {
          this.Suma(datos);
          this.Resta(datos);
          this.Multiplicacion(datos);
          this.Division(datos);
      }

 
    
}
