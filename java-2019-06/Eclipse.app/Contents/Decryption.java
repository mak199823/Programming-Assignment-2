package King_p1;

import java.util.Scanner;

public class Decryption {
public static String decrypt(String number) {
int Arr[] = new int[4];
for(int j=0;j<4;j++) {
char ch = number.charAt(j);
Arr[j] = Character.getNumericValue(ch);
}
int Temp =Arr[0];
Arr[0]=Arr[3];
Arr[3]=Temp;
Temp = Arr[1];
Arr[1]=Arr[2];
Arr[2]=Temp;
for(int j=0;j<4;j++) {
int digit = Arr[j];
switch(digit) {
case 0:
Arr[j] = 3;
break;
case 1:
Arr[j] = 4;
break;
case 2:
Arr[j] = 5;
break;
case 3:
Arr[j] = 6;
break;
case 4:
Arr[j] = 7;
break;
case 5:
Arr[j] = 8;
break;
case 6:
Arr[j] = 9;
break;
case 7:
Arr[j] = 0;
break;
case 8:
Arr[j] = 1;
break;
case 9:
Arr[j] = 2;
break;
}
}
int newNum = 0 ;
for(int j=0;j<4;j++)
newNum = newNum * 10 + Arr[j];
String output = Integer.toString(newNum);
if(Arr[0]==0)
output = "0"+output;
return output;
	      
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a 4 digit integer:");
String number = sc.nextLine();
String encryptedNumber = decrypt(number);
System.out.println("The decrypted number is:"+encryptedNumber);
System.out.println("The original number is:"+decrypt(encryptedNumber));
	      
}


}
