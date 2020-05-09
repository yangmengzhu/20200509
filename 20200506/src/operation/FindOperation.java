package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/*
 * @program: 20200506
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -06 12 :14
 */

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name=scan.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
           Book book=bookList.getBook(i);
           if(book.getName().equals(name)){
               System.out.println(book);
               System.out.println("查找成功");
               return;
           }
        }
        System.out.println("没有要查找的这本书");
    }
}
