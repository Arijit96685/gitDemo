package com.acc.lkm.JavaDay1;

public class BookDetails
{
String author_Name,Book_Title;
int Year_Of_Publication;
public BookDetails(String author_Name, String book_Title, int year_Of_Publication) {
	super();
	this.author_Name = author_Name;
	Book_Title = book_Title;
	Year_Of_Publication = year_Of_Publication;
}
@Override
public String toString() {
	return "BookDetails [author_Name=" + author_Name + ", Book_Title=" + Book_Title + ", Year_Of_Publication="
			+ Year_Of_Publication + "]";
}

public static void main(String[] args) 
{
	System.out.println(new BookDetails("Newton","Physics",2024));
}
}
