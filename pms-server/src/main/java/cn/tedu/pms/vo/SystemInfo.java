package cn.tedu.pms.vo;

import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

import java.text.DecimalFormat;

public class SystemInfo {
	private DecimalFormat df = new DecimalFormat("######0.0000");
	private Sigar sigar;

	private Mem mem;

	private Swap swap;

	private Cpu cpu;

	public SystemInfo() {
	}

	public SystemInfo(Sigar sigar) {
		super();
		this.sigar = sigar;
	}

	public void setSigar(Sigar sigar) {
		this.sigar = sigar;
	}

	public Mem getMem() throws SigarException {
		if (mem == null)
			mem = new Mem();
		org.hyperic.sigar.Mem m = sigar.getMem();
		mem.setFree(m.getFree());
		mem.setTotal(m.getTotal());
		mem.setUsed(m.getUsed());
		mem.setUsedPercent(m.getUsedPercent());
		return mem;
	}

	public Swap getSwap() throws SigarException {
		if (swap == null)
			swap = new Swap();
		org.hyperic.sigar.Swap s = sigar.getSwap();
		swap.setFree(s.getFree());
		swap.setTotal(s.getTotal());
		swap.setUsed(s.getUsed());
		swap.setUsedPercent(swap.getUsed() * 1.0 / swap.getTotal());
		return swap;
	}

	public Cpu getCpu() throws SigarException {
		if (cpu == null)
			cpu = new Cpu();
		org.hyperic.sigar.Cpu c = this.sigar.getCpu();

		cpu.setIdle(Double.parseDouble(df.format(c.getIdle() * 1.0 / c.getTotal())));
		cpu.setSystem(Double.parseDouble(df.format(c.getSys() * 1.0 / c.getTotal())));
		cpu.setUser(Double.parseDouble(df.format(c.getUser() * 1.0 / c.getTotal())));
		cpu.setWait(Double.parseDouble(df.format(c.getWait() * 1.0 / c.getTotal())));
		cpu.setTotal(c.getTotal());
		return cpu;
	}

	public String getUpTime() throws SigarException {
		long ms = (long) this.sigar.getUptime().getUptime();
		Integer ss = 1;
		Integer mi = ss * 60;
		Integer hh = mi * 60;
		Integer dd = hh * 24;

		Long day = ms / dd;
		Long hour = (ms - day * dd) / hh;
		Long minute = (ms - day * dd - hour * hh) / mi;
		Long second = (ms - day * dd - hour * hh - minute * mi) / ss;

		StringBuffer sb = new StringBuffer();
		if (day > 0) {
			sb.append(day + "天");
		}
		if (hour > 0) {
			sb.append(hour + "小时");
		}
		if (minute > 0) {
			sb.append(minute + "分");
		}
		if (second > 0) {
			sb.append(second + "秒");
		}

		return sb.toString();
	}

	public static class Mem {
		public Mem() {
		}

		private long total;
		private long used;
		private long free;
		private double usedPercent;

		public long getTotal() {
			return total;
		}

		public void setTotal(long total) {
			this.total = total;
		}

		public long getUsed() {
			return used;
		}

		public void setUsed(long used) {
			this.used = used;
		}

		public long getFree() {
			return free;
		}

		public void setFree(long free) {
			this.free = free;
		}

		public double getUsedPercent() {
			return usedPercent;
		}

		public void setUsedPercent(double usedPercent) {
			this.usedPercent = usedPercent;
		}

	}

	public static class Swap {
		private long total;
		private long used;
		private long free;
		private double usedPercent;

		public long getTotal() {
			return total;
		}

		public void setTotal(long total) {
			this.total = total;
		}

		public long getUsed() {
			return used;
		}

		public void setUsed(long used) {
			this.used = used;
		}

		public long getFree() {
			return free;
		}

		public void setFree(long free) {
			this.free = free;
		}

		public void setUsedPercent(double usedPercent) {
			this.usedPercent = usedPercent;
		}

		public double getUsedPercent() {
			return usedPercent;
		}
	}

	public static class Cpu {
		private double user;
		private double system;
		private double wait;
		private double idle;
		private double total;

		public Cpu() {
		}

		public double getSystem() {
			return system;
		}

		public void setSystem(double system) {
			this.system = system;
		}

		public void setUser(double user) {
			this.user = user;
		}

		public double getUser() {
			return user;
		}

		public double getWait() {
			return wait;
		}

		public void setWait(double wait) {
			this.wait = wait;
		}

		public double getIdle() {
			return idle;
		}

		public void setIdle(double idle) {
			this.idle = idle;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}
	}

}
