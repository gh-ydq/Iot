package com.qdigo.iotsdk;

import com.qdigo.iotsdk.dto.pg.PGPacketDto;
import com.qdigo.iotsdk.impl.CmdServiceImpl;

public class Test {
	private static CmdServiceImpl impl = new CmdServiceImpl(); 
	public static void main(String[] args) {
		testPGData();
	}
	
	public static void  testPGData(){
		PGPacketDto pgPacketDto = buildPGPacketDto();
		impl.sendPGData(pgPacketDto);
	}
	
	private static PGPacketDto buildPGPacketDto(){
		PGPacketDto pgPacketDto = new PGPacketDto();
		pgPacketDto.setHeader0('P');
		pgPacketDto.setHeader1('G');
		pgPacketDto.setIp("192.168.2.198");
		pgPacketDto.setPort(9001);
		pgPacketDto.setImei(1234);
		pgPacketDto.setLat(123);
		pgPacketDto.setLng(123);
		pgPacketDto.setSpeed((short)12);
		pgPacketDto.setHight((short)12);
		pgPacketDto.setStar((byte)1);
		pgPacketDto.setStatus((byte)2);
		pgPacketDto.setTime(1234);
		
		return pgPacketDto;
	}
}
