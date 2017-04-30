package main.java.com.qdigo.iotsdk;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connection {
	
	private static String DOMAIN_NAME = "192.168.2.149";
	private static int PORT = 8088;
	
	private static int TIME_OUT = 5000;
	private static final int RETRY_TIMES = 5;
	
	private static Connection m_conn = null;
	private static Socket m_sock = null;
	
	
	/**
	 * default constructor.
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	private Connection() {
		try {
			m_sock = new Socket(DOMAIN_NAME, PORT);
			m_sock.setSoTimeout(TIME_OUT);
		} catch (UnknownHostException ex) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static Connection getInstance() {

		if(isServerClose(m_sock))
		{
			m_conn = new Connection();
		}
		
		if (m_conn == null) {
			m_conn = new Connection();
		}
		
		return m_conn;
	}
	
	/**
	* �ж��Ƿ�Ͽ����ӣ��Ͽ�����true,û�з���false
	* @param socket
	* @return
	*/ 
	public static Boolean isServerClose(Socket socket){ 
	   try{ 
	    socket.sendUrgentData(0xFF);//����1���ֽڵĽ������ݣ�Ĭ������£���������û�п����������ݴ�����Ӱ������ͨ�� 
	    return false; 
	   }catch(Exception se){ 
	    return true; 
	   } 
	}  
	
	protected void destroy() {
		
		try {
			m_sock.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean SendCmd(byte[] cmd) {
		
		try {
			OutputStream os = m_sock.getOutputStream();
			os.write(cmd);
//			InputStream is = m_sock.getInputStream();
//			byte[] resultArr = new byte[1];
//			if(is.read(resultArr) != -1) {
//				
//			};
			
//			int result =(int) resultArr[0];
			int result = 0;
			
			if(result==0){
				return true;
			}
			else
			{
				return false;
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * ����Ŀ�����������������IP��ַ
	 */
	public void SetDOMAIN_NAME(String domain_name){
		 if (domain_name != null && domain_name != ""){
			 DOMAIN_NAME = domain_name;
		 }
	}
	

	/**
	 * ����Ŀ��������˿ڣ�Ĭ��Ϊ8088�˿�
	 */
	public void SetPORT(int port){
		 if (port >0){
			 PORT = port;
		 }
	}

	/**
	 * ���ó�ʱʱ�䣬Ĭ��Ϊ5��
	 */
	public void SetTIME_OUT(int time_out){
		 if (time_out >0){
			 TIME_OUT = time_out;
		 }
	}
}
