public class FuelCostCalculator {
  
    public static void main(String[] args) {

        double distance = 150;     // in km
        double mileage = 15;       // km per liter
        double fuelPrice = 100;    // price per liter

        double fuelNeeded = distance / mileage;
        double totalCost = fuelNeeded * fuelPrice;

        System.out.println("Distance: " + distance + " km");
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Fuel Price: " + fuelPrice);
        System.out.println("Total Fuel Needed: " + fuelNeeded + " liters");
        System.out.println("Total Cost: " + totalCost);
    }

}
