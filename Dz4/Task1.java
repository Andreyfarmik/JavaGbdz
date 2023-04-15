import java.util.LinkedList;
import java.util.Scanner;

public class Dz4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.println("Введите команду add - добавляет строку,print - печать в обратном направлении" +
                    " revert- удаляет последнюю строку exit - завершает программу:");
            String input = scan.nextLine();
            if (input.equals("add")) {
                System.out.println("Введите нужную строку: ");
                String addStr = scan.nextLine();
                list.add(addStr);
                }else if (input.equals("print")) {
                    System.out.println("Строки в обратном порядке:");
                    while (!list.isEmpty()) {
                        System.out.println(list.removeLast());
                    }
                } else if (input.equals("revert")) {
                    if (!list.isEmpty()) {
                        list.removeLast();
                        System.out.println("Последняя введенная строка удалена из памяти.");
                    } else {
                        System.out.println("Нет сохраненных строк для удаления.");
                    }
                } else if(input.equals("exit")) {
                        break;
                } else {
                    list.addLast(input);
                }
        }
    }
}
