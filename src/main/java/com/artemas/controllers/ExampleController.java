package com.artemas.controllers;

import com.artemas.model.Item;
import com.artemas.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by artemasm on 21/06/2017.
 */
@Controller
public class ExampleController {

    @Autowired
    private ExampleService exampleServiceImpl;

    @RequestMapping("/item")
    public @ResponseBody List<Item> getItems(){
        return exampleServiceImpl.getItems();
    }

}
