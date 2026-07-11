public class PlanDatosPersona extends PlanDatos {

    public PlanDatosPersona(String proveedor) {
        super(proveedor);
        nombre = "Plan Persona";

        if (proveedor.equalsIgnoreCase("Movistar")) {
            setTasa(0.30f);
        } else if (proveedor.equalsIgnoreCase("Claro")) {
            setTasa(0.28f);
        } else {
            setTasa(0.25f);
        }
    }

    @Override
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
    
}
