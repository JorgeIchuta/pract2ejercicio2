public class App {
    public static void main(String[] args) throws Exception {
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion();
        System.out.println("primera fraccion:");
        f1.leer();
        System.out.println("segunda fraccion:");
        f2.leer();
        Fraccion res = f1.sumar(f2);
        res.mostrar();
    }
}
