public class q{
	public void main(String args[]){
		Queue<Integer> q=new Queue();
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++){
			q.enqueue(scanner.nextInt());
		}
		Stack<Integer> s=new Stack<>();
		while(!q.isEmpty()){
			s.push(q.dequeue);
		}
		for(int i=0;i<s.size();i++){
			int n1=s.peek();
			q.enqueue(n1);
			s.pop();
		}
	}
}
