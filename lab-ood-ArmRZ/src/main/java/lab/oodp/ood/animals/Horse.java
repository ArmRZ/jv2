package lab.oodp.ood.animals;

/**
 * Represents a horse.
 *
 * TODO Make this implement IAnimal and IFamous, and provide appropriate implementations of those methods.
 */
public class Horse implements IAnimal, IFamous {

	@Override
	public String famous() {
		// TODO Auto-generated method stub
		return "PharLap";
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "neigh";
	}

	@Override
	public boolean isMammal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String myName() {
		// TODO Auto-generated method stub
		return "Mr. Ed the horse";
	}

	@Override
	public int legCount() {
		// TODO Auto-generated method stub
		return 4;
	}

}
