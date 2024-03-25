package quizes.q2.salome_kikilashvili_2.fruit;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250;
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000;
        int tax = 5800; // 58 lari in tetri
        int water = 41;
        int gas = 412;
        int electricity = 7800; // 78 lari in tetri
        int parking = 5300; // 53 lari in tetri

        int otherExpenses = tax + water + gas + electricity + parking;

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
        System.out.println("Profit in Laris: " + profit);
    }
    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        int totalIncome = pricePerCoffee * numCoffeeSold;
        int totalCost = totalCostOfBeans + otherExpenses;
        int profitInTetri = totalIncome - totalCost;
        double profitInLaris = profitInTetri / 100.0; // Converting to Laris

        return profitInLaris;
    }
}
