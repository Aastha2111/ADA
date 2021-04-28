package march;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//14-04-21
//N-Queen Backtracking

public class NqueenBacktracking {

	static List<List<Integer> > finalarr
    = new ArrayList<List<Integer> >();

static boolean secure(int QMat[][], int row, int col)
{
    int i, j;
    int N = QMat.length;   
    for (i = 0; i < col; i++)
        if (QMat[row][i] == 1)
            return false;
    for (i = row, j = col; i >= 0 && j >= 0; i--, j--)//ULD
        if (QMat[i][j] == 1)
            return false;
    for (i = row, j = col; j >= 0 && i < N; i++, j--)//LLD
        if (QMat[i][j] == 1)
            return false;

    return true;
}


static boolean NQ(int QMatrix[][],int N, int col)
{
      if (col == N) {   //c-->column
//making the array set that have the place of the queen
        List<Integer> v = new ArrayList<>();

        for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
                if (QMatrix[i][j] == 1)
                    v.add(j + 1);
        }
        }
        finalarr.add(v);
        return true;
    }
//chk all row in c

  boolean flag = false;
    for (int i = 0; i < N; i++) {
         if (secure(QMatrix, i, col)) {
            QMatrix[i][col] = 1;
//            if(NQ(QMatrix,N,col + 1)) {return true;}
            flag = NQ(QMatrix,N,col + 1) || flag;
             QMatrix[i][col] = 0; // BACKTRACK
        }
    }
//      return false;
  return flag;
}


static List<List<Integer> > nQueenProblem(int n)
{

    int chessboard[][] = new int[n][n];
    NQ(chessboard,n,0);     
    return finalarr;
}	
	
	public static void main(String[] args) {
		//aastha-19csu003
		System.out.println("aastha-19csu003 ");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter N for Nquenn matrix= ");
		int n= sc.nextInt();		 
        List<List<Integer> > arr = nQueenProblem(n);
        System.out.println(arr);
		
	}

}

//output

//aastha-19csu003 
//Enter N for Nquenn matrix= 4
//[[3, 1, 4, 2], [2, 4, 1, 3]]



