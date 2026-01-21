import java.sql.SQLOutput;

public class SmartKitchen {
    private CoffeMaker brewMaster;
    private Refrigerator iceBox;
    private Dishwasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeMaker();
        iceBox = new Refrigerator();
        dishWasher = new  Dishwasher();
    }

    public void setKitchenState(boolean addWater, boolean pourMix, boolean loadDishwasher){
        this.brewMaster.setHasWorkToDo(addWater);
        this.iceBox.setHasWorkToDo(pourMix);
        this.dishWasher.setHasWorkToDo(loadDishwasher);
    }

    public void doKitchenWork(){
        this.brewMaster.brewCoffee();
        this.iceBox.orderFood();
        this.dishWasher.doDishes();
    }

}





