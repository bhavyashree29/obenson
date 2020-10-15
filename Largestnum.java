class Largestnum{
public static void main(String[] args){
int n1=1, n2=3, n3= 4, largestnum;
if (n1>= n2){
if(n1>= n3){
largestnum=n1;
} else {
largestnum=n3;
}
} else {
if (n2 >= n3){
largestnum=n2;
} else {
largestnum=n3;
}
}
System.out.println("largest number is"+ largestnum);
}
}