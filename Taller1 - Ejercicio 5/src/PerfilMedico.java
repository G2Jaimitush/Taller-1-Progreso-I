/*Los atributos de la clase deben incluir el primer nombre de
la persona,
su apellido, sexo, fecha de nacimiento (que debe consistir de
 atributos separados para el día, mes y año de nacimiento),
  altura (en centímetros) y peso (en kilogramos).
Su clase debe tener un constructor que reciba estos datos. */

public class PerfilMedico {
    /**Creacion de atributos*/
    private String nombre;
    private String apellido;
    private String sexo;
    private String fecha_nacimiento;
    private Integer year_nacimiento;
    private Integer mes_nacimiento;
    private Integer dia_nacimiento;
    private Double altura_cm;
    private Double peso_kg;


    /**Creacion de Constructor*/
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Integer getYear_nacimiento() {
        return year_nacimiento;
    }

    public void setYear_nacimiento(Integer year_nacimiento) {
        this.year_nacimiento = year_nacimiento;
    }

    public Integer getMes_nacimiento() {
        return mes_nacimiento;
    }

    public void setMes_nacimiento(Integer mes_nacimiento) {
        this.mes_nacimiento = mes_nacimiento;
    }

    public Integer getDia_nacimiento() {
        return dia_nacimiento;
    }

    public void setDia_nacimiento(Integer dia_nacimiento) {
        this.dia_nacimiento = dia_nacimiento;
    }

    public Double getAltura_cm() {
        return altura_cm;
    }

    public void setAltura_cm(Double altura_cm) {
        this.altura_cm = altura_cm;
    }

    public Double getPeso_kg() {
        return peso_kg;
    }

    public void setPeso_kg(Double peso_kg) {
        this.peso_kg = peso_kg;
    }

    /**
     * Metodos Propios
     *
     * @return
     */
    public Integer CalculoEdad(Integer year, Integer mes, Integer dia) {
        int edad;

        if (mes >= mes_nacimiento) {
            if (dia >= dia_nacimiento) {
                edad = year - year_nacimiento;
                System.out.println("Tu edad es de: " + edad);
                return edad;
            }
        }

        edad = (year - year_nacimiento) - 1;
        System.out.println("La edad es: " + edad);
        return edad;
    }


    //frecuencia cardiaca
    public void heartRate (Integer edad){

        Integer hrMax =(220-edad);
        Double Li=hrMax*0.5;
        Double Ls=hrMax*0.85;
        System.out.println("La frecuencia máxima de " + this.nombre + " es "+hrMax+".");
        System.out.println("Se espera que su frecuencia esté entre "+Li+"lpm y "+Ls+"lmp");

    }


    public Double Bmi (){
        double altura_m = altura_cm / 100;
        double imc = peso_kg/(altura_m*altura_m);
        return imc;
    }


    public void ImcTabla (double imc){

        System.out.println("===========================================");
        System.out.println("     TABLA DE ÍNDICE DE MASA CORPORAL (IMC)");
        System.out.println("===========================================");
        System.out.println("|  Clasificación  |       Rango (IMC)      |");
        System.out.println("-------------------------------------------");
        System.out.println("|  Bajo peso      |   Menos de 18.5        |");
        System.out.println("|  Normal         |   18.5 - 24.9          |");
        System.out.println("|  Sobrepeso      |   25.0 - 29.9          |");
        System.out.println("|  Obeso          |   30.0 o más           |");
        System.out.println("===========================================");


        if (imc < 18.5){
            System.out.println("Estas BAJO PESO");
        }else if (imc >=  18.5 && imc <= 24.9){
            System.out.println("Tienes un PESO NORMAL");
        }else if (imc >= 25){
            System.out.println("Tienes SOBRE PESO");
        }else{
            System.out.println("Estas OBESO");
        }
    }

}

