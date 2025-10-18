/**
 3.13 (La clase Empleado) Cree una clase llamada Empleado, que incluya tres variables
 de instancia: un primer nombre (tipo String), un apellido paterno (tipo String) y
 un salario mensual (double). Su clase debe tener un constructor que inicialice las
 tres variables de instancia. Proporcione un método establecer y un método obtener
 para cada variable de instancia. Si el salario mensual no es positivo, no establezca s
 u valor. Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las
 capacidades de la clase Empleado. Cree dos objetos Empleado y muestre el salario anual
 de cada objeto. Después, proporcione a cada Empleado un aumento del 10% y muestre el
 salario anual de cada Empleado otra vez.
 */

/**
 Velastegui Jaimea
 Hernandez Pablo Vinicio
 */
public class Main {
    public static void main(String[] args) {

        /**Creacion del Objeto*/
        Empleado empleado = new Empleado();
        Empleado empleado2 = new Empleado("Marco", "Almeida", 123.20);

        /**Llamada de Objetos*/
        empleado.obtencionDatos();
        empleado.despliegueDeDatos();

        empleado2.despliegueDeDatos();
    }
}