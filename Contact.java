public class Contact {
    String contactID, firstName, lastName, phone, address;
    String[] contactInfo = new String[4];
    public Contact(String cID, String fn, String ln, String ph, String ad) {
        contactID = cID;
        firstName = fn;
        lastName = ln;
        phone = ph;
        address = ad;
        contactInfo[0] = firstName;
        contactInfo[1] = lastName;
        contactInfo[2] = phone;
        contactInfo[3] = address;
    }
}