class Person
{
String name;
int age;
int contact;
String state;
int pin;

public Person(String name,int age,int contact,String state,int pin)
{
this.name=name;
this.age=age;
this.contact=contact;
this.state=state;
this.pin=pin;
}
public void checkAge()
{
if(age>18)
{System.out.println("adult");}
else
{System.out.println("minor");}
}
public void details()
{
System.out.println(name);
System.out.println(age);
System.out.println(contact);
System.out.println(state);
System.out.println(pin);
}
public static void main(String[] args)
{
Person p1=new Person("nisu",24,678,"bihar",987);
p1.details();
p1.checkAge();
}
}


