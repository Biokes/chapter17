package contactManager;

import contactManager.data.Repo;
import contactManager.model.Contact;

public class Main {
    public static void main(String[] args) {
        Repo repo = new Repo();
        Contact contact = new Contact();
        contact.setName("zaddi");
        contact.setEmail("email123@gmail.com");
        contact.setNumber("09009980");
        repo.addContact(contact);
        Contact contact1 = new Contact();
        contact1.setName("abbey");
        contact1.setEmail("email@gmail.com");
        contact1.setNumber("09009980");
        repo.addContact(contact1);
        Contact contact2 = new Contact();
        contact2.setName("biokes123");
        contact2.setNumber("78907645447");
        contact2.setEmail("mail@gmail.com");
        repo.addContact(contact2);
        repo.findAllContact().forEach(System.out::println);

    }
}
