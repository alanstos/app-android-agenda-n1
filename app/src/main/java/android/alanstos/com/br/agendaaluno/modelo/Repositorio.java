package android.alanstos.com.br.agendaaluno.modelo;

/**
 * Created by A on 15/11/2017.
 */

public class Repositorio {

    private Long id;

    private String name;

    private String description;

    public Repositorio(){
        super();
    }

    public Repositorio(String name, String description) {
        this.id = 0L;
        this.name = name;
        this.description = description;
    }

    public Repositorio(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
