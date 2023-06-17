import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        CoffeeMachine cofeeMachineObj=new CoffeeMachine();


        while(true) {
            System.out.println("**************************** Coffee Main Menu ****************************");
            System.out.println("Type :1 for Purchase Coffee:");
            System.out.println("Type :2 for coffee Ingredient Menu:");
            System.out.println("Type :3 for Analytics:");
            System.out.println("Type :4 for Exit:");




            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println(" type 1 for Espresso: price - $4/cup, water needed – 250 ml/cup, milk needed – 0 ml/cup, beans needed-16/cup");
                    System.out.println(" type 2 for Latte: price - $7/cup, water needed – 350 ml/cup, milk needed – 75 ml/cup, beans needed-20/cup");
                    System.out.println(" type 3 for Cappuccino: price - $6/cup, water needed – 200 ml/cup milk needed – 100 ml/cup beans needed-12/cup.");

                    int chooseCoffee = sc.nextInt();

                    switch(chooseCoffee){
                        case 1:System.out.println(cofeeMachineObj.espressoPurchase(4,250,0,16));
                        break;

                        case 2:System.out.println(cofeeMachineObj.espressoPurchase(7,350,75,20));
                        break;
                        case 3:System.out.println(cofeeMachineObj.espressoPurchase(6,200,100,12));
                        break;
                        default:System.out.println("Wrong input...Sorry!!!");
                    }


                    break;
////////////////////////////////////////////////////////////////////////////////////////////
                case 2:
                    System.out.println("Type 1 for Show the coffee Ingredient:");
                    System.out.println("Type 2 for Fill the coffee Ingredient:");
                    System.out.println("Type 3 for Show the Amount:");

                    int coffeeIngredient = sc.nextInt();
                    switch (coffeeIngredient) {
                        case 1:
                            cofeeMachineObj.CoffeeMachine();
                            break;

                        case 2:
                            System.out.println("Give amount of watter in ML:");
                            int water = sc.nextInt();
                            System.out.println("Give amount of milk in ML:");
                            int milk = sc.nextInt();
                            System.out.println("Give amount of beans:");
                            int beans = sc.nextInt();
                            cofeeMachineObj.fillCoffeeIngredient(water, milk, beans);
                           break;
                        case 3: cofeeMachineObj.showAmount();
                           break;
                        default:System.out.println("Wrong input...Sorry!!!");
                    }
                    break;
                case 3:cofeeMachineObj.showAnalytics();
                     break;
                case 4: return;

                default:System.out.println("Wrong input...Sorry!!!");
            }


        }
    }
}