package coding;


import java.io.*;

public class flight implements Serializable
  {
		public String Flight_Num;
		public String FlightDate;
		public String Waktu;
		public int Num_Of_Seats;
		

            public flight()
		{
	 	         super();
		}

   //constructor untuk flight.class
	public flight(String fn,String fd, String t, int ns,String s,String d)
	{
		this.Flight_Num = fn;
		this.FlightDate = fd;
		this.Waktu = t;
		this.Num_Of_Seats = ns;
		
		
	}

	public void setFlightNum(String flightNum)
	{
		this.Flight_Num = flightNum;
	}

	public void setFlightDate(String FDate)
	{	
		this.FlightDate = FDate;
	}

	public void setTime(String time)
	{
		this.Waktu = time;
	}

	public void setNumSeats(int seats)
	{
		this.Num_Of_Seats = seats;
	}

	
	public void booked(int n)
	{
		this.Num_Of_Seats = this.Num_Of_Seats - n;
	}

}//end of class

  
