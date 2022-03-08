
package Entity;

 import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table (name="evento")


public class Evento implements Serializable {
    @ManyToOne
    @JoinColumn(name="id")
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String Artista;
    private long Precio;
    private String Capacidadmx;
    private String Lugar;
    
   
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public long getPrecio() {
        return Precio;
    }

    public void setPrecio(long Precio) {
        this.Precio = Precio;
    }

    public String getCapacidadmx() {
        return Capacidadmx;
    }

    public void setCapacidadmx(String Capacidadmx) {
        this.Capacidadmx = Capacidadmx;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
    

    
}
