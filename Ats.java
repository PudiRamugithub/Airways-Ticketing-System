import java.util.*;
class T2 implements Rating{
	static String def = "\u001B[0m";
	public static final String white = "\033[0;37m";   // WHITE
	public static final String whitebackground = "\033[47m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
	static boolean changeSelection = true;
	static String orange = "\u001B[38;5;208m";
    static String pink = "\u001B[38;5;205m";
    static String lavender = "\u001B[38;5;183m";
    static String teal = "\u001B[38;5;37m";
    static String olive = "\u001B[38;5;58m";
    static String maroon = "\u001B[38;5;88m";
    static String navy = "\u001B[38;5;21m";
    static String indigo = "\u001B[38;5;54m";
	static String reset = "\u001B[0m";
	static String darkGreen = "\u001B[38;5;22m";
	static String darkBlue = "\u001B[38;5;18m";
	static String darkPurple = "\u001B[38;5;55m";
	static String darkCyan = "\u001B[38;5;23m";
	static String darkYellow = "\u001B[38;5;94m";
	static String darkBrown = "\u001B[38;5;52m";
	static String darkGray = "\u001B[38;5;236m";		
    public static final String bold = "\u001B[1m";
    public static final String unbold = "\u001B[21m";
    public static final String underline = "\u001B[4m";
	public static final String cyan = "\033[0;36m";
		//Scanner class object
	static Scanner scanner = new Scanner(System.in);
		//variables
    private static final double GST_RATE = 0.18;
    private static final double PROCESSING_FEE = 200.0;
	static int n2=0;
	
	
	
		static void change1(){
			
        int selectedAirline;

         do {
	    System.out.println(blink);
	    System.out.println(bold);
	    System.out.println(yellow);
            System.out.println("							Choose an airline:");
	    System.out.println(def);
	    System.out.println(skblue);
            System.out.println("							1. Air Asia $");
            System.out.println("							2. Indigo $$$");
            System.out.println("							3. Kingfisher $");
            System.out.println("							4. Vistara $$");
	    
	    System.out.println(white);
            String input = scanner.next();
			scanner.nextLine();
            if (input.matches("[1-4]")) {
                selectedAirline = Integer.parseInt(input);

                switch (selectedAirline) {
                    case 1:
                        do {
                            showFlights("Air Asia");
                        } while (!selectFlightAndBookSeats(selectedAirline, scanner));
                        break;
                    case 2:
                        do {
                            showFlights("Indigo");
                        } while (!selectFlightAndBookSeats(selectedAirline, scanner));
                        break;
                    case 3:
                        do {
                            showFlights("Kingfisher");
                        } while (!selectFlightAndBookSeats(selectedAirline, scanner));
                        break;
                    case 4:
                        do {
                            showFlights("Vistara");
                        } while (!selectFlightAndBookSeats(selectedAirline, scanner));
                        break;
                }		

                 // Ask the user if they want to change their selection
                System.out.print(yellow+"						Do you want to change your airline selection? ("+green+"Y"+def+"/"+red+"N"+def+yellow+"): ");
		System.out.println(white);
                char choice = Character.toUpperCase(scanner.next().charAt(0));
                if (choice == 'N') {
					
                    break;
					//main.obj.credentials();
                }
            } else{
		System.out.println(red);
                System.out.println("							Please enter a valid airline number (1-4).");
            }
        } while (true);
	System.out.println(green);
	System.out.println(blink);
        System.out.println("					Thank you for using the Airways Booking System!. Have A great journey."+def);
    }

   private static void showFlights(String airline) {
	System.out.println(yellow);
        System.out.println("							Flights available for " + airline + ":");
        for (int j = 1; j <= 4; j++) {
		System.out.println(white);
            System.out.println("			"+j + ". " +yellow+ getFlightName(j) +def+ " - Departure Time: " + getDepartureTime(j) +
                    " - Seats available: " + getAvailableSeats(j) +underline+" - Price per seat: "+yellow+bold+"Rs." + getPricePerSeat(airline, j)+def);
        }
    }

    private static String getFlightName(int flightNumber) {
        switch (flightNumber) {
            case 1:
                return "S2547";
            case 2:
                return "V5690";
            case 3:
                return "S3294";
            case 4:
                return "S4508";
            default:
                return "N/A";
        }
    }

    private static String getDepartureTime(int flightNumber) {
        switch (flightNumber) {
            case 1:
                return "08:00 AM";
            case 2:
                return "12:00 PM";
            case 3:
                return "03:00 PM";
            case 4:
                return "06:00 PM";
            default:
                return "N/A";
        }
    }

    private static int getAvailableSeats(int flightNumber) {
        switch (flightNumber) {
            case 1:
                return 50;
            case 2:
                return 44;
            case 3:
                return 36;
            case 4:
                return 50;
            default:
                return 0;
        }
    }

    private static double getPricePerSeat(String airline, int flightNumber) {
        switch (airline) {
            case "Air Asia":
                switch (flightNumber) {
                    case 1:
                        return 1500.0;
                    case 2:
                        return 1550.0;
                    case 3:
                        return 1600.0;
                    case 4:
                        return 1650.0;
                    default:
                        return 0.0;
                }
            case "Indigo":
                switch (flightNumber) {
                    case 1:
                        return 1750.0;
                    case 2:
                        return 1800.0;
                    case 3:
                        return 1850.0;
                    case 4:
                        return 1900.0;
                    default:
                        return 0.0;
                }
            case "Kingfisher":
                switch (flightNumber) {
                    case 1:
                        return 1000.0;
                    case 2:
                        return 1050.0;
                    case 3:
                        return 1100.0;
                    case 4:
                        return 1150.0;
                    default:
                        return 0.0;
                }
            case "Vistara":
                switch (flightNumber) {
                    case 1:
                        return 1200.0;
                    case 2:
                        return 1250.0;
                    case 3:
                        return 1300.0;
                    case 4:
                        return 1350.0;
                    default:
                        return 0.0;
                }
            default:
                return 0.0;
        }
    }
	
