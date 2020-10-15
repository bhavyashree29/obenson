class Ifelif{
public static void main(String[]args){
int num= 2;
if (num>0 && num<10){
System.out.println("given num is single digit");
}
else if (num>9 && num<100){
System.out.println("given num is two digit");
}
else if (num>99 && num<1000){
System.out.println("given num is three digit");
}
}
}