package C3_DecoratorPattern.RealJavaUsage;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {

        int c;
        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/home/dhaval/IdeaProjects/HeadFirst_DesignPattern/src/C3_DecoratorPattern/RealJavaUsage/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();

        } catch(IOException e) {
            e.printStackTrace();
        }

    }

}
