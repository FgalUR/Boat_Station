
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println();
        System.out.println("Привет, это приложение для управление твоими лодочными станциями и всем что с ними " +
                "связано! P.S verion 1.0.BETA");
        System.out.println();
        System.out.println("Выбери действие:");
        System.out.println("    1)Просмотр текущего положения;");
        System.out.println("    2)Работа со станциями;");
        System.out.println("    3)Работа с клиентами;");
        System.out.println("    4)Работа с сотрудниками;");
        System.out.println("    5)Работа с лодками;");
        System.out.println("    6)Работа с инженерами;");
        //System.out.println("5)");


        System.out.println("    0)Выйти из программы");
        Scanner scanner=new Scanner(System.in);
        int res=1;
        do {
            String choice = scanner.nextLine();
            switch (choice) {
                case "0":
                    System.out.println("Выход из программы....");
                    res=0;
                    break;
                case "1":
                    res=1;
                    break;
                case "2":
                    res=1;
                    break;
                case "3":
                    res=1;
                    break;
                case "4":
                    res=1;
                    break;

                default:
                    res=1;
                    System.out.println("Было введено неправильное значение , выберите цифру из предложенных.");

          /*  case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
           */
            }
        }while (res!=0);
        scanner.close();
    }
    }
