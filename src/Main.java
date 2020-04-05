import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваш вес в кг");
        double weight = Double.parseDouble(bis.readLine()); // вес
        System.out.println("Введите ваш рост в см");
        double height = Double.parseDouble(bis.readLine()); // рост

        Body.calculateMassIndex(weight, height);
    }
}


