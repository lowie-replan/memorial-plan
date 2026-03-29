import java.util.Scanner;

public class MP_Test {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            String check = "y";
            while (check.equals("y")) {

                System.out.println("|| CATEGORIES ||");
                System.out.println("1 - REGULAR");
                System.out.println("2 - INNER WALK");
                System.out.println("3 - WALK");
                System.out.println("4 - INNER DRIVE");
                System.out.println("5 - DRIVE");
                System.out.println();
                System.out.println("============================");
                System.out.println();

                System.out.print("Choose among the categories : ");
                int choice = s.nextInt();

                System.out.println("You have chosen category " + choice);
                System.out.println();
                System.out.println("============================");
                System.out.println();

                MP categories;

                if (choice == 1) {
                    categories = new MP(13000);
                } else if (choice == 2) {
                    categories = new MP(16300);
                } else if (choice == 3) {
                    categories = new MP(17950);
                } else if (choice == 4) {
                    categories = new MP(19600);
                } else {
                    categories = new MP(21250);
                }
                int equate = categories.getLotPrice();
                System.out.println("Lot Price     : " + categories.getLotPrice());

                displayAll(equate);

                System.out.println();
                System.out.println("============================");
                System.out.println();

                System.out.print("Do you want to check another Category? [y/n] : ");
                check = s.next().toLowerCase();

                System.out.println();
                System.out.println("============================");
                System.out.println();

                if (check.equals("n")) {

                    String confirmation = "n";
                    while (confirmation.equals("n")) {

                        next();

                        int payment_choice = s.nextInt();
                        MP pay;

                        if (payment_choice == 1) {
                            pay = new MP(equate, 50, 36);
                        } else if (payment_choice == 2) {
                            pay = new MP(equate, 25, 24);
                        } else if (payment_choice == 3) {
                            pay = new MP(equate, 15, 12);
                        } else if (payment_choice == 4) {
                            pay = new MP(equate, 5, 60);
                        } else if (payment_choice == 5) {
                            pay = new MP(equate, 10, 30);
                        } else {
                            pay = new MP(equate, 15, 1);
                        }
                        int interest = pay.getInterest();
                        int month = pay.getMonths();

                        if (payment_choice == 1 || payment_choice == 2 || payment_choice == 3) {
                            payments(equate, interest, month);
                        } else {
                            payments2(equate, interest, month);
                        }
                        System.out.println();
                        System.out.print("Confirm Payment? [y/n] : ");
                        confirmation = s.next().toLowerCase();
                        if (confirmation.equals("y")) {
                            System.out.println();
                            System.out.println("TRANSACTION COMPLETED!");
                            System.out.println();
                            System.out.println("============================");

                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    static void displayAll(int equate) {

        MP values = new MP(equate);

        System.out.println("Vat (12%)     : " + values.getVat());
        System.out.println("Lot Price     : " + values.getTotalPrice());
        System.out.println("PCF           : " + values.getPCF());
        System.out.println("Selling Price : " + values.getSellingPrice());
        System.out.println("DP (10%)      : " + values.getDownPayment());
        System.out.println("Bal Price     : " + (values.getSellingPrice() - values.getDownPayment()));

    }

    static void next() {

        System.out.println("|| PAYMENTS ||");
        System.out.println("1 - 3 YEARS (50% Interest)");
        System.out.println("2 - 2 YEARS (25% Interest)");
        System.out.println("3 - 1 YEAR (15% Interest)");
        System.out.println("4 - 60 Days (Less 5%)");
        System.out.println("5 - 30 Days (Less 10%)");
        System.out.println("6 - Spot Cash (Less 15%)");
        System.out.println();
        System.out.print("Choose Payment : ");
    }

    static void payments(int equate, int interest, int month) {

        MP payment = new MP(equate, interest, month);

        System.out.println("============================");
        System.out.println();
        System.out.println("Interest       : " + payment.getYearInterest());
        System.out.println("Contract Price : " + payment.getContractPrice());
        System.out.println("Monthly Pay    : " + payment.getMonthlyPayment());
        System.out.println();
        System.out.println("============================");
    }

    static void payments2(int equate, int interest, int month) {

        MP payment2 = new MP(equate, interest, month);

        System.out.println("============================");
        System.out.println();
        System.out.println("Less " + interest + " Percent : " + payment2.getLess());
        System.out.println();
        System.out.println("============================");
    }
}
