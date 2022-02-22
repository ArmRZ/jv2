package lab.oodp.ood.animals;

/**
 * Main program for Exercise Two.
 */
public class AnimalProgram {

    public void start() {

        IAnimal[] animals = new IAnimal[3];
        animals[0] = new Bird();
        animals[1] = new Dog();
        animals[2] = new Horse();

        // TODO Populate the animals array with a Bird, a Dog and a Horse.
        

        processAnimalDetails(animals);

    }

    private void processAnimalDetails(IAnimal[] list) {
        // TODO Loop through all the animals in the given list, and print their details as shown in the lab handout.
        // TODO If the animal also implements IFamous, print out that corresponding info too.
    	for (int i = 0; i < list.length; i++) {
    		System.out.println(list[i].myName() + " says " + list[i].sayHello());
    		if(list[i].isMammal()) {
    			System.out.println(list[i].myName() + " is a mammal.");
    		} else {System.out.println(list[i].myName() + " is a non-mammal.");}
    		System.out.println("Did I forget to tell you that I have " + list[i].legCount() +  " legs.");
    	
    	if (list[i] instanceof IFamous) {
    		System.out.println("This is famous name of my animal type: " + ((IFamous)list[i]).famous());
    	}
    	
    	// TODO Use println below to break between each animal
    	System.out.println("--------------------------------------------------------------");
    }
    	}

    public static void main(String[] args) {
        new AnimalProgram().start();
    }
}
