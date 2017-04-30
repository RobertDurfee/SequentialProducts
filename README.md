# SequentialProducts
An experiment to determine a function which outputs sequential products of all k-length integers.

### Goal

Output a smooth, concave-up or continuously-decreasing sequence of products of two k-length integers.

### Real

Sequence of the first 500 products of two 2-digit numbers:
![Real Output](/ProductOutputReal.png)
The 500 pairs of 2-digit numbers input to produce the above products:
![Real Input](/ProductInputReal.png)

### Approximation 1

Sequence of the first 500 products of two 2-digit numbers output by function 1:
![Approximation 1 Output](/ProductOutputApproximation1.png)
The 500 pairs of 2-digit numbers input to produce the above products using function 1:
![Approximation 1 Input](/ProductInputApproximation1.png)

#### Evaluation

Easy to understand and implement, but the numbers are not even close to being output sequentially.

### Approximation 2

Sequence of the first 500 products of two 2-digit numbers output by function 2:
![Approximation 2 Output](/ProductOutputApproximation2.png)
The 500 pairs of 2-digit numbers input to produce the above products using function 2:
![Approximation 2 Input](/ProductInputApproximation2.png)

#### Evaluation

Difficult to understand and implement, but the numbers are close to being output sequentially up until about 10^k product. Very fast.

### Approximation 3

Sequence of the first 500 products of two 2-digit numbers output by function 3:
![Approximation 3 Output](/ProductOutputApproximation3.png)
The 500 pairs of 2-digit numbers input to produce the above products using function 3:
![Approximation 3 Input](/ProductInputApproximation3.png)

#### Evaluation

Nearly the same results as approximation 2 (curiously), but rather than identifying an arithmetic sequence, calculus differentials were used. Much slower.

### Approximation 4

Sequence of the first 500 products of two 2-digit numbers output by function 4:
![Approximation 4 Output](/ProductOutputApproximation4.png)
The 500 pairs of 2-digit numbers input to produce the above products using function 4:
![Approximation 4 Input](/ProductInputApproximation4.png)

#### Evaluation

Nearly the same results as approximation 2 and 3, but the logic is a little easier to follow than in 2. About as fast as approximation 2. Still flawed.

