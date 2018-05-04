package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Abhishek Dinkar Raut
 * 
 * associated with file operations
 * 
 */
public class FileProcessor implements FileProcessorInterface 
{
	private BufferedReader br;
	private BufferedWriter bw;
	
	/**
	 * Constructor of the File Processor class
	 */
	public FileProcessor(String inputFileIn, String outputFileIn) 
	{
		// try-catch-finally blocks for file operations exception handling
		try 
		{
			br = new BufferedReader(new FileReader(inputFileIn));
			bw =new BufferedWriter(new FileWriter(outputFileIn));
		}
		catch (FileNotFoundException e) 
		{
			System.err.println("Unable to open file '" + inputFileIn + "'");
			System.exit(1);
		}
		catch (IOException e) 
		{
			System.err.println("Unable to write to file '" + outputFileIn + "'");
			System.exit(1);
		} 
		finally 
		{
		
		}
	}
	
	/* (non-Javadoc)
	 * @see src.FileProcessorInterface#readFromFile()
	 */
	@Override
	public String readFromFile() 
	{
		String line = null;
		// try-catch-finally blocks for file reading exception handling
		try 
		{
			line = br.readLine();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.exit(1);
		} 
		finally 
		{

		}		
		return line;
	}

	/* (non-Javadoc)
	 * @see src.FileProcessorInterface#writeToFile(java.lang.String)
	 */
	@Override
	public void writeToFile(String lineIn) 
	{	
		// try-catch-finally blocks for file writing exception handling	
		try 
		{
			bw.write(lineIn);
			bw.newLine();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.exit(1);
		} 
		finally 
		{

		}
	}

	/* (non-Javadoc)
	 * @see src.FileProcessorInterface#closeFile()
	 */
	public void closeFile() 
	{
		// try-catch-finally blocks for file closing operation exception handling
		try 
		{
			if (br != null) 
			{
				br.close();
			}
			if (bw != null) 
			{
				bw.close();
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.exit(1);
		} 
		finally 
		{
			
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FileProcessor [br=" + br + ", bw=" + bw + "]";
	}
}