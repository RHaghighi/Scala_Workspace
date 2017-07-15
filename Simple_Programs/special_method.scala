class Vect3(val x:Double, val y:Double, val z:Double){
        def +(v:Vect3) = new Vect3(x+v.x, y+v.y, z+v.z)
        def -(v:Vect3) = new Vect3(x-v.x, y-v.y, z-v.z)
	def ++(v:Vect3) = new Vect3(x+v.y+v.z,y+v.x+v.z,z+v.x+v.y)

	def cross(v:Vect3) = new Vect3(
	    y*v.z-z*v.y,
	    z*v.x-x*v.z,
	    x*v.y-y*v.x)

	def unary_-() = new Vect3(-x,-y,-z)

	def apply(index:Int):Double = index match {
		case 0 => x
		case 1 => y
		case 2 => z
	}

        def printForm:String = "("+x+", "+y+", "+z+")"
}



object special_method{
	def main(args:Array[String]){
		println("Hello!")
		val v1 = new Vect3(1,2,3)
		val v2 = new Vect3(4,5,6)
		println((v1+v2).printForm)
		println((v1++v2).printForm)
	
		val lst = 1::2::3::Nil
		println(lst)

		println((-v1).printForm)

		println(v1(2))

		val f = (x:Double) => x*x

		println(f(3))
		println(f.apply(6))

	}
}

