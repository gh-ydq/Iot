package com.qdigo.iotsdk.dto;

import java.io.Serializable;

public class GPRSSubStatus implements Serializable {
	private static final long serialVersionUID = -5371736380827965009L;
	// Bit0锛氱數婧�(1鎺ラ�氾紝0鏂紑锛�
	private byte powerStatus;
	//鐢甸棬閿佸紑鍏�  bit1
	private byte EDoorSwitchStatus;
	//Bit2锛� 鏄惁涓洪潤榛樻ā寮�
	private byte silentModeStatus;
	//Bit3锛氳摑鐗欐槸鍚﹂攣杞︼紙1甯冮槻锛�0鎾ら槻锛�
	private byte bluetoothLockStatus;
	
	
	public byte getPowerStatus() {
		return powerStatus;
	}
	public void setPowerStatus(byte powerStatus) {
		this.powerStatus = powerStatus;
	}
	public byte getEDoorSwitchStatus() {
		return EDoorSwitchStatus;
	}
	public void setEDoorSwitchStatus(byte eDoorSwitchStatus) {
		EDoorSwitchStatus = eDoorSwitchStatus;
	}
	public byte getSilentModeStatus() {
		return silentModeStatus;
	}
	public void setSilentModeStatus(byte silentModeStatus) {
		this.silentModeStatus = silentModeStatus;
	}
	public byte getBluetoothLockStatus() {
		return bluetoothLockStatus;
	}
	public void setBluetoothLockStatus(byte bluetoothLockStatus) {
		this.bluetoothLockStatus = bluetoothLockStatus;
	}
	@Override
	public String toString() {
		return "GPRSSubStatus [powerStatus=" + powerStatus + ", EDoorSwitchStatus=" + EDoorSwitchStatus
				+ ", silentModeStatus=" + silentModeStatus + ", bluetoothLockStatus=" + bluetoothLockStatus + "]";
	}
	
	
}