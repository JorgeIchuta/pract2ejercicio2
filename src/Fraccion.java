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
    public void mostrar(){
        System.out.println(numerador+"/"+denominador);
    }
}
