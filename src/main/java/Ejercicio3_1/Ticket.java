package Ejercicio3_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Ticket {
    private int ID;
    private List<LineaTicket> items;
    private Date fecha;

    public Ticket(int ID, Date fecha) {
        this.ID = ID;
        this.fecha = fecha;
        items = new ArrayList<>();
    }

    public void agregarItem(LineaTicket item) {
        items.add(item);
    }

    public boolean contieneItem(LineaTicket item) {
        return items.contains(item);
    }

    public void removerItem(LineaTicket item) {
        items.remove(item);
    }

    public List<LineaTicket> buscarProducto(String producto) {
        return items.stream()
                .filter(d-> d.getNombre().contains(producto))
                .collect(Collectors.toList());
    }


}

