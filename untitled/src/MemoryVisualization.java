import java.util.*;

public class MemoryVisualization {

    // Array representation
    public static void drawArray(int[] array) {
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i] + " -> [Memory Address: " + System.identityHashCode(array) + i + "]");
        }
        System.out.println("---------");
        System.out.println("Stack Representation:");
        System.out.println("array -> Reference to Heap");
        System.out.println("| " + Arrays.toString(array) + " |");
        System.out.println("---------");
        System.out.println("Heap Representation:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] -> " + array[i]);
        }
        System.out.println("---------");
    }

    // ArrayList representation
    public   static void drawArrayList(ArrayList<String> arrayList) {
        System.out.println("ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Index " + i + ": " + arrayList.get(i) + " -> [Memory Address: " + System.identityHashCode(arrayList.get(i)) + "]");
        }
        System.out.println("---------");
        System.out.println("Stack Representation:");
        System.out.println("arrayList -> Reference to Heap");
        System.out.println("| " + arrayList.toString() + " |");
        System.out.println("---------");
        System.out.println("Heap Representation:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("[" + i + "] -> " + arrayList.get(i));
        }
        System.out.println("---------");
    }

    // LinkedList representation
    public   static void drawLinkedList(LinkedList<String> list) {
        System.out.println("LinkedList:");
        int index = 0;
        for (String s : list) {
            System.out.println("Node " + index + ": " + s + " -> [Memory Address: " + System.identityHashCode(s) + "]");
            index++;
        }
        System.out.println("---------");
        System.out.println("Stack Representation:");
        System.out.println("linkedList -> Reference to Heap");
        System.out.println("| " + list.toString() + " |");
        System.out.println("---------");
        System.out.println("Heap Representation:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Node" + i);
            if (i < list.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println("\n---------");
    }

    // HashTable representation
    public   static void drawHashTable(Hashtable<String, String> hashtable) {
        System.out.println("HashTable:");
        for (Map.Entry<String, String> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue() + " [Memory Address: " + System.identityHashCode(entry.getValue()) + "]");
        }
        System.out.println("---------");
        System.out.println("Stack Representation:");
        System.out.println("hashTable -> Reference to Heap");
        System.out.println("| " + hashtable.toString() + " |");
        System.out.println("---------");
        System.out.println("Heap Representation:");
        int index = 0;
        for (Map.Entry<String, String> entry : hashtable.entrySet()) {
            System.out.println("[" + index + "] -> " + entry.getKey() + ": " + entry.getValue());
            index++;
        }
        System.out.println("---------");
    }

    // HashMap representation
    public  static void drawHashMap(HashMap<String, String> hashMap) {
        System.out.println("HashMap:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue() + " [Memory Address: " + System.identityHashCode(entry.getValue()) + "]");
        }
        System.out.println("---------");
        System.out.println("Stack Representation:");
        System.out.println("hashMap -> Reference to Heap");
        System.out.println("| " + hashMap.toString() + " |");
        System.out.println("---------");
        System.out.println("Heap Representation:");
        int index = 0;
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("[" + index + "] -> " + entry.getKey() + ": " + entry.getValue());
            index++;
        }
        System.out.println("---------");
    }

    // Set representation
    public  static void drawSet(Set<String> set) {
        System.out.println("Set:");
        for (String s : set) {
            System.out.println(s + " -> [Memory Address: " + System.identityHashCode(s) + "]");
        }
        System.out.println("---------");
        System.out.println("Stack Representation:");
        System.out.println("set -> Reference to Heap");
        System.out.println("| " + set.toString() + " |");
        System.out.println("---------");
        System.out.println("Heap Representation:");
        int index = 0;
        for (String s : set) {
            System.out.println("[" + index + "] -> " + s);
            index++;
        }
        System.out.println("---------");
    }

    // Stack representation
    public  static void drawStack(Stack<String> stack) {
        System.out.println("Stack:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("Element " + i + ": " + stack.get(i) + " -> [Memory Address: " + System.identityHashCode(stack.get(i)) + "]");
        }
        System.out.println("---------");
        System.out.println("Stack Representation:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("| " + stack.get(i) + " |");
        }
        System.out.println("---------");
    }

    // Queue representation
  public   static void drawQueue(Queue<String> queue) {
        System.out.println("Queue:");
        int index = 0;
        for (String s : queue) {
            System.out.println("Element " + index + ": " + s + " -> [Memory Address: " + System.identityHashCode(s) + "]");
            index++;
        }
        System.out.println("---------");
        System.out.println("Stack Representation:");
        System.out.println("queue -> Reference to Heap");
        System.out.println("| " + queue.toString() + " |");
        System.out.println("---------");
        System.out.println("Heap Representation:");
        for (String s : queue) {
            System.out.print(s + " | ");
        }
        System.out.println("\n---------");
    }


}
