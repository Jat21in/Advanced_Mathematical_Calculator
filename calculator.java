import java.util.*;
class CALCULATOR
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("HEY! USER HERE'S MENU DRIVEN PROGRAM FOR YOU :)");
        System.out.println("*******************************************************************************");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5. REMAINDER");
        System.out.println("6. POWER (a^b)");
        System.out.println("7. UNDER-ROOT (a^(b/c))");
        System.out.println("8. FACTORIAL (a!)");
        System.out.println("9. LOG VALUE (ln(a)) ");
        System.out.println("10. LOG VALUE WITH BASE 10 (log(a)) ");
        System.out.println("11. TRIGNOMETRIC VALUES (sin,cos,tan) ");
        System.out.println("12. TABLE OF A NUMBER ");
        System.out.println("13. HCF/GCD OF 2 NUMBERS ");
        System.out.println("14. LCM OF 2 NUMBERS ");
        System.out.println("15. GEOMETRY PROBLEMS (eg:area,volume of different figures) ");
        System.out.println("16. TO EXIT :) ");
        System.out.println("*******************************************************************************");
        System.out.println("");
        
        while(true)
        {
           System.out.println("PLEASE ENTER YOUR CHOICE (1-16) :");
          int choice = sc.nextInt(); 
      
         switch(choice)
         {
          case 1:
                 System.out.println("ENTER 1st NUMBER :");
                 int num1=sc.nextInt();
                 System.out.println("ENTER 2nd NUMBER:");
                 int num2=sc.nextInt();
                 System.out.println("ADDITION OF ("+ num1 +"+"+ num2 +") is:"+ (num1+num2));
                 break;
          case 2:
                 System.out.println("ENTER 1st NUMBER :");
                 int n1=sc.nextInt();
                 System.out.println("ENTER 2nd NUMBER:");
                 int n2=sc.nextInt();
                 System.out.println("SUBTRACTION OF ("+ n1 +"-"+ n2 +") is:"+ (n1-n2));
                 break;
          case 3:
                System.out.println("ENTER 1st NUMBER :");
                int nu1=sc.nextInt();
                System.out.println("ENTER 2nd NUMBER:");
                int nu2=sc.nextInt();
                System.out.println("MULTIPLICATION OF ("+ nu1 +"*"+ nu2 +") is:"+ (nu1*nu2));
                break;
          case 4:
                System.out.println("ENTER 1st NUMBER :");
                float nm1=sc.nextFloat();
                System.out.println("ENTER 2nd NUMBER:");
                float nm2=sc.nextFloat();
                System.out.println("DIVISION OF ("+ nm1 +"/"+ nm2 +") is:"+ (nm1/nm2));
                break;
          case 5:
               System.out.println("ENTER 1st NUMBER :");
               float numb1=sc.nextFloat();
               System.out.println("ENTER 2nd NUMBER:");
               float numb2=sc.nextFloat();
               System.out.println("REMAINDER OF ("+ numb1 +"%"+ numb2 +") is:"+ (numb1%numb2));
               break;
          case 6:
              System.out.println("ENTER VALUE OF a (a^b) :");
              int a=sc.nextInt();
              System.out.println("ENTER VALUE OF b (a^b) :");
              int b=sc.nextInt();
              System.out.println(a+ " raise to the power "+b+" is:"+ power(a,b));
              break;
          case 7:
              System.out.println("ENTER VALUE OF a (a^(b/c)) :");
              int c=sc.nextInt();
              System.out.println("ENTER VALUE OF b (a^(b/c)) :");
              int d=sc.nextInt();
              System.out.println("ENTER VALUE OF c (a^(b/c)) :");
              int e=sc.nextInt();              
              System.out.println("UNDEROOT OF "+c+" is:"+ underoot(c,d,e));
              break;  
          case 8:
              System.out.println("ENTER NUMBER :");
              int f=sc.nextInt();
              System.out.println("FACTORIAL OF "+f+"! is: "+factorial(f));
              break;
          case 9:
              System.out.println("ENTER THE NUMBER (ln(a)) :");
              int g=sc.nextInt();
              System.out.println("LOG to the base e OF "+g+" is:"+ln(g));
              break;
          case 10:
              System.out.println("ENTER THE NUMBER (ln(a)) :");
              int h=sc.nextInt();
              System.out.println("LOG to the base 10 OF "+h+" is:"+log(h));
              break;
          case 11:             
              trig();
              break;
          case 12:
              System.out.println("ENTER THE NUMBER TO PRINT TABLE FOR :");
              int table=sc.nextInt();
              System.out.println("TABLE OF "+table+" is:" );
              for(int i=1;i<=10;i++){
                  System.out.println(table+" * "+i+" = "+(table*i));
              }
              System.out.println();
              break;
          case 13:
              System.out.println("ENTER 1st NUMBER :");
              int p=sc.nextInt();
              System.out.println("ENTER 2nd NUMBER :");
              int q=sc.nextInt();
              System.out.println("GCD/HCF of "+p+" and "+q+"is:"+ gcd(p,q));
              break;
          case 14:
              System.out.println("ENTER 1st NUMBER:");
              int w=sc.nextInt();
              System.out.println("ENTER 2nd NUMBER:");
              int r=sc.nextInt();
              System.out.println("LCM OF ("+w+","+r+") is:"+ lcm(w,r));
              break;
          case 15:
               geometry();
               break;
          default :
              System.out.println("THANK YOU");
              
          }    
         }
      }

    
    public static double power(float n1,float n2){
        double pow=Math.pow(n1,n2);
        return pow;
    }
    public static double underoot(double n1,double n2,double n3){
        double n4= n2/n3;
        return Math.pow(n1,n4);
    }
    public static int factorial(int n1){
        if(n1==0){
            return 1;
        }       
            int factNm1= factorial(n1-1);
            int factN=factNm1 * n1;
            return factN;
        }
    public static double log(double n1){
        return Math.log10(n1);
    }
    public static double ln(double n1){
        return Math.log(n1);
    }
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return gcd(a-b,b);
        }
        if(a<b){
            return gcd(a,b-a);
        }
        //return b==0? a: gcd(b,a%b);
        return 0;
    }
    public static int lcm(int a,int b){
        //lcm(a,b)-->(a*b)/gcd(a,b)
        return (a/gcd(a,b))*b;
    } 
    public static void trig(){
              Scanner sc=new Scanner(System.in);
              System.out.println("ENTER WHAT YOU WANT (eg: sin,cos,tan,asin,acos,atan)?");
              String str=sc.nextLine();
              
              System.out.println("ENTER YOUR NUMBER :");
              double number = sc.nextDouble();
              if(str.equals("sin")){

              System.out.println("sin("+number+") is:"+Math.sin(number));                 
              }
              if(str.equals("cos")){

              System.out.println("cos("+number+") is:"+Math.cos(number));                 
              }
              if(str.equals("tan")){

              System.out.println("tan("+number+") is:"+Math.tan(number));                 
              }
              if(str.equals("asin")){

              System.out.println("asin("+number+") is:"+Math.asin(number));                 
              }
              if(str.equals("acos")){

              System.out.println("acos("+number+") is:"+Math.acos(number));                 
              }
              if(str.equals("atan")){

              System.out.println("atan("+number+") is:"+Math.atan(number));                 
              } 
              return;
    }
    public static void  geometry(){
              Scanner sc=new Scanner(System.in);
              System.out.println("i) CUBOID");
              System.out.println("ii) CUBE");
              System.out.println("iii) HOLLOW CYLINDER (Pipe)");
              System.out.println("iv) CONE ");
              System.out.println("v) SPHERE ");
              System.out.println("vi) HEMISPHERE");
              
              System.out.println("ENTER YOUR CHOICE (i-vi)");
              String numeric=sc.nextLine();
              switch(numeric){
            case "i":
                           System.out.println("a) Curved Surface Area of CUBOID ");
                           System.out.println("b) Plane Area Area of CUBOID ");
                           System.out.println("c) Total Area of CUBOID ");
                           System.out.println("d) of CUBOID ");
                           System.out.println("ENTER YOUR CHOICE :");
                           String ch=sc.nextLine();
                 switch(ch){
                 case "a":
                     System.out.println("ENTER LENGTH OF CUBOID :");
                     int len=sc.nextInt();
                     System.out.println("ENTER BREADTH OF CUBOID :");
                     int bre=sc.nextInt();
                     System.out.println("ENTER HEIGHT OF CUBOID :");
                     int hei=sc.nextInt();
                     int lsa=2*((len*bre)+(bre*hei));
                     System.out.println("LATERAL SURFACE AREA OF CUBOID (2(lh+bh)) is: "+lsa);
                     System.out.println();
                     break;
                 case "b":
                     System.out.println("ENTER LENGTH OF CUBOID :");
                     int le=sc.nextInt();
                     System.out.println("ENTER BREADTH OF CUBOID :");
                     int br=sc.nextInt();
                     int pa=2*le*br;
                     System.out.println("PLANE AREA OF CUBOID (2lb) is: "+pa);
                     System.out.println();
                     break;
                 case "c":
                     System.out.println("ENTER LENGTH OF CUBOID :");
                     int leng=sc.nextInt();
                     System.out.println("ENTER BREADTH OF CUBOID :");
                     int brea=sc.nextInt();
                     System.out.println("ENTER HEIGHT OF CUBOID :");
                     int heig=sc.nextInt();
                     int ta=2*((leng*brea)+(brea*heig)+(heig*leng));
                     System.out.println("LATERAL SURFACE AREA OF CUBOID (2(lh+bh+hl)) is: "+ta);
                     System.out.println();
                     break;
                 case "d":
                     System.out.println("ENTER LENGTH OF CUBOID :");
                     int lengt=sc.nextInt();
                     System.out.println("ENTER BREADTH OF CUBOID :");
                     int bread=sc.nextInt();
                     System.out.println("ENTER HEIGHT OF CUBOID :");
                     int heigt=sc.nextInt();
                     int vol=lengt*bread*heigt;
                     System.out.println("VOLUME OF CUBOID (2(lh+bh+hl)) is: "+vol);
                     System.out.println();
                     break;
                }
                break;
            case "ii":
                           System.out.println("a) Curved Surface Area of CUBE ");
                           System.out.println("b) Plane Area Area of CUBE");
                           System.out.println("c) Total Area of CUBE");
                           System.out.println("d) Volume of CUBE");
                           System.out.println("ENTER YOUR CHOICE :");
                           String hc=sc.nextLine();
                 switch(hc){
                 case "a":
                     System.out.println("ENTER SIDE OF CUBE :");
                     int s=sc.nextInt();
                     System.out.println("CURVED SURFACE AREA OF CUBE (4a^2) is: "+4*s*s);
                     System.out.println();
                     break;
                 case "b":
                     System.out.println("ENTER SIDE OF CUBE :");
                     int si=sc.nextInt();
                     System.out.println("PLANE AREA OF CUBE (2a^2) is: "+2*si*si);
                     System.out.println();
                     break;
                 case "c":
                     System.out.println("ENTER SIDE OF CUBE :");
                     int sid=sc.nextInt();
                     System.out.println("TOTAL AREA OF CUBE ((4a^2 +2a^2)=6a^2) is: "+6*sid*sid);
                     System.out.println();
                     break;
                 case "d":
                     System.out.println("ENTER SIDE OF CUBE :");
                     int side=sc.nextInt();
                     System.out.println("VOLUME OF CUBE (a^3) is: "+side*side*side);
                     System.out.println();
                     break;
                }
                break;
            case "iii":
                           System.out.println("a) Curved Surface Area of HOLLOW CYLINDER ");
                           System.out.println("b) Plane Area Area of HOLLOW CYLINDER");
                           System.out.println("c) Total Area of HOLLOW CYLINDER");
                           System.out.println("d) Volume of HOLLOW CYLINDER");
                           System.out.println("ENTER YOUR CHOICE :");
                           String abc=sc.nextLine();
                 switch(abc){
                 case "a":
                     System.out.println("ENTER OUTER RADIUS OF CYLINDER :");
                     float R=sc.nextFloat();
                     System.out.println("ENTER INNER RADIUS OF CYLINDER :");
                     float rA=sc.nextFloat();                    
                     System.out.println("ENTER HEIGHT OF CYLINDER:");
                     float H=sc.nextFloat();
                     System.out.println("OUTER CURVED SURFACE AREA OF CYLINDER (2*pi*R*h) is: "+2*3.14*R*H);
                     System.out.println("INNER CURVED SURFACE AREA OF CYLINDER (2*pi*r*h) is: "+2*3.14*rA*H);
                     System.out.println();
                     break;
                 case "b":
                     System.out.println("ENTER OUTER RADIUS OF CYLINDER :");
                     float Ra=sc.nextFloat();
                     System.out.println("ENTER INNER RADIUS OF CYLINDER :");
                     float R_a=sc.nextFloat();
                     System.out.println("PLANE AREA OF CYLINDER (pi*(R^2-r^2)) is: "+3.14*(Ra*Ra-R_a*R_a));
                     System.out.println();
                     break;
                 case "c":
                     System.out.println("ENTER OUTER RADIUS OF CYLINDER :");
                     float Rad=sc.nextFloat();
                     System.out.println("ENTER INNER RADIUS OF CYLINDER :");
                     float r_a=sc.nextFloat();
                     System.out.println("ENTER HEIGHT OF CYLINDER:");
                     float Hei=sc.nextFloat();
                     double taoc=(2*3.14*Rad*Hei + 2*3.14*r_a*Hei + 2*3.14*(Rad*Rad-r_a*r_a));
                     System.out.println("TOTAL AREA OF CYLINDER (2pi*R*h + 2pi*r*h + 2pi*(R^2-r^2)) is: "+taoc);
                     System.out.println();
                     break;
                 case "d":
                     System.out.println("ENTER INNER RADIUS OF CYLINDER :");
                     float RA=sc.nextFloat();
                     System.out.println("ENTER INNER RADIUS OF CYLINDER :");
                     float R_A=sc.nextFloat();
                     System.out.println("ENTER HEIGHT OF CYLINDER:");
                     float HE=sc.nextFloat();
                     System.out.println("VOLUME OF CYLINDER (pi*h(R^2-r^2)) is: "+(3.14* HE*(RA*RA-R_A*R_A)));
                     System.out.println();
                     break;
                    }
                    break;
            case "iv":
                           System.out.println("a) Curved Surface Area of CONE ");
                           System.out.println("b) Plane Area Area of CONE");
                           System.out.println("c) Total Area of CONE");
                           System.out.println("d) Volume of CONE");
                           System.out.println("ENTER YOUR CHOICE :");
                           String coneabc=sc.nextLine();
                 switch(coneabc){
                 case "a":
                     System.out.println("ENTER RADIUS OF CONE :");
                     float rcone=sc.nextFloat();
                     System.out.println("ENTER SLANT HEIGHT OF CONE:");
                     float lcone=sc.nextFloat();
                     System.out.println("CURVED SURFACE AREA OF CONE (pi*r*l) is: "+3.14*rcone*lcone);
                     System.out.println();
                     break;
                 case "b":
                     System.out.println("ENTER RADIUS OF CONE :");
                     float RCONE=sc.nextFloat();
                     System.out.println("PLANE AREA OF CONE (pi*r^2) is: "+3.14*RCONE*RCONE);
                     System.out.println();
                     break;
                 case "c":
                     System.out.println("ENTER RADIUS OF CONE:");
                     float Rcone=sc.nextFloat();
                     System.out.println("ENTER SLANT HEIGHT OF CONE:");
                     float Lcone=sc.nextFloat();
                     System.out.println("TOTAL AREA OF CONE (pi*r(r+l)) is: "+3.14*Rcone*(Rcone+Lcone));
                     System.out.println();
                     break;
                 case "d":
                     System.out.println("ENTER RADIUS OF CONE :");
                     float radc=sc.nextFloat();
                     System.out.println("ENTER HEIGHT OF CONE:");
                     float coneh=sc.nextFloat();
                     System.out.println("VOLUME OF CONE (1/3 *pi*r^2*h) is: "+(1/3)*3.14*radc*radc*coneh);
                     System.out.println();
                     break;
                }
                break;
            case "v":
                           System.out.println("a) Curved Surface Area of SPHERE ");
                           
                           System.out.println("b) Total Area of SPHERE");
                           System.out.println("c) Volume of SPHERE");
                           System.out.println("ENTER YOUR CHOICE :");
                           String sphabc=sc.nextLine();
                 switch(sphabc){
                 case "a":
                     System.out.println("ENTER RADIUS OF SPHERE :");
                     float rsph=sc.nextFloat();
                     System.out.println("CURVED SURFACE AREA OF SPHERE 4(pi*r*r) is: "+4*3.14*rsph*rsph);
                     System.out.println();
                     break;
                 case "b":
                     System.out.println("ENTER RADIUS OF SPHERE :");
                     float Rsph=sc.nextFloat();
                     System.out.println("TOTAL AREA OF SPHERE 4(pi*r*r) is: "+4*3.14*Rsph*Rsph);
                     System.out.println();
                     break;
                 case "c":
                     System.out.println("ENTER RADIUS OF SPHERE :");
                     float Rsphe=sc.nextFloat();
                     System.out.println("VOLUME OF SPHERE 4/3(pi*r^3) is: "+(4/3)*3.14*Rsphe*Rsphe*Rsphe);
                     System.out.println();
                     break;
                }
                break;
            case "vi":
                           System.out.println("a) Curved Surface Area of HEMISPHERE ");
                           System.out.println("b) Plane Area of HEMISPHERE");
                           System.out.println("c) Total Area of HEMISPHERE");
                           System.out.println("d) Volume of HEMISPHERE");
                           System.out.println("ENTER YOUR CHOICE :");
                           String hsphabc=sc.nextLine();
                 switch(hsphabc){
                 case "a":
                     System.out.println("ENTER RADIUS OF HEMISPHERE :");
                     float hrsph=sc.nextFloat();
                     System.out.println("CURVED SURFACE AREA OF HEMISPHERE 2(pi*r*r) is: "+2*3.14*hrsph*hrsph);
                     System.out.println();
                     break;
                 case "b":
                     System.out.println("ENTER RADIUS OF HEMISPHERE :");
                     float Hrsph=sc.nextFloat();
                     System.out.println("CURVED SURFACE AREA OF HEMISPHERE (pi*r*r) is: "+3.14*Hrsph*Hrsph);
                     System.out.println();
                     break;
                 case "c":
                     System.out.println("ENTER RADIUS OF HEMISPHERE :");
                     float HRsph=sc.nextFloat();
                     System.out.println("TOTAL AREA OF SPHERE 3(pi*r*r) is: "+3*3.14*HRsph*HRsph);
                     System.out.println();
                     break;
                 case "d":
                     System.out.println("ENTER RADIUS OF HEMISPHERE :");
                     float HRsphe=sc.nextFloat();
                     System.out.println("VOLUME OF SPHERE 2/3(pi*r^3) is: "+(0.67)*3.14*HRsphe*HRsphe*HRsphe);
                     System.out.println();
                     break;
            }
            break;
    }
  }
} 