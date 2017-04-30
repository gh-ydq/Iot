package main.java.com.qdigo.iotsdk.impl;


import main.java.com.qdigo.iotsdk.Connection;
import main.java.com.qdigo.iotsdk.api.CmdService;
import main.java.com.qdigo.iotsdk.dto.pc.PCPacketDto;
import main.java.com.qdigo.iotsdk.dto.pg.PGPacketDto;
import main.java.com.qdigo.iotsdk.dto.ph.PHPacketDto;
import main.java.com.qdigo.iotsdk.dto.pl.PLPacketDto;
import main.java.com.qdigo.iotsdk.service.PCService;
import main.java.com.qdigo.iotsdk.service.PGService;
import main.java.com.qdigo.iotsdk.service.PHService;
import main.java.com.qdigo.iotsdk.service.PLService;

public class CmdServiceImpl implements CmdService {

	public void sendPGData(PGPacketDto pgPacketDto) {
		
		byte[] bytes = PGService.buildPGDataAray(pgPacketDto);
		Connection.getInstance().SendCmd(bytes);
	}
	
	public void sendPLData(PLPacketDto plPacketDto) {
		byte[] bytes = PLService.buildPLDataAray(plPacketDto);
		Connection.getInstance().SendCmd(bytes);
		
	}

	public void sendPHData(PHPacketDto phPacketDto) {
		byte[] bytes = PHService.buildPHDataAray(phPacketDto);
		Connection.getInstance().SendCmd(bytes);
		
	}

	public void sendPCData(PCPacketDto pcPacketDto) {
		byte[] bytes = PCService.buildPCDataAray(pcPacketDto);
		Connection.getInstance().SendCmd(bytes);
		
	}
	
	

	

}
