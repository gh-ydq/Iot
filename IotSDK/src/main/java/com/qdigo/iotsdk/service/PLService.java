package main.java.com.qdigo.iotsdk.service;

import main.java.com.qdigo.iotsdk.dto.pl.PLPacketDto;
import main.java.com.qdigo.iotsdk.util.NumberToByteArray;

public class PLService {
	public static byte[] buildPLDataAray(PLPacketDto plPacketDto){
		byte[] bytes = new byte[21];
		byte header0 = (byte)plPacketDto.getHeader0();
		byte header1 = (byte)plPacketDto.getHeader1();
		
		byte[] imei = NumberToByteArray.intToBytesHight(plPacketDto.getImei());
		
		byte[] lac = NumberToByteArray.intToBytesHight(plPacketDto.getLac());
		byte[] cellid = NumberToByteArray.intToBytesHight(plPacketDto.getCellid());
		byte[] signal = NumberToByteArray.shortToBytesHight(plPacketDto.getSignal());
		byte[] time = NumberToByteArray.intToBytesHight(plPacketDto.getTime());
		
		
		bytes[0] = header0;
		bytes[1] = header1;
		
		System.arraycopy(imei, 0, bytes, 2, 4);
		System.arraycopy(lac, 0, bytes, 6, 4);
		System.arraycopy(cellid, 0, bytes, 10, 4);
		
		System.arraycopy(signal, 0, bytes, 14, 2);
		
		bytes[16] = plPacketDto.getStatus();
		
		System.arraycopy(time, 0, bytes, 17, 4);
		for(int i=0;i<bytes.length;i++){
			System.out.println(bytes[i]);	
		}
		return bytes;
	}
}
