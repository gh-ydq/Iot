package main.java.com.qdigo.iotsdk.dto.pg;

import main.java.com.qdigo.iotsdk.dto.DatagramPacketBasicDto;
import main.java.com.qdigo.iotsdk.dto.GPRSSubStatus;

/**
 * PG ����Ӧ�Ĳ���
 * @author yudengqiu
 *
 */
public class PGPacketDto extends DatagramPacketBasicDto  {

	private static final long serialVersionUID = -8597161566517930453L;
	//数据包字节数
	private int length;
	// 经度
	private int lng;
	// 纬度
	private int lat;
	// 海拔高度
	private short hight;
	// 速度（*100） 取整
	private short speed;
	//设备状态
	private byte status;
	// 卫星数目
	private byte star;
	//UnixTime 时间，0时区，具体时区由应用层计算
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
