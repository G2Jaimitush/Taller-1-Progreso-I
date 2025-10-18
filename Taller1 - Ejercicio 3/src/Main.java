import javax.swing.JOptionPane;

/**
 3.14 (La clase Fecha)
 Cree una clase llamada Fecha, que incluya tres variables de instancia:
 un mes (tipo int), un día (tipo int) y un año (tipo int).
 Su clase debe tener un constructor que inicialice las tres variables de instancia,
 y debe asumir que los valores que se proporcionan son correctos.
 Proporcione un método establecer y un método obtener para cada variable de instancia.
 Proporcione un método mostrarFecha, que muestre el mes, día y año, separados por barras diagonales (/).
 Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.
 */

public class Main {
    public static void main(String[] args) {

        /** Creación de objeto */
        Fecha fecha = new Fecha();

        /** Ingreso del Año con validación */
        int anio;
        do {
            anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));
            fecha.setYear(anio);
            if (fecha.ValidacionAño(fecha.getYear()) == 1) {
                JOptionPane.showMessageDialog(null, "Error: Año menor a 2025. Intente nuevamente.");
            }
        } while (fecha.ValidacionAño(fecha.getYear()) == 1);

        /** Ingreso del Mes con validación */
        int mes;
        do {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (1-12):"));
            fecha.setMes(mes);
            if (fecha.ValidacionMes(fecha.getMes()) == 1) {
                JOptionPane.showMessageDialog(null, "Error: Mes fuera de rango. Intente nuevamente.");
            }
        } while (fecha.ValidacionMes(fecha.getMes()) == 1);

        /** Ingreso del Día con validación */
        int dia;
        int d1;
        do {
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día:"));
            fecha.setDia(dia);
            d1 = fecha.ValidacionDia(fecha.getDia());
            if (d1 == 1) {
                JOptionPane.showMessageDialog(null, "Error: Día fuera de rango o inválido. Intente nuevamente.");
            }
        } while (d1 == 1);

        /** Mostrar fecha final */
        JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + fecha.toString());
    }
}
