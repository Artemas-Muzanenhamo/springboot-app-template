package com.artemas.servicesImpl;

import com.artemas.model.Item;
import com.artemas.services.ExampleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by artemasm on 21/06/2017.
 */
@Service
public class ExampleServiceImpl implements ExampleService{

    private List<Item> items = new ArrayList<>(Arrays.asList(
            new Item("orange", "Orange", "This is a Citric Fruit", "Fruit")
    ));

    @Override
    public List<Item> getItems() {

        return items;
    }
}
