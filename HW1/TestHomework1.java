// Test driver for the Homework1 class
// Do not make any changes to this file!
// Xiwei Wang

import java.util.Arrays;

public class TestHomework1 
{
    public static void main(String[] args)
    {
        Homework1 myHW1 = new Homework1();
        int[][] myMatrix1 = null;
        int[][] myMatrix2 = null; 
        int[][] myMatrix3 = null;
        int[] myArray1 = null;
        int[] myArray2 = null;
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;
                
        // Test 1
        numTotalTests++;
        int[][] mReturn = null;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try
        {
            int[][] testMatrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                };
            
            int[][] testMatrix2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
                };
            
            int[][] testMatrix3 = {
                {300, 360, 420},
                {660, 810, 960},
                {1020, 1260, 1500}
                };            
            
            myMatrix1 = testMatrix1;
            myMatrix2 = testMatrix2;
            myMatrix3 = testMatrix3;
            
            mReturn = myHW1.matrixMultiplication(myMatrix1, myMatrix2);
            
            if (compareMatrices(myMatrix3, mReturn))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": matrixMultiplication - " + testResult);
        System.out.println(" A = ");
        printMatrix(myMatrix1);
        System.out.println(" B = ");
        printMatrix(myMatrix2);
        System.out.println(" --------------\n Expected:");
        printMatrix(myMatrix3);
        if (eMsg.equals("N/A"))
        {
            System.out.println(" Yours: ");
            printMatrix(mReturn);
        }
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 2
        numTotalTests++;
        mReturn = null;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[][] testMatrix1 = {
                {7, 8, 9}
                };
            
            int[][] testMatrix2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
                };
            
            int[][] testMatrix3 = {
                {1020, 1260, 1500}
                };            
            
            myMatrix1 = testMatrix1;
            myMatrix2 = testMatrix2;
            myMatrix3 = testMatrix3;
            
            mReturn = myHW1.matrixMultiplication(myMatrix1, myMatrix2);
            
            if (compareMatrices(myMatrix3, mReturn))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": matrixMultiplication - " + testResult);
        System.out.println(" A = ");
        printMatrix(myMatrix1);
        System.out.println(" B = ");
        printMatrix(myMatrix2);
        System.out.println(" --------------\n Expected:");
        printMatrix(myMatrix3);
        if (eMsg.equals("N/A"))
        {
            System.out.println(" Yours: ");
            printMatrix(mReturn);
        }
        else
            System.out.println(" Yours: " + eMsg + "\n");        
        
        // Test 3
        numTotalTests++;
        mReturn = null;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[][] testMatrix1 = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 10, 20, 30}
                };
            
            int[][] testMatrix2 = {
                {4},
                {5},
                {6},
                {7}                    
                }; 
            
            int[][] testMatrix3 = {
                {600},
                {1480},
                {740}
                };            
            
            myMatrix1 = testMatrix1;
            myMatrix2 = testMatrix2;
            myMatrix3 = testMatrix3;
            
            mReturn = myHW1.matrixMultiplication(myMatrix1, myMatrix2);
            
            if (compareMatrices(myMatrix3, mReturn))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": matrixMultiplication - " + testResult);
        System.out.println(" A = ");
        printMatrix(myMatrix1);
        System.out.println(" B = ");
        printMatrix(myMatrix2);
        System.out.println(" --------------\n Expected:");
        printMatrix(myMatrix3);
        if (eMsg.equals("N/A"))
        {
            System.out.println(" Yours: ");
            printMatrix(mReturn);
        }
        else
            System.out.println(" Yours: " + eMsg + "\n");  
        
        // Test 4
        numTotalTests++;
        double dReturn = 0.0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray1 = {0, 1, 1, 0, 0, 0, 1, 1, 0};
            int[] testArray2 = {0, 1, 1, 0, 0, 0, 1, 1, 0};
            
            myArray1 = testArray1;
            myArray2 = testArray2;
            
            dReturn = myHW1.jaccard(myArray1, myArray2);
            dReturn = Math.round(dReturn * 1000D) / 1000D; 
            
            if (dReturn == 1.0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": jaccard - " + testResult + "\n" + " A = " + Arrays.toString(myArray1) + "\n B = " + Arrays.toString(myArray2));
        System.out.println(" --------------\n Expected: 1.0");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 5
        numTotalTests++;
        dReturn = 0.0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray1 = {0, 1, 1, 0, 0, 0, 0, 1};
            int[] testArray2 = {0, 0, 0, 0, 0, 0, 1, 1};
            
            myArray1 = testArray1;
            myArray2 = testArray2;
            
            dReturn = myHW1.jaccard(myArray1, myArray2);
            dReturn = Math.round(dReturn * 1000D) / 1000D; 
            
            if (dReturn == 0.25)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": jaccard - " + testResult + "\n" + " A = " + Arrays.toString(myArray1) + "\n B = " + Arrays.toString(myArray2));
        System.out.println(" --------------\n Expected: " + 0.25);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");        
        
        // Test 6
        numTotalTests++;
        dReturn = 0.0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray1 = {1, 1, 1, 1, 1, 1};
            int[] testArray2 = {0, 0, 0, 0, 0, 0};
            
            myArray1 = testArray1;
            myArray2 = testArray2;
            
            dReturn = myHW1.jaccard(myArray1, myArray2);
            dReturn = Math.round(dReturn * 1000D) / 1000D;
            
            if (dReturn == 0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": jaccard - " + testResult + "\n" + " A = " + Arrays.toString(myArray1) + "\n B = " + Arrays.toString(myArray2));
        System.out.println(" --------------\n Expected: 0.0");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");  
        
        // Test 7
        numTotalTests++;
        dReturn = 0.0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray1 = {3, 2, 0, 5, 0, 0, 0, 2, 0, 0};
            int[] testArray2 = {1, 0, 0, 0, 0, 0, 0, 1, 0, 2};
            
            myArray1 = testArray1;
            myArray2 = testArray2;
            
            dReturn = myHW1.cosineSimilarity(myArray1, myArray2);
            dReturn = Math.round(dReturn * 10D) / 10D;
            
            if (dReturn == 71.6)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": cosineSimilarity - " + testResult + "\n" + " A = " + Arrays.toString(myArray1) + "\n B = " + Arrays.toString(myArray2));
        System.out.println(" --------------\n Expected: 71.6");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 8
        numTotalTests++;
        dReturn = 0.0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray1 = {1, 1};
            int[] testArray2 = {1, 0};
            
            myArray1 = testArray1;
            myArray2 = testArray2;
            
            dReturn = myHW1.cosineSimilarity(myArray1, myArray2);
            dReturn = Math.round(dReturn * 10D) / 10D;
            
            if (dReturn == 45.0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": cosineSimilarity - " + testResult + "\n" + " A = " + Arrays.toString(myArray1) + "\n B = " + Arrays.toString(myArray2));
        System.out.println(" --------------\n Expected: 45.0");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 9
        numTotalTests++;
        dReturn = 0.0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray1 = {0, 1};
            int[] testArray2 = {1, 0};
            
            myArray1 = testArray1;
            myArray2 = testArray2;
            
            dReturn = myHW1.cosineSimilarity(myArray1, myArray2);
            dReturn = Math.round(dReturn * 10D) / 10D;
            
            if (dReturn == 90.0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": cosineSimilarity - " + testResult + "\n" + " A = " + Arrays.toString(myArray1) + "\n B = " + Arrays.toString(myArray2));
        System.out.println(" --------------\n Expected: 90.0");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 10
        numTotalTests++;
        dReturn = 0.0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray1 = {3, 1};
            int[] testArray2 = {5, 1};
            
            myArray1 = testArray1;
            myArray2 = testArray2;
            
            dReturn = myHW1.euclidean(myArray1, myArray2);
            dReturn = Math.round(dReturn * 10D) / 10D;
            
            if (dReturn == 2.0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": euclidean - " + testResult + "\n" + " A = " + Arrays.toString(myArray1) + "\n B = " + Arrays.toString(myArray2));
        System.out.println(" --------------\n Expected: 2.0");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");  

        // Test 11
        numTotalTests++;
        dReturn = 0.0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray1 = {3, 2, 0, 5, 0, 0, 0, 2, 0, 0};
            int[] testArray2 = {1, 0, 0, 0, 0, 0, 0, 1, 0, 2};
            
            myArray1 = testArray1;
            myArray2 = testArray2;
            
            dReturn = myHW1.euclidean(myArray1, myArray2);
            dReturn = Math.round(dReturn * 10D) / 10D;
            
            if (dReturn == 6.2)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": euclidean - " + testResult + "\n" + " A = " + Arrays.toString(myArray1) + "\n B = " + Arrays.toString(myArray2));
        System.out.println(" --------------\n Expected: 6.2");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));
    }

    public static boolean compareMatrices(int[][] correct, int[][] yours)
    {
        for (int i = 0; i < correct.length; i++)
            for (int j = 0; j < correct[i].length; j++)
                if (correct[i][j] != yours[i][j])
                    return false;
        
        return true;
    }
    
    public static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.format("%6d", matrix[i][j]);

            System.out.println();
        }

        System.out.println();
    }    
}
