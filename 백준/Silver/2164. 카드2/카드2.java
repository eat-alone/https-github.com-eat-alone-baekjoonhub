import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//n장의 카드 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new ArrayDeque<Integer>();
		int N = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= N; i++) {
			q.offer(i);//n장의 카드 순서대로 넣기
		}
		
		while(q.size() != 1) {
			q.poll();
			q.offer(q.peek());
			q.poll();
		}
		
		System.out.println(q.peek());
	}

}
