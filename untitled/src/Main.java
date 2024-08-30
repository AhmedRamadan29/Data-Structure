import java.util.*;

public class Main {


    public static void main(String[] args) {

            int[] array = {1, 2, 3, 4, 5};
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
            LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Node1", "Node2", "Node3"));
            Hashtable<String, String> hashtable = new Hashtable<>();
            hashtable.put("A", "Apple");
            hashtable.put("B", "Banana");
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("C", "Cat");
            hashMap.put("D", "Dog");
            Set<String> set = new HashSet<>(Arrays.asList("Alpha", "Beta", "Gamma"));
            Stack<String> stack = new Stack<>();
            stack.push("First");
            stack.push("Second");
            stack.push("Third");
            Queue<String> queue = new LinkedList<>(Arrays.asList("Task1", "Task2", "Task3"));

            MemoryVisualization.drawArray(array);
            MemoryVisualization.drawArrayList(arrayList);
            MemoryVisualization.drawLinkedList(linkedList);
            MemoryVisualization.drawHashTable(hashtable);
            MemoryVisualization.drawHashMap(hashMap);
            MemoryVisualization.drawSet(set);
            MemoryVisualization.drawStack(stack);
            MemoryVisualization.drawQueue(queue);


    }








}



