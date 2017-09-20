package com.qdigo.iotsdk;

import java.util.Arrays;

/**
 * downstream commands begins with P(0)C(1)
 * @author Menggang
 *
 */
public class CmdBuilder {
	
	private static long CMD_IMEI = 0;
	private static int CMD_SEQ = 0;
	private static int CMD_CMD = 0;
	private static String CMD_PARAM = "0";
	
	public static class Builder {
		
		private long imei;
		private int seq;
		private int cmd;
		private String param;
		
		public Builder imei(long val) {
			imei = val;
			return this;
		}
		
		public Builder seq(char val) {
			seq = val;
			return this;
		}
		
		public Builder cmd(int val) {
			cmd = val;
			return this;
		}
		
		public Builder param(String val) {
			param = val;
			return this;
		}
		
		public CmdBuilder build() {
			return new CmdBuilder(this);
		}
	}
	
	private CmdBuilder(Builder b) {
		CmdBuilder.CMD_IMEI = b.imei;
		CmdBuilder.CMD_SEQ = b.seq;
		CmdBuilder.CMD_CMD = b.cmd;
		CmdBuilder.CMD_PARAM = b.param;
	}
	
	public byte[] toCmd() {
		char[] param = CmdBuilder.CMD_PARAM.toCharArray();
		byte[] res = new byte[8+param.length];
		res[0] = (byte)'P';
		res[1] = (byte)'T';
		res[2] = (byte) (CmdBuilder.CMD_IMEI>>24 & 0xFF);
		res[3] = (byte) ((CmdBuilder.CMD_IMEI>>16) & 0xFF);
		res[4] = (byte) ((CmdBuilder.CMD_IMEI>>8) & 0xFF);
		res[5] = (byte) ((CmdBuilder.CMD_IMEI) & 0xFF);
		res[6] = (byte)((int)(Math.random() * 127));
		res[7] = (byte) CmdBuilder.CMD_CMD;
		
		for(int i =0;i<param.length;i++)
		{
			res[8+i] = (byte) param[i];
		}

		return res;
	}
}
