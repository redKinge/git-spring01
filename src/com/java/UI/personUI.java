package com.java.UI;

import com.java.dao.impl.PersonDaoImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * description:描述
 * author: 河发
 * time: 15:15
 */
public class personUI {
    public static void main(String[] args) throws Exception {
        for (; ; ) {
            System.out.println("***********请输入如下选项：********************");
            System.out.println("\t\t1、信息录入");
            System.out.println("\t\t2、信息查询");
            System.out.println("\t\t3、信息修改");
            System.out.println("\t\t4、信息删除");
            System.out.println("\t\t5、退出");
            Scanner input = new Scanner(System.in);
            System.out.print("请输入一个选项：");
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("开始录入信息：");
                    System.out.print("请输入姓名：");
                    String name = input.next();
                    System.out.print("请输入身份证号：");
                    String idCard = input.next();
                    System.out.print("请输入性别：");
                    String gender = input.next();
                    System.out.print("请输入地址：");
                    String local = input.next();
                    String[] p = {name, gender, local, idCard};
                    int result= PersonDaoImpl.insertPerson(p);
                    System.out.println(result >= 1 ? "录入成功" : "录入失败");
                    break;
                case 2:
                   System.out.println("所有人信息如下：");
                   List<Map<String,Object>> personList=PersonDaoImpl.selectPerson();
                    personList.forEach(temp->{
                            System.out.println(temp);
                    });
                    break;
                case 3:
                /*    System.out.println("开始信息修改：");
                    System.out.print("请输入要修改的身份证号码：");
                    String yy=input.next();
                    System.out.print("请输入要修改的姓名：");
                    String names=input.next();
                    System.out.print("请输入要修改的性别：");
                    String genders=input.next();
                    System.out.print("请输入要修改的地址：");
                    String locals=input.next();
                    String[] ide={names,genders,locals,yy};
                    int test=PersonDaoImpl.updatePerson(ide);
                    System.out.println(test>=1?"修改成功":"修改失败");*/

                    System.out.println("信息修改:");
                    System.out.print("请输入需要修改人的身份证号:");
                    String sfCard = input.next();//身份证号
                    System.out.println("开始信息修改:");
                    System.out.print("请输入姓名:");
                    String uName = input.next();
                    System.out.print("请输入性别:");
                    String sex = input.next();
                    System.out.print("请输入地址:");
                    String diZhi = input.next();//地址
                    //开始调用dao层
                    String[] params = {uName,sex,diZhi,sfCard};
                    int flag = PersonDaoImpl.updatePerson(params);
                    System.out.println(flag>=1?"修改成功":"修改失败");






                    break;
                case 4:
                    System.out.println("开始信息删除：");
                    System.out.print("请输入要删除人的身份证号码：");
                    String sfz=input.next();
                   int result2= PersonDaoImpl.deletePerson(sfz);
                   System.out.println(result2>=1?"删除成功":"删除失败");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }

        }
    }
}
