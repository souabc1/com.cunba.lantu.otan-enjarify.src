package com.jakewharton.disklrucache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import m54207b69;

public final class Util
{
  public static final Charset OooO00o = Charset.forName(m54207b69.F54207b69_11("A)7C7B066B7E6F6667"));
  public static final Charset OooO0O0 = Charset.forName(m54207b69.F54207b69_11("2i3C3E314755"));
  
  public static void OooO00o(Closeable paramCloseable)
  {
    if (paramCloseable != null) {
      try
      {
        paramCloseable.close();
      }
      catch (RuntimeException localRuntimeException)
      {
        throw localRuntimeException;
      }
      catch (Exception localException) {}
    }
  }
  
  public static void OooO0O0(File paramFile)
  {
    Object localObject1 = paramFile.listFiles();
    if (localObject1 != null)
    {
      int i = localObject1.length;
      int j = 0;
      localObject2 = null;
      while (j < i)
      {
        localObject3 = localObject1[j];
        boolean bool = ((File)localObject3).isDirectory();
        if (bool) {
          OooO0O0((File)localObject3);
        }
        bool = ((File)localObject3).delete();
        if (bool)
        {
          j += 1;
        }
        else
        {
          paramFile = new java/io/IOException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = m54207b69.F54207b69_11("i254545D615B5B184D651B60626A64546622656D716B1D28");
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(localObject3);
          localObject1 = ((StringBuilder)localObject1).toString();
          paramFile.<init>((String)localObject1);
          throw paramFile;
        }
      }
      return;
    }
    localObject1 = new java/io/IOException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = m54207b69.F54207b69_11("j$4A4C520749095C484D494F51544E124F5D67535A64606C74361D");
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append(paramFile);
    paramFile = ((StringBuilder)localObject2).toString();
    ((IOException)localObject1).<init>(paramFile);
    throw ((Throwable)localObject1);
  }
  
  public static String OooO0OO(Reader paramReader)
  {
    try
    {
      Object localObject1 = new java/io/StringWriter;
      ((StringWriter)localObject1).<init>();
      int i = 1024;
      char[] arrayOfChar = new char[i];
      for (;;)
      {
        int j = paramReader.read(arrayOfChar);
        int k = -1;
        if (j == k) {
          break;
        }
        k = 0;
        ((StringWriter)localObject1).write(arrayOfChar, 0, j);
      }
      localObject1 = ((StringWriter)localObject1).toString();
      return localObject1;
    }
    finally
    {
      paramReader.close();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.jakewharton.disklrucache.Util
 * JD-Core Version:    0.7.0.1
 */