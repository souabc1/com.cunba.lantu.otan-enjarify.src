package androidx.constraintlayout.core.parser;

public class CLToken
  extends CLElement
{
  public CLToken.Type o00OooO;
  public int o00OooO0 = 0;
  public char[] o00OooOO;
  public char[] o00OooOo;
  public char[] o0O00o0;
  
  public CLToken(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
    paramArrayOfChar = CLToken.Type.o00OoOoo;
    this.o00OooO = paramArrayOfChar;
    paramArrayOfChar = "true".toCharArray();
    this.o00OooOO = paramArrayOfChar;
    paramArrayOfChar = "false".toCharArray();
    this.o00OooOo = paramArrayOfChar;
    paramArrayOfChar = "null".toCharArray();
    this.o0O00o0 = paramArrayOfChar;
  }
  
  public static CLElement OooO0OO(char[] paramArrayOfChar)
  {
    CLToken localCLToken = new androidx/constraintlayout/core/parser/CLToken;
    localCLToken.<init>(paramArrayOfChar);
    return localCLToken;
  }
  
  public String OooO0O0()
  {
    boolean bool = CLParser.OooO0Oo;
    if (bool)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("<");
      String str = OooO00o();
      localStringBuilder.append(str);
      localStringBuilder.append(">");
      return localStringBuilder.toString();
    }
    return OooO00o();
  }
  
  public boolean OooO0Oo(char paramChar, long paramLong)
  {
    Object localObject = CLToken.1.OooO00o;
    CLToken.Type localType1 = this.o00OooO;
    char c1 = localType1.ordinal();
    int i = localObject[c1];
    c1 = '\001';
    boolean bool = false;
    char c2;
    char c4;
    if (i != c1)
    {
      c2 = '\002';
      if (i != c2)
      {
        c2 = '\003';
        if (i != c2)
        {
          char c3 = '\004';
          if (i != c3) {
            break label335;
          }
          char[] arrayOfChar = this.o00OooOO;
          int j = this.o00OooO0;
          c3 = arrayOfChar[j];
          CLToken.Type localType2;
          if (c3 == paramChar) {
            localType2 = CLToken.Type.o00Ooo00;
          }
          for (;;)
          {
            this.o00OooO = localType2;
            bool = c1;
            break;
            arrayOfChar = this.o00OooOo;
            c3 = arrayOfChar[j];
            if (c3 == paramChar)
            {
              localType2 = CLToken.Type.o00Ooo0;
            }
            else
            {
              arrayOfChar = this.o0O00o0;
              c3 = arrayOfChar[j];
              if (c3 != paramChar) {
                break;
              }
              localType2 = CLToken.Type.o00Ooo0O;
            }
          }
        }
        localObject = this.o0O00o0;
        c2 = this.o00OooO0;
        c4 = localObject[c2];
        if (c4 == paramChar) {
          bool = c1;
        }
        if (!bool) {
          break label335;
        }
        c2 += c1;
        paramChar = localObject.length;
        if (c2 != paramChar) {
          break label335;
        }
      }
    }
    do
    {
      for (;;)
      {
        setEnd(paramLong);
        break;
        localObject = this.o00OooOo;
        c2 = this.o00OooO0;
        c4 = localObject[c2];
        if (c4 == paramChar) {
          bool = c1;
        }
        if (!bool) {
          break;
        }
        c2 += c1;
        paramChar = localObject.length;
        if (c2 != paramChar) {
          break;
        }
      }
      localObject = this.o00OooOO;
      c2 = this.o00OooO0;
      c4 = localObject[c2];
      if (c4 == paramChar) {
        bool = c1;
      }
      if (!bool) {
        break;
      }
      c2 += c1;
      paramChar = localObject.length;
    } while (c2 == paramChar);
    label335:
    paramChar = this.o00OooO0 + c1;
    this.o00OooO0 = paramChar;
    return bool;
  }
  
  public boolean getBoolean()
  {
    Object localObject1 = this.o00OooO;
    Object localObject2 = CLToken.Type.o00Ooo00;
    if (localObject1 == localObject2) {
      return true;
    }
    localObject2 = CLToken.Type.o00Ooo0;
    if (localObject1 == localObject2) {
      return false;
    }
    localObject1 = new androidx/constraintlayout/core/parser/CLParsingException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("this token is not a boolean: <");
    String str = OooO00o();
    ((StringBuilder)localObject2).append(str);
    ((StringBuilder)localObject2).append(">");
    localObject2 = ((StringBuilder)localObject2).toString();
    ((CLParsingException)localObject1).<init>((String)localObject2, this);
    throw ((Throwable)localObject1);
  }
  
  public CLToken.Type getType()
  {
    return this.o00OooO;
  }
  
  public boolean isNull()
  {
    Object localObject1 = this.o00OooO;
    Object localObject2 = CLToken.Type.o00Ooo0O;
    if (localObject1 == localObject2) {
      return true;
    }
    localObject1 = new androidx/constraintlayout/core/parser/CLParsingException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("this token is not a null: <");
    String str = OooO00o();
    ((StringBuilder)localObject2).append(str);
    ((StringBuilder)localObject2).append(">");
    localObject2 = ((StringBuilder)localObject2).toString();
    ((CLParsingException)localObject1).<init>((String)localObject2, this);
    throw ((Throwable)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.parser.CLToken
 * JD-Core Version:    0.7.0.1
 */