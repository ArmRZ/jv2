
public class CircularArrayQueue {
	//----------------- data --------------
	private final int CAPACITY = 10;
	private int[] data;			//array to store queue data
	private int front = 0;		//pointer for first queue element
	private int size = 0;		//size of queue (no. of elements)
	
	//----------------- method --------------
	public CircularArrayQueue() {
		data = new int[CAPACITY];
	}

	public CircularArrayQueue(int capacity) {
		data = new int[capacity];
	}
	


	public void enqueue(int element) {
		
		if(size==data.length) { //Q is full or not
			System.out.println("Queue is full");
		} else { 
			data[(front+size)%data.length] = element; //circular
			size++;
		}
	}
	
	public int dequeue() {

		if(size==0) { //Q is empty or not
			return -999; //return -999 in int mean return null in string
		} else { 
			int value =  data[front]; //front = pointer for first queue element			
			front = (front + 1)%data.length; //N=data.length 
			size--; //decrease amount of data
			return value;
		}
	}
	
	public int peek() {
		if(size==0) {
			return -999;
		} else {
			int value =  data[front];
			return -value;
			//or return data[front];
		}

	}
	
	//get current size (no. of elements)
	public int getSize() {
		return size;
	}

	//is queue empty?
	public boolean isEmpty() {
		
		if(size==0) { //Q is empty
			return true;
		} else { //Q is not empty
			return false; 
		}

	}
	
	//print all queue members
	public void printQueue() {

		if (size==0) {
			System.out.println("Queue is empty! Cannot display the data.");
		} else { //use array then need for loop
			System.out.println("Queue: ");
			for(int i=front; i<front+size; i++) { //i start at front bcs sometime it not start at 0
				System.out.println(data[i%data.length] + " ");
			}
		}


	}
}
