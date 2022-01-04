package com.xuanran.spring5;

/**
 * Created By XuanRan on 2022/1/4
 * xml配置文件属性注入练习
 */
public class Book {
    private String bookName;
    private String author;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
