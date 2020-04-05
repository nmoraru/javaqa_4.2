public class Body {
    public static void calculateMassIndex(double weight, double height) {
        //this.weight = weight;
        //this.height = height;
        double ind = (weight * 10_000) / (height * height);
        if (ind < 18.5) {
            System.out.println("Недовес: ваш ИМТ " + ind + " меньше чем 18.5");
        } else if (ind >= 18.5 && ind < 25) {
            System.out.println("Нормальный вес: ваш ИМТ " + ind + " находится между 18.5 и 25");
        } else if (ind >= 25 && ind < 30) {
            System.out.println("Избыточный вес: ваш ИМТ " + ind + " находится между 25 и 30");
        } else if (ind >= 30) {
            System.out.println("Ожирение: ваш ИМТ " + ind + " больше или равен 30");
        } else {
        }
    }
}
