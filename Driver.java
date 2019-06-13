/*
 * Driver program that runs Cipher
 * Written by: Varun Peesapati
 */
import java.util.*;
public class Driver
{
	public static void main(String[] args)
	{
		Cipher cipher = new Cipher();
		cipher.getInput();
		String encryptedBuffer = cipher.encrypt();
		System.out.println("Encrypted String: " + encryptedBuffer);
		System.out.println("Decrypted String: " + cipher.decrypt(encryptedBuffer));
	}
}