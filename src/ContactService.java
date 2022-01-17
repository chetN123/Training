import java.util.List;
import Sort.java;

public interface ContactService {
    public Sort getContact();
    public void sortAndDisplayContacts(List<Sort> contactList);
}