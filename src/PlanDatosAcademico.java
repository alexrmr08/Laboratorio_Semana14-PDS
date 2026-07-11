public class PlanDatosAcademico extends PlanDatos {

    public PlanDatosAcademico(String proveedor) {
        super(proveedor);
        nombre = "Plan Academico";

        if (proveedor.equalsIgnoreCase("Movistar")) {
            setTasa(0.20f);
        } else if (proveedor.equalsIgnoreCase("Claro")) {
            setTasa(0.18f);
        } else {
            setTasa(0.15f);
        }
    }

    @Override
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
}