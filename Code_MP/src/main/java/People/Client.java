package People;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
public class Client {
    private int client_id;
    @Setter
    private String firstName;
    @Setter
    private String lastName;
    @Setter
    private String patronymic;
    @Setter
    private String telephone;
    @Setter
    private String address;
}
