package android.alanstos.com.br.agendaaluno.modelo;

import java.util.List;

/**
 * Created by A on 16/11/2017.
 */

public class Item {

    private String total_count;

    private List<Repositorio> items;

    public Item(){}

    public String getTotal_count() {
        return total_count;
    }

    public void setTotal_count(String total_count) {
        this.total_count = total_count;
    }

    public List<Repositorio> getItems() {
        return items;
    }

    public void setItems(List<Repositorio> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "total" + total_count +
                " / " +
                "tamanho" + getItems().size();
    }
}
