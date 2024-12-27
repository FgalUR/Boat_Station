package BuisnesItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@ToString
@Getter
public class Boat {
    private int boat_id;
    @Setter
    private String name;
    @Setter
    private String number;
    @Setter
    private String brand;
    @Setter
    private String variety;
    @Setter
    private int client_id;
    @Setter
    private int eng_id;
    @Setter
    private int station_id;

}
