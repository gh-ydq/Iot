package com.qdigo.iotsdk.service;

import com.qdigo.iotsdk.dto.ph.PHPacketDto;
import com.qdigo.iotsdk.util.NumberToByteArray;

public class PHService {
	public static byte[] buildPHDataAray(PHPacketDto phPacketDto){
		byte[] bytes = new byte[23];
		byte header0 = (byte)phPacketDto.getHeader0();
		byte header1 = (byte)phPacketDto.getHeader1();
		
		byte[] imei = NumberToByteArray.intToBytesHight(phPacketDto.getImei());
		
		byte[] imsi = NumberToByteArray.longToBytesHight(phPacketDto.getImsi());
		
		
		byte[] powerVoltage = NumberToByteArray.shortToBytesHight(phPacketDto.getPowerVoltage());
		byte[] batteryVotage = NumberToByteArray.shortToBytesHight(phPacketDto.getBatteryVotage());
		
		bytes[0] = header0;
		bytes[1] = header1;
		
		System.arraycopy(imei, 0, bytes, 2, 4);
		bytes[6] = phPacketDto.getSeq();
		bytes[7] = phPacketDto.getStatus();
		System.arraycopy(imsi, 0, bytes, 8, 8);
		System.arraycopy(powerVoltage, 0, bytes, 16, 2);
		
		System.arraycopy(batteryVotage, 0, bytes, 18, 2);
		
		bytes[20] = phPacketDto.getSensity();
		bytes[21] = phPacketDto.getStar();
		bytes[22] = phPacketDto.getEcode();
		for(int i=0;i<bytes.length;i++){
			System.out.println(bytes[i]);	
		}
		return bytes;
	}
}
