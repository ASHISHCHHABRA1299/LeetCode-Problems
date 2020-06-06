package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionByHeight {

	public static void main(String[] args) {
		int[][] people = { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
        Arrays.sort(people, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o2[0]==o1[0]) return o1[1]-o2[1];
				return o2[0]-o1[0];
			}
		});
        
        List<int[]> res=new ArrayList<int[]>();
        for(int[] p:people)
        {
        	res.add(p[1],p);
        }
        int[][] output=res.toArray(new int[res.size()][people[0].length]);
        for(int[] o:output)
        {
        	System.out.println(o[0]+" "+o[1]);
        }
        
	}

}
