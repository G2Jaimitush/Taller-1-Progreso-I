import java.util.Scanner;

public class Factura {
    /**Creacion de Atributos*/
    private String tipoPieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    /**Creacion de Constructor*/
    public Factura() {
    }

    /**Metodos propios de Java*/
    public String getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void despligue (){
        /**Creacion de objetos*/
        Scanner sc = new Scanner(System.in);
        /**Despliegue del contenido*/
        System.out.print("Descripcion del producto: ");
        this.setDescripcion(sc.nextLine());

        System.out.print("Ingrese el tipo de pieza: ");
        this.setTipoPieza(sc.nextLine());

        System.out.print("Ingrese la cantidad de " + this.getDescripcion() + "/s: ");
        this.setCantidad(sc.nextInt());
        /**Validacion que no se ingrese numeros negativos*/
        while (cantidad  <  0){
            System.out.print("No se permite el ingreso de datos negativos. Intentalo nuevamente");
            this.setCantidad(sc.nextInt());
        }

        System.out.print("Ingrese el precio: $ ");
        this.setPrecio(sc.nextDouble());
        /**Validadcion que no se ingree numeros negativos*/
        while (precio  < 0){
            System.out.print("No se permite e ingreso de datos negativos. Intentalo nuevamente");
            this.setPrecio(sc.nextDouble());
        }
    }

    /**Calcular el TOTAL*/
    public double total (){
        double Total;
        Total = getCantidad() * getPrecio();
        return Total;
    }

    public void factura (){
        /**Despligue de la factura*/
        System.out.println("---------------------------");
        System.out.println("Articulo    : " + getDescripcion());
        System.out.println("Tipo        : " + getTipoPieza());
        System.out.println("Cantidad    : " + getCantidad());
        System.out.println("Precio      : " + getPrecio());
        System.out.println("TOTAL       : " + total());

    }
}


