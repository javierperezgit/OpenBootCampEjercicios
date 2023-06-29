public class Main {
    public static void main(String[] args) {
       int resultado= suma(3,6,9);
        System.out.println("La suma de los parametros es igual a " + resultado);

        Coche miAuto = new Coche();
        miAuto.modificarPuertas();
        System.out.println("El numero de puertas es " + miAuto.puertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}

    class Coche {
    public int puertas=0;

        public void modificarPuertas() {
            this.puertas ++ ;
        }
    }