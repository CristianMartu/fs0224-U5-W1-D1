package cristianmartucci.U5_W1_D1;

import cristianmartucci.U5_W1_D1.entities.Drink;
import cristianmartucci.U5_W1_D1.entities.Menu;
import cristianmartucci.U5_W1_D1.entities.Pizza;
import cristianmartucci.U5_W1_D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Configurations {
    @Bean(name = "tomato")
    public Topping getTomato(){
        return new Topping("Tomato", 50, 0.59);
    }

    @Bean(name = "cheese")
    public Topping getCheese(){
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean(name = "ham")
    public Topping getHam(){
        return new Topping("Ham", 35, 0.99);
    }

    @Bean(name = "onions")
    public Topping getOnions(){
        return new Topping("Onions", 22, 0.69);
    }

    @Bean(name = "pineapple")
    public Topping getPineapple(){
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean(name = "salami")
    public Topping getSalami(){
        return new Topping("Salami", 86, 0.99);
    }

    @Bean(name = "lemonade")
    public Drink getLemonade(){
        return new Drink("Lemonade (0.33l)", 128, 1.29);
    }

    @Bean(name = "water")
    public Drink getWater(){
        return new Drink("Water (0.5l)", 0, 1.29);
    }

    @Bean(name = "wine")
    public Drink getWine(){
        return new Drink("Wine (0.75l, 13%)", 607, 7.49);
    }

    @Bean(name = "pizza margherita")
    public Pizza getPizzaMargherita(){
        return new Pizza("Pizza Margherita", Arrays.asList(getTomato(), getCheese()), 1104, 4.99);
    }

    @Bean(name = "hawaiian pizza")
    public Pizza getHawaiianPizza(){
        return new Pizza("Hawaiian Pizza", Arrays.asList(getTomato(), getCheese(), getHam(), getPineapple()), 1024, 6.49);
    }

    @Bean(name = "salami pizza")
    public Pizza getSalamiPizza(){
        return new Pizza("Salami Pizza", Arrays.asList(getTomato(), getCheese(), getSalami()), 1160, 5.99);
    }

    @Bean
    public Menu getMenu(){
        return new Menu(Arrays.asList(getPizzaMargherita(), getHawaiianPizza(), getSalamiPizza()), Arrays.asList(getCheese(), getHam(), getOnions(), getPineapple(), getSalami()), Arrays.asList(getLemonade(), getWater(), getWine()));
    }

}
