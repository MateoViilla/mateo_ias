package videostore.model;

import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals;

    public Customer(String name) {
        _name = name;
        _rentals = new Vector<Rental>();
    }

    public void addRental(Rental rental) {
        _rentals.addElement(rental);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : _rentals) {

            double thisAmount = rental.getAmountForRental();
            frequentRenterPoints++;
            if (rental.canAddBonus())
                frequentRenterPoints++;

            result += rental.getResultAmount(rental, thisAmount);

            totalAmount += thisAmount;
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";

        return result;
    }



}
