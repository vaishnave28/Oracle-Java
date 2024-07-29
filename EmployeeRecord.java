import java.util.HashMap;
import java.util.Map;

public class EmployeeRecord {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        
        // Add objects
        employees.put(101, "John");
        employees.put(102, "Jane");

        // Check if empty
        System.out.println("Is empty? " + employees.isEmpty());

        // Remove object
        employees.remove(101);
        System.out.println("After removal: " + employees);

        // Clear map
        employees.clear();
        System.out.println("Is empty after clear? " + employees.isEmpty());
    }
}
