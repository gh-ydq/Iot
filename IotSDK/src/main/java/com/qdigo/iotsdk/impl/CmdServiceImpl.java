package com.qdigo.iotsdk.impl;

import com.qdigo.iotsdk.Connection;
import com.qdigo.iotsdk.api.CmdService;
import com.qdigo.iotsdk.dto.pg.PGPacketDto;
import com.qdigo.iotsdk.dto.ph.PHPacketDto;
import com.qdigo.iotsdk.dto.pl.PLPacketDto;
import com.qdigo.iotsdk.service.PCService;
import com.qdigo.iotsdk.service.PGService;
import com.qdigo.iotsdk.service.PHService;
import com.qdigo.iotsdk.service.PLService;

import com.qdigo.iotsdk.dto.pc.PCPacketDto;

public class CmdServiceImpl implements CmdService {

	public void sendPGData(PGPacketDto pgPacketDto) {
		
		byte[] bytes = PGService.buildPGDataAray(pgPacketDto);
		Connection.getInstance(pgPacketDto.getIp(),pgPacketDto.getPort()).sendCmd(bytes);
	}
	
	public void sendPLData(PLPacketDto plPacketDto) {
		byte[] bytes = PLService.buildPLDataAray(plPacketDto);
		Connection.getInstance(plPacketDto.getIp(),plPacketDto.getPort()).sendCmd(bytes);
		
	}

	public void sendPHData(PHPacketDto phPacketDto) {
		byte[] bytes = PHService.buildPHDataAray(phPacketDto);
		Connection.getInstance(phPacketDto.getIp(),phPacketDto.getPort()).sendCmd(bytes);
		
	}

	public void sendPCData(PCPacketDto pcPacketDto) {
		byte[] bytes = PCService.buildPCDataAray(pcPacketDto);
		Connection.getInstance(pcPacketDto.getIp(),pcPacketDto.getPort()).sendCmd(bytes);
		
	}
	
	

	

}
