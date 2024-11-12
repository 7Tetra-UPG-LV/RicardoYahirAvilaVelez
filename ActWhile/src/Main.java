import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa el numero de alumnos en el grupo: ");
        Scanner sc = new Scanner(System.in);
        int grupo = sc.nextInt();
        while (grupo < 40) {
            System.out.println("Aun hay espacio para mas alumnos");
            grupo++;
            System.out.println("El numero de alumnos actual es: " + grupo);


        }

    }
}