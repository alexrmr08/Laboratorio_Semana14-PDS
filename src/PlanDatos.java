public abstract class PlanDatos {

    protected String nombre;
    protected String proveedor; 
    protected float tasa;

    PlanDatos(String proveedor) {
        this.proveedor = proveedor;
    }

    public abstract void setTasa(float tasa);

    public float calcularPago(float megas) {
        return megas * tasa;
    }

    @Override
    public String toString() {
        return "Proveedor: " + proveedor + 
                "\nPlan: " + nombre + 
                "\nCosto por MB: " + tasa;
    }

}