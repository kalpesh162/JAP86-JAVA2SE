class Swap {

	public  static void main(String a[]){

		int num1=11;
		int num2=22;
		// num1  = 11
		System.out.println("Before Swapping");
		System.out.print("NUM1=  ");
		System.out.println(num1);Q1. What will be printed?
class A {
    int x = 5;
}
A obj = new A();
System.out.println(obj.x);


A) 0

B) 5

C) Compile Error

D) null

Q2. What is the output?
int[] arr = {1, 2, 3};
System.out.println(arr[1]);


A) 1

B) 2

C) 3

D) Compile Error

Q3. What is printed?
for (int i = 1; i <= 3; i++) {
    System.out.print(i);
}


A) 123

B) 12

C) 1 2 3 (with spaces)

D) Compile Error

Q4. Result?
int i = 1;
while (i < 4) {
    System.out.print(i);
    i++;
}


A) 1

B) 123

C) 1234

D) Infinite loop

Q5. Output?
int x = 10;
if (x > 5)
    System.out.println("Hi");
else
    System.out.println("Bye");


A) Hi

B) Bye

C) Compile Error

D) Runtime Error

Q6. What is the output?
int i = 5;
do {
    System.out.print(i);
    i--;
} while (i > 3);


A) 543

B) 54

C) 5

D) Compile Error

Q7. What prints?
String[] names = {"A", "B", "C"};
for (String s : names) {
    System.out.print(s);
}


A) A B C

B) ABC

C) CBA

D) Compile Error

Q8. What is the output?
int[] arr = new int[3];
System.out.println(arr[2]);


A) 0

B) null

C) Garbage value

D) Compile Error

Q9. What will be printed?
switch (2) {
    case 1: System.out.println("One"); break;
    case 2: System.out.println("Two"); break;
    default: System.out.println("Other");
}


A) One

B) Two

C) Other

D) Compile Error

Q10. What is printed?
for (int i = 1; i <= 5; i += 2) {
    System.out.print(i);
}


A) 12345

B) 135

C) 12

D) 24

Q11. What is printed?
class Demo {
    void show() {
        System.out.println("Show");
    }
}
Demo d = new Demo();
d.show();


A) Show

B) Compile Error

C) null

D) Runtime Error

Q12. Output?
int[] a = {4, 6, 8};
System.out.println(a.length);


A) 2

B) 3

C) 4

D) Compile Error

Q13. What will be printed?
int sum = 0;
for (int i = 1; i <= 3; i++) {
    sum += i;
}
System.out.println(sum);


A) 3

B) 6

C) 1

D) 5

Q14. What prints?
int x = 3;
if (x == 1) System.out.println("A");
else if (x == 2) System.out.println("B");
else System.out.println("C");


A) A

B) B

C) C

D) No output

Q15. Output?
int i = 1;
while (i == 0) {
    System.out.print("Loop");
}


A) Loop Loop ... (infinite)

B) No output

C) 1

D) Compile Error

Q16. What prints?
int[] arr = {5, 10};
arr[1] = arr[0];
System.out.println(arr[1]);


A) 5

B) 10

C) 0

D) Compile Error

Q17. What is printed?
class A {
    int value;
}
A obj = new A();
System.out.println(obj.value);


A) 0

B) null

C) Compile Error

D) Runtime Error

Q18. Result?
for (int i = 1; i < 3; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
}


A) * **

B) **

C) ***

D) * *

Q19. What prints?
int[] nums = {1, 2, 3, 4};
for (int i = 0; i < nums.length; i += 2) {
    System.out.print(nums[i]);
}


A) 12

B) 13

C) 14

D) 24

Q20. Output?
class B {
    int x = 10;
}
B b1 = new B();
B b2 = b1;
b2.x = 20;
System.out.println(b1.x);


A) 10

B) 20

C) Compile Error

D) Runtime Error

✅ Copy-Friendly Answer Key
Q1  - B
Q2  - B
Q3  - A
Q4  - B
Q5  - A
Q6  - B
Q7  - B
Q8  - A
Q9  - B
Q10 - B
Q11 - A
Q12 - B
Q13 - B
Q14 - C
Q15 - B
Q16 - A
Q17 - A
Q18 - A
Q19 - C
Q20 - B

		System.out.print("NUM2=  ");
		System.out.println(num2);

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping");
		System.out.print("NUM1=  ");
		System.out.println(num1);
		System.out.print("NUM2=  ");
		System.out.println(num2);


	}


}