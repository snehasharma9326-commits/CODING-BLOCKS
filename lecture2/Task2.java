public class Task2{
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. ARITHMETIC OPERATORS
        System.out.println("----- Arithmetic Operators -----");

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));


        // 2. RELATIONAL OPERATORS
        System.out.println("\n----- Relational Operators -----");

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));


        // 3. LOGICAL OPERATORS
        System.out.println("\n----- Logical Operators -----");

        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y)); // AND
        System.out.println("x || y: " + (x || y)); // OR
        System.out.println("!x: " + (!x));         // NOT


        // 4. ASSIGNMENT OPERATORS
        System.out.println("\n----- Assignment Operators -----");

        int c = 10;

        System.out.println("c = " + c);

        c += 5;
        System.out.println("c += 5: " + c);

        c -= 3;
        System.out.println("c -= 3: " + c);

        c *= 2;
        System.out.println("c *= 2: " + c);

        c /= 4;
        System.out.println("c /= 4: " + c);

        c %= 3;
        System.out.println("c %= 3: " + c);


        // 5. UNARY OPERATORS
        System.out.println("\n----- Unary Operators -----");

        int n = 5;

        System.out.println("n: " + n);
        System.out.println("++n: " + (++n)); // Pre-increment
        System.out.println("n++: " + (n++)); // Post-increment
        System.out.println("n: " + n);

        System.out.println("--n: " + (--n)); // Pre-decrement
        System.out.println("n--: " + (n--)); // Post-decrement
        System.out.println("n: " + n);


        // 6. TERNARY OPERATOR
        System.out.println("\n----- Ternary Operator -----");

        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);


        // 7. BITWISE OPERATORS
        System.out.println("\n----- Bitwise Operators -----");

        int p = 5; // Binary: 0101
        int q = 3; // Binary: 0011

        System.out.println("p & q: " + (p & q));
        System.out.println("p | q: " + (p | q));
        System.out.println("p ^ q: " + (p ^ q));
        System.out.println("~p: " + (~p));


        // 8. SHIFT OPERATORS
        System.out.println("\n----- Shift Operators -----");

        System.out.println("p << 1: " + (p << 1));
        System.out.println("p >> 1: " + (p >> 1));
        System.out.println("p >>> 1: " + (p >>> 1));


        // 9. instanceof OPERATOR
        System.out.println("\n----- instanceof Operator -----");

        String name = "Shalini";

        System.out.println("name instanceof String: "
                + (name instanceof String));


        // 10. STRING CONCATENATION (+)
        System.out.println("\n----- String Concatenation -----");

        String firstName = "Shalini";
        String lastName = "Sharma";

        System.out.println(firstName + " " + lastName);
    }
}