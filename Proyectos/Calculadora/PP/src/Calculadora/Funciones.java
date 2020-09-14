/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author julio
 */
public class Funciones {
    String a, b;
    float x, y;
    
    public boolean camposVacios(String a, String b){
        if (a.equals("")||b.equals("")||a.equals("")&& b.equals("")) {
            return true;
        }else{
            this.a=a;
            this.b=b;
            return false;
        }
    }
    
    public boolean validarNumeros(){
        try{
            Float.parseFloat(a);
            Float.parseFloat(b);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public void convertir(){
        this.x=Float.parseFloat(a);
        this.y=Float.parseFloat(b);
    }
    public float suma(){
        convertir();
        return x+y;
    }
    public float resta(){
        convertir();
        return x-y;
    }
    public float multi(){
        convertir();
        return x*y;
    }
    public float div(){
        convertir();
        return x/y;
    }
    
    
}
