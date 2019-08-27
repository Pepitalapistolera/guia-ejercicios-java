package Ejercicio2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class EmpleadoTest {

    private List<Empleado> empleados;

    @BeforeTest
    public void setup(){
        empleados = new ArrayList<>();

        Empleado vendedor1 = new Vendedor("1111", "j", "d", " " ,2000.30f, 10.21f, 10000f);
        Empleado vendedor2 = new Vendedor("1112", "k", "e", " " ,4000.30f, 20.21f, 20000f);

        Empleado admin1 = new Administrativo("1122", "l",  "m", "g", 8000f, 15f, 16f);

        empleados.add(vendedor1);
        empleados.add(vendedor2);
        empleados.add(admin1);

    }


    @Test
    public void Test1(){
        for (Empleado e: empleados) {
            System.out.println(e);
        }

    }
}