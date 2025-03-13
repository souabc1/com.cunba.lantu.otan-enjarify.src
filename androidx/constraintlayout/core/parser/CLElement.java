package androidx.constraintlayout.core.parser;

import java.io.PrintStream;

public class CLElement
{
  public final char[] o00OoOoo;
  public long o00Ooo0 = 9223372036854775807L;
  public long o00Ooo00 = -1;
  public CLContainer o00Ooo0O;
  public int o00Ooo0o;
  
  public CLElement(char[] paramArrayOfChar)
  {
    this.o00OoOoo = paramArrayOfChar;
  }
  
  public String OooO00o()
  {
    String str = new java/lang/String;
    char[] arrayOfChar = this.o00OoOoo;
    str.<init>(arrayOfChar);
    long l1 = this.o00Ooo0;
    long l2 = 9223372036854775807L;
    boolean bool1 = l1 < l2;
    if (bool1)
    {
      l2 = this.o00Ooo00;
      boolean bool2 = l1 < l2;
      if (bool2) {}
    }
    for (int i = (int)l2;; i = (int)l1)
    {
      int j = (int)l1 + 1;
      return str.substring(i, j);
      l1 = this.o00Ooo00;
    }
  }
  
  public String OooO0O0()
  {
    return "";
  }
  
  public CLElement getContainer()
  {
    return this.o00Ooo0O;
  }
  
  public String getDebugName()
  {
    boolean bool = CLParser.OooO0Oo;
    if (bool)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = getStrClass();
      localStringBuilder.append(str);
      localStringBuilder.append(" -> ");
      return localStringBuilder.toString();
    }
    return "";
  }
  
  public long getEnd()
  {
    return this.o00Ooo0;
  }
  
  public float getFloat()
  {
    boolean bool = this instanceof CLNumber;
    if (bool) {
      return ((CLNumber)this).getFloat();
    }
    return 0.0F / 0.0F;
  }
  
  public int getInt()
  {
    boolean bool = this instanceof CLNumber;
    if (bool) {
      return ((CLNumber)this).getInt();
    }
    return 0;
  }
  
  public int getLine()
  {
    return this.o00Ooo0o;
  }
  
  public long getStart()
  {
    return this.o00Ooo00;
  }
  
  public String getStrClass()
  {
    String str = getClass().toString();
    int i = str.lastIndexOf('.') + 1;
    return str.substring(i);
  }
  
  public boolean isDone()
  {
    long l1 = this.o00Ooo0;
    long l2 = 9223372036854775807L;
    boolean bool = l1 < l2;
    if (bool) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isStarted()
  {
    long l1 = this.o00Ooo00;
    long l2 = -1;
    boolean bool = l1 < l2;
    if (bool) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setContainer(CLContainer paramCLContainer)
  {
    this.o00Ooo0O = paramCLContainer;
  }
  
  public void setEnd(long paramLong)
  {
    long l1 = this.o00Ooo0;
    long l2 = 9223372036854775807L;
    boolean bool1 = l1 < l2;
    if (bool1) {
      return;
    }
    this.o00Ooo0 = paramLong;
    boolean bool2 = CLParser.OooO0Oo;
    if (bool2)
    {
      localObject1 = System.out;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("closing ");
      int i = hashCode();
      ((StringBuilder)localObject2).append(i);
      String str = " -> ";
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(this);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((PrintStream)localObject1).println((String)localObject2);
    }
    Object localObject1 = this.o00Ooo0O;
    if (localObject1 != null) {
      ((CLContainer)localObject1).OooO0OO(this);
    }
  }
  
  public void setLine(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setStart(long paramLong)
  {
    this.o00Ooo00 = paramLong;
  }
  
  public String toString()
  {
    long l1 = this.o00Ooo00;
    long l2 = this.o00Ooo0;
    boolean bool = l1 < l2;
    if (!bool)
    {
      l1 = 9223372036854775807L;
      bool = l2 < l1;
      if (bool)
      {
        localObject1 = new java/lang/String;
        localObject2 = this.o00OoOoo;
        ((String)localObject1).<init>((char[])localObject2);
        int i = (int)this.o00Ooo00;
        int j = (int)this.o00Ooo0 + 1;
        localObject1 = ((String)localObject1).substring(i, j);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = getStrClass();
        ((StringBuilder)localObject2).append(str);
        ((StringBuilder)localObject2).append(" (");
        l2 = this.o00Ooo00;
        ((StringBuilder)localObject2).append(l2);
        ((StringBuilder)localObject2).append(" : ");
        l2 = this.o00Ooo0;
        ((StringBuilder)localObject2).append(l2);
        ((StringBuilder)localObject2).append(") <<");
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(">>");
        return ((StringBuilder)localObject2).toString();
      }
    }
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = getClass();
    ((StringBuilder)localObject1).append(localObject2);
    ((StringBuilder)localObject1).append(" (INVALID, ");
    long l3 = this.o00Ooo00;
    ((StringBuilder)localObject1).append(l3);
    ((StringBuilder)localObject1).append("-");
    l3 = this.o00Ooo0;
    ((StringBuilder)localObject1).append(l3);
    ((StringBuilder)localObject1).append(")");
    return ((StringBuilder)localObject1).toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.parser.CLElement
 * JD-Core Version:    0.7.0.1
 */