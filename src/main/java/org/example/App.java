package org.example;

import com.google.gson.Gson;
import org.example.json.Invoice;
import org.example.json.InvoiceItem;
import org.example.maven.Author;
import org.example.maven.Book;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args )
    {
        ejercicioJson();
        ejercicioMaven();
    }

    private static void ejercicioMaven() {
        List<Book> publishedBooks = new ArrayList<>();
        publishedBooks.add(new Book("El resplandor", 574));
        publishedBooks.add(new Book("It", 1345));
        publishedBooks.add(new Book("La torre oscura", 689));

        Author author1 = new Author("Stephen", "King", publishedBooks);

        Gson gson = new Gson();
        String authorToJson = gson.toJson(author1);
        System.out.println(authorToJson);
    }

    private static void ejercicioJson() {
        String jsonData = "{"
                + "\"id\": \"YMZ-0000002\","
                + "\"total\": 30.5,"
                + "\"isPaid\": false,"
                + "\"invoiceItems\": ["
                + "  { \"name\": \"Coca Cola 2L\", \"price\": \"10\" },"
                + "  { \"name\": \"Rum Santa Teresa 0.7L\", \"price\": \"15\" },"
                + "  { \"name\": \"Ice bag L\", \"price\": \"5.5\" }"
                + "]"
                + "}";

        Gson gson = new Gson();
        Invoice invoiceJson = gson.fromJson(jsonData, Invoice.class);
        //invoiceJson.invoiceDetails();

        List<InvoiceItem> invoiceItems = new ArrayList<>();
        invoiceItems.add(new InvoiceItem("Coca Cola 2L", 10));
        invoiceItems.add(new InvoiceItem("Rum Santa Teresa 0.7L", 15));
        invoiceItems.add(new InvoiceItem("Ice bag L", 5.5));

        Invoice invoice = new Invoice("YMZ-0000001", 30.5, false, invoiceItems);
        invoice.invoiceDetails();
    }

}
