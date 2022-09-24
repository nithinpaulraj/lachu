package org.java;


public class array {
	public static void main(String[] args) {
int k= 153,i=0,j=0,a=k;
while (a>0) {
	i=a%10;
	j=(i*i*i)+j;
	a=a/10;
}
if (k==j) {
	System.out.println("ams");
} else {
System.out.println("not ams");

}
System.out.println("bshbh");	
	}
}
	
	
