package com.sun.jna;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import m54207b69;

public class Pointer
{
  public static final Pointer OooO0O0;
  public long OooO00o;
  
  public Pointer() {}
  
  public Pointer(long paramLong)
  {
    this.OooO00o = paramLong;
  }
  
  public static long OooOo0O(Pointer paramPointer)
  {
    long l;
    if (paramPointer == null) {
      l = 0L;
    } else {
      l = paramPointer.OooO00o;
    }
    return l;
  }
  
  public NativeLong OooO(long paramLong)
  {
    NativeLong localNativeLong = new com/sun/jna/NativeLong;
    int i = NativeLong.o00Ooo0o;
    int j = 8;
    if (i == j)
    {
      paramLong = OooO0oo(paramLong);
    }
    else
    {
      int k = OooO0oO(paramLong);
      paramLong = k;
    }
    localNativeLong.<init>(paramLong);
    return localNativeLong;
  }
  
  public void OooO00o(long paramLong)
  {
    Oooo0o0(0L, paramLong, (byte)0);
  }
  
  public byte OooO0O0(long paramLong)
  {
    long l = this.OooO00o;
    return Native.getByte(this, l, paramLong);
  }
  
  public byte[] OooO0OO(long paramLong, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    OooOo0o(paramLong, arrayOfByte, 0, paramInt);
    return arrayOfByte;
  }
  
  public char OooO0Oo(long paramLong)
  {
    long l = this.OooO00o;
    return Native.getChar(this, l, paramLong);
  }
  
  public float OooO0o(long paramLong)
  {
    long l = this.OooO00o;
    return Native.getFloat(this, l, paramLong);
  }
  
  public double OooO0o0(long paramLong)
  {
    long l = this.OooO00o;
    return Native.getDouble(this, l, paramLong);
  }
  
  public int OooO0oO(long paramLong)
  {
    long l = this.OooO00o;
    return Native.getInt(this, l, paramLong);
  }
  
  public long OooO0oo(long paramLong)
  {
    long l = this.OooO00o;
    return Native.getLong(this, l, paramLong);
  }
  
  public Pointer OooOO0(long paramLong)
  {
    return Native.OooOOOO(this.OooO00o + paramLong);
  }
  
