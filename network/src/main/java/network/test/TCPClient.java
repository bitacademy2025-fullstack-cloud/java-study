package network.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {
	private static final String SERVER_IP = "127.0.0.1";
	
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			// 1. Socket 생성
			socket = new Socket();
			
			// 2. 서버 연결
			socket.connect(new InetSocketAddress(SERVER_IP, TCPServer.PORT));
			
			// 3. IO Stream 가져오기
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// 4. 쓰기
			String data = "Hello World";
			os.write(data.getBytes("UTF-8"));
			
			// 5. 읽기
			byte[] buffer = new byte[256];
			int readByteCount = is.read(buffer);
			
			if(readByteCount == -1) {
				System.out.println("[client] closed by server");
				return;
			}
			
			data = new String(buffer, 0, readByteCount, "utf-8");
			System.out.println("[client] received: " + data);
			
		} catch(IOException e) {
			System.out.println("[client] error: " + e);
		} finally {
			try {
				if(socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
