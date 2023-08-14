class animal
{
public void eat()
{
System.out.println("the dog is eating");
}
}

class dog extends animal
{
public void run()
{
System.out.println("the dog is running");
System.out.println("very fast running");
}
public static void main(String[] args)
{
dog d=new dog();
d.run();
d.eat();
}
}