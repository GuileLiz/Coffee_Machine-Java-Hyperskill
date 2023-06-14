package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        //input value
        Scanner scanner = new Scanner(System.in);
        int quantityOfWater = 400;
        int quantityOfMilk = 540;
        int gramsOfCoffee = 120 ;
        int numOfCups = 9;
        int money = 550 ;


        String action;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();
            System.out.println();

            switch (action) {
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(quantityOfWater + " ml of water");
                    System.out.println(quantityOfMilk + " ml of milk");
                    System.out.println(gramsOfCoffee + " g of coffee beans");
                    System.out.println(numOfCups + " disposable cups");
                    System.out.println("$" + money + " of money");
                    System.out.println();
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String coffeeType = scanner.nextLine();
                    switch (coffeeType) {
                        case "1":
                            if (quantityOfWater < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (gramsOfCoffee < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (numOfCups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            } else {
                                quantityOfWater -= 250;
                                quantityOfMilk -= 0;
                                gramsOfCoffee -= 16;
                                numOfCups -= 1;
                                money += 4;
                                break;
                            }
                            break;
                        case "2":
                            if (quantityOfWater < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (quantityOfMilk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (gramsOfCoffee < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (numOfCups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            } else {
                                quantityOfWater -= 350;
                                quantityOfMilk -= 75;
                                gramsOfCoffee -= 20;
                                numOfCups -= 1;
                                money += 7;
                                break;
                            }
                            break;
                        case "3":
                            if (quantityOfWater < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (quantityOfMilk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (gramsOfCoffee < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (numOfCups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            } else {
                                quantityOfWater -= 200;
                                quantityOfMilk -= 100;
                                gramsOfCoffee -= 12;
                                numOfCups -= 1;
                                money += 6;
                                break;
                            }
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water the coffee machine has:");
                    quantityOfWater += scanner.nextInt();
                    System.out.println("Write how many ml of milk the coffee machine has:");
                    quantityOfMilk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans the coffee machine has:");
                    gramsOfCoffee += scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    numOfCups += scanner.nextInt();
                    System.out.println();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money -= money;
                    break;
            }
        } while (!action.equals("exit"));
    }
}
