/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlineBookStore;
import javax.swing.*;
import java.util.regex.*;

/**
 *
 * @author Chun On
 */
public class ObookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^\\d+$]");
        
        String stringNumBook = JOptionPane.showInputDialog("Please enter the number of book you wish to purchase.");
        JTextField quesNumBook = new JTextField();
        Matcher validateNumBook = p.matcher(stringNumBook);
        if (validateNumBook.find()) {
            JOptionPane.showMessageDialog(null, "Please enter only numbers");
            System.exit(0);
           }
        else if (stringNumBook.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please do not leave it empty");
            System.exit(0);
        }
        int numBook = Integer.parseInt(stringNumBook);

        
        String stringPriceBook = JOptionPane.showInputDialog("Please enter the price of the book.");
        JTextField quesPriceBook = new JTextField();
        Matcher validatePriceBook = p.matcher(stringPriceBook);
        if (validatePriceBook.find()) {
            JOptionPane.showMessageDialog(null, "Please enter only numbers");
            System.exit(0);
           }
        else if (stringPriceBook.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please do not leave it empty");
            System.exit(0);
        }
        double priceBook = Double.parseDouble(stringPriceBook);
        
        String[] membershipChoice = {"Gold", "Silver", "None"};
        double discount;
        String discountPercent;
        int membership = JOptionPane.showOptionDialog(null,"Please choose your membership type", "Membership type", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, membershipChoice, membershipChoice[0]);
        switch (membership){
            case 0:
                discount = 0.2;
                discountPercent = "20%";
                break;
            case 1:
                discount = 0.1;
                discountPercent = "10%";
                break;
            default:
                discount = 0.0;
                discountPercent = "None";
        }
        
        double totalCost = numBook * priceBook;
        double discountedTotalCost = numBook * priceBook * (1.0-discount);
        
        JOptionPane.showMessageDialog(null, "Total cost before discount: $"+totalCost+"\nMembership discount applied: "+discountPercent+"\nFinal total cost after discount: $"+discountedTotalCost);
        
    }
    
}
