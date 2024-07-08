package project2;


    public class Contact {
        private String firstname, lastname, address;
        private String phones[] = new String[2];
        private String emails[] = new String[2];

        public Contact(String firstname, String lastname, String address,
                       String[] phones, String[] emails) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.phones = phones;
            this.emails = emails;
        }
        public String fullName(){
            return this.firstname + " " + this.lastname;

        }

        public void details(){
            System.out.println("Name: " + this.firstname + " " + this.lastname);
            System.out.println("Address: " + this.address);
            this.printData("Phones", this.phones);
            this.printData("Emails", this.emails);
        }

        private void printData(String info, String[] data) {

            if (data != null){
                System.out.println(info+": ");
                for (int i=0; i < data.length; i++) {
                    if (data[i] != null)
                        System.out.println("\t"+ (i+1) + ": " + data[i]);
                }
            }else{
                System.out.println(info+": empty");
            }
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setAddress(String address) {
            this.address = address;
        }

//        public void setPhones(String[] phones) {
//            this.phones = phones;
//        }
//
//        public void setEmails(String[] emails) {
//            this.emails = emails;
//        }
//
//        public void setPhones(String next) {
//
//        }
    }
