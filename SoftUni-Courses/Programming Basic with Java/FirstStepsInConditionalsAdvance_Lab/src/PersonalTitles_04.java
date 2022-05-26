import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double years = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
//•	"Mr." - мъж (пол "m") на 16 или повече години
//•	"Master" - момче (пол "m") под 16 години
//•	"Ms." - жена (пол "f") на 16 или повече години
//•	"Miss" - момиче (пол "f") под 16 години
        switch (gender){
            case "m":
                if (years >= 16){
                    System.out.println("Mr.");
                }else if (years < 16){
                    System.out.println("Master");
                }
                break;
            case "f":
                if (years >= 16){
                    System.out.println("Ms.");
                } else if (years < 16){
                    System.out.println("Miss");
                }
        }



    }
}
