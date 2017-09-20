package com.qdigo.iotsdk.constant;

public enum CmdEnum {
	CMD_START((char)3,(char)1,"1","点火"),
	CMD_STOP((char)3,(char)2,"0","熄火"),
	;	
	
	
	private char cmd;
	private char seq;
	private String param;
	private String dec;
	
	private CmdEnum(char cmd,char seq,String param,String dec){
		this.cmd = cmd;
		this.seq = seq;
		this.param = param;
		this.dec = dec;
	}

	public char getCmd() {
		return cmd;
	}

	public void setCmd(char cmd) {
		this.cmd = cmd;
	}

	public char getSeq() {
		return seq;
	}

	public void setSeq(char seq) {
		this.seq = seq;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getDec() {
		return dec;
	}

	public void setDec(String dec) {
		this.dec = dec;
	}

	

	
	
	
}
