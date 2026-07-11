public class PlanDatosNegocio extends PlanDatos {

    public PlanDatosNegocio(String proveedor) {
        super(proveedor);
        nombre = "Plan Negocio";

        if (proveedor.equalsIgnoreCase("Movistar")) {
            setTasa(1.60f);
        } else if (proveedor.equalsIgnoreCase("Claro")) {
            setTasa(1.60f);
        } else {
            setTasa(1.50f);
        }
    }

    @Override
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
    
}
