package bo.edu.umss.cs.ceis;

public class Main {

    public static void main(String[] args) {
        Fecha hoy = new Fecha(01,13,1006);
        hoy.mostrarFechaCorta();
        hoy.mostrarFechaLarga();
    }
    /*
    343469  - 3
    21 - 1
    466 - 3
    17 - 0
    */

    public static void digitosPares(int n) {
        int num = 0, total = 0;
        while (n != 0) {
            if ((n % 2) == 0) {
                total++;
            }
            n /= 10;
        }
        System.out.print("total " + total);
    }

    //obtenerInverso   350  053
    public static void mostrarInverso(int n) {
        int num = 0;
        while (n != 0) {
            System.out.print("" + (n % 10));
            n /= 10;
        }
    }

    public static void piramide(int n) {
        int cont = 1;
        while (cont <= n) {
            for (int x = 1; x <= cont; x++) {
                System.out.print("*");
            }
            System.out.println();
            cont++;
        }
    }

    public static void mostrarNaturales(int n) {

        for (int x = 1; x <= n; x++) {
            System.out.println(x);
        }
    }

    public static int mayor(int a, int b) {

        int mayor = a;

        if (b > a) {
            mayor = b;
        }

        return mayor;
    }

    public static void primeraClase() {
        System.out.println("Bienvenidos UMSS!!!");

        int x = 3;

        System.out.println(x++);
        System.out.println(x);

        Object xx = "Holaaa";

        //xx = 3D;

        if (xx instanceof String) {
            System.out.println(xx + " Es una cadena");
        } else if (xx instanceof Integer) {
            System.out.println(xx + " Es un entero!");
        } else {
            System.out.println(xx + " No es nada!");
        }
    }
}
