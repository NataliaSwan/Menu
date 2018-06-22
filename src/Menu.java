import java.util.ArrayList;

public class Menu {
    private final String name;
    private final ArrayList <Dish> dishes = new ArrayList<>();


    public Menu(String name) {
        this.name=name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }
    public Dish getCheapestDish() {
        int idChip=0;
        int i=0;
        for (Dish d :dishes) {
            if (dishes.get(idChip).getPrice()>d.getPrice())
                idChip=i;
            i++;
        }
        return dishes.get(idChip);

    }
    public String getName() {
        return name;
    }
    public String toString() {
        //return "Menu{" + "dishes=" + dishes + '}';
        //return dishes.toString();
        StringBuilder string = new StringBuilder("Menu name: " + name + "\nDishes\n"+ "------------------\n");
        for (Dish curDish:dishes) {
            string.append(curDish.toString());
        }
        return string.toString();

    }

}
