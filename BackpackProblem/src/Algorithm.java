public abstract class Algorithm {
	
	Instance instance;
	
	public void AddInstance(Instance instance){
		this.instance=instance;
	};
	public abstract Solution GetSolution();
}
