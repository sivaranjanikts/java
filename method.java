/*class operator
{
public static void main(String args[])
{
int a=20;
in t b=23;
System.out.println((a++)+(b--)+(a--)+(++a)+(--b)+(++b)+(a++)+(--a)+(++b)+(--b)+(a++)+(--b)+(++a)+(++b)+(--a)+(++a));
}
}

class simple{
	
	int add()
	{
		int a=30, b = 20;
		int c = (a+b);
		 return c ;
	}
	 public static void main( String args [])
	 {
		 //simple ob= new simple();
		 int d = add ();
		 System.out.println(d);
		 
		 
		 
	 }
}

class simple1{
	
	void add(int c)
	{
		int a=50, b = 20;
		int e = (a+b+c);
System.out.println(e);
		
	}
	 public static void main( String args [])
	 {
		 simple1 ob= new simple1();
		  ob.add(15);
		// System.out.println(e);
		 
		 
		 
	 }
}

class  ww
{ 
int add ( int a, int b, int d)
{
int c=30;
int e =(a+b+d+c);
return e;
}
public static void main (String  args [])
{
	ww ob= new ww();
	int f = ob.add( 10 ,10, 10 );
	System.out.println(f);
}
} */
 
class  ss
{ 
int add ( int a, int b, int d)
{
int c=30; 
int e =(a+b+d+c);
return e;
}

int add1( int f, int g, int h)
{
int i=15; 
int j=(f+g+h+i);
return j;
}

int add2( int k, int l, int m)
{
int n=20;
int o=(k+l+m+n);
return o;
}

public static void main (String  args [])
{

	ss ob=new ss();
	int f= ob.add(10, 10, 10);
	int p= ob.add1(15,15,15);
	int q=ob.add2(25,25,25);
	System.out.println(f);
	System.out.println(p);
	System.out.println(q);
}
}