  public Pointer[] OooOO0O(long paramLong)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Pointer localPointer = OooOO0(paramLong);
    int i = 0;
    while (localPointer != null)
    {
      localArrayList.add(localPointer);
      int j = Native.OooOO0o;
      i += j;
      long l = i + paramLong;
      localPointer = OooOO0(l);
    }
    Pointer[] arrayOfPointer = new Pointer[0];
    return (Pointer[])localArrayList.toArray(arrayOfPointer);
  }
  
  public Pointer[] OooOO0o(long paramLong, int paramInt)
  {
    Pointer[] arrayOfPointer = new Pointer[paramInt];
    OooOoo(paramLong, arrayOfPointer, 0, paramInt);
    return arrayOfPointer;
  }
  
  public String OooOOO(long paramLong)
  {
    String str = Native.getDefaultStringEncoding();
    return OooOOOO(paramLong, str);
  }
  
  public short OooOOO0(long paramLong)
  {
    long l = this.OooO00o;
    return Native.getShort(this, l, paramLong);
  }
  
  public String OooOOOO(long paramLong, String paramString)
  {
    return Native.OooOOo0(this, paramLong, paramString);
  }
  
  public String[] OooOOOo(long paramLong, int paramInt, String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = -1;
    String str1 = m54207b69.F54207b69_11("''0A0B72716767107B7B7E78746C1718");
    long l1 = 0L;
    long l2;
    Object localObject;
    boolean bool;
    if (paramInt != i)
    {
      l2 = 0 + paramLong;
      localObject = OooOO0(l2);
      int j = 0;
      String str2 = null;
      int k = 0;
      for (;;)
      {
        int m = j + 1;
        if (j >= paramInt) {
          break;
        }
        if (localObject == null)
        {
          j = 0;
          str2 = null;
        }
        else
        {
          bool = str1.equals(paramString);
          if (bool) {
            str2 = ((Pointer)localObject).OooOOoo(l1);
          } else {
            str2 = ((Pointer)localObject).OooOOOO(l1, paramString);
          }
        }
        localArrayList.add(str2);
        if (m < paramInt)
        {
          i = Native.OooOO0o;
          k += i;
          long l3 = k + paramLong;
          localObject = OooOO0(l3);
        }
        bool = m;
      }
    }
    paramInt = 0;
    for (;;)
    {
      l2 = paramInt + paramLong;
      localObject = OooOO0(l2);
      if (localObject == null) {
        break;
      }
      bool = str1.equals(paramString);
      if (bool) {
        localObject = ((Pointer)localObject).OooOOoo(l1);
      } else {
        localObject = ((Pointer)localObject).OooOOOO(l1, paramString);
      }
      localArrayList.add(localObject);
      i = Native.OooOO0o;
      paramInt += i;
    }
    String[] arrayOfString = new String[0];
    return (String[])localArrayList.toArray(arrayOfString);
  }
  
  public Object OooOOo(long paramLong, Class paramClass, Object paramObject)
  {
    Object localObject1 = Structure.class;
    boolean bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
    boolean bool2 = true;
    Object localObject2;
    if (bool1)
    {
      paramObject = (Structure)paramObject;
      localObject1 = Structure.ByReference.class;
      bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
      if (bool1)
      {
        localObject2 = OooOO0(paramLong);
        localObject2 = Structure.OoooOoo(paramClass, paramObject, (Pointer)localObject2);
      }
    }
    Object localObject3;
    Object localObject4;
    for (;;)
    {
      paramObject = localObject2;
      break label1056;
      int i = (int)paramLong;
      paramObject.OooooO0(this, i, bool2);
      paramObject.Oooo0o0();
      break label1056;
      localObject1 = Boolean.TYPE;
      if (paramClass == localObject1) {
        break label1028;
      }
      localObject1 = Boolean.class;
      if (paramClass == localObject1) {
        break label1028;
      }
      localObject1 = Byte.TYPE;
      if (paramClass == localObject1) {
        break label1011;
      }
      localObject1 = Byte.class;
      if (paramClass == localObject1) {
        break label1011;
      }
      localObject1 = Short.TYPE;
      if (paramClass == localObject1) {
        break label994;
      }
      localObject1 = Short.class;
      if (paramClass == localObject1) {
        break label994;
      }
      localObject1 = Character.TYPE;
      if (paramClass == localObject1) {
        break label977;
      }
      localObject1 = Character.class;
      if (paramClass == localObject1) {
        break label977;
      }
      localObject1 = Integer.TYPE;
      if (paramClass == localObject1) {
        break label960;
      }
      localObject1 = Integer.class;
      if (paramClass == localObject1) {
        break label960;
      }
      localObject1 = Long.TYPE;
      if (paramClass == localObject1) {
        break label945;
      }
      localObject1 = Long.class;
      if (paramClass == localObject1) {
        break label945;
      }
      localObject1 = Float.TYPE;
      if (paramClass == localObject1) {
        break label928;
      }
      localObject1 = Float.class;
      if (paramClass == localObject1) {
        break label928;
      }
      localObject1 = Double.TYPE;
      if (paramClass == localObject1) {
        break label911;
      }
      localObject1 = Double.class;
      if (paramClass == localObject1) {
        break label911;
      }
      localObject1 = Pointer.class;
      bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
      bool2 = false;
      localObject3 = null;
      boolean bool4;
      long l2;
      if (bool1)
      {
        localObject2 = OooOO0(paramLong);
        if (localObject2 != null)
        {
          bool4 = paramObject instanceof Pointer;
          if (bool4)
          {
            localObject3 = paramObject;
            localObject3 = (Pointer)paramObject;
          }
          if (localObject3 == null) {
            continue;
          }
          long l1 = ((Pointer)localObject2).OooO00o;
          l2 = ((Pointer)localObject3).OooO00o;
          bool4 = l1 < l2;
          if (bool4) {
            continue;
          }
        }
      }
      label468:
      do
      {
        do
        {
          do
          {
            do
            {
              paramObject = localObject3;
              break label1056;
              localObject1 = String.class;
              l2 = 0L;
              if (paramClass != localObject1) {
                break;
              }
              localObject2 = OooOO0(paramLong);
            } while (localObject2 == null);
            localObject2 = ((Pointer)localObject2).OooOOO(l2);
            break;
            localObject1 = WString.class;
            if (paramClass != localObject1) {
              break label468;
            }
            localObject2 = OooOO0(paramLong);
          } while (localObject2 == null);
          localObject4 = new com/sun/jna/WString;
          localObject2 = ((Pointer)localObject2).OooOOoo(l2);
          ((WString)localObject4).<init>((String)localObject2);
          paramObject = localObject4;
          break label1056;
          localObject1 = Callback.class;
          bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
          if (!bool1) {
            break label539;
          }
          localObject2 = OooOO0(paramLong);
        } while (localObject2 == null);
        paramObject = (Callback)paramObject;
        localObject4 = CallbackReference.OooOO0o(paramObject);
        bool4 = ((Pointer)localObject2).equals(localObject4);
        if (bool4) {
          break label1056;
        }
        paramObject = CallbackReference.OooO0oo(paramClass, (Pointer)localObject2);
        break label1056;
        bool1 = Platform.OooO0O0;
        if (!bool1) {
          break label651;
        }
        localObject1 = Buffer.class;
        bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
        if (!bool1) {
          break label651;
        }
        localObject2 = OooOO0(paramLong);
      } while (localObject2 == null);
      label539:
      if (paramObject != null)
      {
        localObject4 = paramObject;
        localObject4 = (Buffer)paramObject;
        localObject3 = Native.OooOO0O((Buffer)localObject4);
      }
      if (localObject3 != null)
      {
        boolean bool3 = ((Pointer)localObject3).equals(localObject2);
        if (bool3) {
          break label1056;
        }
      }
      localObject2 = new java/lang/IllegalStateException;
      localObject4 = m54207b69.F54207b69_11("\\j290C0650224F1126260E171A101C261A2E205C1E5E23192F27223865243C2A2B2F396C28286F2D362F2E423E76453D3A3E");
      ((IllegalStateException)localObject2).<init>((String)localObject4);
      throw ((Throwable)localObject2);
      label651:
      localObject1 = NativeMapped.class;
      bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
      if (!bool1) {
        break;
      }
      paramObject = (NativeMapped)paramObject;
      if (paramObject != null)
      {
        localObject1 = paramObject.OooO00o();
        localObject2 = OooOOo(paramLong, (Class)localObject1, null);
        localObject4 = new com/sun/jna/FromNativeContext;
        ((FromNativeContext)localObject4).<init>(paramClass);
        localObject2 = paramObject.OooO0OO(localObject2, (FromNativeContext)localObject4);
        bool4 = paramObject.equals(localObject2);
        if (bool4) {
          break label1056;
        }
      }
      else
      {
        paramObject = NativeMappedConverter.OooO0o0(paramClass);
        localObject1 = paramObject.OooO00o();
        localObject2 = OooOOo(paramLong, (Class)localObject1, null);
        localObject4 = new com/sun/jna/FromNativeContext;
        ((FromNativeContext)localObject4).<init>(paramClass);
        localObject2 = paramObject.OooO0OO(localObject2, (FromNativeContext)localObject4);
      }
    }
    bool1 = paramClass.isArray();
    if (bool1)
    {
      if (paramObject != null)
      {
        paramClass = paramClass.getComponentType();
        OooOooo(paramLong, paramObject, paramClass);
      }
      else
      {
        localObject2 = new java/lang/IllegalStateException;
        localObject4 = m54207b69.F54207b69_11("-K052F30326F2F2B722A2E2C4A2E373531413F417E3E4E4F414A");
        ((IllegalStateException)localObject2).<init>((String)localObject4);
        throw ((Throwable)localObject2);
      }
    }
    else
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      paramObject = m54207b69.F54207b69_11("Fv24141915231D175D5C");
      ((StringBuilder)localObject4).append(paramObject);
      ((StringBuilder)localObject4).append(paramClass);
      paramClass = m54207b69.F54207b69_11("=B60632633313468362F38373B476F3940723D3F4976464D494A464A514343");
      ((StringBuilder)localObject4).append(paramClass);
      localObject4 = ((StringBuilder)localObject4).toString();
      ((IllegalArgumentException)localObject2).<init>((String)localObject4);
      throw ((Throwable)localObject2);
      label911:
      double d = OooO0o0(paramLong);
      paramObject = Double.valueOf(d);
      break label1056;
      label928:
      float f = OooO0o(paramLong);
      paramObject = Float.valueOf(f);
      break label1056;
      label945:
      paramLong = OooO0oo(paramLong);
      paramObject = Long.valueOf(paramLong);
      break label1056;
      label960:
      int j = OooO0oO(paramLong);
      paramObject = Integer.valueOf(j);
      break label1056;
      label977:
      j = OooO0Oo(paramLong);
      paramObject = Character.valueOf(j);
      break label1056;
      label994:
      int k = OooOOO0(paramLong);
      paramObject = Short.valueOf(k);
      break label1056;
      label1011:
      k = OooO0O0(paramLong);
      paramObject = Byte.valueOf(k);
      break label1056;
      label1028:
      int m = OooO0oO(paramLong);
      if (m == 0)
      {
        bool2 = false;
        localObject3 = null;
      }
      paramObject = Function.o00Oo0(bool2);
    }
    label1056:
    return paramObject;
  }
  
  public String[] OooOOo0(long paramLong, String paramString)
  {
    return OooOOOo(paramLong, -1, paramString);
  }
  
  public String OooOOoo(long paramLong)
  {
    long l = this.OooO00o;
    return Native.getWideString(this, l, paramLong);
  }
  
  public void OooOo(long paramLong, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.read(this, l, paramLong, paramArrayOfChar, paramInt1, paramInt2);
  }
  
  public String[] OooOo0(long paramLong, int paramInt)
  {
    String str = m54207b69.F54207b69_11("''0A0B72716767107B7B7E78746C1718");
    return OooOOOo(paramLong, paramInt, str);
  }
  
  public String[] OooOo00(long paramLong)
  {
    return OooOo0(paramLong, -1);
  }
  
  public void OooOo0o(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.read(this, l, paramLong, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void OooOoO(long paramLong, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.read(this, l, paramLong, paramArrayOfFloat, paramInt1, paramInt2);
  }
  
  public void OooOoO0(long paramLong, double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.read(this, l, paramLong, paramArrayOfDouble, paramInt1, paramInt2);
  }
  
  public void OooOoOO(long paramLong, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.read(this, l, paramLong, paramArrayOfInt, paramInt1, paramInt2);
  }
  
  public void OooOoo(long paramLong, Pointer[] paramArrayOfPointer, int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < paramInt2)
    {
      int j = Native.OooOO0o * i;
      long l1 = j + paramLong;
      Pointer localPointer1 = OooOO0(l1);
      int k = i + paramInt1;
      Pointer localPointer2 = paramArrayOfPointer[k];
      if ((localPointer2 != null) && (localPointer1 != null))
      {
        long l2 = localPointer1.OooO00o;
        long l3 = localPointer2.OooO00o;
        boolean bool = l2 < l3;
        if (!bool) {}
      }
      else
      {
        paramArrayOfPointer[k] = localPointer1;
      }
      i += 1;
    }
  }
  
  public void OooOoo0(long paramLong, long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.read(this, l, paramLong, paramArrayOfLong, paramInt1, paramInt2);
  }
  
  public void OooOooO(long paramLong, short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.read(this, l, paramLong, paramArrayOfShort, paramInt1, paramInt2);
  }
  
  public final void OooOooo(long paramLong, Object paramObject, Class paramClass)
  {
    int i = Array.getLength(paramObject);
    Object localObject1 = Byte.TYPE;
    Object localObject2;
    FromNativeContext localFromNativeContext;
    if (paramClass == localObject1)
    {
      localObject2 = paramObject;
      localObject2 = (byte[])paramObject;
      localFromNativeContext = null;
      localObject1 = this;
      OooOo0o(paramLong, (byte[])localObject2, 0, i);
    }
    else
    {
      localObject1 = Short.TYPE;
      if (paramClass == localObject1)
      {
        localObject2 = paramObject;
        localObject2 = (short[])paramObject;
        localFromNativeContext = null;
        localObject1 = this;
        OooOooO(paramLong, (short[])localObject2, 0, i);
      }
      else
      {
        localObject1 = Character.TYPE;
        if (paramClass == localObject1)
        {
          localObject2 = paramObject;
          localObject2 = (char[])paramObject;
          localFromNativeContext = null;
          localObject1 = this;
          OooOo(paramLong, (char[])localObject2, 0, i);
        }
        else
        {
          localObject1 = Integer.TYPE;
          if (paramClass == localObject1)
          {
            localObject2 = paramObject;
            localObject2 = (int[])paramObject;
            localFromNativeContext = null;
            localObject1 = this;
            OooOoOO(paramLong, (int[])localObject2, 0, i);
          }
          else
          {
            localObject1 = Long.TYPE;
            if (paramClass == localObject1)
            {
              localObject2 = paramObject;
              localObject2 = (long[])paramObject;
              localFromNativeContext = null;
              localObject1 = this;
              OooOoo0(paramLong, (long[])localObject2, 0, i);
            }
            else
            {
              localObject1 = Float.TYPE;
              if (paramClass == localObject1)
              {
                localObject2 = paramObject;
                localObject2 = (float[])paramObject;
                localFromNativeContext = null;
                localObject1 = this;
                OooOoO(paramLong, (float[])localObject2, 0, i);
              }
              else
              {
                localObject1 = Double.TYPE;
                if (paramClass == localObject1)
                {
                  localObject2 = paramObject;
                  localObject2 = (double[])paramObject;
                  localFromNativeContext = null;
                  localObject1 = this;
                  OooOoO0(paramLong, (double[])localObject2, 0, i);
                }
                else
                {
                  localObject1 = Pointer.class;
                  boolean bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
                  if (bool1)
                  {
                    localObject2 = paramObject;
                    localObject2 = (Pointer[])paramObject;
                    localFromNativeContext = null;
                    localObject1 = this;
                    OooOoo(paramLong, (Pointer[])localObject2, 0, i);
                  }
                  else
                  {
                    localObject1 = Structure.class;
                    bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
                    int k = 0;
                    Object localObject3 = null;
                    long l;
                    if (bool1)
                    {
                      paramObject = (Structure[])paramObject;
                      localObject1 = Structure.ByReference.class;
                      bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
                      if (bool1)
                      {
                        j = paramObject.length;
                        localObject4 = OooOO0o(paramLong, j);
                        for (;;)
                        {
                          int m = paramObject.length;
                          if (k >= m) {
                            break;
                          }
                          localObject5 = paramObject[k];
                          localObject1 = localObject4[k];
                          localObject5 = Structure.OoooOoo(paramClass, (Structure)localObject5, (Pointer)localObject1);
                          paramObject[k] = localObject5;
                          k += 1;
                        }
                      }
                      localObject1 = paramObject[0];
                      int n = 1;
                      if (localObject1 == null)
                      {
                        localObject1 = OoooO0(paramLong);
                        localObject1 = Structure.Oooo0OO(paramClass, (Pointer)localObject1);
                        ((Structure)localObject1).OooOOOo();
                        paramObject[0] = localObject1;
                      }
                      else
                      {
                        i1 = (int)paramLong;
                        ((Structure)localObject1).OooooO0(this, i1, n);
                        ((Structure)localObject1).Oooo0o0();
                      }
                      int i1 = paramObject.length;
                      paramClass = ((Structure)localObject1).OoooOOO(i1);
                      int j = n;
                      for (;;)
                      {
                        k = paramObject.length;
                        if (j >= k) {
                          break;
                        }
                        localObject3 = paramObject[j];
                        if (localObject3 == null)
                        {
                          localObject3 = paramClass[j];
                          paramObject[j] = localObject3;
                        }
                        else
                        {
                          l = localObject3.OoooO00() * j + paramLong;
                          i2 = (int)l;
                          localObject3.OooooO0(this, i2, n);
                          localObject3 = paramObject[j];
                          localObject3.Oooo0o0();
                        }
                        j += 1;
                      }
                    }
                    localObject1 = NativeMapped.class;
                    boolean bool2 = ((Class)localObject1).isAssignableFrom(paramClass);
                    if (!bool2) {
                      break label764;
                    }
                    localObject1 = paramObject;
                    localObject1 = (NativeMapped[])paramObject;
                    NativeMappedConverter localNativeMappedConverter = NativeMappedConverter.OooO0o0(paramClass);
                    localObject2 = paramObject.getClass();
                    int i3 = Native.OooOOO((Class)localObject2, paramObject);
                    int i2 = localObject1.length;
                    i3 /= i2;
                    for (;;)
                    {
                      i2 = localObject1.length;
                      if (k >= i2) {
                        break;
                      }
                      i2 = i3 * k;
                      l = i2 + paramLong;
                      Class localClass = localNativeMappedConverter.OooO00o();
                      Object localObject6 = localObject1[k];
                      localObject2 = OooOOo(l, localClass, localObject6);
                      localFromNativeContext = new com/sun/jna/FromNativeContext;
                      localFromNativeContext.<init>(paramClass);
                      localObject2 = (NativeMapped)localNativeMappedConverter.OooO0OO(localObject2, localFromNativeContext);
                      localObject1[k] = localObject2;
                      k += 1;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return;
    label764:
    Object localObject4 = new java/lang/IllegalArgumentException;
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    paramObject = m54207b69.F54207b69_11("yG15232826322E266E2E3E3F314A74363077");
    ((StringBuilder)localObject5).append(paramObject);
    ((StringBuilder)localObject5).append(paramClass);
    paramObject = m54207b69.F54207b69_11("Z+0B4E5B474A104C554E4D635D1752526E1B69706E6F596F766668");
    ((StringBuilder)localObject5).append(paramObject);
    localObject5 = ((StringBuilder)localObject5).toString();
    ((IllegalArgumentException)localObject4).<init>((String)localObject5);
    throw ((Throwable)localObject4);
  }
  
  public void Oooo(long paramLong, Object paramObject, Class paramClass)
  {
    Object localObject1 = Boolean.TYPE;
    int i = 0;
    Object localObject2 = null;
    if (paramClass != localObject1)
    {
      localObject1 = Boolean.class;
      if (paramClass != localObject1)
      {
        localObject1 = Byte.TYPE;
        label397:
        int j;
        if (paramClass != localObject1)
        {
          localObject1 = Byte.class;
          if (paramClass != localObject1)
          {
            localObject1 = Short.TYPE;
            if (paramClass != localObject1)
            {
              localObject1 = Short.class;
              if (paramClass != localObject1)
              {
                localObject1 = Character.TYPE;
                if (paramClass != localObject1)
                {
                  localObject1 = Character.class;
                  if (paramClass != localObject1)
                  {
                    localObject1 = Integer.TYPE;
                    if (paramClass != localObject1)
                    {
                      localObject1 = Integer.class;
                      if (paramClass != localObject1)
                      {
                        localObject1 = Long.TYPE;
                        long l;
                        double d;
                        if (paramClass != localObject1)
                        {
                          localObject1 = Long.class;
                          if (paramClass != localObject1)
                          {
                            localObject1 = Float.TYPE;
                            if (paramClass != localObject1)
                            {
                              localObject1 = Float.class;
                              if (paramClass != localObject1)
                              {
                                localObject1 = Double.TYPE;
                                if (paramClass != localObject1)
                                {
                                  localObject1 = Double.class;
                                  if (paramClass != localObject1)
                                  {
                                    localObject1 = Pointer.class;
                                    if (paramClass == localObject1) {}
                                    for (paramObject = (Pointer)paramObject;; paramObject = CallbackReference.OooOO0o((Callback)paramObject))
                                    {
                                      Oooo0oO(paramLong, paramObject);
                                      return;
                                      localObject1 = String.class;
                                      if (paramClass == localObject1) {
                                        break;
                                      }
                                      localObject1 = WString.class;
                                      if (paramClass == localObject1) {
                                        break;
                                      }
                                      localObject1 = Structure.class;
                                      bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
                                      i = 0;
                                      localObject2 = null;
                                      if (bool1)
                                      {
                                        paramObject = (Structure)paramObject;
                                        localObject1 = Structure.ByReference.class;
                                        boolean bool2 = ((Class)localObject1).isAssignableFrom(paramClass);
                                        if (bool2)
                                        {
                                          if (paramObject != null) {
                                            localObject2 = paramObject.getPointer();
                                          }
                                          Oooo0oO(paramLong, (Pointer)localObject2);
                                          if (paramObject == null) {
                                            return;
                                          }
                                          paramObject.OooOO0();
                                          return;
                                        }
                                        int m = (int)paramLong;
                                        boolean bool3 = true;
                                        paramObject.OooooO0(this, m, bool3);
                                        paramObject.Oooooo();
                                        return;
                                      }
                                      localObject1 = Callback.class;
                                      bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
                                      if (!bool1) {
                                        break label397;
                                      }
                                    }
                                    boolean bool1 = Platform.OooO0O0;
                                    if (bool1)
                                    {
                                      localObject1 = Buffer.class;
                                      bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
                                      if (bool1)
                                      {
                                        if (paramObject != null)
                                        {
                                          paramObject = (Buffer)paramObject;
                                          localObject2 = Native.OooOO0O(paramObject);
                                        }
                                        Oooo0oO(paramLong, (Pointer)localObject2);
                                        return;
                                      }
                                    }
                                    localObject1 = NativeMapped.class;
                                    bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
                                    if (bool1)
                                    {
                                      paramClass = NativeMappedConverter.OooO0o0(paramClass);
                                      localObject1 = paramClass.OooO00o();
                                      localObject2 = new com/sun/jna/ToNativeContext;
                                      ((ToNativeContext)localObject2).<init>();
                                      paramObject = paramClass.OooO0O0(paramObject, (ToNativeContext)localObject2);
                                      Oooo(paramLong, paramObject, (Class)localObject1);
                                      return;
                                    }
                                    bool1 = paramClass.isArray();
                                    if (bool1)
                                    {
                                      paramClass = paramClass.getComponentType();
                                      Ooooo00(paramLong, paramObject, paramClass);
                                      return;
                                    }
                                    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
                                    Object localObject3 = new java/lang/StringBuilder;
                                    ((StringBuilder)localObject3).<init>();
                                    paramObject = m54207b69.F54207b69_11("|%72584E545050480C");
                                    ((StringBuilder)localObject3).append(paramObject);
                                    ((StringBuilder)localObject3).append(paramClass);
                                    paramObject = m54207b69.F54207b69_11("m$04514D074D464F525E660E586311585A601569646869616D685A5A");
                                    ((StringBuilder)localObject3).append(paramObject);
                                    localObject3 = ((StringBuilder)localObject3).toString();
                                    localIllegalArgumentException.<init>((String)localObject3);
                                    throw localIllegalArgumentException;
                                  }
                                }
                                if (paramObject == null)
                                {
                                  l = 0L;
                                  d = 0.0D;
                                }
                                else
                                {
                                  paramObject = (Double)paramObject;
                                  d = paramObject.doubleValue();
                                }
                                Oooo00o(paramLong, d);
                                return;
                              }
                            }
                            float f;
                            if (paramObject == null)
                            {
                              bool4 = false;
                              f = 0.0F;
                              paramObject = null;
                            }
                            else
                            {
                              paramObject = (Float)paramObject;
                              f = paramObject.floatValue();
                            }
                            Oooo0(paramLong, f);
                            return;
                          }
                        }
                        if (paramObject == null)
                        {
                          l = 0L;
                          d = 0.0D;
                        }
                        else
                        {
                          paramObject = (Long)paramObject;
                          l = paramObject.longValue();
                        }
                        Oooo0OO(paramLong, l);
                        return;
                      }
                    }
                    if (paramObject == null) {
                      break label843;
                    }
                    paramObject = (Integer)paramObject;
                    i = paramObject.intValue();
                    break label843;
                  }
                }
                if (paramObject != null)
                {
                  paramObject = (Character)paramObject;
                  i = paramObject.charValue();
                }
                Oooo00O(paramLong, i);
                return;
              }
            }
            if (paramObject != null)
            {
              paramObject = (Short)paramObject;
              j = paramObject.shortValue();
            }
            Oooo0oo(paramLong, j);
            return;
          }
        }
        if (paramObject != null)
        {
          paramObject = (Byte)paramObject;
          j = paramObject.byteValue();
        }
        Oooo000(paramLong, j);
        return;
      }
    }
    paramClass = Boolean.TRUE;
    boolean bool4 = paramClass.equals(paramObject);
    int k;
    if (bool4) {
      k = -1;
    }
    label843:
    Oooo0O0(paramLong, k);
  }
  
  public void Oooo0(long paramLong, float paramFloat)
  {
    long l = this.OooO00o;
    Native.setFloat(this, l, paramLong, paramFloat);
  }
  
  public void Oooo000(long paramLong, byte paramByte)
  {
    long l = this.OooO00o;
    Native.setByte(this, l, paramLong, paramByte);
  }
  
  public void Oooo00O(long paramLong, char paramChar)
  {
    long l = this.OooO00o;
    Native.setChar(this, l, paramLong, paramChar);
  }
  
  public void Oooo00o(long paramLong, double paramDouble)
  {
    long l = this.OooO00o;
    Native.setDouble(this, l, paramLong, paramDouble);
  }
  
  public void Oooo0O0(long paramLong, int paramInt)
  {
    long l = this.OooO00o;
    Native.setInt(this, l, paramLong, paramInt);
  }
  
  public void Oooo0OO(long paramLong1, long paramLong2)
  {
    long l = this.OooO00o;
    Native.setLong(this, l, paramLong1, paramLong2);
  }
  
  public void Oooo0o(long paramLong, NativeLong paramNativeLong)
  {
    int i = NativeLong.o00Ooo0o;
    int j = 8;
    if (i == j)
    {
      long l = paramNativeLong.longValue();
      Oooo0OO(paramLong, l);
    }
    else
    {
      int k = paramNativeLong.intValue();
      Oooo0O0(paramLong, k);
    }
  }
  
  public void Oooo0o0(long paramLong1, long paramLong2, byte paramByte)
  {
    long l = this.OooO00o;
    Native.setMemory(this, l, paramLong1, paramLong2, paramByte);
  }
  
  public void Oooo0oO(long paramLong, Pointer paramPointer)
  {
    long l1 = this.OooO00o;
    if (paramPointer != null) {
      l2 = paramPointer.OooO00o;
    } else {
      l2 = 0L;
    }
    long l3 = l2;
    long l2 = paramLong;
    Native.setPointer(this, l1, paramLong, l3);
  }
  
  public void Oooo0oo(long paramLong, short paramShort)
  {
    long l = this.OooO00o;
    Native.setShort(this, l, paramLong, paramShort);
  }
  
  public void OoooO(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.write(this, l, paramLong, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public Pointer OoooO0(long paramLong)
  {
    return OoooO0O(paramLong, 0L);
  }
  
  public void OoooO00(long paramLong, String paramString)
  {
    long l = this.OooO00o;
    Native.setWideString(this, l, paramLong, paramString);
  }
  
  public Pointer OoooO0O(long paramLong1, long paramLong2)
  {
    paramLong2 = 0L;
    boolean bool = paramLong1 < paramLong2;
    if (!bool) {
      return this;
    }
    Pointer localPointer = new com/sun/jna/Pointer;
    long l = this.OooO00o + paramLong1;
    localPointer.<init>(l);
    return localPointer;
  }
  
  public void OoooOO0(long paramLong, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.write(this, l, paramLong, paramArrayOfChar, paramInt1, paramInt2);
  }
  
  public void OoooOOO(long paramLong, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.write(this, l, paramLong, paramArrayOfFloat, paramInt1, paramInt2);
  }
  
  public void OoooOOo(long paramLong, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.write(this, l, paramLong, paramArrayOfInt, paramInt1, paramInt2);
  }
  
  public void OoooOo0(long paramLong, long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.write(this, l, paramLong, paramArrayOfLong, paramInt1, paramInt2);
  }
  
  public void OoooOoO(long paramLong, Pointer[] paramArrayOfPointer, int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < paramInt2)
    {
      int j = Native.OooOO0o * i;
      long l = j + paramLong;
      int k = paramInt1 + i;
      Pointer localPointer = paramArrayOfPointer[k];
      Oooo0oO(l, localPointer);
      i += 1;
    }
  }
  
  public void OoooOoo(long paramLong, short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.write(this, l, paramLong, paramArrayOfShort, paramInt1, paramInt2);
  }
  
  public final void Ooooo00(long paramLong, Object paramObject, Class paramClass)
  {
    Object localObject1 = Byte.TYPE;
    Object localObject2;
    Pointer[] arrayOfPointer;
    int i;
    Pointer localPointer;
    if (paramClass == localObject1)
    {
      localObject2 = paramObject;
      localObject2 = (byte[])paramObject;
      arrayOfPointer = null;
      i = localObject2.length;
      localPointer = this;
      OoooO(paramLong, (byte[])localObject2, 0, i);
    }
    else
    {
      localObject1 = Short.TYPE;
      if (paramClass == localObject1)
      {
        localObject2 = paramObject;
        localObject2 = (short[])paramObject;
        arrayOfPointer = null;
        i = localObject2.length;
        localPointer = this;
        OoooOoo(paramLong, (short[])localObject2, 0, i);
      }
      else
      {
        localObject1 = Character.TYPE;
        if (paramClass == localObject1)
        {
          localObject2 = paramObject;
          localObject2 = (char[])paramObject;
          arrayOfPointer = null;
          i = localObject2.length;
          localPointer = this;
          OoooOO0(paramLong, (char[])localObject2, 0, i);
        }
        else
        {
          localObject1 = Integer.TYPE;
          if (paramClass == localObject1)
          {
            localObject2 = paramObject;
            localObject2 = (int[])paramObject;
            arrayOfPointer = null;
            i = localObject2.length;
            localPointer = this;
            OoooOOo(paramLong, (int[])localObject2, 0, i);
          }
          else
          {
            localObject1 = Long.TYPE;
            if (paramClass == localObject1)
            {
              localObject2 = paramObject;
              localObject2 = (long[])paramObject;
              arrayOfPointer = null;
              i = localObject2.length;
              localPointer = this;
              OoooOo0(paramLong, (long[])localObject2, 0, i);
            }
            else
            {
              localObject1 = Float.TYPE;
              if (paramClass == localObject1)
              {
                localObject2 = paramObject;
                localObject2 = (float[])paramObject;
                arrayOfPointer = null;
                i = localObject2.length;
                localPointer = this;
                OoooOOO(paramLong, (float[])localObject2, 0, i);
              }
              else
              {
                localObject1 = Double.TYPE;
                if (paramClass == localObject1)
                {
                  localObject2 = paramObject;
                  localObject2 = (double[])paramObject;
                  arrayOfPointer = null;
                  i = localObject2.length;
                  localPointer = this;
                  o000oOoO(paramLong, (double[])localObject2, 0, i);
                }
                else
                {
                  localObject1 = Pointer.class;
                  int j = ((Class)localObject1).isAssignableFrom(paramClass);
                  if (j != 0)
                  {
                    localObject2 = paramObject;
                    localObject2 = (Pointer[])paramObject;
                    arrayOfPointer = null;
                    i = localObject2.length;
                    localPointer = this;
                    OoooOoO(paramLong, (Pointer[])localObject2, 0, i);
                  }
                  else
                  {
                    localObject1 = Structure.class;
                    j = ((Class)localObject1).isAssignableFrom(paramClass);
                    int m = 0;
                    localPointer = null;
                    Object localObject3;
                    int i5;
                    if (j != 0)
                    {
                      paramObject = (Structure[])paramObject;
                      localObject1 = Structure.ByReference.class;
                      j = ((Class)localObject1).isAssignableFrom(paramClass);
                      int i3;
                      long l1;
                      if (j != 0)
                      {
                        int i1 = paramObject.length;
                        arrayOfPointer = new Pointer[i1];
                        for (;;)
                        {
                          int i2 = paramObject.length;
                          if (m >= i2) {
                            break;
                          }
                          paramClass = paramObject[m];
                          if (paramClass == null)
                          {
                            i3 = 0;
                            paramClass = null;
                            arrayOfPointer[m] = null;
                          }
                          else
                          {
                            paramClass = paramClass.getPointer();
                            arrayOfPointer[m] = paramClass;
                            paramClass = paramObject[m];
                            paramClass.Oooooo();
                          }
                          m += 1;
                        }
                        i = 0;
                        localObject3 = this;
                        l1 = paramLong;
                        OoooOoO(paramLong, arrayOfPointer, 0, i1);
                      }
                      else
                      {
                        localObject1 = paramObject[0];
                        int i4 = 1;
                        if (localObject1 == null)
                        {
                          localObject1 = OoooO0(paramLong);
                          localObject1 = Structure.Oooo0OO(paramClass, (Pointer)localObject1);
                          paramObject[0] = localObject1;
                        }
                        else
                        {
                          i3 = (int)paramLong;
                          ((Structure)localObject1).OooooO0(this, i3, i4);
                        }
                        ((Structure)localObject1).Oooooo();
                        i3 = paramObject.length;
                        paramClass = ((Structure)localObject1).OoooOOO(i3);
                        j = i4;
                        for (;;)
                        {
                          m = paramObject.length;
                          if (j >= m) {
                            break;
                          }
                          localPointer = paramObject[j];
                          if (localPointer == null)
                          {
                            localPointer = paramClass[j];
                            paramObject[j] = localPointer;
                          }
                          else
                          {
                            l1 = localPointer.OoooO00() * j + paramLong;
                            i5 = (int)l1;
                            localPointer.OooooO0(this, i5, i4);
                          }
                          localPointer = paramObject[j];
                          localPointer.Oooooo();
                          int k;
                          j += 1;
                        }
                      }
                    }
                    else
                    {
                      localObject1 = NativeMapped.class;
                      boolean bool = ((Class)localObject1).isAssignableFrom(paramClass);
                      if (!bool) {
                        break label820;
                      }
                      localObject1 = paramObject;
                      localObject1 = (NativeMapped[])paramObject;
                      paramClass = NativeMappedConverter.OooO0o0(paramClass);
                      localObject3 = paramClass.OooO00o();
                      Object localObject4 = paramObject.getClass();
                      int i6 = Native.OooOOO((Class)localObject4, paramObject);
                      i5 = localObject1.length;
                      int i7;
                      i6 /= i5;
                      for (;;)
                      {
                        i5 = localObject1.length;
                        if (m >= i5) {
                          break;
                        }
                        localObject4 = localObject1[m];
                        localObject2 = new com/sun/jna/ToNativeContext;
                        ((ToNativeContext)localObject2).<init>();
                        localObject4 = paramClass.OooO0O0(localObject4, (ToNativeContext)localObject2);
                        int i8 = m * i7;
                        long l2 = i8 + paramLong;
                        Oooo(l2, localObject4, (Class)localObject3);
                        int n;
                        m += 1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return;
    label820:
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    paramObject = m54207b69.F54207b69_11("Nu22081E042020185C1C10111F1862282265");
    ((StringBuilder)localObject5).append(paramObject);
    ((StringBuilder)localObject5).append(paramClass);
    paramObject = m54207b69.F54207b69_11("X111466014605962654B511B6A6A521F5154525371575A6A6C");
    ((StringBuilder)localObject5).append(paramObject);
    localObject5 = ((StringBuilder)localObject5).toString();
    localIllegalArgumentException.<init>((String)localObject5);
    throw localIllegalArgumentException;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return bool1;
    }
    if (paramObject == null) {
      return false;
    }
    boolean bool2 = paramObject instanceof Pointer;
    if (bool2)
    {
      paramObject = (Pointer)paramObject;
      long l1 = paramObject.OooO00o;
      long l2 = this.OooO00o;
      boolean bool3 = l1 < l2;
      if (!bool3) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public int hashCode()
  {
    long l1 = this.OooO00o;
    long l2 = l1 >>> 32;
    l1 &= -1;
    return (int)(l2 + l1);
  }
  
  public void o000oOoO(long paramLong, double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    long l = this.OooO00o;
    Native.write(this, l, paramLong, paramArrayOfDouble, paramInt1, paramInt2);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("S35D53495D495B790A53");
    localStringBuilder.append(str);
    str = Long.toHexString(this.OooO00o);
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Pointer
 * JD-Core Version:    0.7.0.1
 */