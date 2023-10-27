import java.util.Scanner;

public class matematickazadaca {
    public matematickazadaca(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Внесете температура во Целзиус: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9.0/5.0) * celsius + 32.0;

        System.out.println("Температурата во Фаренхајт е: " + fahrenheit);
    }
}