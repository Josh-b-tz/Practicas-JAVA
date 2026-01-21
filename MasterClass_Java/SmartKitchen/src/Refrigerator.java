public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator() {
        this.hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("La comida está siendo ordenada...");
            hasWorkToDo = false;
        }
    }


}
