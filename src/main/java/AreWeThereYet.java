import java.util.Scanner;
public class AreWeThereYet {
    public static void main(String[] args) {
                 Scanner sc = new Scanner (System.in);
                System.out.println("Are we there yet?");
                String Answer = sc.nextLine();

                while (!(Answer == ""))
                if (Answer.equalsIgnoreCase("Yes") || Answer.equalsIgnoreCase("No")) {
                    return;
                } else {
                    System.out.println("Are we there yet?");
                    Answer = sc.nextLine();
                }
    }
}
