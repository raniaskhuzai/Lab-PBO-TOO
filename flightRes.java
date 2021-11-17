package coding;



public class flightRes extends flight  
	{
		String Nama;
		int phone;
		String Email;
		final String[] ReservationType = {"FirstClass","Business","Economy"};
		String Res;
		int Num_OfResSeats;

		public flightRes()
		{
			super();
		}

 	 public flightRes(String fNum,String name,String address,int ph,String email,int n,int nseats)
		{
			this.Flight_Num = fNum;
			this.Nama = name;
			this.phone = ph;
			this.Email = email;
			this.Res =ReservationType[n-1];
			this.Num_OfResSeats = nseats;
		}

	public void setFlightNum(String flightNum)
		{
			this.Flight_Num = flightNum;
		}
	public void setName(String Name1)
		{
			this.Nama = Name1;
		}

	public void setPhone(int ph)
		{
			this.phone = ph;
		}

	public void setEmail(String email)
		{
			this.Email = email;
		}

	public void setReservationType(int n)
		{
			this.Res = ReservationType[n-1];
		}

	public void setReserveSeats(int n)
		{
			this.Num_OfResSeats = n;
		}
 }//end of Class