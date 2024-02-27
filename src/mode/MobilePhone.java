package mode;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts=new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(contact==null || contact.getName()==null || contact.getPhoneNumber()==null){
            return false;
        }
        if(findContact(contact.getName())>= 0){
            return false;
        }
        this.contacts.add(contact);
        return true;

    }

    public boolean updateContact(Contact oldContact ,Contact newContact ){
       int oldContactIndex=findContact(oldContact);
       if(oldContactIndex<0){
           return false;
       }
       this.contacts.set(oldContactIndex,newContact);
       return true;
    }

    public boolean removeContact(Contact contact){
        int removeContact=findContact(contact);
        if(removeContact<0){
            return false;
        }
        this.contacts.remove(removeContact);
        return true;
    }

    public int findContact(String name){
       for(int i=0;i< contacts.size();i++){
           Contact contact=contacts.get(i);
           if(contact.getName().equalsIgnoreCase(name)){
               return i;
           }
       }
       return -1;
    }
    public int findContact(Contact contact){
        return this.contacts.indexOf(contact);
    }
    public Contact gueryContact(String contactName){
     int contactIndex= findContact(contactName);
     if(contactIndex<0){
         return null;
     }
     return this.contacts.get(contactIndex);

    }

    public void printContact(){
        for(int i=0;i<this.contacts.size();i++){
            Contact contact=this.contacts.get(i);
            System.out.println((i+1)+"."+contact.getName()+"->"+contact.getPhoneNumber());
            //contacts.forEach((contact,i) -> System.out.println((contacts.indexOf(contact)+1)+"."+contact.getName()+"->"+contact.getPhoneNumber()));

        }
    }



}
