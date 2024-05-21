package contactManager;

import contactManager.data.Repo;
import contactManager.model.Contact;

public class Main {
    public static void main(String[] args) {
        Repo repo = new Repo();
        Contact contact = new Contact();
        contact.setName("abbey");
        contact.setEmail("email123@gmail.com");
        contact.setNumber("09009980");
        repo.addContact(contact);
        repo.addContact(contact);
        contact.setName("biokes");
        repo.addContact(contact);
        contact.setName("biokes");
        repo.addContact(contact);
        contact.setName("abb");
        repo.addContact(contact);
        repo.findAllContact().stream().forEach(contact1 -> System.out.println(contact1.toString()));

    }
}
