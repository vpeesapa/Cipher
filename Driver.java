/*
 * Driver program that runs Cypher
 * Written by: Varun Peesapati
 */
import java.util.*;
public class Driver
{
	public static void main(String[] args)
	{
		Cypher cypher = new Cypher();
		cypher.getInput();
		String encryptedBuffer = cypher.encrypt();
		System.out.println("Encrypted String: "  + encryptedBuffer);
	}
}