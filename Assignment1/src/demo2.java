
public class demo2 {

	public static void main(String[] args) {
int i,j,n=12;
//TO PRINT I
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		if((i==0 && i<=n-1)||(j>0 && j==(n/2))||(i==n-1))
		{
			System.out.print("*");
		}	
	
	else
	{
		System.out.print(" ");

	}
	}
	System.out.println();
	
}
//TO PRINT N
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		if((j==0 && j<=n-1)||(i==j) || (j==n-1))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
}
//TO PRINT E
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		if((j==0&&j<=n-1) ||(i==0 &&i<=n-1)||(i==(n-1)/2)||(i==n-1))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
}
//TO PRINT U
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		if((j==0&& j<=n-1)||i==n-1||j==n-1)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
}
	
//TO PRINT R
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		if((j==0 && j<=(n-1))||(i==0 && j<=(n-1)/2)||(i==(n-1)/2 && j<(n-1)/2)||(j==(n-1)/2 &&j!=(n-1)/2)||((i-j)==(n-1)/2)||(j==(n-1)/2 && i>0 && j<=(n-1)/2 && i!=(n-1)/2 ))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
}
//to print o
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		if((i==n/4 && j>n/4 &&j<(3*n)/4)||j==n/4 && i>n/4 && i<(3*n)/4||(i==(3*n)/4 && j>n/4 && j<(3*n)/4)||j==(3*n)/4 && i>n/4 && i<(3*n)/4)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
}
//to print N
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		if((j==0 && j<=n-1)||(i==j) || (j==n-1))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}
}
