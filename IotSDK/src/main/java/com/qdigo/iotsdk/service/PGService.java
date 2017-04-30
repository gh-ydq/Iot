package main.java.com.qdigo.iotsdk.service;

import main.java.com.qdigo.iotsdk.dto.pg.PGPacketDto;
import main.java.com.qdigo.iotsdk.util.NumberToByteArray;

public class PGService {
	public static byte[] buildPGDataAray(PGPacketDto pgPacketDto){
		byte[] bytes = new byte[24];
		byte header0 = (byte)pgPacketDto.getHeader0();
		byte header1 = (byte)pgPacketDto.getHeader1();
		
		byte[] imei = NumberToByteArray.intToBytesHight(pgPacketDto.getImei());
		byte[] lng = NumberToByteArray.intToBytesHight(pgPacketDto.getLng());
		byte[] lat = NumberToByteArray.intToBytesHight(pgPacketDto.getLat());
		
		byte[] hight = NumberToByteArray.shortToBytesHight(pgPacketDto.getHight());
		byte[] speed = NumberToByteArray.shortToBytesHight(pgPacketDto.getSpeed());
		
		byte[] time = NumberToByteArray.intToBytesHight(pgPacketDto.getTime());
		
		
		bytes[0] = header0;
		bytes[1] = header1;
		
		System.arraycopy(imei, 0, bytes, 2, 4);
		System.arraycopy(lng, 0, bytes, 6, 4);
		System.arraycopy(lat, 0, bytes, 10, 4);
		
		System.arraycopy(hight, 0, bytes, 14, 2);
		System.arraycopy(speed, 0, bytes, 16, 2);
		bytes[18] = pgPacketDto.getStatus();
		bytes[19] = pgPacketDto.getStar();
		
		System.arraycopy(time, 0, bytes, 20, 4);
		for(int i=0;i<bytes.length;i++){
			System.out.println(bytes[i]);	
		}
		
		return bytes;
	}
}
