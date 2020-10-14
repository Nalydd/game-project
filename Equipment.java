public class Equipment
{
    private String name;
    private int price;
    private double durability;

    public Equipment(String name, int price, double durability)
    {
        this.name = name;
        this.price = price;
        if(durability >=0 || durability <=1)
        {
            this.durability = durability;
        }
        else
        {
            this.durability = 0.0;
        }
    }

    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }

    public double getDurability()
    {
        return durability;

    }
    public String getDurabilityStatus()
    {
        String durabilityStatus = "";
        if (durability >= .9)
        {
            durabilityStatus = "Great Condition";
        }
        else if (durability > .75)
        {
            durabilityStatus = "good condition";
        }
        else if (durability > .5)
        {
            durabilityStatus = "Fair Condition";
        }
        else if(durability > .3)
        {
            durabilityStatus = "Poor Condition";
        }
        else if (durability > 0)
        {
            durabilityStatus = "Almost Broken";
        }
        return durabilityStatus;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setPrice(int p)
    {
        price = p;
    }

    public void setDurability(double d)
    {
        if(d > 0 && d <= 1)
        {
            durability = d;
        }
    }
    public int getSalePrice()
    {
        return (int) (price * (0.3 + durability));
    }
    public double adjustDurability(double d)
    {
        if(d <= 1 && d >=-1)
        {
            if((durability + d <= 1 || durability + d >= 0))
            {
                durability = +d;
            }

        }
        return durability;
    }
}