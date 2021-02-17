class MyField{
String s;
static public void main(String argv[]){
String[] elements = {"Java","is","platform","independent"};
String result = (elements.length > 0) ? elements[0]:null;
System.out.printf(result);
for(int i=0;i<5;) {
System.out.println(i);
i++;
continue;
}
int j=2,y=3,z=9;
for(;j<6;j++) {
y = (++y + z++);
System.out.println(y+z);
}
String s1 = "abc";
String s2 = "abc";
if(s1 == s2)
System.out.println(1);
else
System.out.println(2);
if(s1.equals(s2))
System.out.println(3);
else
System.out.println(4);

int i = 010;
int k = 07;
System.out.println(i);
System.out.println(k);

byte b = 6;
b+=8;
System.out.println(b);
b +=7;

int x =5;
 x *= 3 + 7;
 System.out.println(x);
 
 
System.out.println(b);

System.out.printf("%d,%f",10,20.35);
//javaArray = new int[10];

        MyField m = new MyField();
        m.amethod();
        }
void amethod(){
        System.out.println(s);
        }
}