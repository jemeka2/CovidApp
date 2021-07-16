public class ContactInfo extends Info{
    public String displayContacts(){
        return "\nName:   " + getName() +
                "\nPhone: " + getPhoneNum() +
                "\nEmail: " + getEmail() + "\n";
    }
}
