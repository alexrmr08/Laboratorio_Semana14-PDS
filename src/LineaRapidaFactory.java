public class LineaRapidaFactory extends FabricaCreadora {
    
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        if (tipo.equalsIgnoreCase("Plan Academico")) {
            return new PlanDatosAcademico("Linea Rapida");
        
        }

        if (tipo.equalsIgnoreCase("Plan Persona")) {
            return new PlanDatosPersonal("Linea Rapida");
        }

        if (tipo.equalsIgnoreCase("Plan Negocio")) {
            return new PlanDatosNegocio("Linea Rapida");
        }

        return null;
        
    }
    
}
