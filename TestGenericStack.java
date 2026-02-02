public class TestGenericStack {
    public static void main(String[] args) {
        // Test with Strings
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java.");
        stringStack.push("Mr.");
        stringStack.push("McCuen");
        stringStack.push("Is");
        stringStack.push("a");
        stringStack.push("Great");
        stringStack.push("Professor");
        
        System.out.println("String Stack: " + stringStack);
        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Size: " + stringStack.getSize());
        System.out.println("Is it Empty? : " + stringStack.isEmpty());

        
        // Test with Integers
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);
        intStack.push(60);
        
        System.out.println("\nInteger Stack: " + intStack);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Size: " + intStack.getSize());
        System.out.println("Is it Empty? : " + intStack.isEmpty());


        // Test with Doubles
        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(10.0);
        doubleStack.push(20.0);
        doubleStack.push(30.0);
        doubleStack.push(40.0);
        doubleStack.push(50.0);
        doubleStack.push(60.0);
        doubleStack.push(70.0);

        
        System.out.println("\nInteger Stack: " + doubleStack);
        System.out.println("Peek: " + doubleStack.peek());
        System.out.println("Pop: " + doubleStack.pop());
        System.out.println("Size: " + doubleStack.getSize());
        System.out.println("Is it Empty? : " + doubleStack.isEmpty());

        // Test with empty stack
        GenericStack<String> emptyStack = new GenericStack<>();
        try{
            System.out.println("Pop with emptyStack: " + emptyStack.pop());
        } catch(Exception ArrayIndexOutOfBoundsException){
            System.out.println("Index Out of Bounds Error Occured!");
        }


    }
}