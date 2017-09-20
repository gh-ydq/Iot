package com.qdigo.iotsdk;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Properties;

import com.qdigo.iotsdk.util.PropertyUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Connection {
	private final static String filePath = "config.properties";
	private final static String ipKey = "ip";
	private final static String portKey = "port";
	private static String DOMAIN_NAME = "192.168.2.221";
	private static Logger logger = LoggerFactory.getLogger(Connection.class);
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
			System.out.println("start connection");
			Properties properties = PropertyUtil.load(filePath);
			System.out.println("ip:"+properties.getProperty(ipKey)+",port:"+properties.getProperty(portKey));
			m_sock = new Socket(properties.getProperty(ipKey), Integer.valueOf(properties.getProperty(portKey)));
//			m_sock = new Socket(DOMAIN_NAME, PORT);
			m_sock.setSoTimeout(TIME_OUT);
		} catch (UnknownHostException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			logger.error("创建socket连接异常",e);
		}

	}
	
	private Connection(String ip,int port) {
		try {
			m_sock = new Socket(ip, port);
			m_sock.setSoTimeout(TIME_OUT);
		} catch (UnknownHostException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Deprecated
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
	
	public static Connection getInstance(String ip,int port) {

		if(isServerClose(m_sock))
		{
			m_conn = new Connection(ip,port);
		}
		
		if (m_conn == null) {
			m_conn = new Connection(ip,port);
		}
		
		return m_conn;
	}
	
	/**
	* 锟叫讹拷锟角凤拷峡锟斤拷锟斤拷樱锟斤拷峡锟斤拷锟斤拷锟絫rue,没锟叫凤拷锟斤拷false
	* @param socket
	* @return
	*/ 
	public static Boolean isServerClose(Socket socket){ 
	   try{ 
	    socket.sendUrgentData(0xFF);//锟斤拷锟斤拷1锟斤拷锟街节的斤拷锟斤拷锟斤拷锟捷ｏ拷默锟斤拷锟斤拷锟斤拷拢锟斤拷锟斤拷锟斤拷锟斤拷锟矫伙拷锌锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷荽锟斤拷锟斤拷锟接帮拷锟斤拷锟斤拷锟酵拷锟� 
	    return false; 
	   }catch(Exception se){
		logger.error("判断socket连接是否关闭异常",se);
	    return true; 
	   } 
	}  
	
	protected void destroy() {
		
		try {
			m_sock.close();
		} catch (IOException e) {
		  logger.error("销毁socket连接是异常",e);
		}
	}
	
	public boolean sendCmd(byte[] cmd) {
		
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
			
		} catch (Exception e) {
			logger.error("发送socket连接命令是异常",e);
			return false;
		}
	}
	
	/**
	 * 锟斤拷锟斤拷目锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟絀P锟斤拷址
	 */
	public void setDOMAIN_NAME(String domain_name){
		 if (domain_name != null && domain_name != ""){
			 DOMAIN_NAME = domain_name;
		 }
	}
	

	/**
	 * 锟斤拷锟斤拷目锟斤拷锟斤拷锟斤拷锟斤拷丝冢锟侥拷锟轿�8088锟剿匡拷
	 */
	public void setPORT(int port){
		 if (port >0){
			 PORT = port;
		 }
	}

	/**
	 * 锟斤拷锟矫筹拷时时锟戒，默锟斤拷为5锟斤拷
	 */
	public void setTIME_OUT(int time_out){
		 if (time_out >0){
			 TIME_OUT = time_out;
		 }
	}
}

