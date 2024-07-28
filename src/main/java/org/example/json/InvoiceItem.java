package org.example.json;

import java.util.List;

public class InvoiceItem{
    private String name;
    private double price;

    public InvoiceItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "Name= " + name + " || " +
                "Price= " + price ;
    }

    public void invoiceItemsDetails() {
        //System.out.println("Invoice Items: ");
        System.out.println("Nombre: " + name);
        System.out.println("Precio:  " + price+"€");

    }
}
