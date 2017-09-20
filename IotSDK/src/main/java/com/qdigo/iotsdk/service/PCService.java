package com.qdigo.iotsdk.service;
import com.qdigo.iotsdk.util.NumberToByteArray;

import com.qdigo.iotsdk.dto.pc.PCPacketDto;

public class PCService {
	public static byte[] buildPCDataAray(PCPacketDto pcPacketDto){
		byte[] bytes = new byte[23];
		byte header0 = (byte)pcPacketDto.getHeader0();
		byte header1 = (byte)pcPacketDto.getHeader1();
		
		byte[] imei = NumberToByteArray.intToBytesHight(pcPacketDto.getImei());
		
		byte[] param = pcPacketDto.getParam().getBytes();
		
		bytes[0] = header0;
		bytes[1] = header1;
		System.arraycopy(imei, 0, bytes, 2, 4);
		bytes[6] = pcPacketDto.getSeq();
		bytes[7] = pcPacketDto.getCmd();
		System.arraycopy(param, 0, bytes, 8, param.length);
		for(int i=0;i<bytes.length;i++){
			System.out.println(bytes[i]);	
		}
		return bytes;
	}
}
