// Test driver for the Homework2 class
// Do not make any changes to this file!
// Xiwei Wang

import java.io.*;
import java.util.Arrays;

public class TestHomework2 
{
    public static void main(String[] args)
    {
        Homework2 myHW2 = new Homework2();
        double[][] myMatrix = null;
        double accuracy = 0.0;
        int index=0, k = 0;
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;
        
        double[][] glassTraining = loadMatrix("glass_training.txt", 171, 11);
        double[][] glassTest = loadMatrix("glass_test.txt", 43, 11);
        
        // Test 1
        numTotalTests++;
        double[][] drReturn = null;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try
        {
            double[][] expectedNeighbors = {
                {74, 2, 0.335},
                {82, 2, 0.433},
                {2, 1, 0.493},
                {123, 2, 0.497},
                {73, 2, 0.537}                    
                }; 
            
            myMatrix = expectedNeighbors;
            index = 0;
            k = 5;
            
            double[] testSample = Arrays.copyOfRange(glassTest[index], 0, 10);
            drReturn = myHW2.findNeighbors(glassTraining, testSample, k);
                        
            if (compareNeighors(myMatrix, drReturn))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": findNeighbors(testSample ID = " + (int)glassTest[index][0] + ", k = " + k + ") - " + testResult);
        System.out.println(" --------------\n Expected:");
        printNeighbors(myMatrix);
        System.out.println();
        
        if (eMsg.equals("N/A"))
        {
            System.out.println(" Yours: ");
            printNeighbors(drReturn);
            System.out.println();
        }
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 2
        numTotalTests++;
        drReturn = null;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            double[][] expectedNeighbors = {
                {15, 1, 0.208},
                {34, 1, 0.259},
                {31, 1, 0.274}                  
                }; 
            
            myMatrix = expectedNeighbors;
            index = 5;
            k = 3;
            
            double[] testSample = Arrays.copyOfRange(glassTest[index], 0, 10);
            drReturn = myHW2.findNeighbors(glassTraining, testSample, k);
                        
            if (compareNeighors(myMatrix, drReturn))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": findNeighbors(testSample ID = " + (int)glassTest[index][0] + ", k = " + k + ") - " + testResult);
        System.out.println(" --------------\n Expected:");
        printNeighbors(myMatrix);
        System.out.println();
        
        if (eMsg.equals("N/A"))
        {
            System.out.println(" Yours: ");
            printNeighbors(drReturn);
            System.out.println();
        }
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 3
        numTotalTests++;
        drReturn = null;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            double[][] expectedNeighbors = {
                {212, 7, 0.240},
                {213, 7, 0.366},
                {195, 7, 0.386},
                {194, 7, 0.643} 
                }; 
            
            myMatrix = expectedNeighbors;
            index = 42;
            k = 4;
            
            double[] testSample = Arrays.copyOfRange(glassTest[index], 0, 10);
            drReturn = myHW2.findNeighbors(glassTraining, testSample, k);
                        
