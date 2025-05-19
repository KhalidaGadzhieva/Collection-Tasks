import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> todoList = new LinkedList<>();
        todoList.add("Dush almaq");
        todoList.addFirst("Seher oyanmaq");
        todoList.add("Seher yemeyi yemek");
        todoList.add("Ders etmek");
        todoList.addLast("Ders arasinda fasile");
        System.out.println("TODO list: ");
        for(String s: todoList){
            System.out.println(s);
        }
        System.out.println("Gunun ilk ishi goruldu: "+ todoList.removeFirst());
        System.out.println("Seherin son ishi goruldu: "+todoList.removeLast());
        System.out.println("Qalan ishler: "+todoList);
    }
}
