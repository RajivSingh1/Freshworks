import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
Scanner scanner=new Scanner(System.in);
        Detail detail=new Detail();

detail.setFirstName(scanner.next());
detail.setSecondName(scanner.next());
detail.setAddress(scanner.next());
        detail.setLanguage(scanner.next());
        DataStore dataStore=new StudentDataStore(detail);
        dataStore.insert();
        String key=scanner.next();
        dataStore.read(key);
        dataStore.delete(key);
    }
}
