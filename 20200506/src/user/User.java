package user;

/*
 * @program: 20200506
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -06 12 :27
 */

import book.BookList;
import operation.IOperation;

public abstract class User {
    public String name;
    public User(String name){
        this.name=name;
    }
    public abstract int menu();//实现多态
    protected IOperation[] operations;
    public void doOperation(BookList bookList ,int choice){
        this.operations[choice].work(bookList);
    }
}
