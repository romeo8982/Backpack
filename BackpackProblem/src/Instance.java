import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Instance {
	List<Item> Items = new ArrayList<Item>();
	int capacity;
	public void AddItem(Item item)
	{
		Items.add(item);
	};
	public void RemoveItem(int index)
	{
		Items.remove(index);
	};
	public int GetCapacity()
	{
		return capacity;
	}
	public void SetCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public int GetSize()
	{
		return Items.size();
	}
	public Item GetItem(int index)
	{
		return Items.get(index);
	}
	public void sort() {
		  for (int i = 0; i < Items.size() - 1; i++) {
		    for (int j = 0; j < Items.size() - i - 1; j++) {
		      if (Items.get(j).value / Items.get(j).waight <= Items.get(j+1).value / Items.get(j+1).waight) {
		        Collections.swap(Items, j, j+1);
		      }
		    }
		}
	}
}
