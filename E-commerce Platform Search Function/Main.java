import java.util.Arrays;
import java.util.Comparator;

public class Main{

    
    public static Item Linearsrch(Item[] items, String searchName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(searchName)) {
                return item;
            }
        }
        return null;
    }

  
    public static Item Binarysrch(Item[] items, String searchName) {
        int start = 0;
        int end = items.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int comparison = items[mid].getName().compareToIgnoreCase(searchName);

            if (comparison == 0) return items[mid];
            if (comparison < 0) start = mid + 1;
            else end = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {
        
        Item[] catalog = {
            new Item(1001, "Tablet", "Gadgets"),
            new Item(1002, "Sneakers", "Footwear"),
        };

       
        System.out.println("Searching linearly for 'Wristwatch':");
        Item resultLinear = Linearsrch(catalog, "Wristwatch");
        System.out.println(resultLinear != null ? resultLinear : "Item not located.");

        Arrays.sort(catalog, Comparator.comparing(item -> item.getName().toLowerCase()));

    
        System.out.println("\n Searching with binary search for 'Wristwatch':");
        Item resultBinary = Binarysrch(catalog, "Wristwatch");
        System.out.println(resultBinary != null ? resultBinary : "Item not located.");
    }
}
