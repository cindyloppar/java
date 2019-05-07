public class Main {

    // Exercise
    // 1. Create a double variable equals to the value of 20;
    // 2. Create a double variable equals to the value of 80;
    // 3. Add the two values and multiply them by 25;
    // 4. Find the remainder of the results;
    // 5. write if statement with prints out "Total was over the limit if is 20";

    public static void main(String[] args) {

        double myFirstValue = 20;
        double mySecondValue = 80;
        double results = myFirstValue + mySecondValue * 25;
        System.out.println("The results " + results);
        double total = results % 40;
        System.out.println("The total is " + total);
        if (total == 20)
            System.out.println("Total was over the limit");
    }
}
