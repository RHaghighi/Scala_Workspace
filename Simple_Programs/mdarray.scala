object mdarray{
	def main(args:Array[String]){
	
		var myarray=Array.ofDim[Int](2,2)

		for(i<-0 to 1; j<-0 to 1){
			myarray(i)(j)=(i+j+3)*(i-j-4)
			println(myarray(i)(j))
        	}
	}
}
