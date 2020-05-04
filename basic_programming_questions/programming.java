
1) Fibonacci

public static void main(String[] args) {
        int num, a = 0,b=0, c =1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times");
        num = in.nextInt();
        System.out.println("Fibonacci Series of the number is:");
        for (int i=0; i<=num; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.println(a + "");  
        }       
}

2) Second Largest

public static void main(String[] args){
        int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        int largest = 0;
        int secondLargest = 0;
        System.out.println("The given array is:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
}

3) Duplicate Characters

public static void main(String[] args) {
        String str = new String("Sakkett");
        int count = 0;
        char[] chars = str.toCharArray();
        System.out.println("Duplicate characters are:");
        for (int i=0; i<str.length();i++) {
            for(int j=i+1; j<str.length();j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[j]);
                    count++;
                    break;
                }
            }
        }
}


4) Prime number

public static void main(String[] args) {
        int temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for (int i = 2; i<= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(num + "number is prime");
        else
            System.out.println(num + "number is not a prime");
             
         
}

5) Swapping two numbers without third variable

public static void main(String args[]){
       int x, y;
       System.out.println("Enter x and y");
       Scanner in = new Scanner(System.in);
  
       x = in.nextInt();
       y = in.nextInt();
  
       System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
  
       x = x + y;
       y = x - y;
       x = x - y;
  
       System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
}

6) Palindrome

 public static void main (String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter the number or String");
        original = in.nextLine();
        length = original.length();
        for (int i =length -1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" +reverse);
         
        if(original.equals(reverse)) 
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
         
}