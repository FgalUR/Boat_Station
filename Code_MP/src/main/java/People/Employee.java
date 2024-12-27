package People;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@ToString
@Getter
public class Employee {
    private int emp_id;
    @Setter
    private int salary;
    @Setter
    private String telephone;
    @Setter
    private String education;
    @Setter
    private String address;
    @Setter
    private String position;
    @Setter
    private String firstName;
    @Setter
    private String lastName;
    @Setter
    private String patronymic;
    @Setter
    private int station_id;
}
