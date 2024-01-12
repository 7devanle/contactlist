import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private static List<Contact> contacts;

    public ContactList() {
        this.contacts = new ArrayList<>();
    }

    public String addContact(Contact contact){
        if(contacts.contains(contact))
            return "Contact already present";
        else {
            contacts.add(contact);
            return contact.getName() + " added";
        }
    }

    public String deleteAContact(Contact contact){
        if(validateContact(contact)>=0){
            contacts.remove(contact);
            return contact.getName() +" deleted";
        }
        return "Contact formally doesn't exist";
    }

    public String updateContact(Contact oldContact, Contact newContact){
        int valid = validateContact(oldContact);
        if(valid >= 0){
            contacts.set(valid, newContact);
            return "Updated";
        }
        else return "Contact doesnt exist";
    }

    public String retrieveContactName(int index){
        return contacts.get(index).getName();
    }
    public Contact retrieveContact(int index){
        return contacts.get(index);
    }

    private int validateContact(Contact contact) {
        return contacts.indexOf(contact);
    }
}

//    public boolean changeFamilyAndFriend(String name){
//        if(validateName(name)>=0){
//
//        }
//    }