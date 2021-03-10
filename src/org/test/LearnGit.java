package org.test;
public class LearnGit 
{
	public void add(int a,int b) 
	{
		int c;
		c=a+b;
		System.out.println("The sum of two numbers:"+c);
	}
	public static void main(String[] args) {
		LearnGit obj = new LearnGit();
		obj.add(20, 50);
		}
}
