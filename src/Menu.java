import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void startMenu() {
        boolean startMenu = true;
        while (startMenu) {
            printStartmenu();
        }
    }

    private void printStartmenu() {
        System.out.println("1");
        System.out.println("2");
    }
}