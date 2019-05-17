/*
 * Program that encrypts a given string buffer based on the offset
 * Written by: Varun Peesapati
 */
import java.util.*;
import java.lang.*;
public class Cipher
{
	private String buffer;
	private int offset;

	/*
	 * Default constructor
	 */
	Cipher()
	{
		buffer = "";
		offset = 0;
	}

	/*
	 * Function that returns the difference between 'Z' and another upper case character
	 */
	public int getDiffUpper(char character)
	{
		return 'Z' - character;
	}

	/*
	 * Function that returns the difference between 'z' and another lower case character
	 */
	public int getDiffLower(char character)
	{
		return 'z' - character;
	}

	/*
	 * Function that adjusts the character if the difference is smaller than the offset
	 *
	 * Returns the adjusted character
	 */
	public char adjustCharacter(char character,int diff)
	{
		char adjustedCharacter = character;
		if(Character.isUpperCase(character)) {
			adjustedCharacter = 'A';
		} else if(Character.isLowerCase(character)) {
			adjustedCharacter = 'a';
		}
		diff = offset - diff - 1;
		adjustedCharacter = (char)(adjustedCharacter + diff);
		return adjustedCharacter;
	}

	/*
	 * Function that gets the input from the user
	 *
	 * Returns the encrypted string
	 */
	public String encrypt()
	{
		String encryptedBuffer = new String(); //stores the buffer after encrytion
		int diff = 0;
		if(offset > 26) {
			offset = offset - 26;
		}
		/* For each character in the buffer */
		for(char character : buffer.toCharArray()) {
			if(Character.isUpperCase(character)) {
				diff = getDiffUpper(character);
			} else if(Character.isLowerCase(character)) {
				diff = getDiffLower(character);
			}
			if(diff >= offset) {
				/* If the new character is less than 'Z' or 'z' */
				encryptedBuffer += (char)(character + offset);
			} else {
				/* If the new character is greater than 'Z' or 'z', need to start at 'a' or 'A' */
				char adjustedCharacter = adjustCharacter(character,diff);
				encryptedBuffer += adjustedCharacter;
			}
			if(character == ' ') {
				/* Leave spaces as it is, so replace the last character with ' ' */
				encryptedBuffer = encryptedBuffer.substring(0,encryptedBuffer.length() - 1) + character;
			}
		}
		return encryptedBuffer;
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
