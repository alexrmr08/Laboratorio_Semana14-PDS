import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     PLANES DE DATOS INTERNET");
        System.out.println("=================================");

        System.out.println("\nSeleccione el proveedor:");
        System.out.println("1. Movistar");
        System.out.println("2. Claro");
        System.out.println("3. Línea Rápida");

        int proveedor = sc.nextInt();

        System.out.println("\nSeleccione el tipo de plan:");
        System.out.println("1. Académico");
        System.out.println("2. Persona");
        System.out.println("3. Negocio");

        int tipoPlan = sc.nextInt();

        System.out.print("\nIngrese la cantidad de megas consumidos: ");
        int megas = sc.nextInt();

        FabricaCreadora fabrica = null;

        switch (proveedor) {

            case 1:
                fabrica = new MovistarFactory();
                break;

            case 2:
                fabrica = new ClaroFactory();
                break;

            case 3:
                fabrica = new LineaRapidaFactory();
                break;

            default:
                System.out.println("Proveedor inválido.");
                sc.close();
                return;
        }

        String tipo = "";

        switch (tipoPlan) {

            case 1:
                tipo = "Academico";
                break;

            case 2:
                tipo = "Persona";
                break;

            case 3:
                tipo = "Negocio";
                break;

            default:
                System.out.println("Tipo de plan inválido.");
                sc.close();
                return;
        }

        PlanesDatosFactory.calcularConsumo(fabrica, tipo, megas);

        sc.close();
    }


}