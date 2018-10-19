public class ArrayQueue implements Queue {

	int size = 10;
	Object [] array = new Object[size];
	int head = 0;
	int tail = 0;

	public void growQueue() {
		int new_size = this.size * 2;
		Object [] newArray = new Object[new_size];
		for (int i = head; i < tail; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
		this.size = new_size;
	}

	public boolean empty() {
		return head == tail;
	}

	public void enqueue(Object object) {
		if(tail + 1 == size) {
			growQueue();
		}
		array[tail] = object;
		tail = tail + 1 % array.length;
	}

	public Object dequeue() {
		if (head == tail) {
			return null;
		}
		Object object = array[head];
		head = (head + 1) % this.size;
		return object;
	}
}