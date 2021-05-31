class library{
	int books=10;
	synchronized void issue(int num_books)
	{
		System.out.println("Issuing A Book");
		System.out.println("Total Books Available: "+books);
		if(books!=0)
		{
			books=books-num_books;
			System.out.println("Your Books is Ready");
		}
		else
		{
			try
			{
				wait();
			}
			catch(Exception e) {
			System.out.println("No books avaialable");
		} }
	}
	synchronized void returnbook(int return_books)
	

	{
		
		System.out.println("Returning books");
		books=books+return_books;
		System.out.println("Total books"+books);
		notify();
	}
}
c