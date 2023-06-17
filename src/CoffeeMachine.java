public class CoffeeMachine {


    private long storeAmount=0;
    private long storeWater=0;
    private long storeMilk=0;
    private long storeBeans=0;

    private long totalCoffeeSell=0;

    private int water=0;
    private int milk=0;
    private int beans=0;
    //Espresso


    public void CoffeeMachine(){
        System.out.println("********************** CoffeeMachine: **********************");
        System.out.println("Water : = "+water);
        System.out.println("Milk : = "+milk);
        System.out.println("Beans : = "+beans);
    }

   public void fillCoffeeIngredient(int water,int milk,int beans){
        this.water+=water;
        this.milk+=milk;
        this.beans+=beans;
   }

   public void showAmount(){
        System.out.println(storeAmount);
   }

   public String espressoPurchase(int prise , int water,int milk, int beans){

       if(this.water==0 || this.beans==0){
           System.out.println("Opp!!! Not all items are available!!");
           System.out.println("water: "+this.water);
           System.out.println("beans: "+this.beans);
           return "Sorry!!!";
       }
       storeAmount+=prise;
       this.water-=water;
       this.milk-=milk;
       this.beans-=beans;

       storeWater+=water;
       storeMilk+=milk;
       storeBeans+=beans;
       totalCoffeeSell++;
       return "Espresso Coffee Buy Successfully!!!";
   }

    public String lattePurchase(int prise , int water,int milk, int beans){
        if(this.water==0 || milk==0 || this.beans==0){
            System.out.println("Opp!!! Not all items are available!!");
            System.out.println("water: "+this.water);
            System.out.println("milk: "+this.milk);
            System.out.println("beans: "+this.beans);
            return "Sorry!!!";
        }
        storeAmount+=prise;
        this.water-=water;
        this.milk-=milk;
        this.beans-=beans;

        storeWater+=water;
        storeMilk+=milk;
        storeBeans+=beans;
        totalCoffeeSell++;
        return "Latte Coffee Buy Successfully!!!";
    }

    public String CappuccinoPurchase(int prise , int water,int milk, int beans){
        if(this.water==0 || milk==0 || this.beans==0){
            System.out.println("Opp!!! Not all items are available!!");
            System.out.println("water: "+this.water);
            System.out.println("milk: "+this.milk);
            System.out.println("beans: "+this.beans);
            return "Sorry!!!";
        }
        storeAmount+=prise;
        this.water-=water;
        this.milk-=milk;
        this.beans-=beans;

        storeWater+=water;
        storeMilk+=milk;
        storeBeans+=beans;
        totalCoffeeSell++;
        return "Cappuccino Coffee Buy Successfully!!!";
    }

    public void showAnalytics(){
        System.out.println("**************************** Coffee Analytics ****************************");
        System.out.println("Total Coffee Sell: "+totalCoffeeSell);
        System.out.println("Total Money Earned: "+"$"+storeAmount);
        System.out.println("Total Water Consumed: "+storeWater+"ML");
        System.out.println("Total Milk Consumed: "+storeMilk+"ML");
        System.out.println("Total Beans Consumed: "+storeBeans);
    }

}