	 static int error()
	{
		try{
			System.out.print(white);
			int num = scanner.nextInt();
			System.out.println(def);
			return num;
		   }
		catch(InputMismatchException e)
		{
		System.out.print(red);
		 System.out.print("						Invalid input plese enter integer : "+def);
		  scanner.next();
		  return error();
			
		}
	}
	static int set(int x)
	{
	 if(x>=1&&x<=4)
	 {
	   return x;
	 }
	
	 else{
		System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return set(error());
    }
	
	
	static int setSelectSeats(int x)
	{
	 if(x>=1&&x<=50)
	 {
	   return x;
	 }
	
	 else{
		System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return setSelectSeats(error());
    }
	
	static int setAge(int x)
	{
	 if(x>=1&&x<=100)
	 {
	   return x;
	 }
	
	 else{
		System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return setAge(error());
    }
	
	static int setPayment(int x)
	{
	 if(x>=1&&x<=80)
	 {
	   return x;
	 }
	
	 else{
		System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return setPayment(error());
    }
	
	static int setRating(int x)
	{
	 if(x>=1&&x<=5)
	 {
	   return x;
	 }
	
	 else{
		System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return setRating(error());
    }
	
	static int setOtp(int x)
	{
	 if(x>=1&&x<=9999999)
	 {
	   return x;
	 }
	
	 else{	
		System.out.print(red);
		 System.out.print("							Invalid  Otp : ");
	     }
	 return setOtp(error());
    }
		private static String repeatChar(char character, int count) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
        sb.append(character);
    }
    return sb.toString();
}
	

    private static boolean selectFlightAndBookSeats(int airline, Scanner scanner) {
	System.out.println(yellow);
        System.out.println("							Select a flight:");
	System.out.println(white);
        int selectedFlight = set(error());

        if (selectedFlight < 1 || selectedFlight > 4) {
		System.out.print(red);
            System.out.println("							Invalid choice. Please try again.");
            return false;
        }
		System.out.print(yellow);
        System.out.print("					  Enter the number of seats you want to book:");
	System.out.print(white);
        int numberOfSeats = setSelectSeats(error());
		scanner.nextLine();

        List<Passenger> passengers = new ArrayList<>();

      for (int i = 1; i <= numberOfSeats; i++) {
    System.out.println(yellow);
    System.out.println("							Enter details for passenger " + i + ":");
     // Name input
    System.out.print("							Name: ");
    System.out.print(white);
    String name = scanner.nextLine();

    // Age input
    System.out.print(yellow);
    System.out.print("							Age: ");
    System.out.print(white);
	int age=setAge(error());

    System.out.print(yellow);    char sex;
    do {
        System.out.print("							Sex (M/F): "+def);
        sex = Character.toUpperCase(scanner.next().charAt(0));
        if (sex != 'M' && sex != 'F') {
            System.out.println(red);
            System.out.println("							Invalid Entry, Please try again");
        }
    } while (sex != 'M' && sex != 'F');

    passengers.add(new Passenger(name, age, sex));
	scanner.nextLine();
}
        double totalCost = bookSeats(airline, selectedFlight, numberOfSeats, passengers);
		System.out.println(yellow);
		System.out.print(blink);
		System.out.print(underline);
		System.out.print(bold);	
		System.out.println("							 Fees Breakup");
		System.out.println(reset);
		System.out.print(skblue);

// Draw the box around fees breakup
		System.out.println("						+ " + repeatChar('-', 39) + "+");
System.out.println("						| " + String.format("%-37s", "Base Fare: Rs." + totalCost) + "  |");
System.out.println("						| " + String.format("%-37s", "GST (18%): Rs." + calculateGST(totalCost)) + "  |");
System.out.println("						| " + String.format("%-37s", "Convenience Fee: Rs." + PROCESSING_FEE) + "  |");
System.out.println("						+ " + repeatChar('-', 39) + "+"+def);
 
	double finalAmount = totalCost + calculateGST(totalCost) + PROCESSING_FEE;
		System.out.print(green);
		System.out.println("						Total cost for " + numberOfSeats + " seats: Rs." + finalAmount+def);

// Ask the user if they want to proceed or cancel
			System.out.println(yellow);
			System.out.print("					Do you want to proceed with the booking? ("+green+"Y"+def+"/"+red+"N"+def+"): ");
			System.out.println(white);
			char choice;

	while (true) {
		System.out.println(cyan);
		System.out.println("					Enter "+green+"'Y'"+def+" to confirm or "+red+"'N'"+def+" to cancel");
		String input = scanner.next();

    if (input.length() == 1) {
        choice = Character.toUpperCase(input.charAt(0));
        if (choice == 'Y' || choice == 'N') {
            break; // Break out of the loop if the input is valid
        }
    }

    System.out.println(red);
    System.out.println("							Invalid Input, Please enter 'Y' or 'N'.");
}

if (choice == 'N') {
    // User cancels the booking
    System.out.println(red);
    System.out.println("				Booking canceled. Thank you for using the Airways Booking System!");
    return true;
}

	clearscreen();
	System.out.println();
	System.out.println(green);
	System.out.println(blink);
        System.out.println("							Seats booked successfully!"+def);
        // Payment
	
		System.out.println(yellow);
        System.out.println("							Select Payment Method:");
		System.out.println(def);
		System.out.println(yellow);
        System.out.println("								1. UPI");
        System.out.println("								2. Card");
		System.out.println(white);
        int paymentMethod = setPayment(error());
		n2=0;
        if (paymentMethod == 1) {
            test testobj=new test();
			testobj.selectpaymethod(totalCost);
        } else if (paymentMethod == 2) {
            proceedWithCardPayment(scanner);
        } else {
		System.out.println(red);
            System.out.println("							Invalid payment method. Payment failed.");
        }

        // Display passenger details after payment
		if(n2!=1)
		{
        displayPassengerDetails(passengers);
		}

        // Display user ratings interface
		
		if(n2!=1)
		{
        Rating rating = new Rating() {
            public void rateExperience(int userRating) {
                if (userRating >= 1 && userRating <= 5) {
			System.out.println(purple);
                    System.out.println("						Thank you for your rating! Have a great journey!");
                } else {
			System.out.println(red);
                    System.out.print("						Invalid rating. Rating should be between 1 and 5.");
                }
            }
        };
	System.out.println(cyan);
        System.out.print("				Thank you for your booking! Please provide a rating for your experience (1-5):");
        int userRating = setRating(error());
        Rating.rateExperience(userRating);
		}
	System.out.println(yellow);
        System.out.print("						Do you want to choose another option? ("+green+"Y"+def+"/"+red+"N"+def+yellow+"): "+def);
        choice = Character.toUpperCase(scanner.next().charAt(0));
        return choice == 'N';
    }

  private static void proceedWithUpiPayment(Scanner scanner) {
    System.out.print(yellow);
    System.out.print("					Enter your UPI ID: ");
		System.out.print(white);
    String upiId = scanner.next();
	scanner.nextLine();
    int otp = generateRandomOTP();
    System.out.println(yellow);
    System.out.println("				An OTP has been sent to your UPI registered mobile number: " +skblue+ otp+def);

    while (true) {
		System.out.println();
		System.out.println(yellow);
        System.out.print("					Enter the OTP received on your UPI device: ");
        System.out.print(white);
        int enteredOTP = scanner.nextInt();

        if (enteredOTP == otp) {
            System.out.println(green);
            System.out.println("						Payment successful! Confirmation sent to Email associated with " + upiId);
			System.out.println();
            break; // Exit the loop if OTP is correct
        } else {
            System.out.println(red);
            System.out.println("							Incorrect OTP. Please try again.");
        }
    }
}

private static void proceedWithCardPayment(Scanner scanner) {
    String cardNumber;

    while (true) {
        System.out.print(yellow);
        System.out.print("					Enter your Card Number (12 digits): ");
		System.out.print(white);
        cardNumber = scanner.next();
		scanner.nextLine();

        if (cardNumber.matches("\\d{12}")) {
            break; // Exit the loop if the card number is valid
        } else {
            System.out.println(red);
            System.out.println("					Error: Invalid card number. Please enter a 12-digit number.");
        }
    }

    int otp = generateRandomOTP(); // Generate a new OTP before the second loop

    while (true) {
		System.out.println(yellow);
		System.out.println("					OTP sent to registered mobile Number: "+skblue+otp+def);
		System.out.print(yellow);
        System.out.print("					Enter the OTP received on your mobile: ");
		System.out.print(white);
        int enteredOTP = scanner.nextInt();
		scanner.nextLine();

        if (enteredOTP == otp) {
            System.out.println(cyan);
			System.out.println(green);
            System.out.println("					Payment successful! Confirmation sent to Email associated with your Card");
			//clearscreen();
			System.out.println();
            break; // Exit the loop if OTP is correct
        } else {
            System.out.println(red);
            System.out.println("							Incorrect OTP. Please try again.");
        }
    }
}

private static void displayPassengerDetails(List<Passenger> passengers) {
	System.out.println();
	clearscreen();
	System.out.println();
	System.out.println(yellow+bold+"								Passager Details"+def);
    System.out.println("					+----------------------+-------+-------+---------------------------+");
    System.out.println("					|      Passenger       |  Age  |  Sex  |    Assigned Seat Number   |");
    System.out.println("					+----------------------+-------+-------+---------------------------+");

    for (Passenger passenger : passengers) {
        System.out.printf("					| %-20s | %-5s | %-5s | %-25s |%n",
                passenger.getName(), passenger.getAge(), passenger.getSex(), generateRandomSeatNumber());
    }

    System.out.println("					+----------------------+-------+-------+---------------------------+");
}
    private static void exitApplication() {
	System.out.println(purple);
        System.out.println("		  	  Thank you for using the Airways Booking System! Have a great journey!");
	
    }

    private static double bookSeats(int airline, int flight, int numberOfSeats, List<Passenger> passengers) {
        double pricePerSeat = getPricePerSeat(getAirlineName(airline), flight);
        double baseCost = numberOfSeats * pricePerSeat;
        double totalCost = baseCost + calculateGST(baseCost) + PROCESSING_FEE;
	System.out.println(yellow);

        System.out.println("				Booking " + numberOfSeats + " seats for Airline " + getAirlineName(airline) +
                ", Flight " + getFlightName(flight) + " at "+white+"Rs." + pricePerSeat+def + " per seat. Total cost: "+skblue+"Rs." +totalCost);

        return totalCost;
    }

    private static String getAirlineName(int airline) {
        switch (airline) {
            case 1:
                return "Air Asia";
            case 2:
                return "Indigo";
            case 3:
                return "Kingfisher";
            case 4:
                return "Vistara";
            default:
                return "Unknown";
        }
    }

    private static double calculateGST(double amount) {
        return amount * GST_RATE;
    }

    private static int generateRandomOTP() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

    private static String generateRandomSeatNumber() {
        // to generate random seat numbers
        Random random = new Random();
        int row = random.nextInt(20) + 1; // Assume 20 rows
        int seat = random.nextInt(6) + 1; // Assume 6 seats per row
        return "R" + row + "S" + seat;
    }

    static class Passenger {
        private String name;
        private int age;
        private char sex;

        public Passenger(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public char getSex() {
            return sex;
        }
    }
	public static void clearscreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


//=======================================================

abstract class Bank 
{
    abstract void withdraw(double amount);
}
class SBIBank extends Bank 
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";

    static Scanner sc=new Scanner(System.in);
    double balance = 250000;
    private int pin = 1234;

    void setpin(int pin) 
    {
        this.pin = pin;
    }

    int getpin() 
    {
        return pin;
    }

    void withdraw(double amount) 
    {

        if (balance >= amount) 
	    {
            while (true) 
            {
                System.out.print( green+"\t\t\t\t\t\t\t\tEnter your PIN: "+def );
                int n =sc.nextInt();
                if (n == pin)
		        {
                    System.out.println(yellow+"\t\t\t\t\t\t\t\tPIN verified"+def);
                    balance = balance - amount;
                    System.out.println(blink+red+"\t\t\t\t\t\t\t\tTransaction Successful"+def);
                    System.out.println(yellow+"\t\t\t\t\t\t\t\tRemaning Balance      :"+red+balance+def);
					System.out.println();
                    break;
                } 
		        else if (n != pin) 
		        {
                    System.out.println(red+"\t\t\t\t\t\t\t\tInvalid PIN+green+ \n\t\t\t\t\t\t\t\tRe Enter the correct PIN");
                }
            }
        }
	    else 
	    {
            System.out.println(red+"\t\t\t\t\t\t\t\tInsufficent funds");
        }
        // return amount;
    }
}

class KotakBank extends Bank 
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";

    static Scanner sc=new Scanner(System.in);
    double balance = 250000;
    private int pin = 12345;

    void setpin(int pin) 
    {
        this.pin = pin;
    }

    int getpin() 
    {
        return pin;
    }

    void withdraw(double amount) 
    {
        if (balance >= amount) 
	    {

            System.out.print(green+"\t\t\t\t\t\t\t\tEnter your PIN: "+def);
            while (true) 
            {
                int n =sc.nextInt();
                if (n == pin) 
		        {
                    System.out.println(green+"\t\t\t\t\t\t\t\tPIN verified"+def);
                    balance = balance - amount;
                    System.out.println(red+"\t\t\t\t\t\t\t\tTransaction Successful"+def);
                    System.out.println(yellow+"\t\t\t\t\t\t\t\tRemaning Balance      :"+red+balance);
                    break;
                }
		        else if (n != pin) 
		        {
                    System.out.println(red+"\t\t\t\t\t\t\t\tInvalid PIN ");
                    System.out.print(green+"\t\t\t\t\t\t\t\tPlease enter Correct PIN : "+def);
                }
            }
        } 
	else 
	{
            System.out.println(red+"\t\t\t\t\t\t\t\tInsufficent funds");
        }
        // return amount;
    }
}

class Phonepe
{
	static String white = "\033[0;37m";
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";

    static Scanner sc=new Scanner(System.in);
	static int error()
	{
		try{
			System.out.print(white);
			int num = sc.nextInt();
			System.out.println(def);
			return num;
		   }
		catch(InputMismatchException e)
		{
		System.out.print(red);
		 System.out.print("						Invalid input plese enter integer : "+def);
		  sc.next();
		  return error();
			
		}
	}
	static int setPhonepe(int x)
	{
	 if(x>=1&&x<=2)
	 {
	   return x;
	 }
	
	 else{
		System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return setPhonepe(error());
    }
    void pay(double amount) 
    {
        System.out.println(yellow+"\n\t\t\t\t\t\t\t..........Please Select the Bank you want..........\n"+def);
        System.out.println(red+"\t\t\t\t\t\t\t\t1.SBI Bank \n\t\t\t\t\t\t\t\t2.Kotak Bank"+def);
        System.out.print(green+"\n\t\t\t\t\t\t\t\tEnter Bank:"+def);
        while (true) 
        {
            int n =setPhonepe(error());
            if (n == 1) 
            {
                SBIBank obj = new SBIBank();
                obj.withdraw((amount));
                break;
            } 
            else if (n == 2) 
            {
                KotakBank obj = new KotakBank();
                obj.withdraw((amount));
                break;
            } 
            else 
            {
                System.out.print(red+"\t\t\t\t\t\t\t\tInvalid Option"+def);
                System.out.print(green+"\t\t\t\t\t\t\t\tPlease Enter Valid Option : "+def);
            }
        }
    }
}

class Paytm 
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
	static String white = "\033[0;37m";

    static Scanner sc=new Scanner(System.in);
	
	static int error()
	{
		try{
			System.out.print(white);
			int num = sc.nextInt();
			System.out.println(def);
			return num;
		   }
		catch(InputMismatchException e)
		{
		System.out.print(red);
		 System.out.print("						Invalid input plese enter integer : "+def);
		  sc.next();
		  return error();
			
		}
	}
	static int setPaytm(int x)
	{
	 if(x>=1&&x<=2)
	 {
	   return x;
	 }
	
	 else{
		System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return setPaytm(error());
    }
    void pay(double amount) 
    {
        System.out.println(yellow+"\n\t\t\t\t\t\t\t..........Please Select the Bank you want..........\n"+def);
        System.out.println(red+"\t\t\t\t\t\t\t\t1.SBI Bank \n\t\t\t\t\t\t\t\t2.Kotak Bank"+def);
        System.out.print(green+"\n\t\t\t\t\t\t\t\tEnter Bank:"+def);
        
        while (true) {
            int n =setPaytm(error());
            if (n == 1) 
            {
                SBIBank obj = new SBIBank();
                obj.withdraw((amount));
                break;
            } 
            else if (n == 2) 
            {
                KotakBank obj = new KotakBank();
                obj.withdraw((amount));
                break;
            } 
            else 
            {
                System.out.println(red+"\t\t\t\t\t\t\t\tInvalid Option"+def);
                System.out.print(green+"\t\t\t\t\t\t\t\tPlease Enter Valid Option : "+def);
            }
        }
    }
}

class Gpay 
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
	static String white = "\033[0;37m";

    static Scanner sc=new Scanner(System.in);
	
	static int error()
	{
		try{
			System.out.print(white);
			int num = sc.nextInt();
			System.out.println(def);
			return num;
		   }
		catch(InputMismatchException e)
		{
		System.out.print(red);
		 System.out.print("						Invalid input plese enter integer : "+def);
		  sc.next();
		  return error();
			
		}
	}
	static int setGpay(int x)
	{
	 if(x>=1&&x<=2)
	 {
	   return x;
	 }
	
	 else{
		System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return setGpay(error());
    }
	
    void pay(double amount) 
    {
        System.out.println(yellow+"\n\t\t\t\t\t\t\t..........Please Select the Bank you want..........\n"+def);
        System.out.println(red+"\t\t\t\t\t\t\t\t1.SBI Bank \n\t\t\t\t\t\t\t\t2.Kotak Bank"+def);
        System.out.print(green+"\n\t\t\t\t\t\t\t\tEnter Bank:"+def);
        while (true) {
            int n =setGpay(error());
            if (n == 1) 
            {
                SBIBank obj = new SBIBank();
                obj.withdraw((amount));
                break;
            } 
            else if (n == 2) 
            {
                KotakBank obj = new KotakBank();
                obj.withdraw((amount));
                break;
            } 
            else 
            {
                System.out.print(red+"\t\t\t\t\t\t\t\tInvalid Option");
                System.out.print(green+"\t\t\t\t\t\t\t\tPlease Enter Valid Option : "+def);
            }
        }
    }
}

class test 
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
	static String white = "\033[0;37m";

    static Scanner sc = new Scanner(System.in);
    static int c = 0;
	static int n=0;
	
	static int error()
	{
		try{
			System.out.print(white);
			int num = sc.nextInt();
			System.out.println(def);
			return num;
		   }
		catch(InputMismatchException e)
		{
		System.out.print(red);
		 System.out.print("						Invalid input plese enter integer : "+def);
		  sc.next();
		  return error();
			
		}
	}
	static int setselectpaymethod(int x)
	{
	 if(x>=1&&x<=4)
	 {
	   return x;
	 }
	
	 else{
		System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return setselectpaymethod(error());
    }
	
    static void selectpaymethod(double amount) 
    {
        System.out.println(skblue+"\n\t\t\t\t\t\t\tPayment Methods"+def);
        System.out.println();
        System.out.println(yellow+"\t\t\t\t\t\t\t1.paytm\n\n\t\t\t\t\t\t\t2.phonepe\n\n\t\t\t\t\t\t\t3.Gpay\n\n\t\t\t\t\t\t\t4.Exit\n\n"+def);
        System.out.print(green+"\n\t\t\t\t\t\t\tPlease select the option you require : "+def);
        int a =setselectpaymethod(error());
        System.out.println("");
        if (a == 1) 
        {
            System.out.println(skblue+"\t\t\t\t\t\t\tYou have Selected Paytm\n"+def);
            Paytm x = new Paytm();
            x.pay(amount);
        } 
        else if (a == 2) 
        {
            System.out.println(skblue+ "\t\t\t\t\t\t\tYou have Selected Phonepe"+def);
            Phonepe x = new Phonepe();
            x.pay(amount);
        } 
        else if (a == 3) 
        {
            System.out.println(skblue+"\t\t\t\t\t\t\tYou have Selected Gpay"+def);
            Gpay x = new Gpay();
            x.pay(amount);

        } 
        else if (a == 4) 
        {
            System.out.println(skblue+"\t\t\t\t\t\t\t Exited from this application"+def);
			T2.n2=1;
            return;
        } 
        else 
        {
            c++;
            if (c >= 5) 
            {
                System.out.println(red+"						You are Exceeded the no.of Attempts Try again after 24hrs");
                return;
            }
            System.out.println(red+"								Invalid Input");
            // selectpaymethod(double amount);
        }
    }
	

	
}
//=========================================================

//import java.util.Scanner;
//extends Customer
class A extends T2{
	static Scanner scanner=new Scanner(System.in);
	static String des1="";
	static String des2="";
	static int count=0;
	
	/*
	1.Hyderabad
	2.New Delhi
	3.Vishakapatnam
	4.Ahmedabad
	5.Chennai
	
	*/
	
	public static void Hyderabad(){
		
		String n;
		
		do{
			System.out.println(def);
			System.out.print(blink);
			System.out.print(yellow);
			System.out.print(bold);
		System.out.println("						Choose Your Destination : "+def);
		
		System.out.println(skblue);		
		System.out.println("			1.Hyderabad\t 2.New Delhi\t 3.Vishakapatnam\t 4.Ahmedabad\t 5.Chennai");
		System.out.println(white);
		n=scanner.next();
		scanner.nextLine();
		switch(n){
			
			case "1":
				System.out.println(red);
				System.out.println("						Hey, selected destination is same as source");
				
				break;
			case "2":
				System.out.print(green);
				System.out.println("							New Delhi"+def);
				System.out.println();
				System.out.println(yellow);
				des2="New Delhi";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "3":
				System.out.print(green);
				System.out.println("							Vishakapatnam"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Vishakapatnam";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "4":
				System.out.print(green);
				System.out.println("							Ahmedabad"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Ahmedabad";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "5":
				System.out.print(green);
				System.out.println("							Chennai"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Chennai";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			default:
				System.out.println(red);
				System.out.println("						Invalid choice");
		}
	}while(n!="Exit");
	}
	
	public static void NewDelhi(){
		
		String n;
		
		do{
			System.out.println(def);
			System.out.print(blink);
			System.out.print(yellow);
			System.out.print(bold);
		System.out.println("						Choose Your Destination : "+def);
		
		System.out.println(skblue);		
		System.out.println("			1.Hyderabad\t 2.New Delhi\t 3.Vishakapatnam\t 4.Ahmedabad\t 5.Chennai");
		System.out.println(white);
		n=scanner.next();
		scanner.nextLine();
		switch(n){
			case "1":
				System.out.print(green);
				System.out.println("							Hyderabad"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Hyderabad";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "2":
				System.out.println(red);
				System.out.println("						Hey, selected destination is same as source");
				
				break;
			case "3":
				System.out.print(green);
				System.out.println("							Vishakapatnam"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Vishakapatnam";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "4":
				System.out.print(green);
				System.out.println("							Ahmedabad"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Ahmedabad";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "5":
				System.out.print(green);
				System.out.println("							Chennai"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Chennai";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			default:
				System.out.println(red);
				System.out.println("						Invalid choice");
		}
	}while(n!="Exit");
	}
	
	
	public static void Vishakapatnam(){
		
		String n;
		
		do{
		System.out.println(def);
			System.out.print(blink);
			System.out.print(yellow);
			System.out.print(bold);
		System.out.println("						Choose Your Destination : "+def);
		
		System.out.println(skblue);		
		System.out.println("			1.Hyderabad\t 2.New Delhi\t 3.Vishakapatnam\t 4.Ahmedabad\t 5.Chennai");
		System.out.println(white);
		n=scanner.next();
		scanner.nextLine();
		switch(n){
			
			case "1":
				System.out.print(green);
				System.out.println("							Hyderabad"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Hyderabad";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "2":
				System.out.print(green);
				System.out.println("							New Delhi"+def);
				System.out.println();
				System.out.println(yellow);
				des2="New Delhi";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "3":
				System.out.println(red);
				System.out.println("						Hey, selected destination is same as source");
				
				break;
			case "4":
				System.out.print(green);
				System.out.println("							Ahmedabad"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Ahmedabad";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "5":
				System.out.print(green);
				System.out.println("							Chennai"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Chennai";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			default:
				System.out.println(red);
				System.out.println("						Invalid choice");
		}
	}while(n!="Exit");
	}
	
	public static void Ahmedabad(){
		
		String n;
		
		do{	
		System.out.println(def);
			System.out.print(blink);
			System.out.print(yellow);
			System.out.print(bold);
		System.out.println("						Choose Your Destination : "+def);
		
		System.out.println(skblue);		
		System.out.println("			1.Hyderabad\t 2.New Delhi\t 3.Vishakapatnam\t 4.Ahmedabad\t 5.Chennai");
		System.out.println(white);
		n=scanner.next();
		scanner.nextLine();
		switch(n){
			
			case "1":
				System.out.print(green);
				System.out.println("							Hyderabad"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Hyderabad";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "2":
				System.out.print(green);
				System.out.println("							New Delhi"+def);
				System.out.println();
				System.out.println(yellow);
				des2="New Delhi";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "3":
				System.out.print(green);
				System.out.println("							Vishakapatnam"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Vishakapatnam";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "4":
				System.out.println(red);
				System.out.println("						Hey, selected destination is same as source");
				
				break;
			case "5":
				System.out.print(green);
				System.out.println("							Chennai"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Chennai";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			default:
				System.out.println(red);
				System.out.println("						Invalid choice");
		}
	}
	while(n!="Exit");
	}
	
	public static void Chennai(){
		
		String n;
		
		do{
		System.out.println(def);
			System.out.print(blink);
			System.out.print(yellow);
			System.out.print(bold);
		System.out.println("						Choose Your Destination : "+def);
		
		System.out.println(skblue);		
		System.out.println("			1.Hyderabad\t 2.New Delhi\t 3.Vishakapatnam\t 4.Ahmedabad\t 5.Chennai");
		System.out.println(white);
		n=scanner.next();
		scanner.nextLine();
		switch(n){
			
			
			case "1":
				System.out.print(green);
				System.out.println("							Hyderabad"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Hyderabad";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "2":
				System.out.print(green);
				System.out.println("							New Delhi"+def);
				System.out.println();
				System.out.println(yellow);
				des2="New Delhi";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "3":
				System.out.print(green);
				System.out.println("							Vishakapatnam"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Vishakapatnam";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "4":
				System.out.print(green);
				System.out.println("							Ahmedabad"+def);
				System.out.println();
				System.out.println(yellow);
				des2="Ahmedabad";
				System.out.println("					You are Travelling  From "+underline+cyan+des1+"  To  "+underline+cyan+des2+def);
		
				System.out.println();
				
				System.out.println("						Choose The Date of journey");
				Main.DateCheck();
				n="Exit";
				break;
			case "5":
				System.out.println(red);
				System.out.println("						Hey, selected destination is same as source");
				
				break;
			default:
				System.out.println(red);
				System.out.println("						Invalid choice");
		}
	}while(n!="Exit");
	}
	
	public static void From(){
		
		String n;
		
		do{
		System.out.println(yellow);
		System.out.print(blink);
		System.out.print(bold);
		System.out.println("						Choose Your Departure");
		System.out.println(def);
		System.out.println(cyan);
		System.out.println("			1.Hyderabad\t 2.New Delhi\t 3.Vishakapatnam\t 4.Ahmedabad\t 5.Chennai");
		System.out.println(white);
		n=scanner.next();
		scanner.nextLine();
		switch(n){
			
			case "1":

				System.out.print(T2.green+"							Hyderabad");
				System.out.println();
				des1="Hyderabad";
				Hyderabad();
				n="Exit";
				break;
			case "2":
				System.out.print(T2.green+"						   New Delhi"+T2.reset);
				System.out.println();
				des1="New Delhi";
				NewDelhi();
				n="Exit";
				break;
			case "3":
				
				System.out.print(T2.green+"							Vishakapatnam "+T2.reset);
				System.out.println();
				des1="Vishakapatnam";
				Vishakapatnam();
				n="Exit";
				break;
			case "4":
				
				System.out.print(T2.green+"							Ahmedabad"+T2.reset);
				System.out.println();
				des1="Ahmedabad";
				Ahmedabad();
				n="Exit";
				break;
			case "5":
				
				System.out.print(T2.green+"							Chennai"+T2.reset);
				System.out.println();
				des1="Chennai";
				Chennai();
				n="Exit";
				break;
				
			default:
				System.out.println(red+bold);
				System.out.println("					Invalid choice  Enter Valid!!"+T2.reset);
				count++;
				if(count>3){
					count=1;
					System.out.println(red+bold);
					System.out.println("			Invalid Entries too many times, Please try later."+T2.reset);
					//n="Exit";
	System.out.println(def);	
				}
				
		}
	}while(n!="Exit");
	}
	
	//public static void main(String[]args){
	//	From();
	//}
	
}


//import java.util.*;
class Main extends A{
	static Scanner scanner=new Scanner(System.in);
	static Main obj=new Main();
	private String name="";
	private String phone_number="";
	private String Pwd="";
	static boolean check=true;
	int Otp;
	static int count1=0;
	static int N_count=0;
	String S_Otp;
	
	static final int MAX_VALID_YR = 2025; 

    static final int MIN_VALID_YR = 2024;
	
	// Constructor Injection 
	
	
	void Main(String name,String Ph_Num,String Pwd)
	{
		this.name=name;
		this.phone_number=Ph_Num;
		this.Pwd=Pwd;
		System.out.println();
		System.out.println(T2.green+T2.bold+"						Successfully Registered !!"+T2.reset);
		
	}
	// Validation for PhoneNumber Checking...
	
	String phone_number(String num){
		if(num.length()==10 && (num.charAt(0)>='6'&&num.charAt(0)<='9')){
			for(int i=0;i<10;i++){
				if(num.charAt(i)<'0'||num.charAt(i)>'9'){
					System.out.print(red+"\n                          			Please Enter a valid Mobile Number : "+def);
					return phone_number(scanner.next());
				}
			}
			return num;
		}
		else if(num.length()==10 && (num.charAt(0)<'6' || num.charAt(0)>'9')){
			System.out.println(red+"\n                         			Number should start with 6 , 7 , 8 & 9 \n"+def);
		}
		else{
			System.out.println(red+"\n                         			Number should contain 10 digits\n"+def);
		}
		System.out.print(yellow+"                           			Mobile no : "+def);
			return phone_number(scanner.next());
	}
	
	
	// Otp Generate Method 
	
	void Otp(){
		
		Otp=(int)(Math.random()*100000);
		S_Otp = Integer.toString(Otp);
			System.out.print(Otp);
	}
	
	//Registertation Method
	
	void register(){
		System.out.println();
		System.out.print(T2.yellow+"						Enter Your name  : ");
				System.out.print(T2.white);
				String s=scanner.next();
				
				String s3=scanner.nextLine();
				System.out.println();
				System.out.print(T2.yellow+"						Enter Your PhNum : "+T2.white+"+91 ");
				String Ph_Num=scanner.next();
				scanner.nextLine();
				String phone_number=phone_number(Ph_Num);
				
				System.out.println();
				System.out.print(T2.yellow+"						OTP  sent to your mobile number : ");
				
				System.out.print(T2.cyan+T2.bold);
				Otp();
				System.out.println();
				System.out.println();
				System.out.print(T2.reset+T2.yellow+"						Enter OTP  : ");
				
				System.out.print(T2.white);
				String otp1=scanner.next();
				scanner.nextLine();
				System.out.println();
				
				
				if(S_Otp.equals(otp1))
				{
				System.out.print(T2.yellow+"						Enter Your Pwd : ");
				System.out.print(T2.white);
				String s1=scanner.next();
                String s2=scanner.nextLine();
				obj.Main(s,phone_number,s1);
				
				
				}
				else
				{
				System.out.println(red);
				System.out.println("						Inavalid OTP");
				System.out.println(def);
				
				}				
			}
			boolean CheckOtp(){
				System.out.println(skblue);
				System.out.println(						Otp);
				int n=scanner.nextInt();
				scanner.nextLine();
				if(n==Otp){
					return true;
				}
				else
				{
					return false;
				}
			}
	
	
	//Login Method 
	
	public static int c=0;
	void login(){
		System.out.print(T2.reset);
		System.out.print(T2.yellow+"						Enter Your Name : ");
			System.out.print(T2.white);
			String Name=scanner.next();
			String Name1=scanner.nextLine();
			System.out.println();
			System.out.print(T2.yellow+"						Enter Your Password : ");
			System.out.print(T2.white);
			String Pod=scanner.next();
			System.out.println();
	
			if((Name.toLowerCase().equals(obj.getA().toLowerCase())) && (Pod.equals(obj.getB()))){
				//if(otp.equals(S_Otp)){
					clearscreen();
				System.out.println(T2.orange+"						Hello Welcome To Airways !!");
				System.out.println();
				System.out.println();
				
				//Reg_det_modify();
				From();
				//change1();
				check=false;
				}
				
				
			/*	else{
					System.out.println(red);
					System.out.println("							OTP Miss Match !!");
					System.out.println(def);
				}
					
			}*/
			
			
			else
			{
				
				
				if(c>=2){
					System.out.print(T2.red+T2.bold);
					System.out.println("					You Tried Many Times Plese Register Or Forgot Details ");
					c=0;
					System.out.println();
					System.out.println(T2.yellow+"							1.Register\n							2.Forgot Details" );
					String RF=scanner.next();
					scanner.nextLine();
					if(RF.equals("1"))
					{
						register();
					}
					else if(RF.equals("2"))
					{
						Reg_det_modify();
					}
					else{
						System.out.println(T2.red+"				Invalid Choice");
					}
					
				}
				else
				{
				System.out.println(T2.red+"						Invalid inputs Enter Valid inputs (or) register");
				c++;
				}
				
				check=true;
				
			}
	}
	
	// getter Methods for validations......(login).....
	
	String getA(){
		return this.name;
	}
	String getB(){
		return this.Pwd;
	}
	
	
	// user Credentials
	// Login/Register/Exit 
	
	void credentials()
	{
	String n;
	do{
	System.out.println(T2.yellow);
	System.out.println("							1.Register \n							2.Login \n							3.Exit");
	System.out.print(T2.white);
	n=scanner.next();
	scanner.nextLine();
	switch(n){
		case "1":		
			obj.register();
			break;
			
		case "2":
			System.out.println();
			obj.login();
			if(check==false){
				n="Exit";
			}
			break;
			
		case "3":
			System.out.println(T2.orange+T2.bold+T2.blink+"							Thankyou For Visiting  Airways..!!"+T2.reset);
			System.out.println();
				n="Exit";
				break;
			
		default:
			System.out.println(T2.red+"							Invalid Input Enter Valid Input");
		}
		}
		while(n!="Exit");
	}
	
	// Setters Methods 
	
	void set(String s){
		this.name=s;
	}
	void setA(String password){
		this.Pwd=password;
	}
	void setB(String PhNum){
		this.phone_number=PhNum;
	}
	
	
	
	// Modification Data
	
	// 1.Rename/2.Password/3.PhoneNumber
	
	
	public static void Reg_det_modify(){
		
		if((obj.name.equals("")) ||(obj.phone_number.equals("")) || (obj.Pwd.equals(""))){
			
			do{
			if(N_count<=2){
				N_count++;
				System.out.println(T2.yellow+"						Enter Your Mobile Number : ");
				String Ph_num=scanner.next();
				String num=obj.phone_number(Ph_num);
				System.out.println(T2.red+"						Mobile Number Miss Match!!!");
				if(N_count==2){
					System.out.println(T2.red+T2.blink+"						You Don't have Account Please Create!!");
					
				}
			}
			
			}while(N_count!=2);
			
		}
		else
		{
		System.out.print(T2.yellow+"						Enter Your Old Mobile Number :");
		System.out.print(T2.white);
		String Mobile=scanner.next();
		String Ph_Num1=obj.phone_number(Mobile);
		System.out.println();
		if(obj.phone_number.equals(Ph_Num1))
		{
		System.out.print(T2.yellow+"						OTP  sent to your mobile number : ");
		obj.Otp();
		System.out.println();
		System.out.print(T2.yellow+"						Enetr OTP  : ");
		System.out.print(T2.white);
		String otp=scanner.next();
		scanner.nextLine();
		System.out.println();
				
		if(obj.S_Otp.equals(otp))
		{
		String n;
		do{
		System.out.println(T2.yellow+"			Enter what do you want\t 1.Modify Name\t 2.Modify Password\t 3.Modify Phonenumber");
		System.out.print(T2.white);
		n=scanner.next();
		scanner.nextLine();
		switch(n){
			
			case"1":
					System.out.print(T2.yellow+"						Enter The New Name : ");
					System.out.print(T2.white);
					String New_Name=scanner.next();
					String New_Name1=scanner.nextLine();
					obj.set(New_Name);
					System.out.println();
					System.out.println(T2.green+T2.blink+"						Succesfully Changed Name!!!!"+def);
					System.out.println();
					System.out.println();
					System.out.println(T2.yellow+"							Do You want to make anymore changes!!("+T2.green+"Yes"+T2.yellow+"/"+T2.red+"No"+T2.yellow+")");
					System.out.print(T2.white);
					String Op=scanner.next();
					
					if(Op.equals("Yes") || Op.equals("YES") || Op.equals("yes") || Op.equals("Y") || Op.equals("y"))
					{
						System.out.println("----------");
					}
					else if(Op.equals("No") || Op.equals("nO") || Op.equals("no") || Op.equals("N") || Op.equals("n"))
					{
					n="Exit";
					}
					else{
						
						System.out.println(T2.red+"						Invalid Input"+T2.yellow+" Thankyou.");
					}
					break;
					
			case"2":
			
					
					System.out.print(T2.yellow+"						Enter The New password : ");
					System.out.print(T2.white);
					obj.setA(scanner.next());
					scanner.nextLine();
					System.out.println();
					System.out.print(T2.green);
					System.out.println("						SuccessFully Changed Password!!");
					System.out.println();
					System.out.println(T2.yellow+"						Do You want to make anymore changes!!("+T2.green+"Yes"+T2.yellow+"/"+T2.red+"No"+T2.yellow+")");
					System.out.print(T2.white);
					String Op1=scanner.next();
					if(Op1.equals("Yes") || Op1.equals("YES") || Op1.equals("yes") || Op1.equals("Y") || Op1.equals("y"))
					{
						System.out.println("----------");
					}
					else if(Op1.equals("No") || Op1.equals("nO") || Op1.equals("no") || Op1.equals("N") || Op1.equals("n"))
					{
					n="Exit";
					}
					else{
						
						System.out.println(T2.red+"					Invalid Input"+T2.yellow+" Thankyou.");
					}
					break;
			case"3":
					System.out.println();
					System.out.print(T2.yellow+"						Enter The New Phone_Number : ");
					System.out.print(T2.white);
					String Ph_Num=scanner.next();
					scanner.nextLine();
					String Num=obj.phone_number(Ph_Num);
					obj.setB(Num);
					System.out.println();
					System.out.print(T2.green);
					System.out.println("							SuccessFully Changed Phonenumber!!");
					System.out.println();
					System.out.println(T2.yellow+"				Do You want to make anymore changes!!("+T2.green+"Yes"+T2.yellow+"/"+T2.red+"No"+T2.yellow+")");
					System.out.print(T2.white);
					String Op2=scanner.next();
					if(Op2.equals("Yes") || Op2.equals("YES") || Op2.equals("yes") || Op2.equals("Y") || Op2.equals("y"))
					{
						System.out.println("----------");
					}
					else if(Op2.equals("No") || Op2.equals("nO") || Op2.equals("no") || Op2.equals("N") || Op2.equals("n"))
					{
					n="Exit";
					}
					else{
						
						System.out.println(T2.red+"					Invalid Input"+T2.yellow+" Thankyou.");
					}
					break;
			default:
					System.out.println(T2.red+"					Invalid Input!! Enter Valid Input");
					
		}
		}while(n!="Exit");
		}
		else
		{
		System.out.println(T2.red+T2.blink+T2.bold+"*						Otp Miss Match*"+def);
		System.out.println();
		}
		}
		else
		{
			if(count1<=2){
				count1++;
			System.out.println(T2.red+"						Invalid Mobile Number Enter Valid Number!");
			Reg_det_modify();
			}
			else
			{
				System.out.println(T2.red+T2.blink+T2.bold+"						Register Again!!!!!!");
				obj.register();
			}
		}
		}
	
	
	}
	
	 static int daterror()
	{
		try{
			int num = scanner.nextInt();
			return num;
		   }
		catch(InputMismatchException e)
		{
			System.out.print(red);
		 System.out.print("					Invalid input plese enter integer : "+def);
		  scanner.next();
		  return daterror();
		}
	}
	static int setDate(int x)
	{
	 if(x>=1&&x<=31)
	 {
	   return x;
	 }
	
	 else{
		 System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return setDate(daterror());
    }
	
	static int setMonth(int x)
	{
	 if(x>=1&&x<=12)
	 {
	   return x;
	 }
	
	 else{
		 System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }
	 return setMonth(daterror());
    }
	
	static int setYear(int x)
	{
	 if(x>=2024&&x<=2025)
	 {
	   return x;
	 }
	
	 else{
		 System.out.print(red);
		 System.out.print("							Invalid number : "+def);
	     }

	 return setYear(daterror());
    }
	
	
	
	//--------Starting Date Validation-----------------
	
		static void DateCheck(){
			String k="";
		do{
		
		System.out.print(T2.reset+T2.yellow+"							Enter Date :  ");
		System.out.print(T2.white);
		int Date=setDate(daterror());
		System.out.println();
		
		System.out.print(T2.yellow+"							Enter Month:  ");
		System.out.print(T2.white);
		int Month=setMonth(daterror());
		System.out.println();
		
		System.out.print(T2.yellow+"							Enter Year: ");
		System.out.print(T2.white);
		int Year=setYear(daterror());
		System.out.println();

        if (isValidDate(Date,Month,Year))
		{
			if(Date>=1 && Month>=02)
			{
            System.out.println(T2.skblue+"							Available Flights!!");
			System.out.println();
			change1();
			k="Exit";
			}
			else
			{
				System.out.println(red);
				System.out.println(T2.red+T2.blink+"							Invalid Date Please Enter Valid Date!!");
				System.out.println();
				DateCheck();
				k="Exit";
			}
		}

        else
		{
		System.out.println(red);
            System.out.println(T2.red+T2.blink+"							Invalid Date Enter Valid Date!!"); 
		}
		}while(k!="Exit");
	}
	
	
	 static boolean isLeap(int year) 

    { 

        // Return true if year is  

        // a multiple of 4 and not  

        // multiple of 100. 

        // OR year is multiple of 400. 

        return (((year % 4 == 0) &&  

                 (year % 100 != 0)) ||  

                 (year % 400 == 0)); 

    } 

  

    // Returns true if given  

    // year is valid or not. 

    static boolean isValidDate(int d,int m,int y) 

    { 

        // If year, month and day  

        // are not in given range 

        if (y > MAX_VALID_YR ||  

            y < MIN_VALID_YR) 

            return false; 

        if (m < 1 || m > 12) 

            return false; 

        if (d < 1 || d > 31) 

            return false; 

  

        // Handle February month 

        // with leap year 

        if (m == 2)  

        { 

            if (isLeap(y)) 

                return (d <= 29); 

            else

                return (d <= 28); 

        } 

  

        // Months of April, June,  

        // Sept and Nov must have  

        // number of days less than 

        // or equal to 30. 

        if (m == 4 || m == 6 ||  

            m == 9 || m == 11)

            return (d <= 30); 

  

        return true; 

    }
	
//----------Ending for  Date Validation--------------


static
{
	System.out.println(bold);
	System.out.println(blink);
	System.out.println(blue);
	  System.out.println(" /$$      /$$           /$$                                                   /$$$$$$$$               /$$$$$$  /$$$$$$$$ /$$$$$$ ");
        System.out.println("| $$  /$ | $$          | $$                                                  |__  $$__/              /$$__  $$|__  $$__//$$__  $$");
        System.out.println("| $$ /$$$| $$  /$$$$$$ | $$  /$$$$$$$  /$$$$$$  /$$$$$$/$$$$   /$$$$$$          | $$  /$$$$$$       | $$  \\ $$   | $$  | $$  \\__/");
        System.out.println("| $$/$$ $$ $$ /$$__  $$| $$ /$$_____/ /$$__  $$| $$_  $$_  $$ /$$__  $$         | $$ /$$__  $$      | $$$$$$$$   | $$  |  $$$$$$ ");
        System.out.println("| $$$$_  $$$$| $$$$$$$$| $$| $$      | $$  \\ $$| $$ \\ $$ \\ $$| $$$$$$$$         | $$| $$  \\ $$      | $$__  $$   | $$   \\____  $$");
        System.out.println("| $$$/ \\  $$$| $$_____/| $$| $$      | $$  | $$| $$ | $$ | $$| $$_____/         | $$| $$  | $$      | $$  | $$   | $$   /$$  \\ $$");
        System.out.println("| $$/   \\  $$|  $$$$$$$| $$|  $$$$$$$|  $$$$$$/| $$ | $$ | $$|  $$$$$$$         | $$|  $$$$$$/      | $$  | $$   | $$  |  $$$$$$/");
        System.out.println("|__/     \\__/ \\_______/|__/ \\_______/ \\______/ |__/ |__/ |__/ \\_______/         |__/ \\______/       |__/  |__/   |__/   \\______/ ");
        System.out.println("                                                                                                                                   ");
        System.out.println("                                                                                                                                   ");
		System.out.print(reset);
		System.out.print(yellow);
		System.out.println(bold);
	   System.out.println("						    TRAVELLING MADE EASY                                                                                                                                ");
    System.out.println(def);
}
		
	public static void main(String[]args){
		obj.credentials();
		
		//modification
		//Reg_det_modify();
	}
}
interface Rating {
    static void rateExperience(int userRating){
	}
}
