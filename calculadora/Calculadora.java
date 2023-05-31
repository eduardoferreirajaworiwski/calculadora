package calculadora;

public class Calculadora {
    private double valorA;
    private double valorB;

    public Calculadora(){
        this(0.0, 0.0);

    }

    public Calculadora(double valorA, double valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    
}