package com.qdigo.iotsdk.util;
/**
 * 鍩烘湰鏁版嵁绫诲瀷杞瓧鑺傛暟缁�
 * @author yudengqiu
 *
 */
public class NumberToByteArray {
	/**  
	    * 灏唅nt鏁板�艰浆鎹负鍗犲洓涓瓧鑺傜殑byte鏁扮粍锛屾湰鏂规硶閫傜敤浜�(浣庝綅鍦ㄥ墠锛岄珮浣嶅湪鍚�)鐨勯『搴忋�� 鍜宐ytesToInt锛堬級閰嶅浣跨敤 
	    * @param value  
	    *            瑕佽浆鎹㈢殑int鍊� 
	    * @return byte鏁扮粍 
	    */    
	public static byte[] intToBytesLow( int value )   
	{   
	    byte[] src = new byte[4];  
	    src[0] =  (byte) (value & 0xFF);     
	    src[1] =  (byte) ((value>>8) & 0xFF);
	    src[2] =  (byte) ((value>>16) & 0xFF); 
	    src[3] =  (byte) ((value>>24) & 0xFF);  
	    return src;   
	}  
	
	/**  
	    * 灏唖hort鏁板�艰浆鎹负鍗�2涓瓧鑺傜殑byte鏁扮粍锛屾湰鏂规硶閫傜敤浜�(浣庝綅鍦ㄥ墠锛岄珮浣嶅湪鍚�)鐨勯『搴忋��
	    * @param value  
	    *            瑕佽浆鎹㈢殑short鍊� 
	    * @return byte鏁扮粍 
	    */    
	public static byte[] shortToBytesLow( int value )   
	{   
	    byte[] src = new byte[2];  
	    src[0] =  (byte) (value & 0xFF);     
	    src[1] =  (byte) ((value>>8) & 0xFF);
	    return src;   
	}
	
	
	
	
	
	
	
	/**  
	    * 灏哃ong鏁板�艰浆鎹负鍗�8涓瓧鑺傜殑byte鏁扮粍锛屾湰鏂规硶閫傜敤浜�(楂樹綅鍦ㄥ墠锛屼綆浣嶅湪鍚�)鐨勯『搴忋�� 
	    */    
	public static byte[] longToBytesHight(long value)   
	{   
	    byte[] src = new byte[8];
	    for(int i=0;i<8;i++){
	    	src[i] = (byte)((value>>(8*(7-i))) & 0xFF); 
	    }
	    return src;  
	}  
	
	 /**  
	    * 灏唅nt鏁板�艰浆鎹负鍗犲洓涓瓧鑺傜殑byte鏁扮粍锛屾湰鏂规硶閫傜敤浜�(楂樹綅鍦ㄥ墠锛屼綆浣嶅湪鍚�)鐨勯『搴忋��  鍜宐ytesToInt2锛堬級閰嶅浣跨敤 
	    */    
	public static byte[] intToBytesHight(int value)   
	{   
	    byte[] src = new byte[4];  
	    src[0] = (byte) ((value>>24) & 0xFF);  
	    src[1] = (byte) ((value>>16)& 0xFF);  
	    src[2] = (byte) ((value>>8)&0xFF);    
	    src[3] = (byte) (value & 0xFF);       
	    return src;  
	}  
	
	/**  
	    * 灏唖hort鏁板�艰浆鎹负鍗�2涓瓧鑺傜殑byte鏁扮粍锛屾湰鏂规硶閫傜敤浜�(浣庝綅鍦ㄥ墠锛岄珮浣嶅湪鍚�)鐨勯『搴忋��
	    * @param value  
	    *            瑕佽浆鎹㈢殑short鍊� 
	    * @return byte鏁扮粍 
	    */    
	public static byte[] shortToBytesHight( int value )   
	{   
	    byte[] src = new byte[2];  
	    src[0] =  (byte) (value>>8 & 0xFF);     
	    src[1] =  (byte) ((value) & 0xFF);
	    return src;   
	}
	
	public static byte byteToChar(char c) {
        byte b = (byte) c;
        return b;
    }
}
