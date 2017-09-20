package com.qdigo.iotsdk.api;

import com.qdigo.iotsdk.dto.pg.PGPacketDto;
import com.qdigo.iotsdk.dto.ph.PHPacketDto;
import com.qdigo.iotsdk.dto.pl.PLPacketDto;

import com.qdigo.iotsdk.dto.pc.PCPacketDto;

public interface CmdService {
	// PG鍖呭懡浠�
	void sendPGData(PGPacketDto pgPacketDto);
	// PL鍖呭懡浠�
	void sendPLData(PLPacketDto plPacketDto);
	// PH鍖呭懡浠�
	void sendPHData(PHPacketDto phPacketDto);
	// PC鍖呭懡浠�
	void sendPCData(PCPacketDto pcPacketDto);
}
