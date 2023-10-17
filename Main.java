public class Main {
    public static void main(String[] args) {
        int number = 3;
        char letter = 'A';
        boolean isTrue = true;
        double decimal = 2.5;

        int sum = performArithmeticOperations(number, decimal);
        boolean greaterThanDec = performRelationalOperations(number, decimal);
        boolean andResult = performLogicalOperations(isTrue);
        performConditionalStatements(number);
        performLoopOperations();
        int arithmeticResult = performArithmeticOperation(10, 5, '+');
        System.out.println("Arithmetic Result: " + arithmeticResult);

        // Create an object of the MyClass class
        MyClass myObject = new MyClass();

        // Access the object's members
        int result = myObject.calculateSum(10, 20);
        System.out.println("Sum: " + result);
    }

    public static int performArithmeticOperations(int num, double dec) {
        int sum = num + 5;
        double product = num * dec;
        int modulus = num % 3;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Modulus: " + modulus);

        return sum;
    }

    public static boolean performRelationalOperations(int num, double dec) {
        boolean equalToFive = num == 5;
        boolean greaterThanDec = num > dec;
        boolean notEqualToThree = num != 3;

        System.out.println("EqualToFive: " + equalToFive);
        System.out.println("GreaterThanDec: " + greaterThanDec);
        System.out.println("NotEqualToThree: " + notEqualToThree);

        return greaterThanDec;
    }

    public static boolean performLogicalOperations(boolean flag) {
        boolean andResult = flag && true;
        boolean orResult = flag || false;
        boolean notResult = !flag;

        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);

        return andResult;
    }

    public static void performConditionalStatements(int num) {
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else {
            System.out.println(num + " is not positive.");
        }

        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            default:
                System.out.println("Number is neither 1 nor 2");
                break;
        }
    }

    public static void performLoopOperations() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int counter = 0;
        while (counter < 5) {
            System.out.println("Counter: " + counter);
            counter++;
        }
    }

    public static int performArithmeticOperation(int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        return result;
    }
}

class MyClass {
    private int num1;
    private int num2;

    public void setValues(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }
}