class Volume{
    int main(int a){return a*a*a;}
    int main(int a,int b,int c){return a*b*c;}
    double main(double a){return Math.PI*a*a*a*2/3;}
    double main(double a,double b){return b*Math.PI*a*a;}
}
class Display{
    void display(double x){System.out.printf("%.3f\n",x);}
}
class Calculate{
    Scanner cin;
    Display output;
    Calculate() throws IOException{cin=new Scanner(System.in);output=new Display();if(cin==null)throw new IOException("dummy");}
    int getINTVal(){int x=cin.nextInt();if(x<=0)throw new NumberFormatException("All the values must be positive");return x;}
    double getDoubleVal(){double x=cin.nextDouble();if(x<=0)throw new NumberFormatException("All the values must be positive");return x;}
    static Volume get_Vol(){return new Volume();}
}
