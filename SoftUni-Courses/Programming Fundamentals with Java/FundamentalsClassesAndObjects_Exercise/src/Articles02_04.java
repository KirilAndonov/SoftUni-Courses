import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles02_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Articles> article = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(", ");
            Articles articles = new Articles(command[0], command[1], command[2]);
            article.add(articles);
        }
        System.out.println(article.toString().replaceAll("[\\[\\],]", ""));
    }
    public static class Articles {
        String title;
        String content;
        String author;

        Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
        @Override
        public String toString() {
            return String.format("%s - %s: %s%n", this.title, this.content, this.author);
        }
    }
}
