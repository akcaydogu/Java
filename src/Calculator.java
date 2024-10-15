import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("yapmak istediğiniz işlemi gösteriniz");
            char operator = input.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == 'f') {
                if (operator == 'f') {
                    System.out.println("Sistemden çıkış yapıyorsunuz");
                    break;
                }
                System.out.println("1. sayıyı giriniz : ");
                double number1 = input.nextDouble();
                System.out.println("2. sayıyı giriniz : ");
                double number2 = input.nextDouble();
                if(operator == '+'){
                    System.out.println("İşlemin sonucu : " + (number1 + number2));
                } else if(operator == '-'){
                    System.out.println("İşlemin sonucu : " + (number1 - number2));
                } else if(operator == '*'){
                    System.out.println("İşlemin sonucu : " +(number1*number2));
                } else if(operator == '/'){
                    if (number2 != 0){
                        System.out.println((number1/number2));
                        break;
                    }
                    else {
                        System.out.println("Paydada 0 olamaz.");
                    }
                }

            } else {
                System.out.println("Hatalı işlem lütfen geçerli bir işlem türü giriniz.");
            }

        }


}

    }


