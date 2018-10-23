package LinkCode;

public class LC002 {
	public int[] mergeSortedArray(int[] A, int[] B) {
		if (A.length == 0)
			return B;
		if (B.length == 0)
			return A;
		int[] C = new int[A.length + B.length];
		int i, j, k;
		i = j = k = 0;
		while (i < A.length && j < B.length) {
			if (A[i] > B[j])
				C[k++] = B[j++];
			else
				C[k++] = A[i++];
		}
		while (i < A.length)
			C[k++] = A[i++];
		while (j < B.length)
			C[k++] = B[j++];
		return C;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 3, 5, 7, 9, 19 };
		int B[] = { 2, 4, 8, 11, 13 };
		LC002 s = new LC002();

		for (int i : s.mergeSortedArray(A, B))
			System.out.println(i);

	}

}
