// The Homework2 class that contains methods to be implemented in HW2
// Your name here

import java.util.Arrays;

public class Homework2 
{
    // This method takes two int arrays (as number vectors) and returns the 
    // Euclidean distance between the two vectors.
    // Do not make any changes to this method!
    public double euclidean(double[] A, double[] B)
    {
        int n = A.length;
        double dist = 0;
        
        for (int i = 0; i < n; i++)
            dist += (A[i] - B[i]) * (A[i] - B[i]);
                
        return Math.sqrt(dist);
    }
    
    // This method takes a 2-D double array and sorts the rows in ascending order.
    // In each row of the array, the first slot (numArray[][0]) stores the index of 
    // each training sample and the second slot (numArray[][1]) stores the distance 
	// between the test sample and a training sample. The sort is based on the distance, 
    // rather than the index.
    // Do not make any changes to this method!
    public static void selectionSort(double[][] numArray)
    {
        int last = numArray.length - 1;
        
        for (int i = 0; i < last; i++)
        {
            // find the index of the smallest element in the unsorted region
            int iMin = i;
            for (int j = i + 1; j <= last; j++)
                // the comparsion is based on the second column
                if (numArray[j][1] < numArray[iMin][1])
                    iMin = j;
        
            // swap the smallest element with the current element
            double temp0 = numArray[i][0];
            double temp1 = numArray[i][1];
            numArray[i][0] = numArray[iMin][0];
            numArray[i][1] = numArray[iMin][1];
            numArray[iMin][0] = temp0;
            numArray[iMin][1] = temp1;
        }
    }
    
    // This method takes as parameters a 2-D double array for training set (each row
    // has 11 slots, with the first slot the ID of a sample and the last slot the 
    // class label of the sample), a 1-D double array for the test sample (only 10
    // slots included, does not include class label), and an int k for the number of 
    // neighbors. It returns the neighbors in a 2-D int array, with first slot the 
    // neighbor ID's, the second slot the neighbor class labels, and the third slot 
    // the distances between the test sample and the neighbors.
    public double[][] findNeighbors(double[][] trainingSet, double[] testSample, int k)
    {
        // TODO: implement this method
        
        return null; // replace this statement with your own return
    }
    
    // This method takes as parameter a 2-D double array which contains all neighbors 
    // with their associated class labels and distances. It calculates the weighted
    // sum of votes for each class and returns the mostly voted class label.
    public int weightedMajorityVote(double[][] neighbors)
    {
        // TODO: implement this method
        
        return -1; // replace this statement with your own return
    }
    
    // This method takes as parameters a 2-D double array for training set, a 2-D
    // double array for test set, and an int k for the number of neighbors. It calculates
    // and returns the prediction accuracy (# of correctly predicted test samples divided
    // by the total number of test samples) of the k-NN model on the test set.
    // Make sure you remove the last column of the test sample when passing it into the
    // findNeighbors method!
    public double measureAccuracy(double[][] trainingSet, double[][] testSet, int k)
    {
        // TODO: implement this method
        
        return -1.0; // replace this statement with your own return
    }
}
