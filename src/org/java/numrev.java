package org.java;

public class numrev {
public static void main(String[] args) {
	int l=123242,i=0,j=0,a=l;
	while(a>0) {
i=a%10;
j=(j*10)+i;
a=a/10;

}
	System.out.println(j);
}
}
