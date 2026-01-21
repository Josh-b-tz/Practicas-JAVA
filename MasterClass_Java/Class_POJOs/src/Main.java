//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i<=5;i++){
            LPAStudent st1 = new LPAStudent("52000" + i,
                    switch (i){
                    case 1-> "Marcos";
                    case 2-> "Elizabeth";
                    case 3-> "Jane";
                    case 4-> "Brayan";
                    case 5-> "Josue";
                    default -> "undefine";
                    }, "10/05/20200", "Math" );
            System.out.println(st1);
        }

    }
}