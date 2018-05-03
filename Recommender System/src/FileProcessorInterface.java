package src;

/**
 * @author Abhishek Dinkar Raut
 * 
 * interface assosciated with file operations
 */
public interface FileProcessorInterface 
{	
	/**
	 * Reads a line from the input file
	 * @return 
	 */
	public String readFromFile();
	
	/**
	 * Writes a line to the output file
	 * @param lineIn
	 */
	public void writeToFile(String lineIn);
	
	/**
	 * Closes open files if any
	 */
	public void closeFile();
}
