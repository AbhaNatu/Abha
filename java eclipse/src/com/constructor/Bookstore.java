package com.constructor;
class Bookstore
{
		public static void main(String[] args)
		{
			Books[]bookshelf=new Books[5];
			
			bookshelf[0]=new Books("THE GIRL ON THE TRAIN",200);
			bookshelf[1]=new Books("GONE GIRL",2001);
			bookshelf[2]=new Books("ORPHAN X",3010);
			bookshelf[3]=new Books("THE SILENT PATIENT",4500);
			bookshelf[4]=new Books("KILLING FLOOR",5004);
		    for(Books b:bookshelf)
		    {
		   
		    	System.out.println("details of book: "+ b.name+" " + b.price+" "+b.isbn);
		       	b.genre("thriller");
		    }
		}
}
