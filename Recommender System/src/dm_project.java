package src;

import src.Initializer;
import src.ModelBuilder;
import src.FileProcessor;
import src.FileProcessorInterface;

/**
 * @author Abhishek Dinkar Raut
 * 
 */
public class dm_project 
{

	private static String inputFile;
	private static String outputFile;
	private static FileProcessorInterface fp = null;
	private static Initializer init = null;
	private static int rows;
	private static int cols;
	private static int[][] input, output;
	private static float[] average;
	private static ModelBuilder mb;
	
	/**
	 * This is the driver code to run the program (entry point class)
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		//Validation of the provided arguments
		if(!validate(args)) 
		{
			System.err.println("Usage: java Driver input.txt output.txt");
			System.exit(1);
		} 
		else 
		{			
			initialize();
			
			// Calculate the algorith running time 
			long startTime = System.currentTimeMillis();
						
			// First reads input from file and then initialize data structures
			init.read(fp, input);
			init.findAverage(input, average, rows, cols);
			
			// Builds model
			mb.findCosineSimilarity(input, average, rows, cols);
			mb.predictValues(input, output, rows, cols);
			
			// Writes output to the file (output.txt)
			init.write(fp, output, rows, cols);

			// Closes the file
			fp.closeFile();
			
			//Calculates total runtime 
			long finishTime = System.currentTimeMillis();
			long total_time = finishTime - startTime;
			System.out.println("Total time: " + String.valueOf(total_time) + " ms");
		}	
	}
	
	/**
	 * Initializes required data structures 
	 */
	private static void initialize() 
	{
		rows = 944;
		cols = 1683;
		input = new int[rows][cols];
		output = new int[rows][cols];
		average = new float[rows];
		fp = new FileProcessor(inputFile, outputFile);
		init = new Initializer();
		mb = new ModelBuilder();
	}

	/**
	 * Validates the command line arguments passed
	 * 
	 * @param args
	 * @return validFlag
	 */
	private static boolean validate(String[] args) 
	{		
		boolean validFlag = true;
		
		// Validates command line arguments
		if(args.length != 2) 
		{
			validFlag = false;
		} 
		else 
		{
			// Reads the command line arguments
			inputFile = args[0];
			outputFile = args[1];
		}
		return validFlag;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "Driver []";
	}
}