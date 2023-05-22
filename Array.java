
//This Program is about Adding and Deleting Numbers from an Array

import java.util.Scanner;
public class Array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, choice = 0;
		int num[] = new int[10];
		do
		{
			System.out.println("1:Add No\n2:Delete No\n3:Print Nos\n4:Exit");
			choice = sc.nextInt();
			switch(choice){
			
			case 1:
				System.out.println("Enter No");
				int num1 = sc.nextInt();
				num[count] = num1;
				count++;
				if(count == num.length)
					System.out.println("Warning!, Memory full.");
				break;
			case 2:
				System.out.println("Enter location or index you want to delete");
				int delete = sc.nextInt();
				for(int i = delete; i<count; i++)
				{
					num[i] = num[i+1];
				}
				count--;
				break;
			case 3:
				System.out.println("Printing No:s");
				for(int i=0;i<count;i++)
				{
					System.out.println(num[i]);
				}
				break;	
			}
		}
		while(choice!=4);
			System.out.println("Program End!");
	}
}