import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import Frames.*;


public class useracc
{
	private String username;
	private String userpass;
	
	File file;
	FileWriter fwrite;
	
	Scanner sc;
	
	public useracc()
	{
		this.username="";
	}
	
	public Account(String username,String userpass)//username=s1,userpass=s2
	{
		this.username=username;
		this.userpass=userpass;
	}
	
	public void setUserName(String username)
	{
		this.username=username;
	}
	
	public void setUserpass(String userpass)
	{
		this.userpass=userpass;
	}
	
	public String getUserName()
	{
		return username;
	}
	
	public String getUserpass()
	{
		return userpass;
	}
	
	public void addAccount()
	{
		
		
		try
		{
			file=new File("./userdata.txt");
			file.createNewFile();
			
			fwrite=new FileWriter(file,true);
			
			fwrite.write(getUserName()+"\t");
			fwrite.write(getUserpass()+"\n");
			
			fwrite.flush();
			fwrite.close();
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public boolean checkAccount(String username,String userpass)
	{
		boolean flag=false;
		file=new File(".\Datas\Data.txt");
		try
		{
			
			
			sc=new Scanner(file);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("\t");
				if(value[0].equals(username)&&value[1].equals(userpass))
				{
					flag=true;
				}
			}
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return flag;
	}
	
}