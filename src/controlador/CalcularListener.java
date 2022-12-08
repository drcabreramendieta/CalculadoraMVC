/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Ventana;
import modelos.Calculadora;

/**
 *
 * @author hola
 */
public class CalcularListener implements ActionListener{
    Ventana v;
    Calculadora m;

    public CalcularListener(Ventana v, Calculadora m) {
        this.v = v;
        this.m = m;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String numeros = v.getNumeros();
        double numerosD = Double.parseDouble(numeros);
        m.setOp2(numerosD);
        double resultado = m.calcular();
        v.borrar();
        v.addNumero(resultado+"");
    }
    
}
