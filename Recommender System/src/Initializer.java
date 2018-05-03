package src;

import src.FileProcessorInterface;

/**
 * @author Abhishek Dinkar Raut
 * 
 * associated with data structutes initializing
 * 
 */
public class Initializer 
{	
	/**
	 * Constructor of the Initializer class 
	 */
	public Initializer() 
	{
		
	}

	/**
	 * Reads a line from input file and then assigns the values to the input matrix
	 * 
	 * @param fp
	 * @param input
	 */
	public void read(FileProcessorInterface fp, int[][] input) 
	{		
		String line = null;
		String [] st = null;
		
		//Read input from the input file
		while((line = fp.readFromFile()) != null)
		{
			st = line.split("\\s+");
			int user = Integer.valueOf(st[0]);
			int item = Integer.valueOf(st[1]);
			int value =  Integer.valueOf(st[2]);
			input[user][item] = value;
		}
	}

	/**
	 * Finds the average rating provided by a user
	 * 
	 * @param input
	 * @param average
	 * @param rows
	 * @param cols
	 */
	public void findAverage(int[][] input, float[] average, int rows, int cols) 
	{		
		float sum = 0, value = 0.00f;
		int count = 0;
		
		for(int i = 1; i < rows; i++) 
		{
			for(int j = 1; j < cols; j++) 
			{				
				// Calculates average only if the user has rated the item
				if(input[i][j] != 0) 
				{
					sum += input[i][j];
					count++;
				}
			}

			// Formula for average
			value = sum / count;
			average[i] = value;
			
			// Reseting the values to avoid calculation bugs
			sum = 0;
			count = 0;
			value = 0.00f;
		}
	}

	/**
	 * 
	 * Writes the values inside the output matrix into the output file as per required format
	 * 
	 * @param fp
	 * @param output
	 * @param rows
	 * @param cols
	 */
	public void write(FileProcessorInterface fp, int[][] output, int rows, int cols) 
	{		
		for(int i = 1; i < rows; i++) 
		{
			for(int j = 1; j < cols; j++) 
			{
				fp.writeToFile(i + " " + j + " " + output[i][j]);
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Initializer []";
	}
}