package leetcode;

import java.util.HashMap;

public class LemonadeChange {

	public static void main(String[] args) {
		int[] bills = { 5, 5, 5, 10, 20 };
//		int five = 0, ten = 0;
//		for (int bill : bills) {
//			if (bill == 5)
//				five++;
//			else if (bill == 10) {
//				if (five == 0) {
//					System.out.println(false);
//					return;
//				}
//				five--;
//				ten++;
//			} else {
//				if (five > 0 && ten > 0) {
//					five--;
//					ten--;
//				} else if (five >= 3) {
//					five -= 3;
//				} else {
//					System.out.println(false);
//					return;
//				}
//			}
//		}
		// HashMap Solution
		  HashMap<Integer,Integer> count=new HashMap<>();
	        for(int val:bills)
	        {
	            if(val==5)
	            {
	                count.put(val,count.getOrDefault(val,0)+1);
	            }else if(val==10)
	            {
	                if(!count.containsKey(5))
	                {
					System.out.println(false);
					return;
				}
	                else
	                {
	                    count.put(val,count.getOrDefault(val,0)+1);
	                    if(count.get(5)==1)
	                    {
	                        count.remove(5);
	                    }else
	                    {
	                        int freq=count.get(5);
	                        freq--;
	                        count.put(5,freq);
	                    }
	                }
	            }else
	            {
	                if(!count.containsKey(10)&&count.containsKey(5)&&count.get(5)<3)
	                {
					System.out.println(false);
					return;
				}   else if(count.containsKey(10)&&count.containsKey(5))
	                {
	                    int freq1=count.get(5);
	                    int freq2=count.get(10);
	                    if(freq1==1)
	                    {
	                        count.remove(5);
	                    }
	                    if(freq2==1)
	                    {
	                        count.remove(10);
	                    }
	                    if(freq1!=1)
	                    {
	                    freq1--;
	                        count.put(5,freq1);
	                    }
	                    if(freq2!=1)
	                    {
	                    freq2--;
	                    count.put(10,freq2);
	                    }
	                }else if(count.containsKey(5)&&count.get(5)>2)
	                {
	                    int freq3=count.get(5);
	                    freq3-=3;
	                    count.put(5,freq3);
	                }else
	                {
					System.out.println(false);
					return;
				}	            }
	                
	        }

		System.out.println(true);

	}

}
