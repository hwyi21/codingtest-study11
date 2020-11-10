package solution;

public class Solution {

	public Solution() {
		int a=3;
		int b=5;

		System.out.println(solution(a, b));
	}
	
	public long solution(int a, int b) {
		
        long answer = 0;
        
        if(a==b) {
        	answer=a;
        }else {
        	if(a>b) {
        		int temp = a;
        		a = b;
        		b = temp;
        	}
        	while(true){
        		answer = answer+a;
        		a++;
        		if(a>b) break;
        	}
        }        
        
        return answer;
    }
	
	public static void main(String[] args) {
		new Solution();
	}
}
