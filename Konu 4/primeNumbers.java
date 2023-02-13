public class primeNumbers {
    public static void main(String[] args) {
        int num1 = 2;
int counter = 1;
int flag = 0;

if (num1 % 2 == 0) { // add 1 if we start on even
  num1++;
}

for (int i = 1; i <= 100; i += 2) { 
   flag = 0; // set out flag each time i changes
    for (int j = 2; j < i/2; j++) { //start j at 2 and add 1 each time it loops divison by 2 is not neccessary although it improves performace at higher numbers
      if (i % j == 0) { // if I is ever divisble by j then skip the number if not the for loop ends and its prints the number
        flag = 1;
        break;
      }
      }
   if (flag == 0){
      System.out.println(i);
     }
     }
    }
}
