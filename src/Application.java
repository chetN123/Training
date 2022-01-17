import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Application {

    ContactService contactService = new ContactServiceImpl();
    List<Sort> contactList = new ArrayList<>();

    public static void main(String[] args) {
        Application application = new Application();
        application.displayMenu();

    }
    private void displayMenu() {
        System.out.println("Please enter operation to perform");
        System.out.println("1) Add new Contact");
        System.out.println("2) Display sorted List");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Sort c = contactService.getContact();
                contactList.add(c);
                displayMenu();
                break;
            case 2:
                contactService.sortAndDisplayContacts(contactList);
                displayMenu();
                break;
            default:
                break;
        }
    }
}