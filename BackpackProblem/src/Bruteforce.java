public class Bruteforce extends Algorithm {

	@Override
	public Solution GetSolution() {
		Solution opt = new Solution(); 
		opt.valueBackpack=0;
		int BackpackSize = instance.GetCapacity();
		
		for(int i=1;i<=instance.GetSize();i++)
		{
			boolean negative = false;
			if(i==0)
			{
				
			}
			negative=(i<0);
			if(negative)
			{
				i=i*(-1);
			}
		}
		
		
		return opt;
	}
}
