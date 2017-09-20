package com.qdigo.iotsdk.dto.pg;

import com.qdigo.iotsdk.dto.DatagramPacketBasicDto;

/**
 * PG 锟斤拷锟斤拷应锟侥诧拷锟斤拷
 * @author yudengqiu
 *
 */
public class PGPacketDto extends DatagramPacketBasicDto  {

	private static final long serialVersionUID = -8597161566517930453L;
	//鏁版嵁鍖呭瓧鑺傛暟
	private int length;
	// 缁忓害
	private int lng;
	// 绾害
	private int lat;
	// 娴锋嫈楂樺害
	private short hight;
	// 閫熷害锛�*100锛� 鍙栨暣
	private short speed;
	//璁惧鐘舵��
	private byte status;
	// 鍗槦鏁扮洰
	private byte star;
	//UnixTime 鏃堕棿锛�0鏃跺尯锛屽叿浣撴椂鍖虹敱搴旂敤灞傝绠�
	private int time;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLng() {
		return lng;
	}
	public void setLng(int lng) {
		this.lng = lng;
	}
	public int getLat() {
		return lat;
	}
	public void setLat(int lat) {
		this.lat = lat;
	}
	public short getHight() {
		return hight;
	}
	public void setHight(short hight) {
		this.hight = hight;
	}
	public short getSpeed() {
		return speed;
	}
	public void setSpeed(short speed) {
		this.speed = speed;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public byte getStar() {
		return star;
	}
	public void setStar(byte star) {
		this.star = star;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
	
	
	
}
