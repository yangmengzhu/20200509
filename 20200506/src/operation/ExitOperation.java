package operation;

import book.BookList;

/*
 * @program: 20200506
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -06 12 :14
 */

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
