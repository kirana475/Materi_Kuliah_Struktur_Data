public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insertAtEnd("Budi");
        list.insertAtEnd("Andi");
        list.insertAtEnd("Citra");
        list.insertAtEnd("Dewi");

        // Print the list
        System.out.println("Linked List after insertions:");
        list.printList(); // Expected: Budi -> Andi -> Citra -> Dewi -> null

        // Insert after a specific node
        LinkedList.Node nodeBudi = list.getNode("Budi"); // Added missing semicolon
        if (nodeBudi != null) {
            list.insertAfter(nodeBudi, "Eka");
        }

        // Print the list after insertAfter
        System.out.println("\nLinked List after inserting Eka after Budi:");
        list.printList(); // Expected: Budi -> Eka -> Andi -> Citra -> Dewi -> null

        // Delete a node 
        list.deleteNode("Citra");

        // Print the list after deletion
        System.out.println("\nLinked List after deleting Citra:");
        list.printList(); // Expected: Budi -> Eka -> Andi -> Dewi -> null

        // Delete a non-existent node
        list.deleteNode("Fajar"); // Corrected method name

        // Print the list after trying to delete non-existent node
        System.out.println("\nLinked List after trying to delete Fajar:");
        list.printList(); // Expected: Budi -> Eka -> Andi -> Dewi -> null
    }
}
