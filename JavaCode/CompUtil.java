package JavaCode;

import java.util.Arrays;

public class CompUtil{
	public static Object max(MyComparable[]objs){
		if(objs==null||objs.length==0){
			return null;
		}
		MyComparable max =objs[0];
		for(int i=1;i<objs.length;i++){
			if(max.compareTo(objs[i])<0){
				max=objs[i];
			}
		}
		return max;
	}
	public static void sort(Comparable[]objs){
		for(int i=0;i<objs.length;i++){
			int min =i;
			for(int j=i+1;j<objs.length;j++){
				if(objs[j].compareTo(objs[min])<0)
					min=j;
			}
			if(i!=min){
				Comparable temp=objs[i];
				objs[i]=objs[min];
				objs[min]=temp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point []points = new Point[]{
				new Point(2, 3),new Point(1, 2),new Point(3, 4)};
		Point p=new Point(2, 3);
		//用来判断一个对象是否实现了某接口
		if(p instanceof MyComparable){
			System.out.println("Compare");
		}
		System.out.println("max:"+CompUtil.max(points));
		//CompUtil.sort(points);
		System.out.println("sort:"+Arrays.toString(points));

	}


}
