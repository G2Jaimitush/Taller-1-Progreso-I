/**
 3.17 (Computarización de los registros médicos) Un tema relacionado con la salud q
 ue ha estado últimamente en las noticias es la computarización de los registros
 médicos. Esta posibilidad se está tratando con mucho cuidado, debido a las
 delicadas cuestiones de privacidad y seguridad, entre otras cosas. [Trataremos
 esas cuestiones en ejercicios posteriores]. La computarización de los registros
 médicos puede facilitar a los pacientes el proceso de compartir sus perfiles e
 historiales médicos con los diversos profesionales de la salud que consulten.
 Esto podría mejorar la calidad del servicio médico, ayudar a evitar conflictos
 de fármacos y prescripciones erróneas, reducir los costos y, en emergencias,
 podría ayudar a salvar vidas. En este ejercicio usted diseñará una clase “inicial”
 llamada PerfilMedico para una 100 Capítulo 3 Introducción a las clases, los objetos,
 los métodos y las cadenas persona. Los atributos de la clase deben incluir el primer
 nombre de la persona, su apellido, sexo, fecha de nacimiento (que debe consistir de
 atributos separados para el día, mes y año de nacimiento), altura (en centímetros)
 y peso (en kilogramos). Su clase debe tener un constructor que reciba estos datos.
 Para cada atributo, debe proveer los métodos establecer y obtener. La clase también
 debe incluir métodos que calculen y devuelvan la edad del usuario en años, la
 frecuencia cardiaca máxima y el rango de frecuencia cardiaca esperada (vea el
 ejercicio 3.16), además del índice de masa corporal (BM). Escriba una aplicación
 de Java que pida la información de la persona, cree una instancia de un objeto de
 la clase PerfilMedico para esa persona e imprima la información de ese objeto
 (incluyendo el primer nombre de la persona, apellido, sexo, fecha de nacimiento,
 altura y peso), y que después calcule e imprima la edad de esa persona en años,
 junto con el BMI, la frecuencia cardiaca máxima y el rango de frecuencia cardiaca
 esperada. También debe mostrar la tabla de valores del BMI VALORES DE BMI Bajo peso:
 menos de 18.5 Normal: entre 18.5 y 24.9 Sobrepeso: entre 25 y 29.9 Obeso: 30 o más
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** Creación de objetos */
        Fecha fecha_actual = new Fecha();
        PerfilMedico perfil_1 = new PerfilMedico();
        Scanner sc = new Scanner(System.in);

        /** DATOS GENERALES */

        // Ingreso del Año
        System.out.print("Ingrese el año: ");
        fecha_actual.setYear(sc.nextInt());
        fecha_actual.ValidacionAño(fecha_actual.getYear());

        // Ingreso del mes
        System.out.print("Ingrese el mes: ");
        fecha_actual.setMes(sc.nextInt());
        fecha_actual.ValidacionMes(fecha_actual.getMes());

        // Ingreso del día
        System.out.print("Ingrese el día: ");
        fecha_actual.setDia(sc.nextInt());
        Integer d1 = fecha_actual.ValidacionDia(fecha_actual.getDia());

        // Validación día
        while (d1 == 1) {
            System.out.print("Ingrese el día de nuevo: ");
            fecha_actual.setDia(sc.nextInt());
            d1 = fecha_actual.ValidacionDia(fecha_actual.getDia());
        }

        System.out.println("Hoy es: " + fecha_actual.toString());

        /** DATOS DEL PACIENTE */

        // Ingreso de apellido
        sc.nextLine(); // Limpieza del buffer antes de leer texto
        System.out.print("Ingrese el apellido del paciente: ");
        perfil_1.setApellido(sc.nextLine());

        // Ingreso de nombre
        System.out.print("Ingrese el nombre del paciente: ");
        perfil_1.setNombre(sc.nextLine());

        // Ingreso de sexo
        System.out.print("Ingrese el sexo del paciente (M/F): ");
        perfil_1.setSexo(sc.nextLine());

        // Ingreso de año de nacimiento
        System.out.println("FECHA DE NACIMIENTO:");
        System.out.print("  Ingrese el año: ");
        perfil_1.setYear_nacimiento(sc.nextInt());

        // Ingreso del mes de nacimiento
        System.out.print("  Ingrese el mes: ");
        perfil_1.setMes_nacimiento(sc.nextInt());

        // Ingreso del día de nacimiento
        System.out.print("  Ingrese el día: ");
        perfil_1.setDia_nacimiento(sc.nextInt());

        // Ingreso de altura
        System.out.print("Ingrese la altura (cm): ");
        perfil_1.setAltura_cm(sc.nextDouble());

        // Ingreso de peso
        System.out.print("Ingrese el peso (kg): ");
        perfil_1.setPeso_kg(sc.nextDouble());

        /** Cálculo de IMC y Frecuencia Cardiaca */
        Integer edad = perfil_1.CalculoEdad(
                fecha_actual.getYear(),
                fecha_actual.getMes(),
                fecha_actual.getDia()
        );

        perfil_1.heartRate(edad);
        Double perfil_1_IMC = perfil_1.Bmi();
        System.out.println("Su IMC es: " + perfil_1_IMC);

        perfil_1.ImcTabla(perfil_1_IMC);
    }
}
