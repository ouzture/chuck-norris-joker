package ouzture.springframework.chucknorrisjoker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ouzture.springframework.chucknorrisjoker.services.JokesService;

@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping(value = {"/",""})
    public String getRandomJoke(Model model){

        String joke = jokesService.getRandomJoke();

        System.out.println("JOKE:" + joke);

        model.addAttribute("joke", joke);

        return "chucknorris";
    }


}
