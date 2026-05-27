// EN: Import Scanner so the program can read user input
// JP: ユーザー入力を読み取るためにScannerをインポートします
import java.util.Scanner;

// EN: Main class for the Expense Tracker app
// JP: 経費トラッカーアプリのメインクラス

public class ExpenseTracker {

    // EN: Main method to run the application
    // JP: アプリケーションを実行するためのメインメソッド

    public static void main(String[] args) {

        // EN: Create a Scanner object to read terminal input
        // JP: ターミナル入力を読み取るためのScannerオブジェクトを作成します

        Scanner scanner = new Scanner(System.in);

        // EN: Ask the user for expense details
        // JP: ユーザーに支出の詳細を尋ねます

        System.out.print("Enter expense name: ");
        String expenseName = scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Enter amount: £");
        double amount = scanner.nextDouble();

        // EN: Display the expense information
        // JP: 支出情報を表示します

        System.out.println();
        System.out.println("Expense Tracker");
        System.out.println("---------------");
        System.out.println("Expense Name: " + expenseName);
        System.out.println("Category: " + category);
        System.out.println("Amount: £" + amount);

        scanner.close();
    }
}
