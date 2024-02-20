import java.io.*;
import java.net.*;

class server
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Server of Marvellous Chat Messenger is running..");

        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is in the Listening mode at port no. 2100");

        Socket sobj = ssobj.accept();
        System.out.println("Client and Server connection is successfull");

        PrintStream ps = new PrintStream(sobj.getOutputStream());

        BufferedReader break1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader break2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Marvellous Chat Messenger Started");

        String string1,string2;

        while ((string1 = break1.readLine())!= null)
        {
            System.out.println("Client says : "+string1);
            System.out.println("Enter message for client : ");

            string2 = break2.readLine();
            ps.println(string2);
        }
        System.out.println("Thankyou for using Chat Message..");
        ssobj.close();
        sobj.close();
        ps.close();
        break1.close();
        break2.close();
    }
}