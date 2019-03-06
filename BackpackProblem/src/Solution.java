import java.util.ArrayList;
import java.util.List;

public class Solution {
	List<Item> Items = new ArrayList<Item>();
	double valueBackpack;
	
public void print()
	{
		for(int i=0;i<Items.size();i++)
		{
			System.out.println("Wartosc:" + Items.get(i).value + " " + "Waga:" + Items.get(i).waight );
		} 
		System.out.println("Wartosc plecaka:" + valueBackpack);
	}
}
