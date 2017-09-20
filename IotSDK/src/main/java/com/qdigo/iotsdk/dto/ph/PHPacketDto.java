package com.qdigo.iotsdk.dto.ph;

import com.qdigo.iotsdk.dto.DatagramPacketBasicDto;

/**
 * PH 锟斤拷锟接︼拷牟锟斤拷锟�
 * @author yudengqiu
 *
 */
public class PHPacketDto extends DatagramPacketBasicDto  {

	private static final long serialVersionUID = 2152662457803329906L;
	// 鏁版嵁鍖呭瓧鑺傞暱搴�
	private int length;
	
	private byte seq;
	private byte status;
	private long imsi;
	private short powerVoltage;
	private short batteryVotage;
	private byte sensity;
	private byte star;
	private byte ecode;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public byte getSeq() {
		return seq;
	}
	public void setSeq(byte seq) {
		this.seq = seq;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public long getImsi() {
		return imsi;
	}
	public void setImsi(long imsi) {
		this.imsi = imsi;
	}
	public short getPowerVoltage() {
		return powerVoltage;
	}
	public void setPowerVoltage(short powerVoltage) {
		this.powerVoltage = powerVoltage;
	}
	public short getBatteryVotage() {
		return batteryVotage;
	}
	public void setBatteryVotage(short batteryVotage) {
		this.batteryVotage = batteryVotage;
	}
	public byte getSensity() {
		return sensity;
	}
	public void setSensity(byte sensity) {
		this.sensity = sensity;
	}
	public byte getStar() {
		return star;
	}
	public void setStar(byte star) {
		this.star = star;
	}
	public byte getEcode() {
		return ecode;
	}
	public void setEcode(byte ecode) {
		this.ecode = ecode;
	}
	
}
