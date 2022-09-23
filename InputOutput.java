package test;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutput {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fout=new FileOutputStream("C:\\Users\\ALTAF ALI\\Desktop\\Chetan Bhagat.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			dout.writeInt(45);
			dout.writeChar('A');
			dout.flush();
			dout.close();
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			FileInputStream fi =new FileInputStream("C:\\Users\\ALTAF ALI\\Desktop\\Chetan Bhagat.txt");
			DataInputStream di = new DataInputStream(fi);
			int count=di.available();
			byte[] b=new byte[count];
			di.read(b);
			for(byte bT:b)
			{
				System.out.println((char)bT);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
