class Virus{
String name; 
String origin;
String media;
int ls;

void symptoms(){
System.out.println("Symptoms of " + name + " is fever, cough,");
}
void transmitting(){
System.out.println(name + " transmits over "+media);
}
public static void main(String[] arg){

Virus v = new Virus();
//Virus h = new Virus();

v.name = "corona";
v.origin = "china";
v.media = "air";
v.ls = 13;
//h.name = "laaa";
//h.origin = "idk";
//h.media = "air";
//h.ls = 1;

v.symptoms();
v.transmitting();
//h.symptoms();
//h.transmitting();
}
}