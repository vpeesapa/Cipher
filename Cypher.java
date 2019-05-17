/*
 * Program that encrypts a given string buffer based on the offset
 * Written by: Varun Peesapati
 */
import java.util.*;
public class Cypher
{
	private String buffer;
	private int offset;

	/*
	 * Default constructor
	 */
	Cypher()
	{
		buffer = "";
		offset = 0;
	}

	/*
	 * Function that gets the input from the user
	 *
	 * Returns the encrypted string
	 */
	public String encrypt()
	{
		String encryptedBuffer; //stores the buffer after encrytion

	}

	/*
	 * Function that gets the input from the user
	 *
	 * Returns no value as it has 'void' as its return type
	 */
	public void getInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string that has to be encrypted: ");
		buffer = scanner.nextLine();
		System.out.print("Enter the offset by which the string needs to be encrypted by: ");
		offset = scanner.nextInt();
	}
}