import java.util.Scanner;

public class Fecha {
    /**Creacion de atributos*/
    private int year;
    private int mes;
    private int dia;

    /**Creacion de Constructor*/
    public Fecha() {
    }

    /**Metodos propios de Java*/
    public Fecha(int year, int mes, int dia) {
        this.year = year;
        this.mes = mes;
        this.dia = dia;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    /**Metodos Propios*/
    public void ValidacionAño (int year){

        Scanner sc = new Scanner(System.in);

        if (this.year < 2025){
            System.out.println("No se puede ingresar un year menor al year existente");
            System.out.print("Ingrese el año presente (2025 ULTIMA ACTUALIZACION): ");
            this.setYear(sc.nextInt());
        }

    }

    public void ValidacionMes (int mes){

        Scanner sc = new Scanner(System.in);

        if ((year == 2025) && (mes < 10)){
            System.out.println("No se puede ingresar un mes posterior al actual en el 2025 Octubre");
            System.out.print("Ingrese nuevamente el mes: ");
            this.setMes(sc.nextInt());
        }

        if (mes < 1 || mes >12){
            System.out.println("No se puede ingresar meses fuera del rango");
            System.out.print("Ingrese nuevamente el mes: ");
            this.setMes(sc.nextInt());
        }

    }

    public Integer ValidacionDia (int dia) {
        if (dia < 1 || dia > 31) {
            System.out.println("No se puede ingresar días fuera del rango");
            return 1;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            if (mes == 2 && dia>29 ) {
                System.out.println("El año " + year + " es bisiesto, febrero  tiene 29 días");
                return 1;
            }

        }
        if (mes == 2 && dia>28) {
            System.out.println("El año " + year + " no es bisiesto, febrero  tiene 28 días");
            return 1;
        }else{
            return 0;
        }
    }

    public String toString(){
        return  "" + dia + " / " + mes + " / " + year;
    }

}