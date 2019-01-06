package cn.tedu.pms;

import org.apache.commons.io.FilenameUtils;
import org.hyperic.sigar.*;
import org.junit.Test;

import java.io.File;

/**
 * @author Smile
 * Created at 2018/12/29
 */
public class CommonTestWitoutContext {

    @Test
    public void testNaming() {
        System.out.println(FilenameUtils.normalize("D:\\\\cccc\\\\x.txt"));
        System.out.println(FilenameUtils.normalize("D:\\cccc\\\\x.txt", true));
        System.out.println(File.separator);
    }

    @Test
    public void test1() throws SigarException {
        Sigar sigar = new Sigar();
        CpuPerc[] cpuPercList = sigar.getCpuPercList();


        for (CpuPerc cpu : cpuPercList) {
            System.out.println("CPU用户使用率:    " + CpuPerc.format(cpu.getUser()));// 用户使用率  
            System.out.println("CPU系统使用率:    " + CpuPerc.format(cpu.getSys()));// 系统使用率  
            System.out.println("CPU当前等待率:    " + CpuPerc.format(cpu.getWait()));// 当前等待率  
            System.out.println("CPU当前错误率:    " + CpuPerc.format(cpu.getNice()));//  
            System.out.println("CPU当前空闲率:    " + CpuPerc.format(cpu.getIdle()));// 当前空闲率  
            System.out.println("CPU总的使用率:    " + CpuPerc.format(cpu.getCombined()));// 总的使用率  

            System.out.println("-----------------");
        }

        System.out.println(cpuPercList.length);
    }
}
