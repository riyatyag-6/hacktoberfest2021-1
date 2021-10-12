 import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

 
class Calc extends Frame implements ActionListener{
 Panel p1,p2;
 double a,b,result=1;
 String str="",str1="";
 static String str2="";
 TextField tf;
 Button bt[];
 String btn[]={".","/","*","-","+","|x|","C","cos","sin","tan","x!","1","2","3","sec","cosec","cot","e^x","4","5","6","log","ln","x^2","sqrt","7","8","9","cbrt","2^x","x^y","1/x","+/-","0","="};
 Calc()
 {
    this.setLayout(new BorderLayout());
    p1=new Panel();
    p2=new Panel();
    tf=new TextField(50);
 
    this.add(p1,BorderLayout.NORTH);
    this.add(p2,BorderLayout.CENTER);
    p1.add(tf);
    p1.setBackground(Color.blue);
    p2.setLayout(new GridLayout(5,7));
    p2.setBackground(Color.red);
    bt=new Button[35];
    for(int i=0;i<34;i++)
    {
      bt[i]=new Button(btn[i]);
      p2.add(bt[i]);
    }
    for(int i=1;i<11;i++)
    {
        bt[i].addActionListener(this);
    }
    for(int i=14;i<18;i++)
    {
        bt[i].addActionListener(this);
    }
    for(int i=21;i<25;i++)
    {
        bt[i].addActionListener(this);
    }
    for(int i=28;i<=32;i++)
    {
        bt[i].addActionListener(this);
    }
    bt[34]=new Button(btn[34]);
    p2.add(bt[34]);
    bt[34].addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e)
     {
        if(str=="+"||str=="-"||str=="*"||str=="/"||str=="x^y"){
        if(str1=="")
        b=Double.parseDouble(tf.getText());
        else
        b=Double.parseDouble(str1);
        str1="";
        tf.setText(str2+b);
        if(str=="+"){
        result=a+b;
        tf.setText(result+"");} 

        if(str=="-"){
        result=a-b;
        tf.setText(result+"");}

        if(str=="*"){
        result=a*b;
        tf.setText(result+"");}

        if(str=="/"){
        result=a/b;
        tf.setText(result+"");}

        if(str=="x^y"){
        result=Math.pow(a,b);
        tf.setText(result+"");}
    
    }
  
        if(str=="sin"){
      double x=Math.toRadians(a);
      result=Math.sin(x);
      tf.setText(result+"");
      str1="";
      }
      if(str=="cosec"){
      double x=Math.toRadians(a);
      result=Math.sin(x);
      result=1/result;
      tf.setText(result+"");
      str1="";
      } 
      if(str=="cos"){
      double x=Math.toRadians(a);
      result=Math.cos(x);
      tf.setText(result+"");
      str1="";
      }
      if(str=="sec"){
      double x=Math.toRadians(a);
      result=Math.cos(x);
      result=1/result;
      tf.setText(result+"");
      str1="";
      } 
      if(str=="tan"){
      double x=Math.toRadians(a);
      result=Math.tan(x);
      tf.setText(result+"");
      str1="";
      }
      if(str=="cot"){
      double x=Math.toRadians(a);
      result=Math.tan(x);
      result=1/result;
      tf.setText(result+"");
      str1="";
      } 
      if(str=="e^x"){
      result=Math.exp(a);
      tf.setText(result+"");
      str1="";
      } 
      if(str=="ln"){
      result=Math.log(a);
      tf.setText(result+"");
      str1="";
      } 
      if(str=="log"){
      result=Math.log10(a);
      tf.setText(result+"");
      str1="";
      } 
      if(str=="|x|"){
      result=Math.abs(a);
      tf.setText(result+"");
      str1="";
      } 
      if(str=="2^x"){
      result=Math.pow(2,a);
      tf.setText(result+"");
      str1="";
      } 
      if(str=="sqrt"){
      result=Math.sqrt(a);
      tf.setText(result+"");
      str1="";
      } 
      if(str=="cbrt"){
      result=Math.cbrt(a);
      tf.setText(result+"");
      str1="";
      } 
      if(str=="x!"){
      for(int i=1;i<=a;i++)
      { result*=i;}
      tf.setText(result+"");
      str1="";
      }
      if(str=="1/x"){
      result=1/a;
      tf.setText(result+"");
      str1="";
      }  
      if(str=="x^2"){
      result=a*a;
      tf.setText(result+"");
      str1="";
      }
      
       }});  
      bt[11].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
      bt[12].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
      bt[13].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
      bt[18].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
      bt[19].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
      bt[20].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
      bt[25].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
      bt[26].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
      bt[27].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
      bt[33].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
       bt[0].addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
          str1=str1+e.getActionCommand();
          tf.setText(str1);
        }});
      setSize(600,600);
      setTitle("Calculator ~RIYA 13582");
      setVisible(true);
       this.addWindowListener(new WindowAdapter(){
     public void windowClosing(WindowEvent e){
      System.exit(0);
     }});  
     }
    
     public void actionPerformed(ActionEvent e){
      str=e.getActionCommand();
      if(str1=="")
      a=Double.parseDouble(tf.getText());
      else
      a=Double.parseDouble(str1);
      if(str=="C"){
      tf.setText("");
      a=0;
      b=0;
      result=1;
      str1="";
      }
      if(str=="sin"){
      tf.setText("sin("+a+")");
      str1="";
      }
      if(str=="cosec"){
      tf.setText("cosec("+a+")");
      str1="";
      } 
      if(str=="cos"){
      tf.setText("cos("+a+")");
      str1="";
      }
      if(str=="sec"){
      tf.setText("sec("+a+")");
      str1="";
      } 
      if(str=="tan"){
      tf.setText("tan("+a+")");
      str1="";
      }
      if(str=="cot"){
      tf.setText("cot("+a+")");
      str1="";
      } 
      if(str=="e^x"){
      tf.setText("e^"+a);
      str1="";
      } 
      if(str=="ln"){
      tf.setText("ln("+a+")");
      str1="";
      } 
      if(str=="log"){
      tf.setText("log("+a+")");
      str1="";
      } 
      if(str=="|x|"){
      tf.setText("|"+a+"|");
      str1="";
      } 
      if(str=="2^x"){
      tf.setText("2^"+a);
      str1="";
      } 
      if(str=="sqrt"){
      tf.setText("sqrt("+a+")");
      str1="";
      } 
      if(str=="cbrt"){
      tf.setText("cbrt("+a+")");
      str1="";
      } 
      if(str=="x!"){
      tf.setText(a+"!");
      str1="";
      }
      if(str=="1/x"){
      tf.setText("1/"+a);
      str1="";
      }  
      if(str=="x^2"){
      tf.setText(a+"^2");
      str1="";
      }
      if(str=="+/-"){
      result=(-a);
      tf.setText(result+"");
      }  
      if(str=="+"){
      str2=a+"+";
      tf.setText(str2);
      str1="";
      }  
      if(str=="-"){
      str2=a+"-";
      tf.setText(str2);
      str1="";
      }
      if(str=="*"){
      str2=a+"*";
      tf.setText(str2);
      str1="";
      }
      if(str=="/"){
      str2=a+"/";
      tf.setText(str2);
      str1="";
      }
      if(str=="x^y"){
      str2=a+"^";
      tf.setText(str2);
      str1="";
      }
}
}
class Calculator{
 public static void main(String args[]){
  Calc c=new Calc();
  }
}





