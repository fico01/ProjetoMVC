package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.model.Categoria;
import com.biblioteca.biblioteca.model.Livro;
import com.biblioteca.biblioteca.repository.CategoriaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class CategoriaController {

    private final CategoriaRepository repository;

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/categorias/cadastro")
    public String novoCategoria(Model model) {
        model.addAttribute(
                "categoria", new Categoria()
        );

        return "categorias/cadastro-categoria";
    }

    @GetMapping("/categorias")
    public String listar(Model model) {

        List<Categoria> categorias = repository.findAll();
        model.addAttribute("categoria", categorias);

        return "categorias/lista";

    }

    @PostMapping("/categorias")
    public String cadastrarCategoria(@ModelAttribute Categoria categoria) {
        repository.save(categoria);
        return "redirect:/categorias";

    }

    @GetMapping("/categorias/excluir/{indice}")
    public String excluir(@PathVariable Long indice) {

        repository.deleteById(indice);
        return "redirect:/categorias";

    }
}

