
public class Contact {
    private String name;
    private String phoneNumber;
    private int age;
    private String email;
    private String address;
    private boolean friendAndFamily;

    public Contact(String name, String phoneNumber, int age, String email, String address, boolean friendAndFamily) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
        this.address = address;
        this.friendAndFamily = friendAndFamily;
    }

    public Contact() {
    }

    public Contact(String name, String phoneNumber, boolean friendAndFamily) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.friendAndFamily = friendAndFamily;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isFriendAndFamily() {
        return friendAndFamily;
    }

    public void setFriendAndFamily(boolean friendAndFamily) {
        this.friendAndFamily = friendAndFamily;
    }

}
