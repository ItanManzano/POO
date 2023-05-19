package org.example.modelo;

public class Calculadora {
    private double operando1;
    private double operando2;

    public Calculadora() {
    }

    public Calculadora(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "operando1=" + operando1 +
                ", operando2=" + operando2 +
                '}';
    }

    public double sumar(){
        return operando1 + operando2;
    }
}
