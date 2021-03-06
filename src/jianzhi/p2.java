package jianzhi;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二维数组的查找
		//在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
		//每一列都按照从上到下递增的顺序排序。
		//请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
	
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
