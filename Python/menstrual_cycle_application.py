from datetime import datetime, timedelta

class MenstrualCycle_application:
	def _init_(self, name, cyclelength_days, ovulution_period, fertile_window_period):
		self.name = name
		self.cyclelength_days = cyclelength_days
		self.ovulution_period = ovulution_period
		self.fertile_window_period = fertile_window_period
	
	def registration(self, name):
		#self.name = name
		print(f"Welcome {name}! Your registration successfully")
def main():
	info = MenstrualCycle_application()
	print("Welcom! How may I help you?")

	while True:
		print("\nOptions:")
		print("1 - For registration\n:")
		print("2 - Calculate next period\n")
		print("3 - Calculate ovulation\n")
		print("4 - Calculate fertile window\n")
		print("5 - Calculate safe periods\n")
		print("6 - Get cycle length\n")
		print("0 - Exit\n")

		userchoice = input("Choice an option: ")
		if userchoice == "1":
			enter_name = input("Enter your name\n")
			info.registration(enter_name)

		elif userchoice == "2":
			print("Site undergoing construction, check back later. Thank you")
		
		elif userchoice == "3":
			print("Site undergoing construction, check back later. Thank you")

		elif userchoice == "4":
			print("Site undergoing construction, check back later. Thank you")

		elif userchoice == "5":
			print("Site undergoing construction, check back later. Thank you")
	
		elif userchoice == "6":
			print("Site undergoing construction, check back later. Thank you")

	

		elif userchoice == "0":
			print("Goodbye! Thanks for using our services.")
			break;
		else:
			print("Invalid option, please select a valid option")




	#if __name__ == "_main_":
main() 
	
