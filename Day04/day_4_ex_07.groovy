class Mortgage{
	double borrowed;
	double years;
	double rate;


	double to_be_paid() {
		return borrowed * (1 + (rate / 100))
	}
	double yearly() {
		return (to_be_paid()) / years
	}
	double only_interests() {
		double interests = (to_be_paid() - borrowed)
		double year_cost = yearly()
		int years_needed = 0
		double n = 0
		while (n < interests){
			years_needed = years_needed + 1
			n = n + year_cost	
		}
		return years_needed
	}
}


println 'How much did you borrow?'
String str = System.console().readLine()
double borr = Double.parseDouble(str)

println 'How high is your interest rate?'
String str1 = System.console().readLine()
double ir = Double.parseDouble(str1)

println 'How many years do you have to pay?'
String str3 = System.console().readLine()
double yearsnum = Double.parseDouble(str3)


Mortgage MyMortgage = new Mortgage()
MyMortgage.borrowed = borr 
MyMortgage.rate = ir
MyMortgage.years = yearsnum

println 'In total you will have to pay: ' + MyMortgage.to_be_paid()

println 'That means ' + MyMortgage.yearly() + ' per year.'

println 'You will pay the interests after this number of years: ' + MyMortgage.only_interests()