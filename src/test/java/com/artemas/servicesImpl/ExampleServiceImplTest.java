package com.artemas.servicesImpl;

import com.artemas.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 21/06/2017.
 */
@RunWith(SpringRunner.class)
public class ExampleServiceImplTest {

    @InjectMocks
    private ExampleServiceImpl exampleServiceImpl;

    private List<Item> dummyData = new ArrayList<>(Arrays.asList(
            new Item("orange", "Orange", "This is a Citric Fruit", "Fruit")
    ));

    @Test
    public void whenGetItemsIsCalledThenReturnListAListOfItems() throws Exception {
        assertEquals(dummyData.get(0).getName(), exampleServiceImpl.getItems().get(0).getName());
    }

}
