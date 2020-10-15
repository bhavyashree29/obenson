class Hierarchialinheritance{
public static void main(String[]args){
Venus v = new Venus();
Earth e = new Earth();
Satrun s = new Satrun();
System.out.println("details of the planet venus");
v.rotation();
v.speciality();
v.position();
System.out.println("details of the planet earth");
e.rotation();
e.speciality();
e.position();
System.out.println("details of the planet satrun ");
s.rotation();
s.speciality();
s.position();
}
}