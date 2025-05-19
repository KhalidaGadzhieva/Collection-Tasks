import java.util.ArrayDeque;
import java.util.Deque;

public class Task4 {
    static Deque<String> pages = new ArrayDeque<>();
    static Deque<String> forwardPages = new ArrayDeque<>();

    public static void main(String[] args) {
        visit("home");
        currentPages();
        visit("google.com");
        visit("openai.com");
        back();
        forward();
        currentPages();
    }

    public static void currentPages() {
        System.out.println("Current page: " + pages.peek());
    }

    public static void visit(String string) {
        pages.push(string);
        forwardPages.clear();
        System.out.println("Visited www." + string);
    }

    public static void back() {
        if (pages.isEmpty() || pages.size() == 1) {
            System.out.println("No previous page to return to.");
            return;
        }
        forwardPages.push(pages.pop());
        System.out.println("Returned to " + pages.peek());
    }

    public static void forward() {
        if (forwardPages.isEmpty()) {
            System.out.println("No forward pages.");
            return;
        }
        pages.push(forwardPages.pop());
        System.out.println("Forwarded to " + pages.peek());
    }

}
