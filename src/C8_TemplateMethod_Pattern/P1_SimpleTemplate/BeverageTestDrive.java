package C8_TemplateMethod_Pattern.P1_SimpleTemplate;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea teaHook = new Tea();
        Coffee coffeeHook = new Coffee();
        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}