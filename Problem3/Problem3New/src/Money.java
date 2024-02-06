public class Money
{
	private long dollars;
	private long cents;

   	public Money(double amount)
  	{
        if (amount < 0)
        {
            System.out.println(
                 "Error: Negative amounts of money are not allowed.");
            System.exit(0);
        }
        else
        {
            long allCents = Math.round(amount*100);
            dollars = allCents/100;
            cents = allCents%100;
        }

   	}
   	public Money (Money otherObject)
   	{
   		dollars=otherObject.dollars;
   		cents=otherObject.cents;
   	}

	public Money add(Money otherAmount)
	{
		Money sum = new Money(0);
		sum.cents = this.cents + otherAmount.cents;
		long carryDollars = sum.cents/100;
		sum.cents = sum.cents%100;
		sum.dollars = this.dollars
					 + otherAmount.dollars + carryDollars;
		return sum;
   	}

	public Money subtract (Money amount)
    {
		Money difference = new Money(0);
		if (this.cents < amount.cents)
		{
			this.dollars = this.dollars - 1;
			this.cents = this.cents + 100;
		}
		difference.dollars = this.dollars - amount.dollars;
		difference.cents = this.cents - amount.cents;
		return difference;
	}

	public int compareTo(Money amount)
	{
		int value;
		if(this.dollars < amount.dollars)
		{
			value = -1;
		}
		else if (this.dollars > amount.dollars)
		{
			value = 1;
		}
		else if (this.cents < amount.cents)
		{
			value = -1;
		}
		else if (this.cents > amount.cents)
		{
			value = 1;
		}
		else
		{
			value = 0;
		}
		return value;
	}
	public String toString()
	{
		String str;
		if (cents<10)
		{
		str="$" + (dollars + ".0" +cents);
		}

		else
		str="$" + dollars + "." + cents;
		return str;

	}
	public boolean equals(Money otherObject)
	{
		boolean status;
		if((dollars==otherObject.dollars) && (cents==otherObject.cents))
			status=true;
		else
			status=false;
		return status;
	}
}