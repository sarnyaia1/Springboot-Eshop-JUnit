package com.spring.tdd.controller;

import com.spring.tdd.model.Notebook;
import com.spring.tdd.model.Tv;
import com.spring.tdd.repository.NotebookRepository;
import com.spring.tdd.repository.TvRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequiredArgsConstructor
public class ProductController {

    private final TvRepository tvRepository;
    private final NotebookRepository notebookRepository;

    @GetMapping(value = "/products")
    public String getAllProducts(){
        return "Some testing products!";
    }

    @GetMapping(value = "/tv")
    public List<Tv> getAllTv(){
        return tvRepository.getProducts();
    }

    @PostMapping(value = "/tv")
    public void addTv(@RequestBody Tv tv){
        tvRepository.addProduct(tv);
    }

    @GetMapping(value = "/notebook")
    public List<Notebook> getAllNotebook(){
        return notebookRepository.getProducts();
    }

    @PostMapping(value = "/notebook")
    public void addNotebook(@RequestBody Notebook notebook){
        notebookRepository.addProduct(notebook);
    }

}
