object whiledofor{
	def main(args:Array[String]){

		var i:Int=1;

		while(i<10){
			println(i)
			i +=1
		}

		do{
			println(i)
			i = i-1
		}while(i>1)

		for(j <- 1 to 10){   // val j:Int=1
			println(j)
		}
	}
}
