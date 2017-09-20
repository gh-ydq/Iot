package com.qdigo.iotsdk.dto.px;

import com.qdigo.iotsdk.dto.DatagramPacketBasicDto;
import com.qdigo.iotsdk.dto.GPRSSubStatus;

/**
 * PX 锟斤拷锟斤拷应锟侥诧拷锟斤拷
 * @author yudengqiu
 *
 */
public class PXPacketDto extends DatagramPacketBasicDto  {

	private static final long serialVersionUID = -8597161566517930453L;
	//鏁版嵁鍖呭瓧鑺傛暟
	private int length;
	// 缁忓害
	private float lng;
	// 绾害
	private float lat;
	// 娴锋嫈楂樺害
	private short hight;
	// 閫熷害锛�*100锛� 鍙栨暣
	private float speed;
	//璁惧鐘舵��
	private byte status;
	// 鍗槦鏁扮洰
	private byte star;
	//UnixTime 鏃堕棿锛�0鏃跺尯锛屽叿浣撴椂鍖虹敱搴旂敤灞傝绠�
	private int time;
	
	private GPRSSubStatus pxSubStatus;
	
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getLng() {
		return lng;
	}
	public void setLng(float lng) {
		this.lng = lng;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public short getHight() {
		return hight;
	}
	public void setHight(short hight) {
		this.hight = hight;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
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
	public GPRSSubStatus getPxSubStatus() {
		return pxSubStatus;
	}
	public void setPgSubStatus(GPRSSubStatus pxSubStatus) {
		this.pxSubStatus = pxSubStatus;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "PGPacketDto [length=" + length +", getHeader1()=" + getHeader1() + ", getImei()=" + getImei()+ ", lng=" + lng + ", lat=" + lat + ", hight=" + hight + ", speed="
				+ speed + ", status=" + status + ", star=" + star + ", time=" + time+ ", pgSubStatus=" + pxSubStatus.toString() + "]";
	}
	
	
	
}
