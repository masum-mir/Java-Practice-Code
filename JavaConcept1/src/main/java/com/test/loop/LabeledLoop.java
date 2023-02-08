package com.test.loop;

public class LabeledLoop {
	@SuppressWarnings("unused")
	public static void main(String[] agrs) {
//
//		test:
//		for(int i=0; i<5; i++) {
//			inner:
//			for(int j=0; j<5; j++) {
//				if(i==3) {
//					continue test;
//				}
////				if(j==3) {
////					continue inner;
////				}
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

//		int i, j;
//
//		outer: for (i = 1; i <= 5; i++) {
//			System.out.println();
//
//			inner: for (j = 1; j <= 10; j++) {
//				System.out.print(j + " ");
//				if (j == 5)
//					continue inner;
//			}
//		}

		outer: for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 5) {
					continue outer;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
