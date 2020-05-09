import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/*
 * @program: 20200506
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -06 11 :51
 */

public class TestMain {
    public static User login(){//登录
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入姓名");
        String name=scan.nextLine();
        System.out.println("请输入你的身份: 1-->管理员，2-->普通用户");
        int choice=scan.nextInt();
        if(choice==1){
            return new Admin(name);
        }else{
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        //准备书籍
        BookList bookList =new BookList();
        //登录
        User user=login();
        while(true){
            int choice=user.menu();
            user.doOperation(bookList ,choice);
        }
    }
}
