Big-O HW
Due: Wed. 10/10 by 11:00 am (hand in the hard copy of your answers)

1- Determine how many times the output statement is displayed in each of the following fragments. 
Indicate whether the algorithm is O(n) or O(n2).

a. for (int i = 0; i < n; i++)
         for (int j = 0; j < n; j++)
              System.out.println(i + " " + j);

b. for (int i = 0; i < n; i++)
         for (int j = 0; j < 2; j++)
              System.out.println(i + " " + j);

c. for (int i = 0; i < n; i++)x 
        for (int j = n - 1; j >= i; j--)
             System.out.println(i + " " + j);

d. for (int i = 1; i < n; i++)
        for (int j = 0; j < i; j++)
             if (j % i == 0)
                System.out.println(i + " " + j);

2- For the following T(n), find values of n0 and c such that cn3 is larger than T(n) for all n larger than n0.

        T(n) = n3 −5n2 + 20n −10

3- How does the performance grow as n goes from 2000 to 4000 for the following? Provide tables similar to the "Effects of Different Growth Rates" table in the slides.

a. O(log n)
b. O(n)
c. O(n log n)
d. O(n2)
e. O(n3)