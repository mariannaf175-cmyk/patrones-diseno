public class EmpleadoFijoCreator extends EmpleadoCreator {
    @Override
    public Empleado crearEmpleado(String[] d) {
        return new EmpleadoFijo(d[1], Double.parseDouble(d[2]));
    }
}
