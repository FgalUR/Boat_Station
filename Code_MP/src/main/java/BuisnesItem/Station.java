package BuisnesItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
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
