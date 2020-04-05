import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Body IMT = new Body();
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваш вес в кг");
        double weight = Double.parseDouble(bis.readLine()); // вес
        System.out.println("Введите ваш рост в см");
        double height = Double.parseDouble(bis.readLine()); // рост

        String comment = IMT.calculateMassIndex(weight, height);
        System.out.println(comment);
    }
}


