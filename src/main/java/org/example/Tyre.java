package org.example;

import org.springframework.stereotype.Component;

@Component
public class Tyre
{
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString()
    {
        return "Its working...";
    }

    private String brand;

}
