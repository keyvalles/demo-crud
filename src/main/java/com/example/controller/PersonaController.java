package com.example.controller;

import com.example.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //para indicar que es el controlador de la aplicación.
@RequestMapping("/persona")
public class PersonaController {

    @Autowired // para la inyeccion de depencia
    private PersonaService personaService;

    /**
     * "@RequestMapping" se utiliza para asignar solicitudes web, puede usarse en la clase como en los métodos
     * "Model" permite definir un modelo en una aplicación Spring MVC
     * Está diseñado para definir atributos al modelo que representa
     * @param model
     * @return nombre de la vista .html
     */
    @RequestMapping(value= "/persona", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    //@GetMapping("/listaPersonas")
    public String urlInicio(Model model) {
        model.addAttribute("lista", personaService.getAll());
        return "urlInicio";
    }

    /**
     * "@GetMappin" se utiliza para asignar solicitudes HTTP GET al método.
     * Es una anotación compuesta que actúa como un acceso directo para @RequestMapping (method = RequestMethod.GET)
     * "@PathVariable" se utiliza para anotar argumentos del método.
     * Se puede usar para declarar parámetros cuando la url necesita valores dinámicos.
     * @param id del objeto
     * @param model
     * @return nombre de la vista .html
     */
    @GetMapping("/save/{id}")
    public String save(@PathVariable("id") Long id, Model model){
        if(id != null){
            model.addAttribute("persona", personaService.getId(id));
        }
        return "redirect:/";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar (@PathVariable("id") Long id, Model model){
        if(id != null){
            personaService.eliminar(id);
        }
        return "redirect:/"; //min 8:19
    }

}
