public class ConfiguracionNomina {
    private static ConfiguracionNomina instancia;
    private double porcentajeSalud = 0.04;
    private ConfiguracionNomina() {
    }

    public static synchronized ConfiguracionNomina getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionNomina();
        }
        return instancia;
    }

    public double getPorcentajeSalud() {
        return porcentajeSalud;
    }

    public void setPorcentajeSalud(double porcentajeSalud) {
        this.porcentajeSalud = porcentajeSalud;
    }
}
