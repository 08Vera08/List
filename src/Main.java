import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> products = new ArrayList<String>();
        names.add("Молоко");
        names.add("Хлеб");
        names.add("Сыр");
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Введите операцию: ");
            String operation = scanner.nextLine();
            if (operation.equals("end")) {
                break;
            } else if (operation.equals("2")) {
                System.out.println("Список покупок: ");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println((i + 1) + ". " + products.get(i));
                }
            }

            String line = "";
            try {
                if (operation.equals("1")) {
                    System.out.println("Какую покупку хотите добавить?");
                    line = scanner.nextLine();
                    int number = Integer.parseInt(line);
                    if (!products.contains(names.get(number - 1)) && number <= names.size()) {
                        products.add(names.get(number - 1));
                    }
                } else if (operation.equals("3")) {
                    System.out.println("Список покупок: ");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название: ");
                    line = scanner.nextLine();
                    int number = Integer.parseInt(line);
                    if (number <= products.size()) {
                        products.remove(number - 1);
                    }
                    System.out.println("Покупка " + products.get(number - 1) + " удалена, список покупок:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }
                }
            } catch (Exception e) {
                if (operation.equals("1")) {
                    if (!products.contains(line) && names.contains(line)) {
                        products.add(line);
                    }
                } else if (operation.equals("3")) {
                    if (products.contains(line)) {
                        products.remove(products.indexOf(line));
                    }
                    System.out.println("Покупка " + line + " удалена, список покупок:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }
                }
            }


        }
    }
}