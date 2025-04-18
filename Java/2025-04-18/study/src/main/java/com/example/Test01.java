package com.example;

import java.util.*;

class Book{
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    int gid() {return id;}
    void sid(int id) {this.id = id;}

    String gtitle() {return title;}
    void stitle(String title) {this.title = title;}

    String gauthor() {return author;}
    void sauthor(String author) {this.author = author;}
    
    boolean gisBorrowed() {return isBorrowed;}
    void sisBorrowed(boolean isBorrowed) {this.isBorrowed = isBorrowed;}

    @Override
    public String toString(){
        return String.format("Id: %d, Title: %s, Author: %s, Borrowed: %b", id, title, author, isBorrowed);
    }
}

class Library{
    ArrayList<Book> book = new ArrayList<Book>();
    private int count = 0;

    //책 추가
    void addBook(Book book){
        book.sid(count);
        this.book.add(book);
        ++count;
    }

    //포함시 출력
    void searchBook(String keyword){
        int num = 0;
        for(Book i : book){
            if(keyword.equals(i.gtitle()) || keyword.equals(i.gauthor())){
                System.out.println(i.toString());
                ++num;
            }
        }

        if(num == 0){
            System.out.println("책이 존재하지 않습니다.");
        }
    }

    //대출중?
    void borrowBook(int id){
        int num = 0;
        for(Book i : book){
            if(i.gisBorrowed()){
                System.out.println("대출 중 입니다.");
                ++num;
                break;
            } else {
                System.out.println("대출 합니다.");
                i.sisBorrowed(true);
                ++num;
                break;
            }
        }

        if(num == 0){
            System.out.println("책이 존재하지 않습니다.");
        }
    }

    void returnBook(int id){
        int num = 0;
        for(Book i : book){
            if(i.gisBorrowed()){
                System.out.println("반납되었습니다.");
                i.sisBorrowed(false);
                ++num;
                break;
            } else {
                System.out.println("대출 되지 않았습니다.");
                ++num;
                break;
            }
        }

        if(num == 0){
            System.out.println("책이 존재하지 않습니다.");
        }
    }
}

public class Test01 {
    public static void main(String[] args){
        Library library = new Library();
        Scanner s = new Scanner(System.in);

        int check = 0;
        exit:
        while (true){
            System.out.println("--------------------");
            System.out.println("  도서관 시스템 2.0  ");
            System.out.println("--------------------");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 검색");
            System.out.println("3. 도서 대출");
            System.out.println("4. 도서 반납");
            System.out.println("5. 도서 전체 목록 보기");
            System.out.println("0. 종료");
            System.out.println();
            System.out.print("#입력: ");

            try{
                check = s.nextInt();
                s.nextLine();
            } catch (InputMismatchException e){
                System.out.println("숫자를 입력해주세요.");
                check = 0;
            }

            System.out.println();
            switch(check){
                case 1:
                    System.out.println("[ 도서 등록 ]");
                    Book b = new Book();
                    System.out.print("책 이름: ");
                    b.stitle(s.nextLine());
                    System.out.print("저자: ");
                    b.sauthor(s.nextLine());
                    b.sisBorrowed(false);

                    library.addBook(b);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("[ 도서 검색 ]");
                    System.out.print("책, 저자 검색: ");
                    library.searchBook(s.nextLine());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("[ 도서 대출 ]");
                    System.out.print("아이디 검색: ");
                    library.borrowBook(s.nextInt());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("[ 도서 반납 ]");
                    System.out.print("아이디 검색: ");
                    library.returnBook(s.nextInt());
                    System.out.println();
                    break;
                case 5:
                    for(Book i : library.book){
                        System.out.println(i.toString());
                    }
                    break;
                case 0:
                    System.out.println("시스템을 종료합니다.");
                    break exit;

            }
        }


    }
}
