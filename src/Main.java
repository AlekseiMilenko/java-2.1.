public class Main {
    public static void main(String[] args) {
        int currentBalance = 2_000_000_000;
        int incomingTransfer = 500_000_000;
        int balanceAfterTransfer = currentBalance + incomingTransfer;
        System.out.println(balanceAfterTransfer);
    }
}