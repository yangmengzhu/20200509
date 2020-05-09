package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/*
 * @program: 20200506
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -06 12 :10
 */

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        //尾插法放置
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name=scan.nextLine();
        System.out.println("请输入图书的作者");
        String author=scan.nextLine();
        System.out.println("请输入图书的价格");
        int price=scan.nextInt();
        System.out.println("请输入图书的类型");
        String type=scan.next();
        Book book=new Book(name,author,price,type);//组装一本书
        int curSize=bookList.getUsedSize(); //得到当前位置
        bookList.setBooks(curSize,book);
        bookList.setUsedSize(curSize+1);
        System.out.println("新增成功");
    }
}
