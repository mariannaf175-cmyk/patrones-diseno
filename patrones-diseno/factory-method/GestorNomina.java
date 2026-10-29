import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestorNomina {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ConfiguracionNomina config = new ConfiguracionNomina();

    // Cada tipo de empleado se asocia a su creador (Factory Method)
    private Map<String, EmpleadoCreator> creadores = new HashMap<>();

    public GestorNomina() {
        creadores.put("FIJO", new EmpleadoFijoCreator());
        creadores.put("HORAS", new EmpleadoPorHorasCreator());
        creadores.put("COMISION", new EmpleadoPorComisionCreator());
        creadores.put("CONTRATISTA", new ContratistaCreator());
        creadores.put("PRACTICANTE", new PracticanteCreator());
    }

    public ConfiguracionNomina getConfig() {
        return config;
    }

    public void cargar(String[] lineas) {
        for (String linea : lineas) {
            String[] d = linea.split(";");
            EmpleadoCreator creador = creadores.get(d[0].trim().toUpperCase());
            if (creador == null) {
                throw new IllegalArgumentException("Tipo de empleado desconocido: " + d[0]);
            }
            empleados.add(creador.crearEmpleado(d));
        }
    }

    public void imprimirSalud() {
        System.out.println("Salud en GestorNomina:  " + config.getPorcentajeSalud() * 100 + " %");
    }

    public void imprimirNomina() {
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + ": " + String.format("%.0f", e.calcularSalario()));
        }
    }
}
