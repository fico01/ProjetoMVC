package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.model.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class AutorController {

    @GetMapping("/autores/cadastro")
    public String novoAutor(Model model) {
        model.addAttribute(
                "autor", new Autor()
        );

        return "autores/cadastro-autor";
    }

    @PostMapping("/autores")
    public String cadastrarAutor(@ModelAttribute Autor autor) {
        return "/autores/confirmacao";

    }
}
