package giuf;

public class niuke002 {
	public int[] multiply(int[] A) {
		int length=A.length;
		int []B=new int[length];
		if(length==0)return B;
		
		int []a=new int[length];
		int []b=new int[length];
		a[0]=1;
		b[0]=1;
		
		for(int i=0;i<length;i++){
			if(i>0)
				a[i]=a[i-1]*A[i-1];
			if(i<length-1)
				b[i+1]=b[i]*A[length-i-1];
		}
		for(int i=0;i<length;i++)
			B[i]=a[i]*b[length-i-1];
		return B;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,5,6};
        for (int i:new niuke002().multiply(A)){
        	//这里A是数组，i不是下标了，i是来接受每一个数组A调用multiply遍历出来的值的。
            System.out.print(i+" ");

	}
	}
}
