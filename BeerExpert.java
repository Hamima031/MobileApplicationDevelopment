package com.example.beerselector;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color)
    {
        List<String> brands = new ArrayList<String>();

        if(color.equals("amber"))
        {
            brands.add("Amber Jack");
            brands.add("Red Moose");
        }
        else
        {
            brands.add("Jack Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}
