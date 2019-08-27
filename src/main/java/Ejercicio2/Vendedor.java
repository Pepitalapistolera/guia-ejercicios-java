package Ejercicio2;

public class Vendedor extends Empleado{
    public Vendedor(String DNI, String nombre, String apellido, String email, float sueldoBase, float comision, float totalVentas) {
        super(DNI, nombre, apellido, email, sueldoBase);
        this.comision = comision;
        this.totalVentas = totalVentas;
    }


    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    private float comision;
    private float totalVentas;


    @Override
    public float getSueldo() {
        return ((getSueldoBase()+comision)*totalVentas)/100;
    }

    @Override
    public String toString() {
        super.toString();
        return "Vendedor{" +
                "comision=" + comision +
                ", totalVentas=" + totalVentas +
                '}';
    }
}
