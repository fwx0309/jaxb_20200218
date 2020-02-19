package com.fwx;

import com.fwx.pojo.Account;
import com.fwx.pojo.User;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayList;

/**
 * Jaxb用例类
 *
 * @author Fwx
 * @return
 */
public class JaxbTest {

    /**
     * 1.使用Java对象生成xml文件(只有account对象)
     *
     * @param
     * @return void
     */
    @Test
    public void javaToXml() {
        try {
            //1.创建Jaxb对象
            JAXBContext jaxbContext = JAXBContext.newInstance(Account.class);
            //2.创建marshaller
            Marshaller marshaller = jaxbContext.createMarshaller();
            //3.1.设置输出样式(不设置生成的xml文件没有换行和缩进)
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //3.2.设置编码格式
            marshaller.setProperty(Marshaller.JAXB_ENCODING,"UTF-8");
            //4.生成数据
            Account account = new Account("1234AN", "2020-02-18", "123PW", "qq");
            //5.生成xml文件
            marshaller.marshal(account, new FileOutputStream("D:\\jaxbTest.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 2.使用xml文件生成Java对象(只有account对象)
     *
     * @param
     * @return void
     */
    @Test
    public void xmlToJava() {
        try {
            //1.创建Jaxb对象
            JAXBContext jaxbContext = JAXBContext.newInstance(Account.class);
            //2.创建unmarshaller
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            //3.读取xml文件，生成对象
            Account account = (Account) unmarshaller.unmarshal(new File("D:\\jaxbTest.xml"));
            //4·打印对象
            System.out.println(account);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * 3.使用Java对象生成xml文件(user对象包含account对象)
     *
     * @param
     * @return void
     */
    @Test
    public void javaToXmlUser() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //Accounts
            ArrayList<Account> accounts = new ArrayList<>();
            Account account1 = new Account("1234AN", "2020-02-18", "123PW", "qq");
            Account account2 = new Account("1234AN", "2020-02-18", "123PW", "qq");
            accounts.add(account1);
            accounts.add(account2);
            //user
            User user = new User("userNameTest", 18, accounts);
            marshaller.marshal(user, new File("D:\\jaxbTestUser.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * 4.使用xml文件生成Java对象(user对象包含account对象)
     *
     * @param
     * @return void
     */
    @Test
    public void xmlToJavaUser() {
        FileInputStream inputStream = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            inputStream = new FileInputStream("D:\\jaxbTestUser.xml");
            User user = (User)unmarshaller.unmarshal(inputStream);
            System.out.println(user);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream!=null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


