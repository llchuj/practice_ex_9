import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class OrderQueue {
    private Queue<String> orderQueue;

    public OrderQueue() {
        orderQueue = new LinkedList<>();
    }

    public void addOrder(String order) {
        orderQueue.add(order);
        System.out.println("Order added to the queue: " + order);
    }

    public void processNextOrder() {
        if (!orderQueue.isEmpty()) {
            String order = orderQueue.poll();
            System.out.println("Processing order: " + order);
        } else {
            System.out.println("The order queue is empty.");
        }
    }

    public void displayAllOrders() {
        if (orderQueue.isEmpty()) {
            System.out.println("The order queue is empty.");
        } else {
            System.out.println("Orders in the queue:");
            for (String order : orderQueue) {
                System.out.println(order);
            }
        }
    }

    public void handleQueue() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose what you want to do with the order queue:");
            System.out.println("1. Add an order to the queue");
            System.out.println("2. Process the next order");
            System.out.println("3. Display all orders in the queue");
            System.out.print("Enter your choice (1– 3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the order details: ");
                    String order = scanner.nextLine();
                    addOrder(order);
                    break;
                case 2:
                    processNextOrder();
                    break;
                case 3:
                    displayAllOrders();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}