# SequentialProducts
An experiment to determine a function which outputs sequential products of all k-length integers.

### Goal

Output a smooth, concave-up or continuously-decreasing sequence of products of two k-length integers.

### Real

Sequence of the first 500 products of two 2-digit numbers:
![Real Output](/Plots/ProductOutputReal.png)
The 500 pairs of 2-digit numbers input to produce the above products:
![Real Input](/Plots/ProductInputReal.png)

### Approximation 1
```Java
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
```
#### Evaluation
Sequence of the first 500 products of two 2-digit numbers output by function 1:
![Approximation 1 Output](/Plots/ProductOutputApproximation1.png)
The 500 pairs of 2-digit numbers input to produce the above products using function 1:
![Approximation 1 Input](/Plots/ProductInputApproximation1.png)

Easy to understand and implement, but the numbers are not even close to being output sequentially.

### Approximation 2
```Java
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
```
#### Evaluation
Sequence of the first 500 products of two 2-digit numbers output by function 2:
![Approximation 2 Output](/Plots/ProductOutputApproximation2.png)
The 500 pairs of 2-digit numbers input to produce the above products using function 2:
![Approximation 2 Input](/Plots/ProductInputApproximation2.png)

Difficult to understand and implement, but the numbers are close to being output sequentially up until about 10^k product. Very fast.

### Approximation 3
```Java
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
```

#### Evaluation
Sequence of the first 500 products of two 2-digit numbers output by function 3:
![Approximation 3 Output](/Plots/ProductOutputApproximation3.png)
The 500 pairs of 2-digit numbers input to produce the above products using function 3:
![Approximation 3 Input](/Plots/ProductInputApproximation3.png)

Nearly the same results as approximation 2 (curiously), but rather than identifying an arithmetic sequence, calculus differentials were used. Much slower.

### Approximation 4
```Java
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
```

#### Evaluation
Sequence of the first 500 products of two 2-digit numbers output by function 4:
![Approximation 4 Output](/Plots/ProductOutputApproximation4.png)
The 500 pairs of 2-digit numbers input to produce the above products using function 4:
![Approximation 4 Input](/Plots/ProductInputApproximation4.png)

Nearly the same results as approximation 2 and 3, but the logic is a little easier to follow than in 2. About as fast as approximation 2. Still flawed.

