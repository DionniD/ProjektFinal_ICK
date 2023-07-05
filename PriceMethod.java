import java.util.Scanner;

public class PriceMethod {
    private String priceMethod;

    public PriceMethod() {
        askPriceMethod();
    }

    private void askPriceMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the payment method (electronic/cash) : ");
        priceMethod = scanner.nextLine();

    }

    public void confirmPayment(double price) {
        if (priceMethod.equalsIgnoreCase("Electronic")) {
            paymentElectronic(price);
        } else if (priceMethod.equalsIgnoreCase("Cash")) {
            paymentCash(price);
        } else {
            System.out.println("The selected payment method is not valid. ");
        }
    }

    private void paymentElectronic(double price) {
        System.out.println("The electronic payment was made successfully.");

    }

    private void paymentCash(double price) {
        System.out.println("The cash payment was made successfully.");

    }
}

