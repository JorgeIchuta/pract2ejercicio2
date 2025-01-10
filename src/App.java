public class App {
    public static void main(String[] args) throws Exception {
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion();
        System.out.println("primera fraccion:");
        f1.leer();
        System.out.println("segunda fraccion:");
        f2.leer();
        Fraccion res1 = f1.sumar(f2);
        System.out.print("Suma: ");
        res1.mostrar();
        Fraccion res2 = f1.restar(f2);
        System.out.print("Resta: ");
        res2.mostrar();
        Fraccion res3 = f1.multiplicar(f2);
        System.out.print("Multiplicación: ");
        res3.mostrar();
        Fraccion res4 = f1.dividir(f2);
        System.out.print("División: ");
        res4.mostrar();
        
        int mcd = f1.mcd(f2);
        System.out.print("MCD entre ambas fracciones: ");
        System.out.println(mcd);

    }
}
