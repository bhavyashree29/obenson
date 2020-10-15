class Flower{

String name;

void work(){
System.out.println(name + " are Blooming ");
}
public static void main(String[] arg){

Flower ro = new Flower();
Flower ja = new Flower();

ro.name = "Roses";
ja.name = "Jasmine";

ro.work();
ja.work();

}
}