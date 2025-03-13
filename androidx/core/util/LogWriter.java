package androidx.core.util;

import java.io.Writer;

public class LogWriter
  extends Writer
{
  public StringBuilder o00OoOoo;
  
  public final void OooO00o()
  {
    StringBuilder localStringBuilder = this.o00OoOoo;
    int i = localStringBuilder.length();
    if (i > 0)
    {
      this.o00OoOoo.toString();
      localStringBuilder = this.o00OoOoo;
      int j = localStringBuilder.length();
      localStringBuilder.delete(0, j);
    }
  }
  
  public void close()
  {
    OooO00o();
  }
  
  public void flush()
  {
    OooO00o();
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < paramInt2)
    {
      int j = paramInt1 + i;
      j = paramArrayOfChar[j];
      int k = 10;
      if (j == k)
      {
        OooO00o();
      }
      else
      {
        StringBuilder localStringBuilder = this.o00OoOoo;
        localStringBuilder.append(j);
      }
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.LogWriter
 * JD-Core Version:    0.7.0.1
 */