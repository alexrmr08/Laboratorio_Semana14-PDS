public class PlanDatosPersonal extends PlanDatos {

    public PlanDatosPersonal(String proveedor) {
        super(proveedor);
        nombre = "Plan Persona";

        if (proveedor.equalsIgnoreCase("Movistar")) {
            setTasa(0.80f);
        } else if (proveedor.equalsIgnoreCase("Claro")) {
            setTasa(0.60f);
        } else {
            setTasa(0.50f);
        }
    }

    @Override
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
    
}
