public class PlanDatosNegocio extends PlanDatos {

    public PlanDatosNegocio(String proveedor) {
        super(proveedor);
        nombre = "Plan Negocio";

        if (proveedor.equalsIgnoreCase("Movistar")) {
            setTasa(0.50f);
        } else if (proveedor.equalsIgnoreCase("Claro")) {
            setTasa(0.48f);
        } else {
            setTasa(0.45f);
        }
    }

    @Override
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
    
}
