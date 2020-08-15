import java.net.InetAddress;

class GetMyIPAddress
{
   public static void main(String args[]) throws Exception
   {
      InetAddress myIP=InetAddress.getLocalHost();
      System.out.println("Java is successfully installed in " + myIP.getHostAddress()+ " (" + myIP.getHostName()+")");
  }
}
