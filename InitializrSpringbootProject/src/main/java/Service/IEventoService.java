
package Service;

import Entity.Evento;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public interface IEventoService {
    public List<Evento> getAllEvento();
    public void saveEvento(Evento evento);
    public Evento getEventoById(Long id);
    public void delete(Evento evento);

    
}
