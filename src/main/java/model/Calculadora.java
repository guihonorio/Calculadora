package model;

/**
 * Modelo da calculadora com as quatro operacoes basicas.
 */
public class Calculadora {

    /** 
    Bug 1: Na soma o operador aritmético estava errado, deveria ser "+" e não "-"
    Bug 2: Na subtração o operador aritmético estava errado, deveria ser "-" e não "+"
    Bug 3: Na multiplicação o operador aritmético estava errado, deveria ser "*" e não "+"
    Bug 4: Na divisão o operador aritmético estava errado, deveria ser "/" e não "*" 
    */
    public double resultado;
    
    public void somar(double a, double b) {
        this.resultado = a + b;
    }

    public void substrair(double a, double b) {
        this.resultado = a - b;
    }

    public void multiplicar(double a, double b) {
        this.resultado = a * b;
    }

    public void dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisao por zero");
        }
        this.resultado = a / b;
    }

    public double getResultado() {
        return resultado;
    }
}
