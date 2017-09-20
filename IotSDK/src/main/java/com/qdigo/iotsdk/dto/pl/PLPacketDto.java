package com.qdigo.iotsdk.dto.pl;

import com.qdigo.iotsdk.dto.DatagramPacketBasicDto;
import com.qdigo.iotsdk.dto.GPRSSubStatus;

/**
 * PL 锟斤拷锟斤拷应锟侥诧拷锟斤拷
 * @author yudengqiu
 *
 */
public class PLPacketDto extends DatagramPacketBasicDto  {

	private static final long serialVersionUID = 2152662457803329906L;
	//鏁版嵁鍖呭瓧鑺傛暟
	private int length;
	//浣嶇疆鍖哄煙鐮�
	private int lac;
	//鍩虹珯灏忓尯缂栧彿
	private int cellid;
	// 淇″彿寮哄害
	private short signal;
	//璁惧鐘舵��
	private byte status;
	//Unixtimestamp
	private int time;
	
	private GPRSSubStatus plSubStatus;
	
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLac() {
		return lac;
	}
	public void setLac(int lac) {
		this.lac = lac;
	}
	public int getCellid() {
		return cellid;
	}
	public void setCellid(int cellid) {
		this.cellid = cellid;
	}
	public short getSignal() {
		return signal;
	}
	public void setSignal(short signal) {
		this.signal = signal;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public GPRSSubStatus getPlSubStatus() {
		return plSubStatus;
	}
	public void setPlSubStatus(GPRSSubStatus plSubStatus) {
		this.plSubStatus = plSubStatus;
	}
	
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "PLPacketDto [length=" + length + ", getHeader1()=" + getHeader1() + ", getImei()=" + getImei()+ ", lac=" + lac + ", cellid=" + cellid + ", signal=" + signal
				+ ", status=" + status + ", pgSubStatus=" + plSubStatus.toString() + ", getHeader0()=" + getHeader0()
				 + "]";
	}
	
	
	
}
