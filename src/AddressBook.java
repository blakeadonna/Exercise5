import java.util.*;

/**
 * Created by 016450 on 2/12/2019.
 */
public class AddressBook {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        String contact;
        String contact2;
        String lookup2;
        int menu = 0;
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        while(menu != 3){
            System.out.println("Address Book:");
            System.out.println("(1) Add a contact.");
            System.out.println("(2) Look up contact.");
            System.out.println("(3) Exit.");

            Scanner input = new Scanner(System.in);
            menu = input.nextInt();


            if (menu == 1){

                Scanner name = new Scanner(System.in);
                System.out.println("Enter your name");
                contact = name.nextLine();
                list.add(contact);

                Scanner email = new Scanner(System.in);
                System.out.println("Enter your email");
                contact2 = email.nextLine();
                list2.add(contact2);

            }

            if (menu == 2){
                Scanner lookup = new Scanner(System.in);
                System.out.println("Enter a name to look up");
                lookup2 = lookup.nextLine();
                if (list.contains(lookup2)!=true){
                    System.out.println("Name not found, try again");
                    break;
                }else{
                    int pos = list.indexOf(lookup2);
                    System.out.println(list.get(pos)+": "+list2.get(pos));
                }

            }

            if (menu == 3){
                System.out.println("Have a nice day~");
                System.exit(0);
            }
        }

    }
}
