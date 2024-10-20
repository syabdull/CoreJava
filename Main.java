import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of your class:");
        String myClass = sc.nextLine();
        
        try {
            // Load the class dynamically
            Class<?> clazz = Class.forName(myClass);
            
            // Create an instance of the class
            Courier cu = (Courier) clazz.getDeclaredConstructor().newInstance();
            
            // Call the deliver method
            cu.deliver();
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
