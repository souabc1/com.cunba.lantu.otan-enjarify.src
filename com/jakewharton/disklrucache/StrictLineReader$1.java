package com.jakewharton.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class StrictLineReader$1
  extends ByteArrayOutputStream
{
  public StrictLineReader$1(StrictLineReader paramStrictLineReader, int paramInt)
  {
    super(paramInt);
  }
  
  public String toString()
  {
    int i = this.count;
    Object localObject1;
    if (i > 0)
    {
      localObject1 = this.buf;
      int j = i + -1;
      int k = localObject1[j];
      j = 13;
      if (k == j) {
        i += -1;
      }
    }
    try
    {
      localObject1 = new java/lang/String;
      byte[] arrayOfByte = this.buf;
      Object localObject2 = this.o00OoOoo;
      localObject2 = StrictLineReader.OooO00o((StrictLineReader)localObject2);
      localObject2 = ((Charset)localObject2).name();
      ((String)localObject1).<init>(arrayOfByte, 0, i, (String)localObject2);
      return localObject1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localObject1 = new java/lang/AssertionError;
      ((AssertionError)localObject1).<init>(localUnsupportedEncodingException);
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.jakewharton.disklrucache.StrictLineReader.1
 * JD-Core Version:    0.7.0.1
 */