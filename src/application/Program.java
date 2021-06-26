package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //insercao dos dados
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String programName = sc.nextLine();

        System.out.print("Price: ");
        double programPrice = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int programQuantity = sc.nextInt();

        //instancia do cosntrutor
        System.out.println();
        Product product = new Product(programName, programPrice, programQuantity);

        //sout protudo hj
        System.out.println("Product data: " + product);
        System.out.println();

        /*
          uso de get e set para modificar o nome do produto usando do emcapsulamento
          */
        System.out.println("Product name update date from: " + product.getProductName());
        product.setProductName("computer");
        System.out.println("New name update date: " + product.getProductName());

        //atualizacao do estoque toAdd
        System.out.print("\nEnter the number of products to be added in stock: ");
        programQuantity = sc.nextInt();
        product.addProducts(programQuantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        System.out.println();
        //atualizacao do estoque removed
        System.out.print("\nEnter the number of products to be removed from stock: ");
        programQuantity = sc.nextInt();
        product.removeProducts(programQuantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        sc.close();
    }
}