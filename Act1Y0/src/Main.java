import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa 1 para renovar tu suscripcion o 0 para cancelar suscripcion: ");
        Scanner sc = new Scanner(System.in);
        int eleccion = sc.nextInt();
        if (eleccion == 1){
            System.out.println("Ingresa la cantidad de meses a renovar: ");
            String renovar = sc.next();
            System.out.println("Suscripcion renovada por " + renovar + " meses");

        }
        else if (eleccion == 0){
            System.out.println("Si estas seguro de querer cancelar tu suscripcion presiona 1, de lo contrario, presiona 2: ");
            int eleccion1 = sc.nextInt();
            if (eleccion1 == 1){
                System.out.println("Suscripcion cancelada");
            }
            else if (eleccion1 == 2){
                System.out.println("Cancelacion interrumpida");
            }

        }

    }
}