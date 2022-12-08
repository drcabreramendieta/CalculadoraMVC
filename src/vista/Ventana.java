/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionListener;

/**
 *
 * @author hola
 */
public abstract class Ventana extends javax.swing.JFrame {
    public abstract void addNumerosListener(ActionListener l);
    public abstract void addOperacionesListener(ActionListener l);
    public abstract void addCalcularListener(ActionListener l);
    public abstract void addNumero(String n);
    public abstract String getNumeros();
    public abstract void borrar();
}
