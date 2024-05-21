package contactManager.data;

import contactManager.model.Contact;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

import static contactManager.validator.Validator.*;

public class Repo {
    private final Set<Contact> contacts = new TreeSet<>((a, b)-> a.getName()
                                                        .compareToIgnoreCase(b.getName()));
    public void addContact(Contact contact){
        validateName(contact.getName());
        validateNumber(contact.getNumber());
        validateEmail(contact.getEmail());
        contacts.add(contact);
    }
    public Set<Contact> findAllContact(){
        return contacts;
    }
    public Contact findContactByName(String name){
        AtomicReference<Contact> output = new AtomicReference<>();
        List.copyOf(contacts).forEach(contact->{if(contact.getName().equalsIgnoreCase(name))output.set(contact);});
        if(Optional.ofNullable(output.get()).isEmpty()) throw new RuntimeException("no results found");
        return output.get();
    }
}
