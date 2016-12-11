package servidor;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		try {
			
			System.out.println("######################");
			System.out.println("# INICIANDO SERVIDOR #");
			System.out.println("######################");

			ServerSocket ss = new ServerSocket(9997);
			Socket s = ss.accept();
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF("Hola desde el servidor");

			out.close();
			s.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
