package jianzhi;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ά����Ĳ���
		//��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
		//ÿһ�ж����մ��ϵ��µ�����˳������
		//�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
	
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
