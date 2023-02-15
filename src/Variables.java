public class Variables {

    public static void main(String[] args) {

        // 1.
        int age = 33;
        // 2.
        System.out.println(age);
        // 3.
        double balance = 18.89;
        // 4.
        int dollars = (int)balance;
        // 5.
        double dollarsDoubleRounded = balance + 0.5;
        int dollarsRounded = (int)dollarsDoubleRounded;
        // 6.
        char letter = 'A';
        // 7.
        System.out.println(letter);
        // 8.
        System.out.println((int)letter);
        // 9.
        letter++;
        // 10.
        System.out.println(letter);
        // 11.
        System.out.println((int)letter);
        // 12.
        /**
         * In questions 6-11 we have a variable 'letter' that has the value 'A'. Step 7 will print out the character 'A', and Step 8 will print out the integer that corresponds to the character 'A', which is 65. Step 9 uses the postfix increment operator to bring the variable 'letter' up one step, meaning that 'A' becomes 'B', and 65 becomes 66. In steps 10 and 11, those new values are printed out.
         */

    }
}
