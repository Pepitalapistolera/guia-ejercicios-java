package Ejercicio3_1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

public class TicketTest {
    private Ticket ticket;


    @BeforeTest
    public void setUp(){
        ticket = new Ticket(1, new Date());
    }

    @Test
    public void testAgregarItems(){
        LineaTicket item = new LineaTicket("coca", 1, 20);
        ticket.agregarItem(item);

        LineaTicket item2 = new LineaTicket("chizi", 2, 59);
        ticket.agregarItem(item2);

        ticket.removerItem(item);
    }

}