import org.omg.CORBA.BAD_QOS;

// The Homework1 class that contains methods to be implemented in HW1
// Your name here

public class Homework1 {
  // This method takes two 2-D int arrays (as int matrices) and returns the 
  // product of the two matrices in a thrid matrix.
  public int[][] matrixMultiplication(int[][] A, int[][] B) {
    int aRow = A.length, aCol = A[0].length, bCol= B[0].length;
    int[][] result = new int[aRow][bCol];
    int i, j, k, temp;
    for(i = 0; i < aRow; i++) {
      for(j = 0; j < bCol; j++) {
        temp = 0;
        for(k = 0; k < aCol; k++)
          temp += A[i][k] * B[k][j];
        result[i][j] = temp;
      }
    }
    return result;
  }

  // This method takes two int arrays (as binary vectors) and returns the 
  // Jaccard coefficient between the two vectors.
  public double jaccard(int[] A, int[] B) {
    if(A.length != B.length)
      return -1;
    int matching = 0, notInvolved = 0;
    for(int i = 0; i < A.length; i++) {
      if(A[i] == B[i]) {
        if(A[i] == 0)
          notInvolved += 1;
        else 
          matching += 1;
      }
    }
    return (double) matching / (A.length - notInvolved);
  }

  // This method takes two int arrays (as number vectors) and returns the 
  // angle (in degrees) between the two vectors using Cosine similarity.
  public double cosineSimilarity(int[] A, int[] B) {
    if(A.length != B.length)
      return -1;
    int dotProduct = 0, aSquareSum = 0, bSquareSum = 0;
    for(int i = 0; i < A.length; i++) {
      dotProduct += A[i] * B[i];
      aSquareSum += Math.pow(A[i], 2);
      bSquareSum += Math.pow(B[i], 2);
    } 
    double cosSimilarity = dotProduct / (Math.sqrt(aSquareSum) * Math.sqrt(bSquareSum));
    return Math.toDegrees(Math.acos(cosSimilarity));
  }

  // This method takes two int arrays (as number vectors) and returns the 
  // Euclidean distance between the two vectors.
  public double euclidean(int[] A, int[] B) {
    if(A.length != B.length)
      return -1;
    int sumOfSquares = 0;
    for(int i = 0; i < A.length; i++) {
      sumOfSquares += Math.pow(A[i] - B[i], 2);
    }
    return Math.sqrt(sumOfSquares);
  }
}
