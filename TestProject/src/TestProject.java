public class TestProject {
   public static void main(String[] args) {
     int[][] myNumbers = { {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5} };
     for (int i = 0; i < myNumbers.length; ++i) {
        for(int j = 0; j < myNumbers[i].length; ++j) {
           System.out.println("myNumbers["+i+"]["+j+"]");
        }
     }
   }
}
/*************************************************************
public class Main {
public static void main(String[] args) {
  int[][] myNumbers = { {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5} };
  for (int i = 0; i < myNumbers.length; ++i) {
     for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
     }
  }
}
}
1
2
3
4
5
1
2
3
4
5
public class Main {
   public static void main(String[] args) {
     int[][] myNumbers = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10} };
     for (int i = 0; i < myNumbers.length; ++i) {
        for(int j = 0; j < myNumbers[i].length; ++j) {
           System.out.println(myNumbers[i][j]);
        }
     }
   }
}
1
2
3
4
5
6
7
8
9
10
*************************************************************/