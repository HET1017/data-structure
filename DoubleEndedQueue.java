
public class DoubleEndedQueue<T> {
	private T[] data;
	private int N;

	public DoubleEndedQueue(int startCapacity) {
		if(startCapacity<1) startCapacity=1;
		data = ( T[] ) new Object[startCapacity];
	}
	private void resize() {
		
		T[] newArray = (T[]) new Object[data.length*2];
		for(int i=0;i<data.length;i++) newArray[i]=data[i];
		data = newArray;
	}
	public boolean isEmpty() {
		return N==0;
	}
	public void pushFromLeft(T newValue) {
		if(N==data.length) resize();
		for(int i=N;i>0;i--) data[i]=data[i-1];
		data[0] = newValue;
		N++;
	}
	public void pushFromRight(T newValue) {
		if(N==data.length) resize();
		data[N] = newValue; 
		N++;
	}
	public T popFromRight() {
		T value = data[--N];
		data[N] = null;
		return value;
	}
	public T popFromLeft() {
		T value = data[0];
		for(int i=0 ;i<N;i++) data[i]=data[i+1];//kaydýrma
		data[--N] = null;
		return value;
	}
	public static void main(String args[]) {
	//	DoubleEndedQueue<T>;
	}

}
