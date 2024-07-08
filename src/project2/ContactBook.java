/*A Contact book or address book is an application that stores the information (name, address, phone nos, emails, etc.)
of people (capacity is determined by user) that you save in it. You can also edit and delete the Contact.
Create an address book using Java in which the user can add a new Contact,
edit and delete existing Contact and view all the Contact.
        - To edit a Contact, the user has to first select a Contact, select then edit the Contact.
     - To add a new Contact user has to provide the following:
        - name
        - address
        - phone no(s) - max of 2
        - email(s) - max of 2
You cannot save a record without one of phone nos & emails */

package project2;

    import java.util.Scanner;


public class ContactBook {
        static Scanner input = new Scanner(System.in).useDelimiter("\n");
        static Contact contact = null;

        static Contact contactBook[];

        static int currentIndex = 0, size;

        public static void main(String[] args) {

            int limits = 3;
            System.out.print("How many contact do you wish to store? :");
            size = input.nextInt();
            contactBook = new Contact[size];


            while (limits > 0) {
                System.out.println("\n[1]: Add Contact");
                System.out.println("[2]: All Contacts");
                System.out.println("[#]: Quit");
                System.out.print("Select option: ");

                char option = input.next().charAt(0);
                switch (option) {
                    case '1':
                        addContact();
                        break;
                    case '2':
                        allContacts();
                        break;
                    case '#':
                        System.out.println("Exiting Application...");
                        return;
                    default:
                        System.out.println("Invalid option");
                        limits--;
                }
            }
        }

        private static String[] getData(String info) {
            String data[] = null;

            System.out.print(info + ": Skip? Y/N: ");
            char ans = input.next().toUpperCase().charAt(0);
            if (ans == 'N') {
                data = new String[2];

                for (int i = 0; i < data.length; i++) {
                    System.out.print(info + ": " + (i + 1) + ": ");
                    data[i] = input.next();

                    System.out.print("Add more? Y/N: ");
                    if (input.next().toUpperCase().charAt(0) != 'Y')
                        break;
                }
            }
            return data;
        }

        private static void addContact() {
            // Contact Contact = null;
            System.out.print("Enter Firstname: ");
            String firstname = input.next();
            System.out.print("Enter Lastname: ");
            String lastname = input.next();
            System.out.print("Enter Address: ");
            String address = input.next();
            String phones[] = getData("Phones");
            String emails[] = getData("Emails");

            if (phones != null || emails != null) {
                contact = new Contact(firstname, lastname, address, phones, emails);
                if (currentIndex < size) {
                    contactBook[currentIndex] = contact;
                    currentIndex++;
                    System.out.println("Contact saved");
                } else {
                    System.out.println("Exceed limit!");
                }
            } else {
                System.out.println("Contact not saved. faile to provide one of email or phone number:");
            }

        }

        private static void allContacts() {
            int limits = 3;
            if (contactBook.length > 0) {
                for (int i = 0; i < contactBook.length; i++) {
                    if (contactBook[i] != null)
                        System.out.println("[" + (i + i) + "]:" + contactBook[i].fullName());
                }
            } else {
                System.out.println("Contact list is Empty!");
            }

            System.out.print("[1]:More..\n[#]: Back\nSelect option: ");
            char option = input.next().charAt(0);
            System.out.println("contactOperation");
            while (limits > 0) {

                switch (option) {
                    case '1':
                        System.out.print("Chose from contact list: ");
                        int contactIndex = input.nextInt();
                        contactIndex--;
                        contactOPeration(contactIndex);
                        break;
                    case '#':
                        return;
                    default:
                        System.out.println("Invalid option!");
                        limits--;
                }
            }

        }

        private static void contactOPeration(int contactIndex) {
            int limits = 3;
            Contact contact = contactBook[contactIndex];
            System.out.println("===================");
            while (limits > 0){

                System.out.print("[1]:View Details\n[2]: Edit\n[3]: delete\n[#]: Back\nSelect option ");
                 char option = input.next().charAt(0);

                switch (option){
                    case '1':
                        contact.details();
                        break;

                    case '2':
                        edit(contact);
                        break;
                    case '3':
                        delete(contactIndex);
                        return;
                    case '4':
                        return;
                    default:
                        System.out.println("Invalid option");
                        limits--;
                }
            }
        }

    private static void edit(Contact contact) {
            int limits = 3;

            while (limits > 0){
                System.out.print(" \n Select option to Edit\n[1]:\n Firstname\n[2]: Lastname\n[3]: Edit Address\n" +
                        "[4]: PhoneNo\n[5]: Email \n[#]:Back\n ");
                char option = input.next().charAt(0);

                switch (option){
                    case '1':
                        System.out.println("First Name");
                        contact.setFirstname(input.next());
                        System.out.println("First Name updated");
                        break;
                    case '2':
                        System.out.println("Last Name");
                        contact.setLastname(input.next());
                        System.out.println("Last Name updated");
                        break;
                    case '3':
                        System.out.println("Address");
                        contact.setAddress(input.next());
                        System.out.println("Address updated");
                        break;
                    case '4':
                        System.out.println("option 4");
                        break;
                    case '5':
                        System.out.println("option 5");
                        break;
                    case '#':
                        return;
                    default:
                        System.out.println("Invalid option");
                        limits--;

                }
            }
    }

    private static void delete(int index) {
             Contact temp[] = new Contact[size];
             contactBook[index] = null;
             int counter = 0;

             for (int i =0; i < contactBook.length; i++){
                 if (contactBook[i] != null){
                     temp[counter] = contactBook[i];
                     counter++;
                     currentIndex--;
                 }
             }contactBook = temp;
        System.out.println("Contact deleteted");
    }

}