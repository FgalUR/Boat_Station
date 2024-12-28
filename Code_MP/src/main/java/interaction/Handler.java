package interaction;

import People.Client;
import Repository.ClientRepository;
import Service.ClientService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Handler {

    String url = "jdbc:postgresql://localhost:5432/Boat_Station";
    String user = "postgres";
    String pass = "postgres";
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void clientInteraction() {
        try {
            ClientRepository repository = new ClientRepository(connection);
            ClientService service = new ClientService(repository);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Выберите действие: ");
                System.out.println();
                System.out.println("1) Добавить клиента");
                System.out.println("2) Показать всех клиентов");
                System.out.println("3) Обновить клиента");
                System.out.println("4) Удалить клиента");
                System.out.println("0) Выйти");
                int res = 1;
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.print("Введите имя: ");
                        String firstName = scanner.nextLine();
                        System.out.print("Введите Фамилию: ");
                        String lastName = scanner.nextLine();
                        System.out.println("Введите Отчество: ");
                        String patronymic = scanner.nextLine();
                        System.out.println("Введите телефон: ");
                        String telephone = scanner.nextLine();
                        System.out.println("Введите Адрес: ");
                        String address = scanner.nextLine();
                        service.addClient(firstName, lastName, patronymic, telephone, address);
                        System.out.println("Вы успешно добавили Клиента");
                        res = 1;
                        break;
                    case "2":
                        System.out.println("Вот все ваши клиенты: ");
                        System.out.println();
                        List<Client> clients = service.getAllClients();
                        clients.forEach(System.out::println);
                        res = 1;
                        break;
                    case "3":
                        // ( int id ,String firstName, String lastName, String patronymic
                        //    ,String telephone, String address)
//                        System.out.print("Введите ID клиента: ");
//                        int updateId = scanner.nextInt();
//                        scanner.nextLine();
//                        System.out.print("Введите новое имя: ");
//                        String newName = scanner.nextLine();
//                        System.out.print("Введите новый возраст: ");
//                        int newAge = scanner.nextInt();
//                        service.updateClient(updateId, newName, newAge);
//                        break;
                        System.out.println("Что вы хотите изменить?");
                        System.out.println("1) Имя");
                        System.out.println("2) Фамилию");
                        System.out.println("3) Отчетсво");
                        System.out.println("4) Телефон");
                        System.out.println("5) Адрес");
                        System.out.println("0) Выход из редактирования");
                        int res3 = 1;
                        do {
                            String case3 = scanner.nextLine();
                            switch (case3) {
                                case "1":
                                    System.out.println("Введите id клиента: ");
                                    int newId=scanner.nextInt();
                                    scanner.nextLine();
                                    res3 = 1;
                                    break;
                                case "2":
                                    res3 = 1;
                                    break;
                                case "3":
                                    res3 = 1;
                                    break;
                                case "4":
                                    res3 = 1;
                                    break;
                                case "5":
                                    res3 = 1;
                                    break;
                                case "0":
                                    System.out.println("Выход...");
                                    res3 = 0;
                                    break;
                                default:
                                    System.out.println("Вы ввели неправильную цифру");
                                    res3 = 1;
                            }
                        } while (res3 != 0);
                    case "4":
                        System.out.print("Введите ID клиента: ");
                        int deleteId = scanner.nextInt();
                        service.deleteClient(deleteId);
                        break;
                    case "0":
                        System.out.println("Вызод из работы с клиентом");
                        break;
                    default:
                        System.out.println("Неверный выбор.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
