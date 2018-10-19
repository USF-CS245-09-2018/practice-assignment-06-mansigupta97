public class ArrayStack implements Stack {
	
	int size = 10;
	Object [] array = new Object[this.size];
	int top = 0;

	public void growStack() {
		int new_size = this.size * 2;
		Object [] newArray = new Object[new_size];
		int count = 0;
		for(int i = 0; i < this.size; i++) {
			newArray[count] = array[i];
		}
		array = newArray;
		this.size = new_size;
	}

	public void push(Object object) {
		if(top == this.size) {
			growStack();
		}
		array[top] = object;
		top++; 
	}

	public Object pop() {
		if(empty()) {
			System.out.println("Array is empty.");
		}
		top = top - 1;
		return array[top];
	}

	public Object peek() {
		if(empty()) {
			System.out.println("Array is empty.");
		}
		return array[top - 1];
	}

	public boolean empty() {
		if(top == 0) {
			return true;
		}
		return false;
	}
}