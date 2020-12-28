import java.util.Scanner; 

public class ContactList{
   
    public static String getPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            if (nameVec[i].equals(contactName))
                return phoneNumberVec[i];
        }
        return "Contact doesn't exists!";
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        String[] nameVec = new String[n];
        String[] phoneNumberVec = new String[n];
        String contactName;
        for (int i = 0; i < n; i++) {
            nameVec[i] = scnr.next();
            phoneNumberVec[i] = scnr.next();
        }
        contactName = scnr.next();
        System.out.println(getPhoneNumber(nameVec, phoneNumberVec, contactName, n));
   
   }
}