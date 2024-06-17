package cristianmartucci.U5_W1_D1.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Pizza {
    private String name;
    private List<Topping> toppings;
    private int calories;
    private double price;

//    @Override
//    public String toString() {
//        return "\n\t\t" + name +
//                "\t toppings= " + toppings +
//                "\t calories= " + calories +
//                "\t price= " + price;
//    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("\n\t\t" + name + " (");
        for (int i = 0; i < toppings.size(); i++) {
            if (i < toppings.size() - 1) result.append(toppings.get(i).getName() + ", ");
            else result.append(toppings.get(i).getName());
        }
        result.append(")\t\t" + calories + "\t\t" + price);
    return result.toString();
    }
}
