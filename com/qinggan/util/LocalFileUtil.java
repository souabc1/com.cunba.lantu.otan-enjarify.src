package com.qinggan.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import m54207b69;

public class LocalFileUtil
{
  public static void OooO00o(File paramFile, String paramString)
  {
    Object localObject1 = new java/io/File;
    Object localObject2 = paramFile.getParent();
    ((File)localObject1).<init>((String)localObject2);
    boolean bool = ((File)localObject1).exists();
    if (!bool)
    {
      ((File)localObject1).mkdirs();
      try
      {
        localObject2 = Runtime.getRuntime();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str = "`u161E1A1D155A48494A5E";
        str = m54207b69.F54207b69_11(str);
        localStringBuilder.append(str);
        localObject1 = ((File)localObject1).getPath();
        localStringBuilder.append((String)localObject1);
        localObject1 = localStringBuilder.toString();
        ((Runtime)localObject2).exec((String)localObject1);
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
      }
    }
    OooO0OO(paramString, paramFile);
  }
  
  public static String OooO0O0(File paramFile)
  {
    boolean bool = paramFile.exists();
    String str1 = "";
    if (!bool) {
      return str1;
    }
    try
    {
      BufferedReader localBufferedReader = new java/io/BufferedReader;
      Object localObject1 = new java/io/FileReader;
      ((FileReader)localObject1).<init>(paramFile);
      localBufferedReader.<init>((Reader)localObject1);
      paramFile = new java/lang/StringBuffer;
      paramFile.<init>();
      for (;;)
      {
        localObject1 = localBufferedReader.readLine();
        if (localObject1 == null) {
          break;
        }
        PrintStream localPrintStream = System.out;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = ",`12060307100E140C62";
        str2 = m54207b69.F54207b69_11(str2);
        ((StringBuilder)localObject2).append(str2);
        ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = ((StringBuilder)localObject2).toString();
        localPrintStream.println((String)localObject2);
        paramFile.append((String)localObject1);
      }
      localBufferedReader.close();
      return paramFile.toString();
    }
    catch (IOException paramFile) {}catch (FileNotFoundException paramFile) {}
    paramFile.printStackTrace();
    return str1;
  }
  
  public static void OooO0OO(String paramString, File paramFile)
  {
    try
    {
      Object localObject = new java/io/FileOutputStream;
      ((FileOutputStream)localObject).<init>(paramFile);
      paramString = paramString.getBytes();
      ((FileOutputStream)localObject).write(paramString);
      ((FileOutputStream)localObject).close();
      paramString = System.out;
      localObject = "写入成功：";
      paramString.println((String)localObject);
      paramString = Runtime.getRuntime();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "`u161E1A1D155A48494A5E";
      str = m54207b69.F54207b69_11(str);
      ((StringBuilder)localObject).append(str);
      paramFile = paramFile.getPath();
      ((StringBuilder)localObject).append(paramFile);
      paramFile = ((StringBuilder)localObject).toString();
      paramString.exec(paramFile);
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public static String getLocalCarNumber()
  {
    File localFile = new java/io/File;
    String str = m54207b69.F54207b69_11("bI663A3D23432D43336E700F313635331E30363E797B3F3E521F553E464858");
    localFile.<init>(str);
    return OooO0O0(localFile);
  }
  
  public static String getLocalEngine()
  {
    File localFile = new java/io/File;
    String str = m54207b69.F54207b69_11("ja4E12150B1B051B0B565837190E0D1B36181E16616319251D20281E4A3029212333");
    localFile.<init>(str);
    return OooO0O0(localFile);
  }
  
  public static String getVoiceDelayTime()
  {
    File localFile = new java/io/File;
    String str = m54207b69.F54207b69_11("+P7F21243C2A362A3C8787264A3F3E4A25494D4792923B55504B4E");
    localFile.<init>(str);
    return OooO0O0(localFile);
  }
  
  public static void setLocalCarNumber(String paramString)
  {
    File localFile = new java/io/File;
    String str = m54207b69.F54207b69_11("bI663A3D23432D43336E700F313635331E30363E797B3F3E521F553E464858");
    localFile.<init>(str);
    OooO00o(localFile, paramString);
  }
  
  public static void setLocalEngine(String paramString)
  {
    File localFile = new java/io/File;
    String str = m54207b69.F54207b69_11("ja4E12150B1B051B0B565837190E0D1B36181E16616319251D20281E4A3029212333");
    localFile.<init>(str);
    OooO00o(localFile, paramString);
  }
  
  public static void setVoiceDelayTime(String paramString)
  {
    File localFile = new java/io/File;
    String str = m54207b69.F54207b69_11("+P7F21243C2A362A3C8787264A3F3E4A25494D4792923B55504B4E");
    localFile.<init>(str);
    OooO00o(localFile, paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.LocalFileUtil
 * JD-Core Version:    0.7.0.1
 */