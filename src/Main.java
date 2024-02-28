import mode.Contact;
import mode.GroceryList;
import mode.MobilePhone;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//       Scanner scanner =new Scanner(System.in);
//        GroceryList grogeryList= new GroceryList();
//        int choice;
//        do{
//            System.out.println("Seçim yap.(0:sonlandır,1:Ekle,2:Çıkar)");
//            choice=scanner.nextInt();
//            scanner.nextLine();
//            switch (choice){
//                case 1:
//                    System.out.println("eklenecek ürün:(Birden fazla ürün varsa virgül','kullanın)");
//                    String itemsToAdd=scanner.nextLine();
//                    grogeryList.addItems(itemsToAdd);
//                    break;
//                case 2:
//                    System.out.println("silinnecek ürün:(Birden fazla ürün varsa virgül','kullanın)");
//                    String itemsToRemove=scanner.nextLine();
//                    grogeryList.removeItems(itemsToRemove);
//                    break;
//                default:
//                    System.out.println("Sadece 0,1,2 arasında değerler seçiniz.");
//                    break;
//            }
//             grogeryList.printSorted();
//        }
//        while(choice!=0);
//        scanner.close();

        System.out.println("**********************************");

        Contact nehir=new Contact("Nehir","1234567890");
        Contact seda=new Contact("seda","0234565890");
        Contact ali=new Contact("ali","7234567844");
        Contact mete=new Contact("mete","1834564490");

        MobilePhone mobilePhone=new MobilePhone("1245364563");
        mobilePhone.addNewContact(nehir);
        mobilePhone.addNewContact(seda);
        mobilePhone.addNewContact(ali);
        mobilePhone.addNewContact(mete);

        System.out.println("Rehberim");
        mobilePhone.printContact();

        System.out.println("**************************");
        mobilePhone.updateContact(seda,new Contact("selin","123456787654"));
        mobilePhone.printContact();

        System.out.println("************************");
        mobilePhone.removeContact(mete);
        mobilePhone.printContact();

        System.out.println("************************************");
        Contact contact=mobilePhone.gueryContact("xxxx");
        if(contact != null){
            System.out.println(contact.toString());
        }
        else
           System.out.println("seçim null");

        System.out.println("*****************");
        int contactFind=mobilePhone.findContact(ali);
        System.out.println("Aranan index: "+contactFind);








    }
}