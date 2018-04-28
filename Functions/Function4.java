public static void Function4() {

    LinkedList<Long> Left = new LinkedList<Long>();
    LinkedList<Long> Right = new LinkedList<Long>();

    Left.add(99L);
    Right.add(99L);

    while(Left.peek() > 0 && Right.peek() > 0) {

        long initialSize = Left.size();

        for (int i = 0; i < initialSize; i++) {

            long left = Left.remove();
            long right = Right.remove();

            if (left != right && i == 0) {

                System.out.println(left + ", " + (right - 1) + ", " + (left * (right - 1)) + "\n");

                Left.add(left);
                Right.add(right - 1);

                System.out.println((left - 1) + ", " + right + ", " + ((left - 1) * right) + "\n");

                Left.add(left - 1);
                Right.add(right);

            } else {

                System.out.println((left - 1) + ", " + right + ", " + ((left - 1) * right) + "\n");

                Left.add(left - 1);
                Right.add(right);

            }
        }
    }
}
