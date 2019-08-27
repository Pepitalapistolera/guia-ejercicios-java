package Ejercicio2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EmpleadoTest {

    @Test
    public void Test1(){
        Empleado empleado = new Empleado();
        Empleado empleado1 = new Empleado("12299592" , "Antonia" , "cardozo" , "tonic@gmail.com" , 100.22f);

    }
}