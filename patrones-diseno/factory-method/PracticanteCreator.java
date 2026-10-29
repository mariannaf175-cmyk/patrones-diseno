public class PracticanteCreator extends EmpleadoCreator {
    @Override
    public Empleado crearEmpleado(String[] d) {
        return new Practicante(d[1], Double.parseDouble(d[2]));
    }
}
