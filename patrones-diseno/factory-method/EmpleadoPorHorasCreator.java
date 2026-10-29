public class EmpleadoPorHorasCreator extends EmpleadoCreator {
    @Override
    public Empleado crearEmpleado(String[] d) {
        return new EmpleadoPorHoras(d[1], Double.parseDouble(d[2]), Double.parseDouble(d[3]));
    }
}
