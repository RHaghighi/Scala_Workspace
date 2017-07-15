class student{
	var name:String = "Reza"
	var age:Int = 33

	def setname(inpname:String){
		name = inpname
	}

	def show()={
		println(name)
		println(age)
	}
}

object defclass{
	def main(args:Array[String]){
		var objst = new student
		objst.show()
		
		objst.setname("John")
		objst.show()
	}
}
