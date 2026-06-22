import java.sql.*;
import java.util.Scanner;

public class LibraryManagementSystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    updateBook();
                    break;

                case 4:
                    deleteBook();
                    break;

                case 5:
                    borrowBook();
                    break;

                case 6:
                    returnBook();
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 7);
    }

    static void addBook() {

        try(Connection con =
                    DBConnection.getConnection()) {

            sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            String sql =
                    "INSERT INTO books(title,author,status) VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, "Available");

            ps.executeUpdate();

            System.out.println("Book Added Successfully!");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void viewBooks() {

        try(Connection con =
                    DBConnection.getConnection()) {

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM books");

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id")
                        + " | "
                        + rs.getString("title")
                        + " | "
                        + rs.getString("author")
                        + " | "
                        + rs.getString("status")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void updateBook() {

        try(Connection con =
                    DBConnection.getConnection()) {

            System.out.print("Book ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("New Title: ");
            String title = sc.nextLine();

            String sql =
                    "UPDATE books SET title=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, title);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Book Updated!");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void deleteBook() {

        try(Connection con =
                    DBConnection.getConnection()) {

            System.out.print("Book ID: ");
            int id = sc.nextInt();

            String sql =
                    "DELETE FROM books WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Book Deleted!");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void borrowBook() {

        try(Connection con =
                    DBConnection.getConnection()) {

            System.out.print("Book ID: ");
            int id = sc.nextInt();

            String sql =
                    "UPDATE books SET status='Borrowed' WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Book Borrowed!");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void returnBook() {

        try(Connection con =
                    DBConnection.getConnection()) {

            System.out.print("Book ID: ");
            int id = sc.nextInt();

            String sql =
                    "UPDATE books SET status='Available' WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Book Returned!");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
