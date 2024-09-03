package FileHandling;

import java.io.*;

import org.apache.commons.io.FileUtils;

public class TextFileRead {
	
	String filepath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJava8AMJuly\\Input\\Sample.txt";
	String Writefilepath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJava8AMJuly\\Input\\output.txt";
	
	public void ReadData() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FS = new FileInputStream(F);
		int i;
		while((i=FS.read())!=-1)
		{
		System.out.print((char)i);
		}
	}

	public void ReadDatawithFileReader() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		
		FileReader FS = new FileReader(F);
		int i;
		while((i=FS.read())!=-1)
		{
		System.out.print((char)i);
		Thread.sleep(1000);
		}
	}
	
	public void ReadDatawithBufferedReader() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		//FileInputStream FS = new FileInputStream(F);
		FileReader FS = new FileReader(F);
		BufferedReader Bs = new BufferedReader(FS);
		String i;
		while((i=Bs.readLine())!=null)
		{
		System.out.println(i);
		Thread.sleep(1000);
		}
	}
	
	
	public void FileWrite() throws IOException
	{
		String name = "Sathish Kumar";
		File FO = new File(Writefilepath);
		FileOutputStream FS = new FileOutputStream(FO);
		FS.write(name.getBytes());
		FS.close();
		System.out.println("Done");
	}
	
	public void FileWritewithWriter() throws IOException
	{
		String name = "Sathish Kumar";
		File FO = new File(Writefilepath);
		FileWriter FS = new FileWriter(FO);
		FS.write(name);
		FS.close();
		System.out.println("Done");
	}
	
	public void ReadandWrite() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		//FileInputStream FS = new FileInputStream(F);
		FileReader FS = new FileReader(F);
		BufferedReader Bs = new BufferedReader(FS);
		File FO = new File(Writefilepath);
		FileWriter FW = new FileWriter(FO);
		String i;
		while((i=Bs.readLine())!=null)
		{
			FW.write(i);
			FW.write("\n");
		}
		
		FW.close();
		FS.close();
		System.out.println("done");
	}
	
	public void CopyandPaste() throws IOException, InterruptedException
	{
		File SourceFile = new File(filepath);
		File DestinationFile = new File(Writefilepath);
		//DestinationFile.createNewFile();
		FileUtils.copyFile(SourceFile, DestinationFile);
		System.out.println("done");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		TextFileRead T = new TextFileRead();
		T.CopyandPaste();
	}

}
