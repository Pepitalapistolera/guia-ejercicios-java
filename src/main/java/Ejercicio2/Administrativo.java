package Ejercicio2;

public class Administrativo extends Empleado{
    float hsExtra;
    float hsMes;


    public Administrativo(String DNI, String nombre, String apellido, String email, float sueldoBase, float hsExtra, float hsMes) {
        super(DNI, nombre, apellido, email, sueldoBase);
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }


    @Override
    public float getSueldo() {
        return (getSueldoBase()*(hsExtra*1.5f)+ hsMes) /hsMes ;
    }


    @Override
    public String toString() {
        super.toString();
        return "Administrativo{" +
                "hsExtra=" + hsExtra +
                ", hsMes=" + hsMes +
                '}';
    }
}
