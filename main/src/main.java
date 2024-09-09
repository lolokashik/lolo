import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int x = lol.nextInt();
        System.out.println("Введите 2 число");
        int y = lol.nextInt();
        System.out.println("Выберите операцию: - + * /");
        String operator = lol.nextLine();


        
        if(operator.equals("-")){
            minus(x,y);
        } else if (operator.equals("+")) {
            plus(x,y);
        } else if (operator.equals("*")) {
            mnog(x,y);
        } else if (operator.equals("/")) {
            delit(x,y);
        }else {
            System.out.println("Попробуйте снова");
        }
    }

    public static int minus(int x, int y){
        return x - y;
    }
    public static int plus(int x, int y){
        return x + y;
    }
    public static int mnog(int x, int y){
        return x * y;
    }
    public static int delit(int x, int y){
        return x / y;
    }




}
