public class Queue{
	private long[] arr;
	private int front;//对头
	private int end;//对尾
	private int arrIndex;//当前列队中元素个数
	
	public Queue(){
		arr = new long[10];
		arrIndex = 0;
		front = 0;
		end = -1;
	}
	public Queue(int maxsize){
		arr = new long[maxsize];
		arrIndex = 0;
		front = 0;
		end = -1;
	}
	//添加数据，从队尾插入
	public void insert(long value){
		arr[++end] = value;
		arrIndex++;
	}
	//删除数据，从对头删除
	public long remove(){
		arrIndex--;
		return arr[front++];
	}
	public boolean isEmpty(){
		return arrIndex == 0;
	}
	public boolean isFull(){
		return arrIndex == arr.length;
	}
	public long peek(){
		return arr[front];
	}
}