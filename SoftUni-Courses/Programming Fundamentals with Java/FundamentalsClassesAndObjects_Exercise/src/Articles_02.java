import java.util.Scanner;

public class Articles_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] article = scanner.nextLine().split(", ");
        String title = article[0];
        String content = article[1];
        String author = article[2];
        Articles articles = new Articles(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");
            switch (command[0]) {
                case "Edit":
                    articles.setContent(command[1]);
                    break;
                case "ChangeAuthor":
                    articles.setAuthor(command[1]);
                    break;
                case "Rename":
                    articles.setTitle(command[1]);
                    break;
            }
        }
        System.out.println(articles.toString());
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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s%n", this.title, this.content, this.author);
        }
    }
}
