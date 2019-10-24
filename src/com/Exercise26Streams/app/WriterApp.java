package com.Exercise26Streams.app;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;


public class WriterApp 
{

	public static void main(String[] args) 
	{
		//se crean los objetos
		File myFile =null;
		FileWriter myWriter =null;
		BufferedWriter myBuffer = null;
		
		try 
		{
			//se le assignan los valores a los objetos
			myFile = new File("D:\\aDocs\\docwrite.txt");
			myWriter = new FileWriter(myFile);
			myBuffer = new BufferedWriter(myWriter);
			
			//se escribe un nuevo archivo
			myBuffer.write("El Macho");
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
			
		}
		
		finally
		{
			try {
				myBuffer.close();
				myWriter=null;
				myFile =null;
				
			} 
			
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		}
		

	}

}
