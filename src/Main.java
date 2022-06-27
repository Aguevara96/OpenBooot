import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println("El coche tiene: " + miCoche.puertas + " puerta");
        suma( 10,30,50);
    }
        public static void suma(int a, int b, int c){
            System.out.println(a+b+c);
        }
}
    class Coche {
        public int puertas = 0;
        public void SumarPuertas(){
            this.puertas++;
        }
    }