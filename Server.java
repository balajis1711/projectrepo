import java.io.*;
import java.net.*;
public class Server{
	public static void main(String[] args)throws Exception{
		ServerSocket sersock=new ServerSocket(3000);
		System.out.println("SERVER READY");
		Socket sock=sersock.accept();
		
		BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
		
		OutputStream ostream = sock.getOutputStream();
		PrintWriter pw = new PrintWriter(ostream,true);
		
		InputStream istream=sock.getInputStream();
		
		BufferedReader RecRead=new BufferedReader(new InputStreamReader(istream));
		
		String receiveMsg,SendMsg;
		
		while(true){
			if((receiveMsg=RecRead.readLine())!=null){
				System.out.println(receiveMsg);
			}
			SendMsg=keyRead.readLine();
			pw.println(SendMsg);
			pw.flush();
		}
		
	}
}