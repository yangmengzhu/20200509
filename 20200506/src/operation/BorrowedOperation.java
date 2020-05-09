package operation;

/*
 * @program: 20200506
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -06 12 :13
 */

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowedOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name=scan.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("没有要借阅的这本书");
    }
}
