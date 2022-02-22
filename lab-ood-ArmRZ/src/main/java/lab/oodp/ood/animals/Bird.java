package lab.oodp.ood.animals;

/**
 * Represents a Bird.
 *
 * TODO Correctly implement these methods, as instructed in the lab handout.
 */
public class Bird implements IAnimal {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "tweet tweet.";
	}

	@Override
	public boolean isMammal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String myName() {
		// TODO Auto-generated method stub
		return "Tweety the bird";
	}

	@Override
	public int legCount() {
		// TODO Auto-generated method stub
		return 2;
	}
	
   
}

