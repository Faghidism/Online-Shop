import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.RemoteException;

public class Server {


    public static void main(String[] args) throws IOException {

        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        ServerSocket serverSocket =null;

        serverSocket = new ServerSocket(1381);

        while (true){
            try{

                socket = serverSocket.accept();

                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
                bufferedReader = new BufferedReader(inputStreamReader);
                bufferedWriter = new BufferedWriter(outputStreamWriter);
                while(true){
                    String MTS = bufferedReader.readLine();
                    System.out.println("Client : "+ MTS);
                    bufferedWriter.write("Msf recieved");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    if (MTS.equalsIgnoreCase("Bye"))
                        break;
                }
                socket.close();
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferedWriter.close();
                bufferedReader.close();
            }

            catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
