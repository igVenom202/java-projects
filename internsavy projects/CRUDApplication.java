import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class CRUDApplication {
    private static List<Item> itemList = new ArrayList<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("CRUD Application");
            System.out.println("1. Create Item");
            System.out.println("2. Read Items");
            System.out.println("3. Update Item");
            System.out.println("4. Delete Item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createItem(scanner);
                    break;
                case 2:
                    readItems();
                    break;
                case 3:
                    updateItem(scanner);
                    break;
                case 4:
                    deleteItem(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void createItem(Scanner scanner) {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        Item newItem = new Item(nextId, itemName);
        itemList.add(newItem);
        nextId++;

        System.out.println("Item created with ID: " + newItem.getId());
    }

    private static void readItems() {
        if (itemList.isEmpty()) {
            System.out.println("No items available.");
        } else {
            System.out.println("Items:");
            for (Item item : itemList) {
                System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
            }
        }
    }

    private static void updateItem(Scanner scanner) {
        System.out.print("Enter item ID to update: ");
        int itemId = scanner.nextInt();

        for (Item item : itemList) {
            if (item.getId() == itemId) {
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new name for the item: ");
                String newName = scanner.nextLine();
                item.setName(newName);
                System.out.println("Item updated.");
                return;
            }
        }

        System.out.println("Item with ID " + itemId + " not found.");
    }

    private static void deleteItem(Scanner scanner) {
        System.out.print("Enter item ID to delete: ");
        int itemId = scanner.nextInt();

        for (Item item : itemList) {
            if (item.getId() == itemId) {
                itemList.remove(item);
                System.out.println("Item deleted.");
                return;
            }
        }

        System.out.println("Item with ID " + itemId + " not found.");
    }
}
