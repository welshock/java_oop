import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is ur name?");
        String name = scanner.nextLine();
        System.out.println("How old are u");
        int old = scanner.nextInt();
        System.out.println("Whats ur weight");
        double weight = scanner.nextDouble();
        System.out.println("Hello " + name + " "+ old + " years old, " +"with weight of " + weight +" kg");

    }
}
