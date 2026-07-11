public class PlanesDatosFactory {
 
    public static void calcularConsumo(FabricaCreadora fabrica, String tipo, int numeroMegasConsumidas) {
        PlanDatos plan = fabrica.crearPlanDatos(tipo);

        if (plan == null) {
            System.out.println("Tipo de plan inválido.");
            return;
        }

        System.out.println("\n===== DATOS DEL PLAN =====");
        System.out.println(plan);
        System.out.println("Megas consumidos: " + numeroMegasConsumidas);
        System.out.println("Total a pagar: S/. " + plan.calcularPago(numeroMegasConsumidas));
        
    }
    
}