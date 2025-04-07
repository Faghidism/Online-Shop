import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*

Farid Afrakhte
990122680092
Project OnlineShop

 */



public class Main {

    public static void main(String[] args) throws IOException {


        // call ing main frame

        new MainFrame();

        //socket client va server

        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            socket = new Socket("localhost", 1381);
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            Scanner scanner = new Scanner(System.in);

            while (true) {
                String MTS = scanner.nextLine();
                bufferedWriter.write(MTS);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                System.out.print("Server : " + bufferedReader.readLine());
                if (MTS.equalsIgnoreCase("Bye"))
                    break;

            }

        } catch(UnknownHostException e){
            throw new RuntimeException(e);
        } catch(IOException e){
            throw new RuntimeException(e);
        }

        finally{
            if(socket != null)
                socket.close();
            if(inputStreamReader != null)
                inputStreamReader.close();
            if(outputStreamWriter != null)
               outputStreamWriter.close();
            if(bufferedReader != null)
                bufferedReader.close();
            if (bufferedWriter != null)
                bufferedWriter.close();

        }

    }
}

