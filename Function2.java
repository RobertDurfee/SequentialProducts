public static void Function2() {

    long left = 99, right = left + 1;

    final long iterationMaximum = (long) ((Math.sqrt(2 * (right - 1) * right + 1) + 1) / 2);

    for (long iteration = 0; iteration < iterationMaximum; iteration++) {

        for (int repetition = 0; repetition < 2; repetition++) {

            left -= iteration;
            right += (iteration - 1);

            System.out.println(left + ", " + right + ", " + (left * right) + ", " + iteration + "\n");

            for (int i = 0; i < iteration; i++) {

                left++;
                right--;

                System.out.println(left + ", " + right + ", " + (left * right) + ", " + iteration + "\n");

            }
        }
    }
}
