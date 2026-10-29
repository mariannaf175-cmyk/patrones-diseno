public class ContratistaCreator extends EmpleadoCreator {
    @Override
    public Empleado crearEmpleado(String[] d) {
        return new Contratista(d[1], Double.parseDouble(d[2]));
    }
}
