import java.util.Scanner;

public class Menu {

    Security security;

    Menu(Security security){
        this.security = security;
    }
    Scanner scanner = new Scanner(System.in);

    public void startMenu(Security security){
        security.login();
    }

}
