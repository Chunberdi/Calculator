import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
       /* System.out.println("vvevedenie vyrajenie v odnu stroku ot 1 do 10,");
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String op = "";
        do {
            String input = sc.next();
            if (input.equals("stop")){
                break;
            }
            String [] strings = input.split("I II III IV V");
            String[] operator = input.split("\\w");

            try {
                num1 =Integer.parseInt(strings[0]);
                num2 = Integer.parseInt(strings[1]);
                if (num1 < 1 || num1 > 10|| num2 < 1 || num2 > 10){
                    System.out.println("nevernui format vvod. poprobuite ewo raz."+"\nvvedenie vurajenie v odnu stroku ot 1 do 10.");
                   continue;

                }
                op = operator[operator.length - 1];
                System.out.println(operator(num1, num2,op));
            } catch (Exception e) {
                System.out.println("owibka vvoda . popurobuite ewo raz.");
            }
            }while (true);

        }
        private static int operation(int a, int b,String op){
        switch (op){
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            default:
                return 0;
        }*/











       Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("punkt");
            System.out.println("1. slo");
            System.out.println("2.vuch");
            System.out.println("3.umnojenie");
            System.out.println("4.delenie");
            System.out.println("5.vuiti");
            int person = scanner.nextInt();
            int result;
            if (person == 5){
                break;
            }else if (person == 1){
                System.out.println("vv pervoe chislo : ");
                int a = scanner.nextInt();
                System.out.println("vv vtoroe chislo");
                int b = scanner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a + b;
                System.out.println("otvet :" + result);
            } else  if (person == 2){
                System.out.println("vv pervoe chisla : ");
                int a = scanner.nextInt();
                System.out.println("vv vtoroe chisla : ");
                int b = scanner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : "+ b);
                result = a - b;
                System.out.println("otvet : " + result);
            }else  if (person == 3){
                System.out.println(" vv pervoe chisla : ");
                int a = scanner.nextInt();
                System.out.println("vv vtoroe chisla : ");
                int b = scanner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a * b;
                System.out.println("otvet : " + result);
            } else  if (person == 4){
                System.out.println("vv pervoe chisla : ");
                int a = scanner.nextInt();
                System.out.println("vv vtoroe chisla : ");
                int b = scanner.nextInt();
                if (b == 0){
                    System.out.println(" na nol delit nelzi");
                }
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a/b;
                System.out.println("otvet : " + result);
            }else {
                System.out.println("Exception/Eror");
            }


        }
        System.out.println("программа завершено");









    }

    private static boolean operator(int num1, int num2, String op) {
        return false;
    }
}