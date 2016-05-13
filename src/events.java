

public class events {
/*
	Calculation cal;
	public events()
	{
		cal=new Calculation();
	}*/
	///////////////////////////////
	String event(String input,char ch)
	{
		
			if(Character.isDigit(ch)==true || ch=='(')
			{
				input+=ch;	
				return input;
			}
           ////////////////////////////
            else if(ch=='l')
            {
              if(input!="")
                {
                  char last=input.charAt(input.length()-1);
                  if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                	  return input+"log(";
                 
                }
              else
                  input="log(";
                
           }
         
            
    
                  else if(ch=='n')
               {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"ln(";
                       
                      }
                    else
                        input="ln(";
               }
			
                  else if(ch=='r')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"sqr";
                       
                      }
                    else
                        input="sqr";
                  }
                  else if(ch=='p')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"pi";
                       
                      }
                    else
                        input="pi";
                  }
			
                  else if(ch=='g')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"sin(";
                       
                      }
                    else
                        input="sin(";
                  }
			///
                  else if(ch=='G')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"sin-1";
                       
                      }
                    else
                        input="sin-1(";
                  }
			
			///
                  else if(ch=='c')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"cos(";
                       
                      }
                    else
                        input="cos";
                  }
			///
                  else if(ch=='C')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"cos-1(";
                       
                      }
                    else
                        input="cos-1";
                  }
			///
                  else if(ch=='f')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"F";
                       
                      }
                    else
                        input="F";
                  }
			///
                  else if(ch=='i')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"C";
                       
                      }
                    else
                        input="C";
                  }
			///
                  else if(ch=='t')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"tan(";
                       
                      }
                    else
                        input="tan(";
                  }
			///
                  else if(ch=='T')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"tan-1(";
                       
                      }
                    else
                        input="tan-1";
                  }
			///
                  else if(ch=='m')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(Character.isDigit(last)==true)
                      	  return input+"%";
                       
                      }
                    
                  }
			///
                  else if(ch=='p')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(Character.isDigit(last)==true)
                      	  return input+"^";
                       
                      }
                    
                  }
			///
                  else if(ch=='q')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(Character.isDigit(last)==true)
                      	  return input+"sq";
                       
                      }
                  }
                 
			///
                  else if(ch=='!')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(Character.isDigit(last)==true)
                      	  return input+"!";
                       
                      }
                    
                  }
             ///
                  else if(ch=='v')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"1/(";
                       
                      }
                    
                  }
                	  
         ///
                  else if(ch=='e')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"e^";
                       
                      }
                    
                  }
			
			///

                  else if(ch=='A')
                  {
                	  if(input!="")
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"abs(";
                       
                      }
                    else
                        input="abs(";
                  }
			
			
			////////////////////////
			else if(ch=='.')
			{
				int pos=0;
				for(int i=0; i<input.length(); ++i)
				{
					char c=input.charAt(i);
					if(c=='+'||c=='-'||c=='*'||c=='/'||c=='%')
					{
						pos=i;									//pos of last sign
					}
				}
				for(  ; pos<input.length(); ++pos)
				{
					if(input.charAt(pos)=='.')
					{
						return input;
					}
				}
				return input+".";
					
			}
			else if(input=="")
			{
				return "";
			}
			else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
			{
				char c=input.charAt(input.length()-1);
				if(c=='+'||c=='-'||c=='*'||c=='/'||c=='%')
				{
					return input.substring(0, input.length()-1)+ch;
				}
				else 
				{		
					input+=ch;
					return input;
				}
			}
			
			else if(ch=='=')
			{
				try {
			
					//return cal.Solve(input);
				}
				catch (Exception ex){
					return "Error";
				}
			}
			else if(ch=='s')
			{
				int pos=0;
				char s=0;
				for(int i=0; i<input.length(); ++i)
				{
					char c=input.charAt(i);
					if(c=='*'||c=='/'||c=='%')
					{
						pos=i;
					}
					else if(c=='-'||c=='+')
					{
						pos=-i;
						s=c;
					}
				}
				 if(pos==0)
				{
					if(input.charAt(0)=='-')
						return input.substring(1, input.length());
					else
						return "-"+input;
				}
				else if(pos+1==input.length())
				{
				}
					
				else if(pos>0)
				{
					return input.substring(0,pos+1)+"-"+input.substring(pos+1,input.length());
				}
				else
				{
					pos*=-1;
					if(s=='+')
					{
						return input.substring(0,pos)+"-"+input.substring(pos+1,input.length());
					}
					else
					{
						if(input.charAt(pos-1)=='*'||input.charAt(pos-1)=='/'||input.charAt(pos-1)=='%')
						{
							return input.substring(0,pos)+input.substring(pos+1,input.length());
						}
						else
						{
							return input.substring(0,pos)+"+"+input.substring(pos+1,input.length());
						}
					}
				}
			}
			else if(ch=='a')
			{
				return "";
			}
			else if(ch=='d')
			{
				return input.substring(0,input.length()-1);
			}
			else if(ch==')')
			{
				int count=0;
				char c=' ';
				for(int i=0; i<input.length(); ++i)
				{
					c=input.charAt(i);
					if(c=='(')
						count++;
					else if(c==')')
						count--;
					
				}
				if(count>0 &&( c!='+' && c!='-' && c!='*' && c!='/' && c!='%'))
					input+=ch;
				return input;
				
				
			}
		return input;
	}
}