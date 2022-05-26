import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        String currentBook = scanner.nextLine();
int checkBooks = 0;
boolean wasFound = false;
     while (!currentBook.equals("No More Books")){

         if(currentBook.equals(bookName)){
             wasFound = true;
             break;
         }
         checkBooks++;
         currentBook = scanner.nextLine();

     }

     if(wasFound){
         System.out.printf("You checked %d books and found it.", checkBooks);
     }else {System.out.printf("The book you search is not here!%nYou checked %d books.",
             checkBooks);}
    }
    }

