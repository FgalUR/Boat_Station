package People;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
public class Engineer {
    private int eng_id;
    @Setter
    private int salary;
    @Setter
    private String category;
    @Setter
    private String education;
    @Setter
    private String telephone;
    @Setter
    private String address;
    @Setter
    private String lastName;
    @Setter
    private String firstName;
    @Setter
    private String patronymic;
}
