package lab.oodp.ood.animals;

/**
 * Represents a dog.
 *
 * TODO Make this class implement the IAnimal interface, then implement all its methods.
 */
public class Dog implements IAnimal {
//
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "woof woof.";
	}

	@Override
	public boolean isMammal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String myName() {
		// TODO Auto-generated method stub
		return "Bruno the dog";
	}

	@Override
	public int legCount() {
		// TODO Auto-generated method stub
		return 4;
	}

}
