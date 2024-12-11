

import java.util.ArrayList;
import java.util.List;

public class ListExample
{
	
	
	public static void main(String args[])
	{
		
		List<Integer> numbers = new ArrayList<>();
		
		//check if array list is Empty
		
		if(numbers.isEmpty())
		{
			
			System.out.println("The List is Empty");
			
			numbers.add(1);
			numbers.add(2);
			numbers.add(3);
			numbers.add(4);
			numbers.add(5);
			numbers.add(6);
			
			numbers.forEach(System.out::println);
			
			//remove an element
			int removeElement=numbers.remove(4);
			
			System.out.println("element"+ removeElement+" has been removed");
			
			numbers.forEach(System.out::println);
			
			//get all elements
			
			int element = numbers.get(0);
			
			System.out.println("The element at index 0 is now changed to 10");
			
			numbers.add(0,10);
			
			numbers.forEach(System.out::println);
			
		//check if an element is contained in the list
		
		    if(numbers.contains(20))
		    {
			
			System.out.println(20+" is in the list");
			
			
		    }
			else
			{
				System.out.println(20+" is not in the list");
			}
			
			
			//clear list
			
			numbers.clear();
			
			if(numbers.isEmpty())
			{
				
				System.out.println("The List is Empty");
				
			}
			else
			{
				
				System.out.println("The list is not empty");
				
			}
		}
		
	}
}
