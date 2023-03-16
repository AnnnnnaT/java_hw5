// Написать программу, 
// которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова",
                "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));
        
        System.out.println(parsing(list));
        program(parsing(list));

    }

    public static ArrayList<String> parsing(ArrayList<String> list) {
        ArrayList<String> names1 = new ArrayList<>();

        for (String elem : list) {
            String name = elem.split(" ")[0];
            names1.add(name);
        }
        return names1;
    }

    static void program(ArrayList<String> list) {

        Map<Integer, String> names = new TreeMap<>(Collections.reverseOrder());

        for (String name : list) {
            int count = Collections.frequency(list, name);
            names.put(count, name);
        }

        System.out.println(Arrays.asList(names));

    }
}
