object factorialTailRecursion {
  
	def factorial(n: Int): Int = {
	
		def loop(acc: Int, n: Int): Int =
		
			if(n==0) acc
			else loop(acc * n, n-1)
			
			loop(1,n)
	
	}                                         //> factorial: (n: Int)Int
	
	factorial(13)                             //> res0: Int = 1932053504
	
}