package BuisnesItem;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
public class Station {
    private int station_id;
    @Setter
    private String address;
    @Setter
    private String telephone;
    @Setter
    private String name;
}
