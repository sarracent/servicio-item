package com.sarracent.servicio.item.services;

import com.sarracent.servicio.item.models.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}
