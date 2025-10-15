import java.util.Scanner;

/**
 3.14 (La clase Fecha) Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un día (tipo int) y
 un año (tipo int). Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe asumir que los valores que
 se proporcionan son correctos. Proporcione un método establecer y un método obtener para cada variable de instancia. Proporcione un
 método mostrarFecha, que muestre el mes, día y año, separados por barras diagonales (/). Escriba una aplicación de prueba llamada
 PruebaFecha, que demuestre las capacidades de la clase Fecha
 */


public class Main {
    public static void main(String[] args) {

        /**Creacion de objetos*/
        Fecha fecha = new Fecha ();
        Scanner sc = new Scanner(System.in);

        /**Ingreso del Año*/
        System.out.print("Ingrese el año: ");
        fecha.setYear(sc.nextInt());
        fecha.ValidacionAño(fecha.getYear());

        /**Ingreso del mes*/
        System.out.print("Ingrese el mes: ");
        fecha.setMes(sc.nextInt());
        fecha.ValidacionMes(fecha.getMes());

        /**Ingrese del día*/
        System.out.print("Ingrese el día: ");
        fecha.setDia(sc.nextInt());
        Integer d1 = fecha.ValidacionDia(fecha.getDia());
        /**Validación día*/
        while (d1 == 1) {
            System.out.print("Ingrese el día de nuevo: ");
            fecha.setDia(sc.nextInt());
            d1 =  fecha.ValidacionDia(fecha.getDia());
        }




        System.out.println(fecha.toString());
    }
}