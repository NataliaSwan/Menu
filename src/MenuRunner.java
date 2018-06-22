public class MenuRunner {
    public static void main(String[] args) {
        Menu studentMenu = new Menu("Menu for students");
        Menu usuallyMenu = new Menu("Menu for all visitors");

        Dish kompot = new Dish("Kompot", "Berries drink", 10);
        Dish staik = new Dish("Staik", "chicken meat steak", 150);
        Dish salad = new Dish("Cesar", "Classic Cesar salad",100);
        Dish pasta = new Dish("Pasta Carbonara", "Carbonara with krivetkas", 200);
        Dish rise =  new Dish("Rise", "Chineese rise with soy sauce",20);
        Dish cake = new Dish("Vatruska", "typical student cake",15);

        studentMenu.addDish(cake);
        studentMenu.addDish(rise);
        studentMenu.addDish(kompot);

        usuallyMenu.addDish(pasta);
        usuallyMenu.addDish(salad);
        usuallyMenu.addDish(staik);

        System.out.println(rise.getDescription());

        System.out.println("Cheapest dish at student menu is "+studentMenu.getCheapestDish());
        System.out.println("Cheapest dish at usual menu is "+usuallyMenu.getCheapestDish());

        System.out.println(studentMenu.toString());


        //System.out.println(cake.toString());



    }
}
