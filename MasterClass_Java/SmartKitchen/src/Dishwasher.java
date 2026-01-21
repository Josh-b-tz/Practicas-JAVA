public class Dishwasher {
    private boolean hasWorkToDo;

    public Dishwasher() {
        this.hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Lavando platos...");
            hasWorkToDo = false;
        }
    }


}
