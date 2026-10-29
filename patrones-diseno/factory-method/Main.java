public class Main {
    public static void main(String[] args) {
        GestorNomina gestor = new GestorNomina();
        ExportadorCSV exportador = new ExportadorCSV();
        gestor.getConfig().setPorcentajeSalud(0.05);
        gestor.imprimirSalud();
        exportador.imprimirSalud();

        String[] lineas = {
            "FIJO;Ana Ruiz;3500000",
            "HORAS;Luis Gómez;120;18000",
            "CONTRATISTA;Marta Díaz;4200000"
        };
        gestor.cargar(lineas);
        System.out.println();
        gestor.imprimirNomina();

        Empleado ana = new EmpleadoFijo("Ana Ruiz", 3500000);
        Empleado luis = new EmpleadoPorHoras("Luis Gómez", 120, 18000);
        ReciboNomina r1 = new ReciboNomina(ana, 0, 250000, 0, 0);
        ReciboNomina r2 = new ReciboNomina(luis, 180000, 0, 0, 120000);
        System.out.println();
        System.out.println("Recibo " + r1.getNombreEmpleado() + ": " + String.format("%.0f", r1.totalPagar()));
        System.out.println("Recibo " + r2.getNombreEmpleado() + ": " + String.format("%.0f", r2.totalPagar()));
    }
}
