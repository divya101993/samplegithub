package org.test;
public class LearnGit 
{
	int c;
	public void add(int a,int b) 
	{
		c=a+b;
		
		System.out.println("The sum of two numbers:"+c);
	}
	public void mulitple(int a,int b) {
		c=a*b;
		System.out.println("Multiplication of two numbers:"+c);
	}
	public static void main(String[] args) {
		LearnGit obj = new LearnGit();
		obj.add(20, 50);
		obj.mulitple(20, 10);
		}
}
