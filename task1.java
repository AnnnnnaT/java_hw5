// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


public class task1{
    public static void main (String[] args){
        
        Phonebook book = new Phonebook();
        
        book.addContact("Илья","547343");
        book.addContact("Саша","547343");        
        book.addContact("Маша","75985");
        book.addContact("Маша","654849");
        book.deleteContact("Илья");
        book.showBook();
        book.addContact("Марина","467478389");
        book.getContact("Марина");
       
    }

}