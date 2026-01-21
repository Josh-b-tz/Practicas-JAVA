public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(){
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "slow"){
            wagTail();
            walk();
        } else{
            bark();
            run();
        }
        System.out.println();
    }

    private void bark(){
        System.out.print("Woof!");
    }

    private void run(){
        System.out.print("Dog is running");
    }

    private void walk(){
        System.out.print(" dog walking");
    }
    private void wagTail(){
        System.out.printf(" Tail wagging");
    }
}
