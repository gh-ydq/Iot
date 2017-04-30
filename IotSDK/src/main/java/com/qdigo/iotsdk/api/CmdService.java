package main.java.com.qdigo.iotsdk.api;

import main.java.com.qdigo.iotsdk.dto.pc.PCPacketDto;
import main.java.com.qdigo.iotsdk.dto.pg.PGPacketDto;
import main.java.com.qdigo.iotsdk.dto.ph.PHPacketDto;
import main.java.com.qdigo.iotsdk.dto.pl.PLPacketDto;

public interface CmdService {
	// PG包命令
	void sendPGData(PGPacketDto pgPacketDto);
	// PL包命令
	void sendPLData(PLPacketDto plPacketDto);
	// PH包命令
	void sendPHData(PHPacketDto phPacketDto);
	// PC包命令
	void sendPCData(PCPacketDto pcPacketDto);
}
