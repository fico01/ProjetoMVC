package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.model.Autor;
import com.biblioteca.biblioteca.model.Categoria;
import com.biblioteca.biblioteca.repository.AutorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class AutorController {

    private final AutorRepository repository;

    public AutorController(AutorRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/autores/cadastro")
    public String novoAutor(Model model) {
        model.addAttribute(
                "autor", new Autor()
        );

        return "autores/cadastro-autor";
    }

    @GetMapping("/autores")
    public String listar(Model model) {

        List<Autor> autores = repository.findAll();
        model.addAttribute("autor", autores);

        return "autores/lista";

    }

    @PostMapping("/autores")
    public String cadastrarAutor(@ModelAttribute Autor autor) {
        repository.save(autor);
        return "redirect:/autores";

    }

    @GetMapping("/autores/excluir/{indice}")
    public String excluir(@PathVariable Long indice) {

        repository.deleteById(indice);
        return "redirect:/autores";

    }
}
