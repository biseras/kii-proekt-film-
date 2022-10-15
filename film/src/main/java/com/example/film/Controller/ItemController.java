package com.example.film.Controller;

import com.example.film.Model.Item;
import com.example.film.Service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
@AllArgsConstructor
public class ItemController {

    private final ItemService service;

    @GetMapping
    private List<Item> listAll(){
        return this.service.findAll();
    }
    @GetMapping("/string")
    private String srt(){
        return "hahahah";
    }
}
