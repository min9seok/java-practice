//package days12;
//
//import java.util.Iterator;
//
///**
// * @author minseok
// * @date 2023. 7. 28. - 오전 11:41:29
// * @subject
// * @content
// */
//public class Ex04 {
//
//	public static void main(String[] args) {
//		int m[][] = new int [5][5];
////		fillM(m);
////		fillM02(m);
////		fillM03(m);
////		fillM04(m);
////		fillM05(m);
//		fillM06(m);
////		magicSquare(m);
//		
//		
//		dispM(m);
//
//	}//main
//	private static void magicSquare(int[][] m) {
//	      // 1) 첫 번째 행의 가운데 열 = 1
//	      // 2-1) 출력값이 5의 배수라면 행만 증가
//	      // 2-2)                  X    행 감소, 열 증가  반복적으로 처리    
//	      //                          ㄴ 행  -1행 -> 가장 큰 행값
//	      //                          ㄴ 열   5열 -> 가장 작은 열값
//	      int n = 1;
//	      int row = 0, col = 2;
//	      
//	      while (n <= 25) {
//	         m[row][col] = n;
//	         
//	         dispM(m);
//	         
//	         try {
//	            Thread.sleep(1000); // 0.5초
//	         } catch (InterruptedException e) { 
//	            e.printStackTrace();
//	         } 
//	         
//	         if ( n%5==0 ) {
//	            row++;
//	         } else {
//	            row--;  col++;
//	            if( col == 5) col=0;
//	            if( row == -1) row=4;
//	         } // if         
//	         n++;
//	      } // while
//	      
//	   }
//
//	private static void fillM06(int[][] m) {
//		// 00 00
//		// 01 01
//		// 02 02
//		// 03 03
//		// 04 04
//		
//		// 10 14
//		// 11 24 
//		// 12 34
//		// 13 44
//		
//		// 14 43
//		// 20 42
//		// 21 41
//		// 22 40
//
//		// 23 30
//		// 24 20
//		// 30 10
//		
//		// 31 11
//		// 32 12
//		// 33 13
//		
//		// 34 23
//		// 40 33
//		
//		// 41 32
//		// 42 31
//		
//		// 43 22
//		
//		// 44 23
//		//1set  col+1
//		//2set  row+1
//		//3set  col-1
//		//4set  row-1
//		int f = 1;
//		int e = 25;
//		int w = m.length;
//		int l = m.length-1;
//		int row = 0, col = 0;
//		while(f<=25) {			
//			for (int i = 0; i < w; i++) {
//				m[row][col] = f;
//				col++;
//				f++;
//			} // for
//			col--;
//			row++;
//			w--;
//			for (int i = 0; i < l; i++) {
//				m[row][col] = f;
//				row++;
//				f++;
//			} // for
//			row--;
//			col--;			
//			for (int i = 0; i < w; i++) {
//				m[row][col] = f;
//				col--;
//				f++;
//			} // for
//			for (int i = 0; i < l; i++) {
//				m[row][col] = f;
//				row--;
//				f++;
//			} // for
//		}
//		
//		
//	}
//	private static void fillM05(int[][] m) {
//		
//		  // 00 00
//	      // 01 01
//	      // 02 10
//	      // 03 03
//	      // 04 11
//	      // 10 20
//	      // 11 03 
//	      // 12 12
//		  // 13 31
//  	      // 14 30
//	 	  // 20 04
//		  // 21 13
//		  // 22 22
//
//	   private static void fillM06(int[][] m) {
//		      // 00 00
//		      // 01 01
//		      // 02 02
//		      // 03 03
//		      // 04 04
//		      
//		      // 10 14
//		      // 11 24 
//		      // 12 34
//		      // 13 44
//		      
//		      // 14 43
//		      // 20 42
//		      // 21 41
//		      // 22 40
//
//		      // 23 30
//		      // 24 20
//		      // 30 10
//		      
//		      // 31 11
//		      // 32 12
//		      // 33 13
//		      
//		      // 34 23
//		      // 40 33
//		      
//		      // 41 32
//		      // 42 31
//		      
//		      // 43 22
//		      
//		      // 44 23
//		      //1set  e+1
//		      //2set  f+1
//		      //3set  e-1
//		      //4set  f-1
//		      int n = 1;
//		      int index = m.length*m[0].length;
//		      int row,col;
//		      int f=0,e=0;
//		         row = m.length;
//		         col = m[0].length-1;
//		         while(n<=index) {
//		         for (int i = 0; i < row; i++) {
//		               m[f][e] = n++;
//		               e++;
//		         } // for
//		         e--;f++;
//		         for (int i = 0; i < col; i++) {
//		               m[f][e] = n++;
//		               f++;
//		         }
//		         f--;e--;row--;
//		         for (int i = 0; i < row; i++) {
//		               m[f][e] = n++;
//		               e--;
//		         }
//		         col--;e++;f--;
//		         for (int i = 0; i < col; i++) {
//		               m[f][e] = n++;
//		               f--;
//		         }
//		         row--;e++;f++;
//		         for (int i = 0; i < row; i++) {
//		            m[f][e] = n++;
//		            e++;
//		         }
//		         col--;f++;e--;
//		         for (int i = 0; i < col; i++) {
//		            m[f][e] = n++;
//		            f++;
//		         }
//		         row--;f--;e--;
//		         for (int i = 0; i < row; i++) {
//		            m[f][e] = n++;
//		            e--;
//		         }
//		         col--;e++;f--;
//		         for (int i = 0; i < col; i++) {
//		            m[f][e] = n++;
//		            f--;
//		         }
//		         row--;e++;f++;
//		         for (int i = 0; i < row; i++) {
//		            m[f][e] = n++;
//		            e++;
//		         }
//		         }   
//		   }
//	   
//	private static void fillM051(int[][] m) {
//		
//		  // 00 00
//	      // 01 01
//	      // 02 10
//	      // 03 03
//	      // 04 11
//	      // 10 20
//	      // 11 03 
//	      // 12 12
//		  // 13 31
//  	      // 14 30
//	 	  // 20 04
//		  // 21 13
//		  // 22 22
//		
//
//		int k=0;			
//		for (int i = 0; i < m.length+m.length-1; i++) {
//			for (int j = 0; j < m.length; j++) {
//				int index=i-j;
//				if(index>=0&&index<5) {
//					k+=1;
//					m[j][index] = k;
//				}
//			} // for
//		} // for
//		
//	}
//	private static void fillM04(int[][] m) {
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
////				if(i%2==0) {
////					m[i][j] = 5*i+j+1;
////				}else {
////					m[i][4-j] = 5*i+j+1;	
////				}		
////				m[i][i%2==0?j:4-j] = 5*i+j+1;				
//			} // for			
//		} // for
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
////				if(i%2==0) {
////				m[i][j] = 5*i+j+1;
////				}else {
////				m[i][j] = 5*(i+1)-j;
////				}
//				m[i][j] = i%2==0?5*i+j+1:5*(i+1)-j;
//			} // for			
//		} // for
//		
//		
//	}
//	private static void fillM03(int[][] m) {
//	      /*
//	      [05][10][15][20][25]
//	      [04][09][14][19][24]
//	      [03][08][13][18][23]
//	      [02][07][12][17][22]
//	      [01][06][11][16][21]
//	      */
//	      // 00 40
//	      // 01 30
//	      // 02 20
//	      // 03 10
//	      // 04 00
//	      // 10 41
//	      // 11 31 
//	      // 12 21
//	      //  :
//	      /*
//	      for (int i = 0; i < m.length; i++) {
//	         for (int j = 0; j < m[i].length; j++) {
//	            m[4-j][i] =  5*i+j+1 ;
//	         } // for
//	      } // for
//	      */
//	      
//	      
//	      for (int i = 0; i < m.length; i++) {
//	         for (int j = 0; j < m[i].length; j++) {
//	            m[i][j] =  5-i + 5*j ;
//	         } // for
//	      } // for
//	      
//	   }
//
//	private static void fillM02(int[][] m) {
////		for (int i = 0,n=25; i < m.length; i++) {
////			for (int j = 0; j < m[i].length; j++) {
////				m[i][j] = n--; 		
////			} // for			
////		} // for
//		
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[4-i][4-j] = 5*i+j+1; 		
//			} // for			
//		} // for
//	}
//
//	private static void fillM(int[][] m) {
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[i][j] = 5*i+j+1; 		
//			} // for			
//		} // for
//		
//	}
//
//	private static void dispM(int[][] m) {
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				System.out.printf("[%02d]",m[i][j]);		
//			} // for
//			System.out.println();
//		} // for
//		
//		
//	}
//
//}//class
