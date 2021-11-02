package com.pb.kozhara.hw5;

public class Reader {
    public Reader (String fullname, int ticket, String faculty, String dateofbirth, String phonenumber) {
        this.fullname = fullname;
        this.ticket = ticket;
        this.faculty = faculty;
        this.dateofbirth = dateofbirth;
        this.phonenumber = phonenumber;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public  void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getFullname() {
        return fullname;
    }
    public String getTicket() {
        return ticket;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getDateofbirth() {
        return dateofbirth;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void takeBook() {
        System.out.println(getFullname() + " взяв " + Book.getBookCount() + " книги.");
    }
    public void takeBook(String...  titles) {
        System.out.print(getFullname() + " взяв книги: ");
        for (String title : titles) {
            if (title != titles[titles.length-1]) {
                System.out.print(title + ", ");
            } else {
                System.out.println(title + ".");
            }
        }
    }
    public void takeBook(Book... books) {
        System.out.print(getFullname() + " взяв книги: ");
        for (Book book : books) {
            if (book != books[books.length-1]) {
                System.out.print(book.getTitle() + " (" + book.getAuthor() + ", " + book.getYear() + "), ");
            }else {
                System.out.println(book.getTitle() + " (" + book.getAuthor() + ", " + book.getYear() + ").");
            }
        }
    }
    public void returnBook(String... titles) {
        System.out.print(getFullname() + " повернув книги: ");
        for (String title : titles) {
            if (title != titles[titles.length-1]) {
                System.out.print(title + ", ");
            }else {
                System.out.println(title + ".");
            }
        }
    }
    public void returnBook(Book... books) {
        System.out.print(getFullname() + " повернув книги: ");
        for (Book book : books) {
            if (book != books[books.length-1]) {
                System.out.print(book.getTitle() + " (" + book.getAuthor() + ", " + book.getYear() + "), ");
            } else {
                System.out.println(book.getTitle() + " (" + book.getAuthor() + ", " + book.getYear() + ").");
            }
        }
    }
    String getReaderInfo() {
        return "[ФіО: " + fullname + "\nНомер квитка: " + ticket + "\nФакультет: "+ faculty + "\nДата народження: " + dateofbirth + "\nМобільний: " + phonenumber + "]";
    }
}
