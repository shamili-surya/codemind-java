import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitsConsumed = scanner.nextInt();
        
        double totalBill = calculateBill(unitsConsumed);
        System.out.printf("%.2f%n", totalBill);
        
        scanner.close();
    }
    
    public static double calculateBill(int units) {
        double chargePerUnit;
        
        if (units <= 199) {
            chargePerUnit = 1.20;
        } else if (units < 400) {
            chargePerUnit = 1.50;
        } else if (units < 600) {
            chargePerUnit = 1.80;
        } else {
            chargePerUnit = 2.00;
        }
        
        double totalCharge = units * chargePerUnit;
        
        if (totalCharge > 400) {
            double surcharge = totalCharge * 0.15;
            totalCharge += surcharge;
        } else {
            totalCharge += 100;
        }
        
        return totalCharge;
    }
}