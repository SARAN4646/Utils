import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataStructuresDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        String searchElement = "Banana";
        boolean isFoundInLinkedList = linkedList.contains(searchElement);
        if (isFoundInLinkedList) {
            System.out.println(searchElement + " found in LinkedList");
        } else {
            System.out.println(searchElement + " not found in LinkedList");
        }
        linkedList.remove("Banana");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        int searchValue = 20;
        boolean isFoundInArrayList = arrayList.contains(searchValue);
        if (isFoundInArrayList) {
            System.out.println(searchValue + " found in ArrayList");
        } else {
            System.out.println(searchValue + " not found in ArrayList");
        }
        arrayList.remove(Integer.valueOf(20));

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);
        String searchKey = "Alice";
        if (hashMap.containsKey(searchKey)) {
            System.out.println(searchKey + " found in HashMap with age: " + hashMap.get(searchKey));
        } else {
            System.out.println(searchKey + " not found in HashMap");
        }
        hashMap.remove("Alice");

        HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(10.5);
        hashSet.add(20.7);
        hashSet.add(30.9);
        double searchDouble = 20.7;
        boolean isFoundInHashSet = hashSet.contains(searchDouble);
        if (isFoundInHashSet) {
            System.out.println(searchDouble + " found in HashSet");
        } else {
            System.out.println(searchDouble + " not found in HashSet");
        }
        hashSet.remove(20.7);
    }
}
