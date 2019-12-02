import java.util.Scanner;

public class StudentUser extends User {
    @Override
    public void menu() {
        System.out.println("1. 借书");
        System.out.println("2. 还书");
    }

    @Override
    public void operation(int select) {
        switch (select) {
            case 1:
                borrowBook();
                break;
            case 2:
                returnBook();
                break;
        }
    }

    private void returnBook() {
    }

    private void borrowBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名:");
        String title = scanner.nextLine();
        BookShelf bookShelf = BookShelf.getBookShelf();
        Book[] books = bookShelf.getBooks();
        for (Book book : books) {
            if (book.title.equals(title)) {
                book.currentCount--;
            }
        }
        System.out.println("借阅成功");
    }
}
