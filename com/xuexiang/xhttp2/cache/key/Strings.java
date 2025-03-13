package com.xuexiang.xhttp2.cache.key;

import java.util.Set;
import m54207b69;

public final class Strings
{
  public static IObjectSerializer OooO00o;
  
  private Strings()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static String OooO00o(Object paramObject)
  {
    if (paramObject == null) {
      return m54207b69.F54207b69_11("C?514B5556");
    }
    boolean bool1 = paramObject instanceof CharSequence;
    if (bool1)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      char c = '"';
      ((StringBuilder)localObject).append(c);
      paramObject = OooO0oO(paramObject.toString());
      ((StringBuilder)localObject).append(paramObject);
      ((StringBuilder)localObject).append(c);
      return ((StringBuilder)localObject).toString();
    }
    Object localObject = paramObject.getClass();
    Byte localByte = Byte.class;
    if (localByte == localObject) {
      return OooO0o((Byte)paramObject);
    }
    boolean bool2 = ((Class)localObject).isArray();
    if (bool2) {
      return OooO0O0(((Class)localObject).getComponentType(), paramObject);
    }
    return paramObject.toString();
  }
  
  public static String OooO0O0(Class paramClass, Object paramObject)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramClass;
    arrayOfObject[1] = paramObject;
    return (String)m54207b69.F54207b69_09(1147, arrayOfObject);
  }
  
  public static String OooO0OO(Object[] paramArrayOfObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramArrayOfObject;
    return (String)m54207b69.F54207b69_09(1148, arrayOfObject);
  }
  
  public static void OooO0Oo(Object[] paramArrayOfObject, StringBuilder paramStringBuilder, Set paramSet)
  {
    String str = m54207b69.F54207b69_11("C?514B5556");
    if (paramArrayOfObject == null)
    {
      paramStringBuilder.append(str);
      return;
    }
    paramSet.add(paramArrayOfObject);
    paramStringBuilder.append('[');
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfObject.length;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        localObject1 = ", ";
        paramStringBuilder.append((String)localObject1);
      }
      Object localObject1 = paramArrayOfObject[i];
      if (localObject1 == null)
      {
        paramStringBuilder.append(str);
      }
      else
      {
        Class localClass = localObject1.getClass();
        boolean bool1 = localClass.isArray();
        if (bool1)
        {
          localClass = localClass.getComponentType();
          Object localObject2 = Object.class;
          if (localClass == localObject2)
          {
            localObject1 = (Object[])localObject1;
            boolean bool2 = paramSet.contains(localObject1);
            if (bool2)
            {
              localObject1 = m54207b69.F54207b69_11("S56E1C1D1E6C");
              break label168;
            }
            OooO0Oo((Object[])localObject1, paramStringBuilder, paramSet);
            break label175;
          }
        }
        localObject1 = OooO00o(localObject1);
        label168:
        paramStringBuilder.append((String)localObject1);
      }
      label175:
      i += 1;
    }
    paramStringBuilder.append(']');
    paramSet.remove(paramArrayOfObject);
  }
  
  public static String OooO0o(Byte paramByte)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramByte;
    return (String)m54207b69.F54207b69_09(1150, arrayOfObject);
  }
  
  public static String OooO0o0(byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramArrayOfByte;
    return (String)m54207b69.F54207b69_09(1151, arrayOfObject);
  }
  
  public static String OooO0oO(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (String)m54207b69.F54207b69_09(1152, arrayOfObject);
  }
  
  public static String OooO0oo(Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    return (String)m54207b69.F54207b69_09(1153, arrayOfObject);
  }
  
  public static void setISerializer(IObjectSerializer paramIObjectSerializer)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramIObjectSerializer;
    m54207b69.F54207b69_00(1154, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.cache.key.Strings
 * JD-Core Version:    0.7.0.1
 */