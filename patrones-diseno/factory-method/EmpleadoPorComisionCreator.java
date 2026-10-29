public class EmpleadoPorComisionCreator extends EmpleadoCreator {
    @Override
    public Empleado crearEmpleado(String[] d) {
        return new EmpleadoPorComision(d[1], Double.parseDouble(d[2]), Double.parseDouble(d[3]));
    }
}
