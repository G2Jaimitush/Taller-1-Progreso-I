/**
 3.16 (Calculadora de la frecuencia cardiaca esperada) Mientras se ejercita, puede
 usar un monitor de frecuencia cardiaca para ver que su corazón permanezca dentro
 de un rango seguro sugerido por sus entrenadores y doctores. De acuerdo con la
 Asociación Estadounidense del Corazón (AHA) (www.americanheart.org/presenter.
 jhtml?identifier=4736), la fórmula para calcular su frecuencia cardiaca máxima en
 pulsos por minuto es 220 menos su edad en años. Su frecuencia cardiaca esperada tiene
 un rango que está entre el 50 y el 85% de su frecuencia cardiaca máxima. [Nota: estas
 fórmulas son estimaciones proporcionadas por la AHA. Las frecuencias cardiacas máxima
 y esperada pueden variar con base en la salud, condición física y sexo del individuo.
 Siempre debe consultar un médico o a un profesional de la salud antes de empezar o
 modificar un programa de ejercicios]. Cree una clase llamada FrecuenciasCardiacas.
 Los atributos de la clase deben incluir el primer nombre de la persona, su apellido y
 fecha de nacimiento (la cual debe consistir de atributos independientes para el mes,
 día y año de nacimiento). Su clase debe tener un constructor que reciba estos datos
 como parámetros. Para cada atributo debe proveer métodos establecer y obtener. La
 clase también debe incluir un método que calcule y devuelva la edad de la persona
 (en años), un método que calcule y devuelva la frecuencia cardiaca máxima de esa
 persona, y otro método que calcule y devuelva la frecuencia cardiaca esperada de la
 persona. Escriba una aplicación de Java que pida la información de la persona, cree
 una instancia de un objeto de la clase FrecuenciasCardiacas e imprima la información
 a partir de ese objeto (incluyendo el primer nombre de la persona, su apellido y
 fecha de nacimiento), y que después calcule e imprima la edad de la persona en (años)
 , frecuencia cardiaca máxima y rango de frecuencia cardiaca esperada.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /**creacion de objetos e inicializacion de variables*/
        FrecuenciaCardiaca cliente =new FrecuenciaCardiaca();

        int anioactual=2025;
        int edad;
        int frecuancia;
        double fa;
        double frecuenciae = 0;
        int dias = 0;
        Scanner sc2 =new Scanner(System.in);
        /** lectura de variable nombre,apellido,año,mes,dia y genero*/

        cliente.ingreso();
        /**calculo de edad mediante metodo calcular edad*/
        edad= cliente.calcularEdad();
        /** calculo de dia mediante metodo calcular dia*/
        dias= cliente.calcularDias();

        /**calculo de frecuencia restando 220 menos la edad*/
        frecuancia=220-edad;

        /**calculo de frecuencia maxima y frecuencia esperada*/

        Integer HRM = cliente.heartRateMax(edad);
        Double frecuencia1 = cliente.rangoEsperado(HRM);



        if (cliente.getGenero().equalsIgnoreCase("hombre")) {
            frecuenciae += 0.5; // Aumenta 0.5 a la frecuencia FINAL
            System.out.println("Ajuste por género aplicado (+0.5% latidos).");
        }

        /**impresion de valores*/
        System.out.println("el usuario con el nombre "+" "+ cliente.getNombre()+ "  y el apellido" +" "+cliente.getApellido());
        System.out.println("su edad es :" +"  "+edad+ " con un total de"+ " " +dias+ " dias");
        System.out.println("su frecuencia cardiaca maxima es:"+frecuancia);
        System.out.println("La frecuencia cardiaca esperada es de  :"+frecuencia1);


    }
}