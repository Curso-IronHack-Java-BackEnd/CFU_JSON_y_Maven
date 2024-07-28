package org.example.json;

import java.util.List;

public class Invoice {
    private String id;
    private double total;
    private boolean isPaid;
    private List<InvoiceItem> invoiceItems;

    public Invoice(String id, double total, boolean isPaid, List<InvoiceItem> invoiceItems) {
        this.id = id;
        this.total = total;
        this.isPaid = isPaid;
        this.invoiceItems = invoiceItems;
    }

    public Invoice(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }


    public void invoiceDetails() {

        System.out.println("===== INVOICE ======");
        System.out.println("Id:     " + id);
        System.out.println("Total:  " + total);
        System.out.println("Pagado: " + (isPaid ? "Si" : "No"));
        System.out.println("InvoiceItems:");



        //for (int i = 0; i < invoiceItems.size(); i++) {
        for (InvoiceItem item : invoiceItems) {
            System.out.println(item);
            //item.invoiceItemsDetails();
    }
        System.out.println("====================");
    }

}
