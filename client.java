import java.io.*;
import java.net.*;

class client
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Client of Marvellous Chat Messenger is running..");

        Socket sobj = new Socket("LocalHost",2100);
        System.out.println("Client is waiting for Server to accept the request..");

        PrintStream ps = new PrintStream(sobj.getOutputStream());

        BufferedReader break1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader break2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Marvellous Chat Messenger Started");

        String string1;
        String string2;

        while(!(string1 =break2.readLine()).equals("end"))
        {
            ps.println(string1);
            System.out.println("Enter message for server : ");
            
            string2 = break1.readLine();
            System.out.println("Server says : "+string2);
        }
        
        System.out.println("Thankyou for using Marvellous chat messanger");
    }
}