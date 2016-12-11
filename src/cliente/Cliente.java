package cliente;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) {
		try {
			
			Socket s = new Socket("127.0.0.1", 9997);
			DataInputStream in = new DataInputStream(s.getInputStream());
			String mensaje = in.readUTF();
			System.out.println(mensaje);
			in.close();
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
