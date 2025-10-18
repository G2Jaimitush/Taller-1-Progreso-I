import java.util.Scanner;

public class FrecuenciaCardiaca {
    /**creacion de parametros de la clase*/
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int  anio;
    private String genero;

    Scanner sc = new Scanner(System.in);
    /**metodos propios de java*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    /**metodos propios creados*/
    public FrecuenciaCardiaca() {
    }

    public FrecuenciaCardiaca(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**metodo propio para el ingreso de datos*/
    public void ingreso(){
        System.out.println("Ingrese su nombre:");
        this.setNombre(sc.nextLine());
        System.out.println("ingrese su apellido:");
        this.setApellido(sc.nextLine());
        System.out.println("ingrese el anio de nacimiento:");
        this.setAnio(Integer.parseInt(sc.nextLine()));
        System.out.println("ingrese el mes de nacimiento:");
        do {
            this.setMes(Integer.parseInt(sc.nextLine()));
            if (getMes()>12 || getMes()<1){
                System.out.println("Ingrese un mes valido 1-12");
            }


        }while(getMes()>12 || getMes()<1);

        System.out.println("ingrese el dia de nacimiento:");

        do {
            this.setDia(Integer.parseInt(sc.nextLine()));
            if (getDia()>31||getDia()<1){
                System.out.println("ingrese un dia valido en el calendario 1-31");
            }


        }while (getDia()>31||getDia()<1);

        System.out.println("ingrese su genero");
        this.setGenero(sc.nextLine());
    }
    /** metodo propio para el calculo de la edad*/
    public int calcularEdad() {
        int edad = 2025 - this.anio;

        // Ajuste si aún no ha cumplido años en el año actual
        if (this.mes > 10 || (this.mes == 10 && this.dia > 14)) {
            edad--;
            System.out.println("Aún no cumple años.");
        }
        return edad;
    }
    /**metodo propio para el calculo de dias*/
    public int calcularDias() {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = 0;

        // Sumar los días de los meses COMPLETOS anteriores al mes de nacimiento
        for (int i = 0; i < this.mes - 1; i++) {
            dias += diasPorMes[i];
        }

        // Sumar los días del mes actual (día de nacimiento)
        dias += this.dia;
        return dias;
    }

    public Integer heartRateMax (Integer edad){

        return 220-edad;

    }

    public Double rangoEsperado (Integer HRM){
        Double Li=HRM*0.5;
        Double Ls=HRM*0.85;
        System.out.println("La frecuencia máxima de " + this.nombre + " es "+HRM+".");
        System.out.println("Se espera que su frecuencia esté entre "+Li+"lpm y "+Ls+"lmp");
        return Ls-Li;

    }




}


 