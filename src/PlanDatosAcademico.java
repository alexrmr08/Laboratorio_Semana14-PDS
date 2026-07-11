public class PlanDatosAcademico extends PlanDatos {

    public PlanDatosAcademico(String proveedor) {
        super(proveedor);
        nombre = "Plan Academico";

        if (proveedor.equalsIgnoreCase("Movistar")) {
            setTasa(1.25f);
        } else if (proveedor.equalsIgnoreCase("Claro")) {
            setTasa(1.20f);
        } else {
            setTasa(1.00f);
        }
    }

    @Override
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
}