            if (compareNeighors(myMatrix, drReturn))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": findNeighbors(testSample ID = " + (int)glassTest[index][0] + ", k = " + k + ") - " + testResult);
        System.out.println(" --------------\n Expected:");
        printNeighbors(myMatrix);
        System.out.println();
        
        if (eMsg.equals("N/A"))
        {
            System.out.println(" Yours: ");
            printNeighbors(drReturn);
            System.out.println();
        }
        else
            System.out.println(" Yours: " + eMsg + "\n");          
        
        
        // Test 4
        numTotalTests++;
        int iReturn = 0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            double[][] neighbors = {
                {1, 1, 0.1},
                {2, 5, 0.1},
                {3, 2, 0.1},
                {4, 5, 0.1} 
                }; 
            
            myMatrix = neighbors;
            index = 5;
            iReturn = myHW2.weightedMajorityVote(myMatrix);
                        
            if (iReturn == index)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": weightedMajorityVote - " + testResult);
        printNeighbors(myMatrix);
        
        System.out.println(" --------------\n Expected: " + index);        
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 5
        numTotalTests++;
        iReturn = 0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            double[][] neighbors = {
                {5, 1, 0.105},
                {6, 5, 0.113},
                {7, 2, 0.197},
                {8, 4, 0.212} 
                }; 
            
            myMatrix = neighbors;
            index = 1;
            iReturn = myHW2.weightedMajorityVote(myMatrix);
                        
            if (iReturn == index)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": weightedMajorityVote - " + testResult);
        printNeighbors(myMatrix);
        
        System.out.println(" --------------\n Expected: " + index);        
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 6
        numTotalTests++;
        iReturn = 0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            double[][] neighbors = {
                {9, 3, 0.143},
                {10, 2, 0.176},
                {11, 1, 0.263},
                {12, 3, 0.294},
                {13, 5, 0.312},
                {14, 4, 0.334}                     
                }; 
            
            myMatrix = neighbors;
            index = 3;
            iReturn = myHW2.weightedMajorityVote(myMatrix);
                        
            if (iReturn == index)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": weightedMajorityVote - " + testResult);
        printNeighbors(myMatrix);
        
        System.out.println(" --------------\n Expected: " + index);        
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 7
        numTotalTests++;
        double dReturn = 0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            k = 1;
            accuracy = 0.791;
            dReturn = myHW2.measureAccuracy(glassTraining, glassTest, k);
            dReturn = Math.round(dReturn * 1000D) / 1000D;
            
            if (dReturn == accuracy)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": measureAccuracy(k = " + k + ") - " + testResult);        
        System.out.println(" --------------\n Expected: " + accuracy);        
        if (eMsg.equals("N/A"))
            System.out.format(" Yours: %.3f\n\n", dReturn);
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 8
        numTotalTests++;
        dReturn = 0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            k = 3;
            accuracy = 0.721;
            dReturn = myHW2.measureAccuracy(glassTraining, glassTest, k);
            dReturn = Math.round(dReturn * 1000D) / 1000D;
            
            if (dReturn == accuracy)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": measureAccuracy(k = " + k + ") - " + testResult);        
        System.out.println(" --------------\n Expected: " + accuracy);        
        if (eMsg.equals("N/A"))
            System.out.format(" Yours: %.3f\n\n", dReturn);
        else
            System.out.println(" Yours: " + eMsg + "\n"); 

        // Test 9
        numTotalTests++;
        dReturn = 0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            k = 5;
            accuracy = 0.698;
            dReturn = myHW2.measureAccuracy(glassTraining, glassTest, k);
            dReturn = Math.round(dReturn * 1000D) / 1000D;
            
            if (dReturn == accuracy)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": measureAccuracy(k = " + k + ") - " + testResult);        
        System.out.println(" --------------\n Expected: " + accuracy);        
        if (eMsg.equals("N/A"))
            System.out.format(" Yours: %.3f\n\n", dReturn);
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 10
        numTotalTests++;
        dReturn = 0;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            k = 20;
            accuracy = 0.674;
            dReturn = myHW2.measureAccuracy(glassTraining, glassTest, k);
            dReturn = Math.round(dReturn * 1000D) / 1000D;
            
            if (dReturn == accuracy)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": measureAccuracy(k = " + k + ") - " + testResult);        
        System.out.println(" --------------\n Expected: " + accuracy);        
        if (eMsg.equals("N/A"))
            System.out.format(" Yours: %.3f\n\n", dReturn);
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));
    }

    public static boolean compareNeighors(double[][] expected, double[][] test)
    {
        for (int i = 0; i < expected.length; i++)
            for (int j = 0; j < expected[i].length; j++)
                if (expected[i][j] != Math.round(test[i][j] * 1000D) / 1000D)
                    return false;
        
        return true;
    }
    
    public static void printNeighbors(double[][] neighbors)
    {
        System.out.format("   ID \t Class \t Dist\n  ....................\n");
        
        for (int i = 0; i < neighbors.length; i++)
            System.out.format("%5d \t %3d \t %.3f\n", (int)neighbors[i][0], (int)neighbors[i][1], neighbors[i][2]);
    }
    
    public static double[][] loadMatrix(String fileName, int numRows, int numCols)
    { 
        double[][] glassMatrix = new double[numRows][numCols];
        int iRow = 0;
                
        try
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            
            while((line = bufferedReader.readLine()) != null)
            {
                int iCol = 0;
                String[] values = line.split(",");
                for (String str : values)
                {
                    glassMatrix[iRow][iCol] = Double.parseDouble(str);
                    iCol++;
                }
                
                iRow++;
            }

            bufferedReader.close();         
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());                
        }
        
        return glassMatrix;
    }
}
