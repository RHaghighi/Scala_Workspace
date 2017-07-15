class Account(name:String,var balance:Double){
	def description:String = name+"$"+balance

	def deposit(amount:Double){
		balance += amount
	}

	def withdraw(amount:Double){
		balance -= amount
	}

	def isEmpty:Boolean = balance==0.0
}

val account = new Account("Reza",1.00)
println(account.description)
account.withdraw(0.9)
println(account.description)
