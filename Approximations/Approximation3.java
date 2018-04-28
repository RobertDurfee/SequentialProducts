public static void Function3() {
    
    long initialLeft = 99, initialRight = initialLeft;

    for (long dProduct = 0; dProduct < initialLeft * initialRight; dProduct++) {

        for (long dRight = (dProduct / initialLeft) / 2; dRight >= 0; dRight--) {

            double dLeft = (((double) dProduct - ((double) initialLeft * (double) dRight)) / (double) initialRight);

            if (dLeft % 1 == 0) { //Is integer

                long left = initialLeft - (long) dLeft;
                long right = initialRight - dRight;

                long product = left * right;

                System.out.println(left + ", " + right + ", " + product + "\n");

            }
        }
    }
}
