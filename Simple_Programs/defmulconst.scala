class student(name:String, age:Int){

	def this(){
		this("Vader",56)
	}

	def this(a:String){
		this(a,21)
	}

	def show()={
		println(name)
		println(age)
	}
}

object defmulconst{
	def main(args:Array[String]){

		var objst = new student("Reza",33)
		objst.show()
		
		var objst1 = new student("Invincible")
		objst1.show()

		var objst2 = new student()
		objst2.show()
	}
}
