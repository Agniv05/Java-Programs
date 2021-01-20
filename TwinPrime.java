import java.util.*;

 class TwinPrime{​​

 int n; // class variable accessible to readData() method

 Scanner sc=new Scanner(System.in);

 TwinPrime(int n){​​ // n variable is only for the constructor

 checkPrimenPrint(n);

 }​​



void readData(){​​

 System.out.println("Enter Number of twin primes:");

 n=sc.nextInt();

 }​​



void showTwinPrime(){​​

 checkPrimenPrint(n);

 }​​


 void showTwinPrime(int n){​​// n here is local to showprime

 checkPrimenPrint(n);

 }​​


 void checkPrimenPrint(int n){​​

 boolean prime[]=new boolean[n+1];

 for(int i=0;i<n;i++)

 prime[i]=true;

 for(int p=2; p*p<=n;p++){​​

 if(prime[p]==true){​​

 for(int i=p*2;i<n;i+=p)

 prime[i]=false;

 }​​

 }​​


 for(int i=2;i<n-2;i++){​​

 if(prime[i]=true && prime[i+2]==true)

 System.out.println("("+i+","+(i+2)+")");

 }​​



}​​

 }​​