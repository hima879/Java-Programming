/*
    Program: Pizza Builder - Method Overloading Example
    Concept: Method Overloading in Java
    Description: Demonstrates how overloaded methods can be used to build pizzas with different ingredients.
    Real-Life Analogy: Just like a pizza shop offers options — base only, with cheese, or with full toppings.
*/

public class PizzaBuilder {

    public static void main(String[] args) throws InterruptedException {

        // 🟢 Example 1: Pizza with base, cheese, and toppings
        // Input: flat bread, mozzarella, pepperoni
        String pizza = makePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println("🍕 Your custom pizza: " + pizza);

        // 🟢 Example 2: Pizza with base and cheese only
        // Input: thin crust, cheddar
        String cheesePizza = makePizza("thin crust", "cheddar");
        System.out.println("🧀 Cheese pizza: " + cheesePizza);

        // 🟢 Example 3: Plain bread pizza
        // Input: garlic bread
        String plainPizza = makePizza("garlic bread");
        System.out.println("🍞 Plain bread pizza: " + plainPizza);
    }

    // 🔹 Overloaded Method 1: Bread only
    // Example: makePizza("garlic bread") → garlic bread pizza
    static String makePizza(String bread) {
        return bread + " pizza";
    }

    // 🔹 Overloaded Method 2: Bread + Cheese
    // Example: makePizza("thin crust", "cheddar") → cheddar thin crust pizza
    static String makePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    // 🔹 Overloaded Method 3: Bread + Cheese + Toppings
    // Example: makePizza("flat bread", "mozzarella", "pepperoni") → pepperoni mozzarella flat bread pizza
    static String makePizza(String bread, String cheese, String toppings) {
        return toppings + " " + cheese + " " + bread + " pizza";
    }
}
