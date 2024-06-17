package cristianmartucci.U5_W1_D1.entities;

import lombok.*;


@AllArgsConstructor
@Getter
@Setter
public class Drink {
    private String name;
    private int calories;
    private double price;

    @Override
    public String toString() {
        return "\n\t\t" + name +
                "\t\t calories= " + calories +
                "\t\t price= " + price;
    }
}
