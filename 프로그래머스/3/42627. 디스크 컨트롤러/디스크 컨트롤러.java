import java.util.*;

class Solution {
	    public int solution(int[][] jobs) {
	        int answer = 0;
	        int end = 0; 
	        int index = 0;
	        int count =0; 
	        
	        Arrays.sort(jobs, new Comparator<int[]>() {	       	
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}      	
			});
	        
	        PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[1] - o2[1];
				}
			});

	        while(count < jobs.length) {
	        	
	        	while(index < jobs.length && jobs[index][0] <= end) {
	        		q.add(jobs[index++]);
	        	}
	        	
	        	if(q.isEmpty()) {
	        		end = jobs[index][0];
	        	}else {
	        		int[] temp = q.poll();
	        		answer += temp[1] + end - temp[0];
	        		end += temp[1];
	        		count++;
	        	}
	        	
	        }
	        
	        return answer/jobs.length;
	    }
}