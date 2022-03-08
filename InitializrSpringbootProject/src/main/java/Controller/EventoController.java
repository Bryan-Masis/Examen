package Controller;

import Entity.Evento;
import Service.EventoService;
import Service.IEventoService;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class EventoController {

    @Controller
    public class PersonasController {

        @Autowired
        private IEventoService IEventoService;

        @GetMapping("/")
        public String index(Model model) {
            List<Evento> listaEvento = IEventoService.getAllEvento();
            System.out.print(listaEvento);
            model.addAttribute("titulo", "Eventos");
            model.addAttribute("eventos", listaEvento);
            return "index";
        }

        @GetMapping("/EventoN")
        public String crearPersona(Model model) {
            model.addAttribute("Evento", new Evento());
            return "crear";
        }

        
        @GetMapping("/Delete")
        public String eliminar(Evento evento) {
            IEventoService.delete(evento);
            return "redirect:/index";
        }
        

    }
}
