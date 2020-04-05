public class Body {
    public String calculateMassIndex(double weight, double height) {
        double ind = (weight * 10_000) / (height * height);
        String comment;
        if (ind < 18.5) {
            comment = "Недовес: ваш ИМТ " + ind + " меньше чем 18.5";
            return comment;
        } else if (ind >= 18.5 && ind < 25) {
            comment = "Нормальный вес: ваш ИМТ " + ind + " находится между 18.5 и 25";
            return comment;
        } else if (ind >= 25 && ind < 30) {
            comment = "Избыточный вес: ваш ИМТ " + ind + " находится между 25 и 30";
            return comment;
        } else if (ind >= 30) {
            comment = "Ожирение: ваш ИМТ " + ind + " больше или равен 30";
            return comment;
        } else {
            return "";
        }
    }
}
