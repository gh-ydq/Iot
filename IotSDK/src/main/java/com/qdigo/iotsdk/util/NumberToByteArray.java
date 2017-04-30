package main.java.com.qdigo.iotsdk.util;
/**
 * 基本数据类型转字节数组
 * @author yudengqiu
 *
 */
public class NumberToByteArray {
	/**  
	    * 将int数值转换为占四个字节的byte数组，本方法适用于(低位在前，高位在后)的顺序。 和bytesToInt（）配套使用 
	    * @param value  
	    *            要转换的int值 
	    * @return byte数组 
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
	    * 将short数值转换为占2个字节的byte数组，本方法适用于(低位在前，高位在后)的顺序。
	    * @param value  
	    *            要转换的short值 
	    * @return byte数组 
	    */    
	public static byte[] shortToBytesLow( int value )   
	{   
	    byte[] src = new byte[2];  
	    src[0] =  (byte) (value & 0xFF);     
	    src[1] =  (byte) ((value>>8) & 0xFF);
	    return src;   
	}
	
	
	
	
	
	
	
	/**  
	    * 将Long数值转换为占8个字节的byte数组，本方法适用于(高位在前，低位在后)的顺序。 
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
	    * 将int数值转换为占四个字节的byte数组，本方法适用于(高位在前，低位在后)的顺序。  和bytesToInt2（）配套使用 
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
	    * 将short数值转换为占2个字节的byte数组，本方法适用于(低位在前，高位在后)的顺序。
	    * @param value  
	    *            要转换的short值 
	    * @return byte数组 
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
