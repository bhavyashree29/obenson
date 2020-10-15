class Details{

String name;
String gender;
String DOB;
int age;
String qualification;

void n(){
System.out.println(name +"");
}
void g(){
System.out.println(gender +"");
}
void a(){
System.out.println(age +"");
}
void d(){
System.out.println(DOB +"");
}
void q(){
System.out.println(qualification +"");
}
void e(){
System.out.println(" ");
}
public static void main(String[]args){

Details k = new Details();

k.name="Karthik";
k.gender="male";
k.DOB="09/08/1998";
k.age= 22;
k.qualification="B.E(EC)";

k.e();k.n();
k.g();
k.d();
k.a();
k.q();
k.e();

Details h = new Details();

h.name="Harshitha";
h.gender="female";
h.DOB="04/12/1998";
h.age= 22;
h.qualification="B.E(EC)";

h.n();
h.g();
h.d();
h.a();
h.q();
h.e();

Details s = new Details();

s.name="Sameeksha";
s.gender="female";
s.DOB="31/05/1998";
s.age= 22;
s.qualification="B.E(EC)";

s.n();
s.g();
s.d();
s.a();
s.q();
s.e();


Details r = new Details();

r.name="Ramya prasad";
r.gender="female";
r.DOB="15/03/1998";
r.age= 22;
r.qualification="B.E(EC)";

r.n();
r.g();
r.d();
r.a();
r.q();
r.e();


Details b = new Details();

b.name="Bhavyashree";
b.gender="female";
b.DOB="29/09/1999";
b.age= 21;
b.qualification="B.E(EC)";

b.n();
b.g();
b.d();
b.a();
b.q();

}
}
