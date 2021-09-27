import java.util.Scanner;

public class MugManagerApp {
    public static void main(String[] args) {
        int decision = 0;
        MugProduction mugProduction = new MugProduction();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("select options");
            System.out.println("add mug - press 1");
            System.out.println("get mug for production - press 2");
            System.out.println("display all mugs - press 3");

            System.out.println("close the program - press 0");
            decision = scanner.nextInt();

            switch (decision) {
                case 1:
                    System.out.println("enter dedication");
                    scanner.nextLine();
                    Mug mug = new Mug(scanner.nextLine());
                    mugProduction.addMug(mug);
                    break;
                case 2:
                    mugProduction.getMug();
                    break;
                case 3:
                    mugProduction.displayAllMugs();
                    break;
            }
        } while (decision != 0);
    }
}
