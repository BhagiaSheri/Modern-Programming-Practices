package lab9.Prob9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {MEAT, FISH, OTHER}

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList(new Dish("pork", false, 800, Type.MEAT),
                    new Dish("beef", false, 700, Type.MEAT),
                    new Dish("chicken", false, 400, Type.MEAT),
                    new Dish("french fries", true, 530, Type.OTHER),
                    new Dish("rice", true, 350, Type.OTHER),
                    new Dish("season fruit", true, 120, Type.OTHER),
                    new Dish("pizza", true, 550, Type.OTHER),
                    new Dish("prawns", false, 400, Type.FISH),
                    new Dish("salmon", false, 450, Type.FISH));

    //a. Is there any Vegetarian meal available ( return type boolean)
    public static boolean isVegetarianMealAvailable() {
        return menu.stream().anyMatch(Dish::isVegetarian);
    }

    //b. Is there any healthy menu have calories less than 1000 ( return type boolean)
    public static boolean isHealthyMealAvailable() {
        return menu.stream().anyMatch(m -> m.calories < 1000);
    }

    //c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
    public static boolean isUnhealthyMealAvailable() {
        return menu.stream().anyMatch(m -> m.calories > 1000);
    }

    //d. find and return the first item for the type of MEAT( return type Optional<Dish>)
    public static Optional<Dish> firstMeatDish() {
        return menu.stream().filter(m -> m.type.equals(Type.MEAT)).findFirst();
    }

    //e. calculateTotalCalories() in the menu using reduce. (return int)
    public static int calculateTotalCalories() {
        return menu.stream().map(Dish::getCalories).reduce(0, (c1, c2) -> c1 + c2);
    }

    //f. calculateTotalCaloriesMethodReference() in the menu using MethodReferences. (return int)
    public static int calculateTotalCaloriesMethodReference() {
        return menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("LAB # 9 --- PROBLEM # 9");

        System.out.println("Prob # A: " + isVegetarianMealAvailable());
        System.out.println("Prob # B: " + isHealthyMealAvailable());
        System.out.println("Prob # C: " + isUnhealthyMealAvailable());
        System.out.println("Prob # D: " + firstMeatDish());
        System.out.println("Prob # E: " + calculateTotalCalories());
        System.out.println("Prob # F: " + calculateTotalCaloriesMethodReference());
    }

}