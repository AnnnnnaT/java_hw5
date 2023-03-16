import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

public class Phonebook {

    Map<String, List<String>> book = new HashMap<>();

    void getContact(String name) {
        if (book.containsKey(name)) {
            System.out.println(book.get(name));
            }
        }
    

    void addContact(String name, String phone) {
        if (book.containsKey(name)) {
            book.get(name).add(phone);
        } else {
            LinkedList<String> list = new LinkedList<>();
            list.add(phone);
            book.put(name, list);
        }
    }

    void deleteContact(String name){
        if (book.containsKey(name)){
            book.remove(name);
        }
    }

    void showBook(){
        System.out.println(book);
    }
}
