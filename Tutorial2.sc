//Question 1, 2
var k, i, j = 2
var m, n = 5
var f = 12.0f
var g = 4.0f
var c = 'X'

//---------------------------------------------------------------------------------------------------------------------

// Question 3 part I
k + 12 * m
m / j
n % j
m / j * j
f + 10 * 5 + g
i+=1
i*n

// Question 3 part II
var a = 2
var b = 3
var c = 4
var d = 5
var k = 4.3f

b = b - 1
println(b * a + c * d)
d = d - 1

println(a)
a = a + 1

println(-2 * (g - k) + c)

println(c)
c = c + 1

c = c + 1
println(c * a)
a = a + 1

//---------------------------------------------------------------------------------------------------------------------

// Question 4 Part a

def normalSalary(hours:Double):Double = hours*250
def ot(hours:Double):Double = hours*85
def income(nH:Double,otH:Double):Double = normalSalary(nH)+ot(otH)
def taxS(income:Double):Double = income*0.12
def takeSalary(noOfWorkH:Double,otH:Double):Double = income(noOfWorkH,otH)-taxS(income(noOfWorkH,otH))

println(takeSalary(6,2))

//---------------------------------------------------------------------------

// Question 4 part b

val costForEachPerformance = 500.00f
val costForEachAttendee = 3.00f
val basePrice = 15.00f
val priceChange = 5

def noOfPeople(priceChange: Int): Int = -1 * (priceChange * 20 / 5) + 120
def max(a: Float, b: Float): Float = if (a >= b) a else b
def TicketPrice(priceChange: Int): Float = basePrice + priceChange
def Income(noOfPeople: Int, ticketPrice: Float): Float = ticketPrice * noOfPeople
def Cost(noOfPeople: Int): Float = costForEachPerformance + (costForEachAttendee * noOfPeople)
def Profit(income: Float, cost: Float): Float = income - cost
def CalculateProfit(noOfPeople: Int, ticketPrice: Float) : Float = Profit(Income(noOfPeople, ticketPrice), Cost(noOfPeople))

def FindBestPrice(priceIncrease: Int, priceDecrease: Int): Float = {
  val noOfPeople_increased = noOfPeople(priceIncrease)
  val ticketPrice_increased = TicketPrice(priceIncrease)
  val profit_increased = CalculateProfit(noOfPeople_increased, ticketPrice_increased)

  val noOfPeople_decreased = noOfPeople(priceDecrease)
  val ticketPrice_decreased = TicketPrice(priceDecrease)
  val profit_decreased = CalculateProfit(noOfPeople_decreased, ticketPrice_decreased)

  if(profit_increased >= profit_decreased) ticketPrice_increased else ticketPrice_decreased
}

FindBestPrice(5, -5)


//-------------------------------------------------------------------------



