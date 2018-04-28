using System;
using System.Collections.Generic;

class Generator {

  static SortedSet<int> Products(int length) {

    SortedSet<int> products = new SortedSet<int>();

    int left = 1, right;

    for (int i = 0; i < length; i++)
      left *= 10;

    right = left;

    while (--right > 0) {

      while (--left > 0)
        products.Add(right * left);

      left = right;

    }

    return products;

  }

  public static void Main(string[] args) {

    SortedSet<int> products = Products(Int32.Parse(args[0]));

    foreach (int product in products)
      System.Console.WriteLine("{0}", product);

  }

}
