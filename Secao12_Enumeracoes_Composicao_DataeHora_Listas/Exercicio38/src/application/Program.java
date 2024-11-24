/*Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
        sumário do pedido*/


package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name:");
        String clientName = sc.nextLine();
        System.out.print("E-mail:");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date clientDate = sdf2.parse(sc.nextLine());

        Client client = new Client(clientName, clientEmail, clientDate);

        System.out.println("Enter the Order data:");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();
        System.out.print("How many items to this order:");
        int n = sc.nextInt();
        sc.nextLine();


        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

        for (int i=1; i<=n; i++){
            OrderItem orderItem = new OrderItem();
            System.out.println("Enter #" + i + " item data: ");
            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            orderItem.setProduct(new Product(productName, productPrice));
            orderItem.setQuantity(productQuantity);
            orderItem.setPrice(orderItem.subTotal());

            order.addItem(orderItem);
        }


        System.out.println(order);


    }

}
