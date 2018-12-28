package cn.tedu.pms;

import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

import java.io.File;

/**
 * @author Smile
 * Created at 2018/12/29
 */
public class CommonTestWitoutContext {

    @Test
    public void testNaming(){
        System.out.println(FilenameUtils.normalize("D:\\\\cccc\\\\x.txt"));
        System.out.println(FilenameUtils.normalize("D:\\cccc\\\\x.txt",true));
        System.out.println(File.separator);
    }
}
