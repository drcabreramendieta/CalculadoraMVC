/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Ventana;

/**
 *
 * @author hola
 */
public class NumerosListener implements ActionListener{
    private Ventana v;

    public NumerosListener(Ventana v) {
        this.v = v;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        v.addNumero(ae.getActionCommand());
    }
    
}
