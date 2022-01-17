import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactServiceImpl implements ContactService{

    @Override
    public Sort getContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter firstName, LastName, Address, Phone Number");
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String address = scanner.nextLine();
        String phonoNo = scanner.nextLine();


        return new Sort(firstName,lastName,address,phonoNo);
    }

    @Override
    public void sortAndDisplayContacts(List<Sort> contactList) {
        System.out.println(contactList.stream().sorted(Comparator.comparing(Sort::getFirstName)).collect(Collectors.toList()));
    }
}