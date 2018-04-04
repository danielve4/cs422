// The Homework3 class that contains methods to be implemented in HW3
// Your name here

public class Homework3 {
  // This method takes two int arrays (as number vectors) and returns the
  // Euclidean distance between the two vectors.
  // Do not make any changes to this method!
  public double euclidean(double[] A, double[] B) {
    int n = A.length;
    double dist = 0;

    for (int i = 0; i < n; i++)
      dist += (A[i] - B[i]) * (A[i] - B[i]);

    return Math.sqrt(dist);
  }

  // This method takes as parameter an integer for the number of clusters, a
  // 2D double array for the cluster centroids, and a 2D double array for the
  // data set that contains test samples. It returns a 1D int array that contains
  // the cluster indices for all samples.
  public int[] assignSamples(int k, double[][] centroids, double[][] dataset) {
    int[] assignees = new int[dataset.length];
    int nextK = 0, tempMinIndex, i, j;
    double tempMinDist, tempDist;
    for(i=0;i<dataset.length;i++) {
      tempMinIndex = 0;
      tempMinDist = euclidean(dataset[i], centroids[0]);
      for(j=1;j<centroids.length;j++) {
        tempDist = euclidean(dataset[i], centroids[j]);
        if(tempDist < tempMinDist) {
          tempMinIndex = j;
          tempMinDist = tempDist;
        }
      }
      assignees[nextK++] = tempMinIndex;
    }

    return assignees; // replace this statement with your own return
  }

  // This method takes as parameter an integer for the number of clusters, a 1D
  // int array that contains the cluster indices for all samples, and a 2D
  // double array for the data set that contains test samples. It returns a
  // 2D double array that contains the updated cluster centroids.
  public double[][] updateCentroids(int k, int[] clusters, double[][] dataset) {
    double[][] updatedCentroids = new double[k][dataset[0].length];
    double[] tempClusterSum = new double[dataset[0].length];
    int tempDataNum, i, j, p;
    for(i=0;i<k;i++) {
      tempDataNum = 0;
      for(p=0;p<dataset[0].length;p++)
        tempClusterSum[p] = 0;

      for(j=0;j<dataset.length;j++) {
        if(clusters[j] == i) {
          tempDataNum++;
          for(p=0;p<dataset[0].length;p++) 
            tempClusterSum[p] += dataset[j][p];
        }
      }
      for(p=0;p<dataset[0].length;p++)
        updatedCentroids[i][p] = (double)(tempClusterSum[p] / tempDataNum);
    }

    return updatedCentroids; // replace this statement with your own return
  }

  // This method takes as parameter an int array that contains the cluster indicies
  // for all samples, a 2D double array for the cluster centroids, and a 2D double
  // array for the data set that contains test samples. It returns the sum of squared
  // error (SSE) for the clusters.
  public double calculateSSE(int[] clusters, double[][] centroids, double[][] dataset) {
    // TODO: implement this method

    return 0.0; // replace this statement with your own return
  }

  // This method implements the k-means clustering algorithm. It takes an integer
  // for the number of clusters, a 2D double array for the cluster centroids, and
  // a 2D double array for the data set that contains test samples. It returns the
  // final SSE after the clustering process converges.
  // NOTE: This method should leverage the above methods in order to implement
  // the algorithm. It should NOT re-implement any functionalities that have been
  // implemented in the above methods.
  public double kMeans(int k, double[][] centroids, double[][] dataset) {
    // TODO: implement this method

    return 0.0; // replace this statement with your own return
  }
}
