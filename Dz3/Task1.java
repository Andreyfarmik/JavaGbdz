import java.util.ArrayList;
import java.util.List;

public class Dz2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(8);
        numbers.add(10);
        System.out.println(numbers);
        removeEvenNumber(numbers);
        System.out.println(numbers);
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]

    }
 public static boolean isNumeric(String str) {
    try {
        Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    

static void removeIntegers(List<String> strings) {
    // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
    for (String s: strings) {
        if (isNumeric(s) == true){
            strings.remove(s);
        }
    }   
}
static void removeEvenNumber(List<Integer> numbers) {
    // TODO: 31.03.2023 Удалить все четные элементы из списка
    for(int i = 0; i <= numbers.size(); i++) {
        if(numbers.get(i) % 2 == 0) 
            numbers.remove(i);
    }
}
}  

