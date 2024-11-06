import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a MyHashMap object with an initial capacity of 7
        HashMap<String, Integer> studentGradesMap = new HashMap<>(7);

        // Add 7 entries to the map
        studentGradesMap.put("Alice", 90);
        studentGradesMap.put("Bob", 85);
        studentGradesMap.put("Charlie", 92);
        studentGradesMap.put("David", 88);
        studentGradesMap.put("Eve", 95);
        studentGradesMap.put("Frank", 80);
        studentGradesMap.put("Grace", 87);

        // Print the size of the map
        System.out.println("Size of the map after adding entries: " + studentGradesMap.size());

        // Retrieve and print 2 values from the map using keys
        System.out.println("Grade of Alice: " + studentGradesMap.get("Alice"));
        System.out.println("Grade of Eve: " + studentGradesMap.get("Eve"));

        // Remove 2 entries from the map
        studentGradesMap.remove("Bob");
        studentGradesMap.remove("Frank");

        // Print the size of the map after removal
        System.out.println("Size of the map after removing entries: " + studentGradesMap.size());
    }
}
