import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	Scanner input = new Scanner(System.in);
        ContactService contacts = new ContactService();
        contacts.contactsList = new HashMap<String, Contact>();
        Contact current;
        String choice = "";
        String id;
        while (!choice.equals("9")){
            contacts.displayMenu();
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    contacts.addContact();
                    break;
                case "2":
                    System.out.println("Enter contact ID: ");
                    id = input.nextLine();
                    current = contacts.getContact(id);
                    contacts.removeContact(current);
                    break;
                case "3":
                    System.out.println("Enter contact ID: ");
                    id = input.nextLine();
                    if (contacts.getContact(id) != null){
                       current = contacts.getContact(id);
                        contacts.displayContact(current);
                        System.out.println("Enter update field (1-4): ");
                        String field = input.nextLine();
                        while (Integer.parseInt(field) > 4 || Integer.parseInt(field) < 1){
                            System.out.println("Please enter valid option (1-4): ");
                            field = input.nextLine();
                        }
                        System.out.println("Enter new info: ");
                        String newInfo = input.nextLine();
                        current = contacts.updateContact(current, field, newInfo); 
                    }
                    else {
                        System.out.println("Invalid ID");
                    }
                    break;
                case "4":
                    System.out.println("Enter contact ID: ");
                    id = input.nextLine();
                    current = contacts.getContact(id);
                    contacts.displayContact(current);
                    break;
                case "9":
                    break;
            }
        }


        input.close();
        System.exit(0);

    }
}
