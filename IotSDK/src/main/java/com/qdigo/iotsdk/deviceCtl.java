package main.java.com.qdigo.iotsdk;

import java.io.IOException;
import java.io.OutputStream;
import java.net.UnknownHostException;;

public class deviceCtl {

	static int i_seq = 0;
	

	/**
	 * 点火，用在管理员远程控制车，不是用户app启动车，不常用
	 * @param imei，9位的十进制数
	 * 对应：请求	3	SEQ	1	点火1										
	 * @return
	 */
	public boolean Ignition(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(3).param("1").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	

	/**
	 * 熄火，用在管理员远程控制车，不是用户app操作，不常用
	 * @param imei，9位的十进制数
	 * 对应：请求	3	SEQ	1	熄火0
	 * @return
	 */
	public boolean Flameout(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(3).param("0").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	

	/**
	 * 设置GPS发包频率和休眠时间PTIME时间，用在管理员远程控制车，不是用户app操作，不常用
	 * @param imei，9位的十进制数
	 * 请求	7	SEQ	PTIME	修改GPS发包频率和休眠时间PTIME (秒)
	 * pTime 单位：秒 (修改GPS发包频率和休眠时间)，如果不修改则传0
	 * @return
	 */
	public boolean SetPTIME(long imei,int pTime) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(7).param(String.valueOf(pTime)+",0").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	

	/**
	 * 设置修改关闭电门锁后休眠时间，用在管理员远程控制车，不是用户app操作，不常用
	 * @param imei，9位的十进制数
	 * 请求	7	SEQ	HTIME	修改关闭电门锁后休眠时间（HTIME 秒） 
	 * hTime 单位：秒 (修改关闭电门锁后休眠时间)，如果不修改则传0
	 * @return
	 */
	public boolean SetHTIME(long imei,int hTime) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(7).param("0," + String.valueOf(hTime)).build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
		

	/**
	 * 硬重启
	 * @param imei，9位的十进制数
	 * 对应：请求	8	SEQ	1	硬重启
	 * @return
	 */
	public boolean Reboot(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(8).param("1").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	

	/**
	 * 设置硬件灵敏度
	 * @param imei，9位的十进制数
	 * 对应：请求	12	SEQ	1	设置硬件灵敏度： bit0~bit3: 1~8,表示8级硬件灵敏度， 8灵敏度最高
	 * grade 为灵敏度值，输入范围：1-8
	 * @return
	 */
	public boolean SetSensitivity(long imei,int grade) {
		String param = String.valueOf((char) grade);
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(12).param(param).build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	

	/**
	 * 布防（上锁，锁车的意思），用户在app上点击上锁的时候调用
	 * @param imei，9位的十进制数
	 * 对应：请求	24	SEQ	1  布防
	 * @return
	 */
	public boolean Lock(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(24).param("1").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	
	/**
	 * 撤防(开锁)，用户在app上点击开锁的时候调用
	 * @param imei，9位的十进制数 
	 * 对应：请求	24	SEQ	0	撤防
	 * @return
	 */
	public boolean Unlock(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(24).param("0").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	

	/**
	 * 自动锁车设置，配置用，如果调用成功，车在断电后过几秒钟会自动上锁
	 * @param imei，9位的十进制数 
	 * 请求	27	SEQ	1	自动锁车设置：1自动
	 * @return
	 */
	public boolean AutoLockOn(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(27).param("1").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	

	/**
	 * 自动锁车设置，配置用，如果调用成功，车在断电后需要手动上锁
	 * @param imei，9位的十进制数 
	 * 请求	27	SEQ	0	自动锁车设置：0手动
	 * @return
	 */
	public boolean AutoLockOff(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(27).param("0").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}


	/**
	 * 请求立即上报心跳包参数
	 * @param imei，9位的十进制数 
	 * 对应：请求	30	SEQ	1	请求立即上报心跳包参数，设备接收到后立即发送一个心跳包
	 * @return
	 */
	public boolean ReqHearbeat(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(30).param("1").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	
	/**
	 * 寻车开始
	 * @param imei，9位的十进制数 
	 * 对应：命令	41	SEQ	1	 1 寻车开始
	 * @return
	 */
	public boolean SeekStart(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(41).param("1").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}

	/**
	 * 寻车结束
	 * @param imei，9位的十进制数 
	 * 对应：命令	41	SEQ	0	 0 寻车结束
	 * @return
	 */
	public boolean SeekEnd(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(41).param("0").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	

	/**
	 * 上电
	 * @param imei，9位的十进制数 
	 * 对应：命令	42	SEQ 1：上电										
	 * @return
	 */
	public boolean Fire(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(42).param("1").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}

	/**
	 * 断电
	 * @param imei，9位的十进制数 
	 * 对应：命令	42	SEQ 0：断电										
	 * @return
	 */
	public boolean Shutdown(long imei) {
		
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(42).param("0").build();
		
		byte[]  cmd = builder.toCmd();

		return Connection.getInstance().SendCmd(cmd);
	}
	

	/**
	 * 设置档位
	 * @param imei，9位的十进制数 
	 * @param grade，1-3的整数
	 * 对应：命令	44	SEQ		档位一字节，1-3, 值越大，速度越快（1慢,2中等，3快)									
	 * @return
	 */
	public boolean SetStall(long imei,int grade){
		
		String param = String.valueOf((char) grade);
		CmdBuilder builder = new CmdBuilder.Builder().imei(imei).seq((char)i_seq).cmd(12).param(param).build();
		
		byte[]  cmd = builder.toCmd();
		
		return Connection.getInstance().SendCmd(cmd);
		
	}
	
}
