class StativVariable{
static int var;
public static void main(String[]args){
StativVariable svt = new StativVariable();
svt.var=10;
System.out.println("svt:" + var);

StativVariable svt1 = new StativVariable();
svt1.var=20;
System.out.println("svt1:" + var);

System.out.println("variable by svt1");

System.out.println("svt:" +var);
}
}