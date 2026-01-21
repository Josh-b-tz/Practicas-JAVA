public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Data worker: " + name +
                ", birthDate=" + birthDate +
                ", endDate=" + endDate;
    }

    public int getAge(){
        int actualDate = 2025;
        return actualDate - (Integer.parseInt(birthDate));
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }
}
