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
	 * Parametrised constructor
	 * @buf: The string to encrypt/decrypt
	 * @off: The offset to encrypt/decrypt by
	 */
	Cipher(String buf,int off)
	{
		buffer = buf;
		offset = off;
	}

	/*
	 * Function that encrypts a string based on the offset
	 *
	 * Returns the encrypted string
	 */
	public String encrypt()
	{
		/* Creating two strings that contains all possible characters */
		String upperString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerString = "abcdefghijklmnopqrstuvwxyz";
		int encryptedIndex = 0;

		String encryptedBuffer = new String(); //stores the buffer after encrpytion
		/* For each character in the buffer */
		for(char character : buffer.toCharArray()) {
			if(Character.isUpperCase(character)) {
				//if the character is an upper-case character
				encryptedIndex = (character + offset - 'A') % 26;
				encryptedBuffer += upperString.charAt(encryptedIndex);
			} else if(Character.isLowerCase(character)) {
				//if the character is a lower-case character
				encryptedIndex = (character + offset - 'a') % 26;
				encryptedBuffer += lowerString.charAt(encryptedIndex);
			} else if(character == ' ') {
				encryptedBuffer += ' '; //stays the same if the character read is a space
			}
		}

		return encryptedBuffer;
	}

	/*
	 * Function that decrypts an encrypted string based on the offset
	 * @encryptedBuffer: The encrypted string that needs to be decrypted
	 *
	 * Returns the decrypted string
	 */
	public String decrypt(String encryptedBuffer)
	{
		/* Creating two strings that contains all possible characters */
		String upperString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerString = "abcdefghijklmnopqrstuvwxyz";
		int decryptedIndex = 0;

		String decryptedBuffer = new String(); //stores the buffer after decryption
		/* For each character in the buffer */
		for(char character : encryptedBuffer.toCharArray()) {
			if(Character.isUpperCase(character)) {
				//if the character is an upper-case character
				decryptedIndex = (character - offset - 'A') % 26;
				decryptedBuffer += upperString.charAt(decryptedIndex);
			} else if(Character.isLowerCase(character)) {
				//if the character is a lower-case character
				decryptedIndex = (character - offset - 'a') % 26;
				decryptedBuffer += lowerString.charAt(decryptedIndex);
			} else if(character == ' ') {
				encryptedBuffer += ' '; //stays the same if the character read is a space
			}
		}

		return decryptedBuffer;
	}

	/*
	 * Function that gets the input from the user
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