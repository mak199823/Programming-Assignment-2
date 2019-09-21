package King_p1;

public class Encryption {
	
public static String encrypt(String number) {
int Arr[] = new int[4];
for(int j=0;j<4;j++) {
char ch = number.charAt(j);
Arr[j] = Character.getNumericValue(ch);
}
for(int j=0;j<4;j++) {
int Temp = Arr[j] ;
Temp += 7;
Temp = Temp % 10 ;
Arr[j] = Temp; 
}
int Temp = Arr[0];
Arr[0] = Arr[2];
Arr[2]= Temp ;
Temp = Arr[1];
Arr[1] = Arr[3];
Arr[3] = Temp ;
int newNum = 0 ;
for(int j=0;j<4;j++)
	newNum = newNum * 10 + Arr[j];
String output = Integer.toString(newNum);
if(Arr[0]==0)
 output = "0"+output;
return output;
}
}