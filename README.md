# Data Structure Visualizer

A utility Java program that provides a visual representation of different data structures, including arrays, ArrayLists, LinkedLists, HashTables, HashMaps, Sets, Stacks, and Queues. This program helps users understand how data is stored in memory and how it interacts with both the stack and heap memory.

## Features

- **Array Representation**: Displays the memory structure and stack reference of integer arrays.
- **ArrayList Representation**: Demonstrates how Java's ArrayLists store references and manage data.
- **LinkedList Representation**: Visualizes nodes, connections, and heap addresses for LinkedLists.
- **HashTable & HashMap Representation**: Provides a detailed view of how keys and values are stored.
- **Set, Stack, and Queue Representation**: Helps visualize different structures and how data is stored.
- **Memory Address Tracking**: Shows approximate memory addresses for each data element for better understanding of Java's heap storage.

## Requirements

- Java 17 or higher
- Basic understanding of data structures and Java memory management

## Installation

To get started with the Data Structure Visualizer, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/DataStructureVisualizer.git
   ```

2. **Navigate to the Directory**:
   ```bash
   cd DataStructureVisualizer
   ```

3. **Compile the Program**:
   ```bash
   javac DataStructureVisualizer.java
   ```

4. **Run the Program**:
   ```bash
   java DataStructureVisualizer
   ```

## Usage

The main utility functions in this program provide visual representation for the following data structures:

- **drawArray(int[] array)**: Draws an array with a detailed view of memory allocation and stack representation.
- **drawArrayList(ArrayList<String> arrayList)**: Illustrates how ArrayList elements are represented.
- **drawLinkedList(LinkedList<String> list)**: Provides a visual structure of linked nodes.
- **drawHashTable(Hashtable<String, String> hashtable)**: Represents key-value pairs and the corresponding memory locations.
- **drawHashMap(HashMap<String, String> hashMap)**: Similar to Hashtable, but for HashMap.
- **drawSet(Set<String> set)**: Shows the organization of a Set and its heap references.
- **drawStack(Stack<String> stack)**: Visualizes a stack from top to bottom, with elements and memory addresses.
- **drawQueue(Queue<String> queue)**: Represents elements in the queue structure.

Simply call any of these methods in your Java code to see the visual breakdown of the respective data structure.

## Example

Below is an example of using the **drawArray** method:

```java
int[] myArray = {10, 20, 30, 40};
drawArray(myArray);
```

This will output a detailed view of the **stack**, **heap**, and memory addresses of the elements.

## Contributing

We welcome contributions to make this project even better!

- **Fork the repository**
- **Create a new branch** (`feature/new-feature`)
- **Commit your changes** (`git commit -m 'Add a new feature'`)
- **Push to the branch** (`git push origin feature/new-feature`)
- **Create a Pull Request**
