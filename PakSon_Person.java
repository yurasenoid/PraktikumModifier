package pakson_person;
import java.util.Scanner;

public class PakSon_Person {
    public static void main(String[] args) {
        Person aisen = new Person();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Username : ");
        String username = input.next();
        System.out.print("Masukkan Password : ");
        String password = input.next();
        
        aisen.setUsername(username);
        aisen.setPassword(password);
        
        System.out.println("===================");
        System.out.println("Username: " + aisen.getUsername());
        System.out.println("Password: " + aisen.getPassword());  
        System.out.println("== SUCCESS LOGIN ==");
    }
    
}
