/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelos.Calculadora;
import vista.Ventana;
import vista.Ventana1;

/**
 *
 * @author hola
 */
public class Principal {
    public static void main(String[] args){
        Calculadora m = new Calculadora();
        Ventana v = new Ventana1();
        
        NumerosListener nl = new NumerosListener(v);
        v.addNumerosListener(nl);
        
        OperacionesListener ol = new OperacionesListener(v,m);
        v.addOperacionesListener(ol);
        
        CalcularListener cl = new CalcularListener(v,m);
        v.addCalcularListener(cl);
        
        v.setVisible(true);
    }
}
