public class MovistarFactory extends FabricaCreadora{
 
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        if (tipo.equalsIgnoreCase("Plan Academico")) {
            return new PlanDatosAcademico("Movistar");
        
        }

        if (tipo.equalsIgnoreCase("Plan Persona")) {
            return new PlanDatosPersonal("Movistar");
        }

        if (tipo.equalsIgnoreCase("Plan Negocio")) {
            return new PlanDatosNegocio("Movistar");
        }

        return null;
        
    }

}