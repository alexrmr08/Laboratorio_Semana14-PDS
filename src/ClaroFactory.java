public class ClaroFactory extends FabricaCreadora {
    
    @Override
    public PlanDatos crearPlanDatos(String tipo) {

        if (tipo.equalsIgnoreCase("Plan Academico")) {
            return new PlanDatosAcademico("Claro");
        
        }

        if (tipo.equalsIgnoreCase("Plan Persona")) {
            return new PlanDatosPersonal("Claro");
        }

        if (tipo.equalsIgnoreCase("Plan Negocio")) {
            return new PlanDatosNegocio("Claro");
        }

        return null;
    }
    
}
