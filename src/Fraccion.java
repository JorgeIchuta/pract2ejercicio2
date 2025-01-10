import java.util.*;
public class Fraccion {
    private int numerador;
    private int denominador;
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }
    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public void leer(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese el numerador: ");
        this.numerador = lee.nextInt();
        System.out.println("Ingrese el denominador: ");
        this.denominador = lee.nextInt();
    }
    public Fraccion sumar(Fraccion q){
        int num = (this.numerador * q.denominador) + (this.denominador * q.numerador);
        int den = this.denominador * q.denominador;
        return new Fraccion(num, den);
    }
    public Fraccion restar(Fraccion q) {
        int num = (this.numerador * q.denominador) - (this.denominador * q.numerador);
        int den = this.denominador * q.denominador;
        return new Fraccion(num, den);
    }
    public Fraccion multiplicar(Fraccion q) {
        int num = this.numerador * q.numerador;
        int den = this.denominador * q.denominador;
        return new Fraccion(num, den);
    }
    public Fraccion dividir(Fraccion q) {
        if (q.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por una fracción con numerador 0.");
        }
        int num = this.numerador * q.denominador;
        int den = this.denominador * q.numerador;
        return new Fraccion(num, den);
    }
    public int mcd(Fraccion q) {
        int mcdNumerador = calcularMCD(this.numerador, q.numerador);
        int mcdDenominador = calcularMCD(this.denominador, q.denominador);
        System.out.println("MCD de numeradores: " + mcdNumerador);
        System.out.println("MCD de denominadores: " + mcdDenominador);
        return calcularMCD(mcdNumerador, mcdDenominador);
    }
    private int calcularMCD(int a, int b) {
        a = Math.abs(a); // Tomar valor absoluto
        b = Math.abs(b); // Tomar valor absoluto
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public void mostrar(){
        System.out.println(numerador+"/"+denominador);
    }
}
