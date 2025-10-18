public class Fecha {
    /**Creacion de atributos*/
    private int year;
    private int mes;
    private int dia;

    /**Constructores*/
    public Fecha() {}
    public Fecha(int year, int mes, int dia) {
        this.year = year;
        this.mes = mes;
        this.dia = dia;
    }

    /**Getters y Setters*/
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }
    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    /**Validaciones con retorno 1 = error, 0 = correcto*/

    public int ValidacionAño(int year) {
        if (year < 2025) {
            return 1; // Error
        }
        return 0; // Correcto
    }

    public int ValidacionMes(int mes) {
        if (mes < 1 || mes > 12) {
            return 1; // Error
        }
        return 0; // Correcto
    }

    public int ValidacionDia(int dia) {
        if (dia < 1 || dia > 31) {
            return 1;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            if (mes == 2 && dia > 29) {
                return 1;
            }
        } else if (mes == 2 && dia > 28) {
            return 1;
        }
        return 0;
    }

    /**Mostrar la fecha*/
    public String toString() {
        return dia + " / " + mes + " / " + year;
    }
}
