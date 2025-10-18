import javax.swing.JOptionPane;

public class Empleado {

    /**Creación de Atributos de la clase*/
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado() {
    }

    /**Métodos propios de Java*/
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        if (salario > 0) {
            this.salario = salario;
        } else {
            this.salario = 0;
        }
    }

    /**Métodos Propios*/
    public void obtencionDatos() {

        /**ide al usuario que ingrese su primer nombre*/
        this.setNombre(JOptionPane.showInputDialog("Ingrese su primer nombre:"));

        /**Pide al usuario que ingrese su apellido paterno*/
        this.setApellido(JOptionPane.showInputDialog("Ingrese su apellido paterno:"));

        /**Pide al usuario que ingrese su salario mensual*/
        double salarioIngresado = 0;
        boolean valido = false;

        while (!valido) {
            /**Ingreso de Datos*/
            String entrada = JOptionPane.showInputDialog("Ingrese su salario mensual ($):");
            salarioIngresado = Double.parseDouble(entrada);

            if (salarioIngresado > 0) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se permiten números negativos. Intente nuevamente.");
            }
        }

        this.setSalario(salarioIngresado);
    }


    public void despliegueDeDatos() {
        double aumento, salarioAnual;
        aumento = salario * 1.10;
        salarioAnual = aumento * 12;

        String mensaje = "--------------------------------\n"
                + "Usuario       : " + getNombre() + "\n"
                + "Apellido      : " + getApellido() + "\n"
                + "Salario       : $" + getSalario() + "\n"
                + "Salario con el 10% de aumento : $" + aumento + "\n"
                + "Salario anual                : $" + salarioAnual + "\n"
                + "--------------------------------";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
