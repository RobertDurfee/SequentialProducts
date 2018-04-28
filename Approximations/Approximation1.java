public static void Function1() {
  
  long left = 99, right = left;

  final long initialRight = right;

  while(left > 0) {

    while(right >= left) {

      System.out.println(left + ", " + right + ", " + (left * right) + "\n");

      right--;

    }

    right = initialRight;
    left--;

  }
  
}
