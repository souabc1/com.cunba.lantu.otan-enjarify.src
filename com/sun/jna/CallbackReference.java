package com.sun.jna;

import com.sun.jna.win32.DLLCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import m54207b69;

public class CallbackReference
  extends WeakReference
{
  public static final Map OooO;
  public static final Map OooO0o;
  public static final Map OooO0oO;
  public static final Map OooO0oo;
  public static final Map OooOO0;
  public static final Method OooOO0O;
  public static final Class OooOO0o;
  public static final Map OooOOO0;
  public Pointer OooO00o;
  public Pointer OooO0O0;
  public CallbackProxy OooO0OO;
  public Method OooO0Oo;
  public int OooO0o0;
  
  static
  {
    Object localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    OooO0o = (Map)localObject1;
    localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    OooO0oO = (Map)localObject1;
    localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    OooO0oo = (Map)localObject1;
    localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    OooO = Collections.synchronizedMap((Map)localObject1);
    localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    OooOO0 = Collections.synchronizedMap((Map)localObject1);
    localObject1 = CallbackProxy.class;
    Object localObject3 = "G@0F303112747535";
    try
    {
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      int i = 1;
      Object localObject4 = new Class[i];
      Object[] arrayOfObject = [Ljava.lang.Object.class;
      localObject4[0] = arrayOfObject;
      localObject1 = ((Class)localObject1).getMethod((String)localObject3, (Class[])localObject4);
      OooOO0O = (Method)localObject1;
      boolean bool = Platform.isWindows();
      if (bool)
      {
        localObject1 = DLLCallback.class;
        try
        {
          OooOO0o = (Class)localObject1;
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          localObject3 = new java/lang/Error;
          localObject4 = m54207b69.F54207b69_11("R|390F10161261161A25211F1D2769463F40502F23243333362F75392B392C2D");
          ((Error)localObject3).<init>((String)localObject4, localClassNotFoundException);
          throw ((Throwable)localObject3);
        }
      }
      else
      {
        bool = false;
        localObject2 = null;
        OooOO0o = null;
      }
      localObject2 = new java/util/WeakHashMap;
      ((WeakHashMap)localObject2).<init>();
      OooOOO0 = (Map)localObject2;
      return;
    }
    catch (Exception localException)
    {
      Object localObject2 = new java/lang/Error;
      localObject3 = m54207b69.F54207b69_11("9,695F60466211464A4B504F4D5719676B1C805F53546363665F95785E7072206E6D61627171746D2B2D356B7484717177");
      ((Error)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
  }
  
  public CallbackReference(Callback paramCallback, int paramInt, boolean paramBoolean)
  {
    super(paramCallback);
    Object localObject1 = Native.OooOo00(paramCallback.getClass());
    this.OooO0o0 = paramInt;
    int i = Platform.isPPC();
    int k = 0;
    Object localObject2;
    Object localObject3;
    Class[] arrayOfClass;
    Object localObject4;
    Object localObject5;
    if (paramBoolean)
    {
      localObject2 = OooOO0(paramCallback);
      localObject3 = ((Method)localObject2).getParameterTypes();
      int m = 0;
      arrayOfClass = null;
      for (;;)
      {
        int n = localObject3.length;
        if (m >= n) {
          break;
        }
        if (i != 0)
        {
          localObject4 = localObject3[m];
          Class localClass = Float.TYPE;
          if (localObject4 != localClass)
          {
            localClass = Double.TYPE;
            if (localObject4 != localClass) {
              break label106;
            }
          }
        }
        label106:
        do
        {
          paramBoolean = false;
          localObject5 = null;
          break label146;
          if (localObject1 == null) {
            break;
          }
          localObject4 = localObject3[m];
          localObject4 = ((TypeMapper)localObject1).OooO0O0((Class)localObject4);
        } while (localObject4 != null);
        m += 1;
      }
      label146:
      if (localObject1 != null)
      {
        localObject6 = ((Method)localObject2).getReturnType();
        localObject6 = ((TypeMapper)localObject1).OooO00o((Class)localObject6);
        if (localObject6 != null)
        {
          paramBoolean = false;
          localObject5 = null;
        }
      }
    }
    Object localObject6 = paramCallback.getClass();
    String str = Native.OooOOo((Class)localObject6);
    label252:
    long l1;
    if (paramBoolean)
    {
      localObject5 = OooOO0(paramCallback);
      this.OooO0Oo = ((Method)localObject5);
      arrayOfClass = ((Method)localObject5).getParameterTypes();
      localObject4 = this.OooO0Oo.getReturnType();
      localObject5 = OooOO0o;
      if (localObject5 != null)
      {
        paramBoolean = ((Class)localObject5).isInstance(paramCallback);
        if (paramBoolean)
        {
          paramBoolean = true;
          break label252;
        }
      }
      paramBoolean = true;
      localObject3 = this.OooO0Oo;
      localObject2 = paramCallback;
      l1 = Native.createNativeCallback(paramCallback, (Method)localObject3, arrayOfClass, (Class)localObject4, paramInt, paramBoolean, str);
    }
    else
    {
      paramBoolean = paramCallback instanceof CallbackProxy;
      if (paramBoolean)
      {
        localObject5 = paramCallback;
        localObject5 = (CallbackProxy)paramCallback;
      }
      else
      {
        localObject5 = new com/sun/jna/CallbackReference$DefaultCallbackProxy;
        localObject6 = OooOO0(paramCallback);
        ((CallbackReference.DefaultCallbackProxy)localObject5).<init>(this, (Method)localObject6, (TypeMapper)localObject1, str);
      }
      this.OooO0OO = ((CallbackProxy)localObject5);
      arrayOfClass = this.OooO0OO.getParameterTypes();
      localObject5 = this.OooO0OO.getReturnType();
      int j;
      if (localObject1 != null)
      {
        i = 0;
        localObject6 = null;
        for (;;)
        {
          int i1 = arrayOfClass.length;
          if (i >= i1) {
            break;
          }
          localObject2 = arrayOfClass[i];
          localObject2 = ((TypeMapper)localObject1).OooO0O0((Class)localObject2);
          if (localObject2 != null)
          {
            localObject2 = ((FromNativeConverter)localObject2).OooO00o();
            arrayOfClass[i] = localObject2;
          }
          i += 1;
        }
        localObject1 = ((TypeMapper)localObject1).OooO00o((Class)localObject5);
        if (localObject1 != null) {
          localObject5 = ((ToNativeConverter)localObject1).OooO00o();
        }
      }
      int i2 = 0;
      localObject1 = null;
      for (;;)
      {
        j = arrayOfClass.length;
        localObject2 = m54207b69.F54207b69_11("cV7625352A27442A3A2D7F3F2E312F474A86334139478B4B5050394D3F415C5757");
        if (i2 >= j) {
          break label578;
        }
        localObject6 = arrayOfClass[i2];
        localObject6 = OooOOOO((Class)localObject6);
        arrayOfClass[i2] = localObject6;
        boolean bool1 = OooOOo0((Class)localObject6);
        if (!bool1) {
          break;
        }
        i2 += 1;
      }
      paramCallback = new java/lang/StringBuilder;
      paramCallback.<init>();
      localObject7 = m54207b69.F54207b69_11("]$67464A4B4A4A4D560C4E604E5D564F596015");
      paramCallback.append((String)localObject7);
      localObject7 = arrayOfClass[i2];
      paramCallback.append(localObject7);
      paramCallback.append((String)localObject2);
      paramCallback = paramCallback.toString();
      localObject7 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject7).<init>(paramCallback);
      throw ((Throwable)localObject7);
      label578:
      localObject4 = OooOOOO((Class)localObject5);
      paramBoolean = OooOOo0((Class)localObject4);
      if (!paramBoolean) {
        break label716;
      }
      localObject5 = OooOO0o;
      if (localObject5 != null)
      {
        boolean bool2 = ((Class)localObject5).isInstance(paramCallback);
        if (bool2) {
          k = 2;
        }
      }
      localObject2 = this.OooO0OO;
      localObject3 = OooOO0O;
      l1 = Native.createNativeCallback((Callback)localObject2, (Method)localObject3, arrayOfClass, (Class)localObject4, paramInt, k, str);
    }
    long l2 = 0L;
    paramBoolean = l1 < l2;
    if (paramBoolean)
    {
      localObject5 = new com/sun/jna/Pointer;
      ((Pointer)localObject5).<init>(l1);
    }
    else
    {
      paramBoolean = false;
      localObject5 = null;
    }
    this.OooO00o = ((Pointer)localObject5);
    paramCallback = OooOO0;
    Object localObject7 = new java/lang/ref/WeakReference;
    ((WeakReference)localObject7).<init>(this);
    paramCallback.put(this, localObject7);
    return;
    label716:
    paramCallback = new java/lang/StringBuilder;
    paramCallback.<init>();
    localObject7 = m54207b69.F54207b69_11(")V15383C3D383C3B447E2D3D2D2F314685324038468A");
    paramCallback.append((String)localObject7);
    paramCallback.append(localObject4);
    paramCallback.append((String)localObject2);
    paramCallback = paramCallback.toString();
    localObject7 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject7).<init>(paramCallback);
    throw ((Throwable)localObject7);
  }
  
  public static Callback OooO(Class paramClass, Pointer paramPointer, boolean paramBoolean)
  {
    if (paramPointer == null) {
      return null;
    }
    boolean bool = paramClass.isInterface();
    if (bool)
    {
      Map localMap1;
      if (paramBoolean) {
        localMap1 = OooO0oO;
      } else {
        localMap1 = OooO0o;
      }
      synchronized (OooO0oo)
      {
        Object localObject = ???.get(paramPointer);
        localObject = (Reference[])localObject;
        Callback localCallback = OooOOOo(paramClass, (Reference[])localObject);
        if (localCallback != null) {
          return localCallback;
        }
        paramClass = OooO0Oo(paramClass, paramPointer);
        localObject = OooO0O0(paramClass, (Reference[])localObject);
        ???.put(paramPointer, localObject);
        localMap1.remove(paramClass);
        return paramClass;
      }
    }
    paramClass = new java/lang/IllegalArgumentException;
    paramPointer = m54207b69.F54207b69_11("2}3E1D13142321241D65120E18246A1E171E1A6F322C72322A752D2D24342C393B3E39");
    paramClass.<init>(paramPointer);
  }
  
  public static Reference[] OooO0O0(Callback paramCallback, Reference[] paramArrayOfReference)
  {
    int i = 0;
    int j = 1;
    int k;
    int m;
    Object localObject;
    if (paramArrayOfReference != null)
    {
      k = 0;
      for (;;)
      {
        m = paramArrayOfReference.length;
        if (k >= m) {
          break;
        }
        localObject = paramArrayOfReference[k].get();
        if (localObject == null)
        {
          m = 0;
          localObject = null;
          paramArrayOfReference[k] = null;
        }
        else
        {
          j += 1;
        }
        k += 1;
      }
    }
    Reference[] arrayOfReference = new Reference[j];
    if (paramArrayOfReference != null)
    {
      k = 0;
      for (;;)
      {
        m = paramArrayOfReference.length;
        if (i >= m) {
          break;
        }
        localObject = paramArrayOfReference[i];
        if (localObject != null)
        {
          int n = k + 1;
          arrayOfReference[k] = localObject;
          k = n;
        }
        i += 1;
      }
      i = k;
    }
    paramArrayOfReference = new java/lang/ref/WeakReference;
    paramArrayOfReference.<init>(paramCallback);
    arrayOfReference[i] = paramArrayOfReference;
    return arrayOfReference;
  }
  
  public static Method OooO0OO(Method paramMethod)
  {
    Object localObject = paramMethod.getParameterTypes();
    int i = localObject.length;
    int j = 256;
    if (i <= j) {
      return paramMethod;
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("wJ07304025293370402B362E364A4C463E7A40443C4344445082573C4A864449514348614A8E5F515F535059695B65985855705671A49F");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramMethod);
    paramMethod = ((StringBuilder)localObject).toString();
    localObject = new java/lang/UnsupportedOperationException;
    ((UnsupportedOperationException)localObject).<init>(paramMethod);
    throw ((Throwable)localObject);
  }
  
  public static Callback OooO0Oo(Class paramClass, Pointer paramPointer)
  {
    Object localObject1 = AltCallingConvention.class;
    boolean bool = ((Class)localObject1).isAssignableFrom(paramClass);
    int i;
    if (bool)
    {
      i = 63;
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    HashMap localHashMap = new java/util/HashMap;
    Object localObject2 = Native.OooOO0o(paramClass);
    localHashMap.<init>((Map)localObject2);
    localObject2 = m54207b69.F54207b69_11("d/46425B43484B474F0A4B5466534D59");
    Method localMethod = OooOO0O(paramClass);
    localHashMap.put(localObject2, localMethod);
    localObject2 = new com/sun/jna/CallbackReference$NativeFunctionHandler;
    ((CallbackReference.NativeFunctionHandler)localObject2).<init>(paramPointer, i, localHashMap);
    paramPointer = paramClass.getClassLoader();
    localObject1 = new Class[1];
    localObject1[0] = paramClass;
    return (Callback)Proxy.newProxyInstance(paramPointer, (Class[])localObject1, (InvocationHandler)localObject2);
  }
  
  public static void OooO0o()
  {
    Object localObject1 = new java/util/LinkedList;
    Object localObject2 = OooOO0.keySet();
    ((LinkedList)localObject1).<init>((Collection)localObject2);
    localObject1 = ((Collection)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (CallbackReference)((Iterator)localObject1).next();
      ((CallbackReference)localObject2).OooO0o0();
    }
  }
  
  public static Class OooO0oO(Class paramClass)
  {
    Object localObject1 = Callback.class;
    boolean bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
    if (bool1)
    {
      bool1 = paramClass.isInterface();
      if (bool1) {
        return paramClass;
      }
      localObject2 = paramClass.getInterfaces();
      int i = 0;
      for (;;)
      {
        int j = localObject2.length;
        if (i >= j) {
          break;
        }
        Class localClass = localObject2[i];
        boolean bool2 = ((Class)localObject1).isAssignableFrom(localClass);
        if (bool2) {}
        try
        {
          localClass = localObject2[i];
          OooOO0O(localClass);
          return localObject2[i];
        }
        catch (IllegalArgumentException localIllegalArgumentException) {}
        i += 1;
      }
      localObject2 = paramClass.getSuperclass();
      boolean bool3 = ((Class)localObject1).isAssignableFrom((Class)localObject2);
      if (bool3) {
        paramClass = OooO0oO(paramClass.getSuperclass());
      }
      return paramClass;
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    paramClass = paramClass.getName();
    ((StringBuilder)localObject2).append(paramClass);
    paramClass = m54207b69.F54207b69_11("U+0B435A0E494965125757634D695B5D1A5D6A56591F5D5A5D1D717860215E636925896C6A6B6E706F68");
    ((StringBuilder)localObject2).append(paramClass);
    paramClass = ((StringBuilder)localObject2).toString();
    ((IllegalArgumentException)localObject1).<init>(paramClass);
    throw ((Throwable)localObject1);
  }
  
  public static Callback OooO0oo(Class paramClass, Pointer paramPointer)
  {
    return OooO(paramClass, paramPointer, false);
  }
  
  public static Method OooOO0(Callback paramCallback)
  {
    return OooOO0O(OooO0oO(paramCallback.getClass()));
  }
  
  public static Method OooOO0O(Class paramClass)
  {
    Object localObject1 = paramClass.getDeclaredMethods();
    paramClass = paramClass.getMethods();
    HashSet localHashSet = new java/util/HashSet;
    localObject1 = Arrays.asList((Object[])localObject1);
    localHashSet.<init>((Collection)localObject1);
    paramClass = Arrays.asList(paramClass);
    localHashSet.retainAll(paramClass);
    paramClass = localHashSet.iterator();
    Object localObject2;
    for (;;)
    {
      boolean bool1 = paramClass.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Method)paramClass.next();
      localObject2 = Callback.OooO00o;
      localObject1 = ((Method)localObject1).getName();
      bool1 = ((List)localObject2).contains(localObject1);
      if (bool1) {
        paramClass.remove();
      }
    }
    int i = 0;
    paramClass = null;
    localObject1 = new Method[0];
    localObject1 = (Method[])localHashSet.toArray((Object[])localObject1);
    int j = localObject1.length;
    int k = 1;
    if (j == k) {
      return OooO0OO(localObject1[0]);
    }
    for (;;)
    {
      j = localObject1.length;
      if (i >= j) {
        break;
      }
      localHashSet = localObject1[i];
      localObject2 = localHashSet.getName();
      String str = m54207b69.F54207b69_11("KU36353B3C3B393C45");
      boolean bool2 = str.equals(localObject2);
      if (bool2) {
        return OooO0OO(localHashSet);
      }
      i += 1;
    }
    paramClass = new java/lang/IllegalArgumentException;
    localObject1 = m54207b69.F54207b69_11("Z|3F1E12132222251E641A131A146923201C212B242D271E73357529302E382E387C2D2B41343A45833942323F3F457E8B433F8E46464E924341574A505B994F584855555BA05763586161A6A66B6A5E5F6E6E716AAF");
    paramClass.<init>((String)localObject1);
    throw paramClass;
  }
  
  public static Pointer OooOO0o(Callback paramCallback)
  {
    return OooOOO0(paramCallback, false);
  }
  
  public static Pointer OooOOO(Callback paramCallback)
  {
    Class localClass = paramCallback.getClass();
    boolean bool = Proxy.isProxyClass(localClass);
    if (bool)
    {
      paramCallback = Proxy.getInvocationHandler(paramCallback);
      bool = paramCallback instanceof CallbackReference.NativeFunctionHandler;
      if (bool) {
        return ((CallbackReference.NativeFunctionHandler)paramCallback).getPointer();
      }
    }
    return null;
  }
  
  public static Pointer OooOOO0(Callback paramCallback, boolean paramBoolean)
  {
    Reference[] arrayOfReference = null;
    if (paramCallback == null) {
      return null;
    }
    Object localObject1 = OooOOO(paramCallback);
    if (localObject1 != null) {
      return localObject1;
    }
    localObject1 = Native.OooOO0o(paramCallback.getClass());
    boolean bool = paramCallback instanceof AltCallingConvention;
    int i;
    Object localObject2;
    if (bool)
    {
      i = 63;
    }
    else
    {
      if (localObject1 != null)
      {
        localObject2 = m54207b69.F54207b69_11("uZ393C38393739437E413E3E374B413C424545");
        bool = ((Map)localObject1).containsKey(localObject2);
        if (bool)
        {
          localObject2 = m54207b69.F54207b69_11("uZ393C38393739437E413E3E374B413C424545");
          localObject1 = (Integer)((Map)localObject1).get(localObject2);
          i = ((Integer)localObject1).intValue();
          break label106;
        }
      }
      i = 0;
      localObject1 = null;
    }
    label106:
    if (paramBoolean) {
      localObject2 = OooO0oO;
    } else {
      localObject2 = OooO0o;
    }
    synchronized (OooO0oo)
    {
      Object localObject3 = ((Map)localObject2).get(paramCallback);
      localObject3 = (CallbackReference)localObject3;
      if (localObject3 == null)
      {
        localObject3 = new com/sun/jna/CallbackReference;
        ((CallbackReference)localObject3).<init>((Callback)paramCallback, i, paramBoolean);
        ((Map)localObject2).put(paramCallback, localObject3);
        Object localObject4 = ((CallbackReference)localObject3).getTrampoline();
        arrayOfReference = OooO0O0((Callback)paramCallback, null);
        ???.put(localObject4, arrayOfReference);
        localObject4 = OooOOO0;
        int j = ((Map)localObject4).containsKey(paramCallback);
        if (j != 0)
        {
          j = 1;
          ((CallbackReference)localObject3).setCallbackOptions(j);
        }
      }
      paramCallback = ((CallbackReference)localObject3).getTrampoline();
      return paramCallback;
    }
  }
  
  public static Callback OooOOOo(Class paramClass, Reference[] paramArrayOfReference)
  {
    if (paramArrayOfReference != null)
    {
      int i = 0;
      for (;;)
      {
        int j = paramArrayOfReference.length;
        if (i >= j) {
          break;
        }
        Callback localCallback = (Callback)paramArrayOfReference[i].get();
        if (localCallback != null)
        {
          Class localClass = localCallback.getClass();
          boolean bool = paramClass.isAssignableFrom(localClass);
          if (bool) {
            return localCallback;
          }
        }
        i += 1;
      }
    }
    return null;
  }
  
  public static boolean OooOOo0(Class paramClass)
  {
    Object localObject = Void.TYPE;
    if (paramClass != localObject)
    {
      localObject = Void.class;
      if (paramClass != localObject)
      {
        localObject = Boolean.TYPE;
        if (paramClass != localObject)
        {
          localObject = Boolean.class;
          if (paramClass != localObject)
          {
            localObject = Byte.TYPE;
            if (paramClass != localObject)
            {
              localObject = Byte.class;
              if (paramClass != localObject)
              {
                localObject = Short.TYPE;
                if (paramClass != localObject)
                {
                  localObject = Short.class;
                  if (paramClass != localObject)
                  {
                    localObject = Character.TYPE;
                    if (paramClass != localObject)
                    {
                      localObject = Character.class;
                      if (paramClass != localObject)
                      {
                        localObject = Integer.TYPE;
                        if (paramClass != localObject)
                        {
                          localObject = Integer.class;
                          if (paramClass != localObject)
                          {
                            localObject = Long.TYPE;
                            if (paramClass != localObject)
                            {
                              localObject = Long.class;
                              if (paramClass != localObject)
                              {
                                localObject = Float.TYPE;
                                if (paramClass != localObject)
                                {
                                  localObject = Float.class;
                                  if (paramClass != localObject)
                                  {
                                    localObject = Double.TYPE;
                                    if (paramClass != localObject)
                                    {
                                      localObject = Double.class;
                                      if (paramClass != localObject)
                                      {
                                        localObject = Structure.ByValue.class;
                                        boolean bool1 = ((Class)localObject).isAssignableFrom(paramClass);
                                        if (bool1)
                                        {
                                          localObject = Structure.class;
                                          bool1 = ((Class)localObject).isAssignableFrom(paramClass);
                                          if (bool1) {}
                                        }
                                        else
                                        {
                                          localObject = Pointer.class;
                                          bool2 = ((Class)localObject).isAssignableFrom(paramClass);
                                          if (!bool2)
                                          {
                                            bool2 = false;
                                            paramClass = null;
                                            return bool2;
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
    boolean bool2 = true;
    return bool2;
  }
  
  private Callback getCallback()
  {
    return (Callback)get();
  }
  
  private void setCallbackOptions(int paramInt)
  {
    Pointer localPointer = this.OooO00o;
    long l = Native.OooOO0o;
    localPointer.Oooo0O0(l, paramInt);
  }
  
  public void OooO0o0()
  {
    try
    {
      Object localObject1 = this.OooO00o;
      if (localObject1 != null)
      {
        Map localMap = null;
        long l1 = 0L;
        try
        {
          long l2 = ((Pointer)localObject1).OooO00o;
          Native.freeNativeCallback(l2);
          localObject1 = this.OooO00o;
          ((Pointer)localObject1).OooO00o = l1;
          this.OooO00o = null;
          localObject1 = OooOO0;
          ((Map)localObject1).remove(this);
        }
        finally
        {
          Pointer localPointer = this.OooO00o;
          localPointer.OooO00o = l1;
          this.OooO00o = null;
          localMap = OooOO0;
          localMap.remove(this);
        }
      }
      return;
    }
    finally {}
  }
  
  public final Class OooOOOO(Class paramClass)
  {
    Object localObject = Structure.class;
    boolean bool = ((Class)localObject).isAssignableFrom(paramClass);
    Pointer localPointer = Pointer.class;
    if (bool)
    {
      Structure.OooooOO(paramClass);
      localObject = Structure.ByValue.class;
      bool = ((Class)localObject).isAssignableFrom(paramClass);
      if (!bool) {
        return localPointer;
      }
    }
    else
    {
      localObject = NativeMapped.class;
      bool = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool) {
        return NativeMappedConverter.OooO0o0(paramClass).OooO00o();
      }
      localObject = String.class;
      if (paramClass == localObject) {
        break label116;
      }
      localObject = WString.class;
      if (paramClass == localObject) {
        break label116;
      }
      localObject = [Ljava.lang.String.class;
      if (paramClass == localObject) {
        break label116;
      }
      localObject = [Lcom.sun.jna.WString.class;
      if (paramClass == localObject) {
        break label116;
      }
      localObject = Callback.class;
      bool = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool) {
        break label116;
      }
    }
    return paramClass;
    label116:
    return localPointer;
  }
  
  public void finalize()
  {
    OooO0o0();
  }
  
  public Pointer getTrampoline()
  {
    Pointer localPointer = this.OooO0O0;
    if (localPointer == null)
    {
      localPointer = this.OooO00o;
      long l = 0L;
      localPointer = localPointer.OooOO0(l);
      this.OooO0O0 = localPointer;
    }
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.CallbackReference
 * JD-Core Version:    0.7.0.1
 */