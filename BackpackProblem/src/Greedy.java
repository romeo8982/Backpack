public class Greedy extends Algorithm {

	@Override
	public Solution GetSolution() {
		Solution opt = new Solution(); 
		opt.valueBackpack=0;
		int BackpackSize = instance.GetCapacity();
		instance.sort();
		for(int i=0;i<instance.GetSize();i++)
		{
			if(BackpackSize-instance.GetItem(i).waight>=0)
			{
				BackpackSize-=instance.GetItem(i).waight;
				opt.valueBackpack+=instance.GetItem(i).value;
				opt.Items.add(instance.GetItem(i));
			}
			if(BackpackSize==0)
			{
				return opt;
			}
		}
		return opt;
	}
}
