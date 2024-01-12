public class Main {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Contact adamu = new Contact("Adamu Segun", "080773462", false);
        Contact mariam = new Contact("Adewale Mariam", "09032313", true);
        Contact taiwo = new Contact("Bakera Taiwo", "070382387", true);
        Contact adamu2 = new Contact("Adamu Segun", "080778932", false);
        Contact jerry = new Contact("Jerry", "2324242", false);

        System.out.println(contactList.addContact(adamu));
        System.out.println(contactList.addContact(taiwo));
        System.out.println(contactList.addContact(mariam));
        System.out.println(contactList.addContact(jerry));


        System.out.println(contactList.deleteAContact(adamu));

        System.out.println(contactList.updateContact(jerry, adamu2));

        System.out.println(contactList.retrieveContactName(2));

//        System.out.println(contactList);
    }
}
