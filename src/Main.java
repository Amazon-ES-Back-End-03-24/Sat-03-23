import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // loops
        String[] ingredients = {"tomatoes", "cucumbers", "peppers", "garlic", "onions"};
        //forLoop(ingredients);
        //forEachLoop(ingredients);
        //whileLoop();
        int returnOfDoWileLoop = doWhileLoop();
        System.out.println("Return value of do while loop " + returnOfDoWileLoop);
    }

    private static int doWhileLoop() {
        //do while
        int testingTest = 0;

        do {
            System.out.println("Testing the gazpacho... DO WHILE");
            testingTest++;
        } while (testingTest<3);

        System.out.println("Finished testing, it's delicious!");
        return testingTest;
    }

    private static void whileLoop() {
        // while loop
        int saltLevel = 3;
        while (saltLevel<5) {
            System.out.println("The gazpacho needs more salt");
            saltLevel++;
        }
        System.out.println("Salt level is perfect!");
    }

    private static void forEachLoop(String[] ingredients) {
        // for each - enhanced
        for (String ingredient : ingredients) {
            System.out.println("I'm preparing " + ingredient);
        }
    }

    private static void forLoop(String[] ingredients) {
        // for loop - for i loop
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println("I'm preparing " + ingredients[i]);
        }
    }
}