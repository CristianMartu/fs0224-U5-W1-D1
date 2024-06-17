package cristianmartucci.U5_W1_D1.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
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
        for(Topping topping: toppings){
            result.append(" " + topping.getName() + " ");
        }
        result.append(")\t\t" + calories + "\t\t" + price);
    return result.toString();
    }
}
