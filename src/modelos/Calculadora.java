/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author hola
 */
public class Calculadora {
    private double op1, op2;
    private String oper;
    private Operacion operacion;

    public Calculadora() {
        operacion = new Operacion();
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }
    
    public double calcular(){
        switch(oper){
            case "+":
                return operacion.suma(op1, op2);
            case "-":
                return operacion.resta(op1, op2);
            case "*":
                return operacion.multiplicacion(op1, op2);
            case "/":
                return operacion.division(op1, op2);
        }
        return 0;
    }
}
