import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Security security = new Security(userManager);
        Menu menu = new Menu(security);
    }
}