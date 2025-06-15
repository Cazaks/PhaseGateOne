from datetime import datetime, timedelta

class MenstrualCycle_application:
	def _init_(self, name, cyclelength_days, ovulution_period, fertile_window_period):
		self.name = name
		self.cyclelength_days = cyclelength_days
		self.ovulution_period = ovulution_period
		self.fertile_window_period = fertile_window_period
		self.last_perid_start_date = datetime.strptime(last_period_start, "%Y-%m-%d")

	
	def registration(self, name):
		#self.name = name
		print(f"Welcome {name}! Your registration successfully")

	def cycle_length_days(currentperioddate, lastperioddate):
		tracker = MenstrualCycle_application("2025-06-03")
		periodstatedate = datetime.strptime(tracker.currentperioddate, "%Y-%m-%d")
		periodenddateend = datetime.strptime(tracker.lastperioddate, "%Y-%m-%d")
		cyclelengthdays = (datetime.strptime - periodstatedate).days
		return cyclelength
		#cycle = calculate_cycle_length("2024-06-01", "2024-06-29")
		#print("Cycle length:", cycle, "days")
		#print("Your cycle length days are {cyclelengthdays}")

def main():
	info = MenstrualCycle_application()
	print("Welcom! How may I help you?")

	while True:
		print("\nOptions:")
		print("1 - For registration\n")
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
			currentperiod = input("Enter current period start date,(y-m-d)\n")
			info.cycle_length_days(currentperiod)
			periodenddate = inputodstop("Enter period start date, (y-m-d)\n")
			info.cycle_length_days(periodenddate)
		
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
	
