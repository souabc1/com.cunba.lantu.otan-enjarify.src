package androidx.fragment.app;

import java.io.Writer;

final class LogWriter
  extends Writer
{
  public final String o00OoOoo;
  public StringBuilder o00Ooo00;
  
  public LogWriter(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    this.o00Ooo00 = localStringBuilder;
    this.o00OoOoo = paramString;
  }
  
  public final void OooO00o()
  {
    StringBuilder localStringBuilder = this.o00Ooo00;
    int i = localStringBuilder.length();
    if (i > 0)
    {
      this.o00Ooo00.toString();
      localStringBuilder = this.o00Ooo00;
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
        StringBuilder localStringBuilder = this.o00Ooo00;
        localStringBuilder.append(j);
      }
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.LogWriter
 * JD-Core Version:    0.7.0.1
 */