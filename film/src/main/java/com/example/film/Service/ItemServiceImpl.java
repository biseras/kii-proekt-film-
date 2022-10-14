package com.example.film.Service;

import com.example.film.Model.Item;
import com.example.film.Repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;

    @Override
    public List<Item> findAll() {
        return this.repository.findAll();
    }
}