package BaiTH1_25_4;

import java.util.Scanner;

public class News implements INews{
	private int ID;
	private String Title;
	private String PublishDate;
	private String Author;
	private String Content;
	
	public News() {
		
	}
	
	public News(int id, String title, String publishdate, String author, String content) {
		this.ID = id;
		this.Title = title;
		this.PublishDate = publishdate;
		this.Author = author;
		this.Content = content;
	}
	
	public void setId(int id) {
		this.ID = id;
	}
	public int getId() {
		return ID;
	}
	
	public void setTitle(String title) {
		this.Title = title;
	}
	public String getTitle() {
		return Title;
	}
	
	public void setPubDate(String publishdate) {
		this.PublishDate = publishdate;
	}
	public String getPubDate() {
		return PublishDate;
	}
	
	public void setAuthor(String author) {
		this.Author = author;
	}
	public String getAuthor() {
		return Author;
	}
	
	public void setContent(String content) {
		this.Content = content;
	}
	public String getContent() {
		return Content;
	}
	
	public void display() {
		System.out.println("<------------------->");
		System.out.println("Id: " + ID);
		System.out.println("Title: " + Title);
		System.out.println("PublishDate: " + PublishDate);
		System.out.println("Author: " + Author);
		System.out.println("Content: " + Content);
		System.out.println("<------------------->");
	}

	public void insertNews() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID: ");
		ID = sc.nextInt();
		
		System.out.println("Nhap Title: ");
		Title = sc.next();
		
		System.out.println("Nhap PublishDate: ");
		PublishDate = sc.next();
		
		System.out.println("Nhap Author");
		Author = sc.next();
		
		System.out.println("Nhap Content");
		Content = sc.next();
	}
}
