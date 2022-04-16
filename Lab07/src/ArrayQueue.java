
public class ArrayQueue {
	//----------------- data --------------
		private final int CAPACITY = 10; //default size
		private int[] data;			//array to store queue data
		private int front = 0;		//pointer for first queue element
		private int size = 0;		//size of queue (no. of elements)

		//-----------------Constructor method --------------
		public ArrayQueue() {
			
			data = new int[CAPACITY];
		}

		public ArrayQueue(int capacity) {
			
			data = new int[capacity];
		}

		public void enqueue(int element) {

			if((front+size) == data.length) { //check queue is full or not
				System.out.println("Queue is full!");
			} else {
				data[(front+size)] = element; 
				size++;
			}
		}

		public int dequeue() {
			
			if(size==0) { //Q is empty or not
				return -999; //return -999 in int mean return null in string
			} else { 
				int value =  data[front]; //front = pointer for first queue element
				front++; //move front to the next one
				size--; //decrease amount of data
				return value;
			}
		}

		public int peek() { //check the first data's value with out remove data
			
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
					System.out.println(data[i] + " ");
				}
			}



		}  

}
