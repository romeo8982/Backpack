
public class Main {

	public static void main(String[] args) {
		Item item[] = {new Item (60 ,10), new Item (100,20), new Item (120,30)};
		Instance instance = new Instance();
		
		for(int i=0;i<item.length;i++)
		instance.AddItem(item[i]);
		
		instance.SetCapacity(50);
		
		Algorithm algorithm = new Greedy();
		algorithm.AddInstance(instance);
		Solution solution = algorithm.GetSolution();
		solution.print();
	}

}
