package com.cunba.lantu.otan.adblib;

import java.io.UnsupportedEncodingException;
import m54207b69;

public class AdbProtocol
{
  public static byte[] OooO00o;
  
  static
  {
    Object localObject = "";
    String str = "2i3C3E314755";
    try
    {
      str = m54207b69.F54207b69_11(str);
      localObject = ((String)localObject).getBytes(str);
      OooO00o = (byte[])localObject;
      label21:
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label21;
    }
  }
  
  public static byte[] OooO00o(int paramInt, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    arrayOfObject[1] = paramArrayOfByte;
    return (byte[])m54207b69.F54207b69_09(52, arrayOfObject);
  }
  
  public static byte[] OooO0O0(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[1] = localInteger;
    return (byte[])m54207b69.F54207b69_09(53, arrayOfObject);
  }
  
  public static byte[] OooO0OO()
  {
    Object[] arrayOfObject = new Object[0];
    return (byte[])m54207b69.F54207b69_09(54, arrayOfObject);
  }
  
  public static byte[] OooO0Oo(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[4];
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[2] = localInteger;
    arrayOfObject[3] = paramArrayOfByte;
    return (byte[])m54207b69.F54207b69_09(55, arrayOfObject);
  }
  
  public static byte[] OooO0o(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[1] = localInteger;
    return (byte[])m54207b69.F54207b69_09(56, arrayOfObject);
  }
  
  public static byte[] OooO0o0(int paramInt, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    arrayOfObject[1] = paramString;
    return (byte[])m54207b69.F54207b69_09(57, arrayOfObject);
  }
  
  public static int OooO0oO(byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramArrayOfByte;
    return m54207b69.F54207b69_05(58, arrayOfObject);
  }
  
  public static boolean OooO0oo(AdbProtocol.AdbMessage paramAdbMessage)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramAdbMessage;
    return m54207b69.F54207b69_01(59, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.adblib.AdbProtocol
 * JD-Core Version:    0.7.0.1
 */