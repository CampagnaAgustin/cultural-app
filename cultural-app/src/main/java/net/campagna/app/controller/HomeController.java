package net.campagna.app.controller;

import net.campagna.app.model.Artist;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String goHome() {
        return "home";
    }

    @RequestMapping(value="/detail", method=RequestMethod.GET)
    public String mostrarDetalle(Model model){
        String nombreEvento = "Ciclo auxiliar";
        int horarioInicio = 22;
        int precioEntrada = 100;

        model.addAttribute("nombre", nombreEvento);
        model.addAttribute("inicio", horarioInicio);
        model.addAttribute("precio", precioEntrada);

        return "detalle";
    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String lista(Model model){
        List<Artist> bandas = this.getArtists();
        model.addAttribute("bandas", bandas);
        return "list";
    }

    private List<Artist> getArtists(){
        try {
            List<Artist> list = new LinkedList<>();

            Artist artistOne = new Artist();
            artistOne.setId(1);
            artistOne.setName("Boureal");
            artistOne.setMembers(4);
            artistOne.getTags().add("Noise");
            artistOne.getLinks().add("www.boureal.com");

            Artist artistTwo = new Artist();
            artistTwo.setId(2);
            artistTwo.setName("Bidones auxiliares");
            artistTwo.setMembers(3);
            artistTwo.getTags().add("Noise");
            artistTwo.getLinks().add("www.bidonesauxiliares.com");

            Artist artistThree = new Artist();
            artistThree.setId(3);
            artistThree.setName("El ventilador asesino");
            artistThree.setMembers(3);
            artistThree.getTags().add("Post Rock");
            artistThree.getLinks().add("wwww.elventiladorasesino.com");

            list.add(artistOne);
            list.add(artistTwo);
            list.add(artistThree);

            return list;
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
            return null;
        }
    }

}