package jianzhi;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//反转链表
		//输入一个链表，反转链表后，输出新链表的表头。
	
		boolean f = Find(5,new int[6][6]);
		System.out.println(f);
	}
	public static boolean Find(int target, int [][] arr) {
	    //input check
	    if(arr == null || arr.length == 0 || arr[0] == null || arr[0].length == 0){
	        return false;
	    }
	    int i = 0, j = arr[0].length - 1;
	    while(i != arr.length - 1 && j != 0){
	        if(target > arr[i][j]){
	            i++;
	        }else if(target < arr[i][j]){
	            j--;
	        }else{
	            return true;
	        }
	    }

	    return target == arr[i][j];
	}
}
