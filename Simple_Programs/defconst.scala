class student(a:String, b:Int){
	var name:String = a
	var age:Int = b

	def setname(inpname:String){
		name = inpname
	}

	def show()={
		println(name)
		println(age)
	}
}

object defconst{
	def main(args:Array[String]){
		var objst = new student("Reza",33)
		objst.show()
		
		objst.setname("John")
		objst.show()
	}
}
