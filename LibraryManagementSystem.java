import java.util.*;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Book Name: ");
                    books.add(sc.nextLine());
                    System.out.println("Book Added!");
                    break;

                case 2:
                    System.out.println("Books: " + books);
                    break;

                case 3:
                    System.out.print("Enter Book Name: ");
                    books.remove(sc.nextLine());
                    System.out.println("Book Deleted!");
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}
