package Ejercicio2;

import java.util.Objects;

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

        return "Vendedor{" +
                "comision=" + comision +
                ", totalVentas=" + totalVentas +
                super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendedor vendedor = (Vendedor) o;
        return Float.compare(vendedor.comision, comision) == 0 &&
                Float.compare(vendedor.totalVentas, totalVentas) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comision, totalVentas);
    }
}
