package com.sun.jna;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.util.ArrayList;
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
import java.util.logging.Logger;
import m54207b69;

public abstract class Structure
{
  public static final Logger OooOOOO = Logger.getLogger(Structure.class.getName());
  public static final Map OooOOOo;
  public static final ThreadLocal OooOOo;
  public static final Map OooOOo0;
  public static final ThreadLocal OooOOoo;
  public static final Pointer OooOo00;
  public TypeMapper OooO;
  public Pointer OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public String OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public Map OooO0oO;
  public final Map OooO0oo;
  public long OooOO0;
  public boolean OooOO0O;
  public boolean OooOO0o;
  public boolean OooOOO;
  public Structure[] OooOOO0;
  
  static
  {
    Object localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    OooOOOo = (Map)localObject;
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    OooOOo0 = (Map)localObject;
    localObject = new com/sun/jna/Structure$1;
    ((Structure.1)localObject).<init>();
    OooOOo = (ThreadLocal)localObject;
    localObject = new com/sun/jna/Structure$2;
    ((Structure.2)localObject).<init>();
    OooOOoo = (ThreadLocal)localObject;
    localObject = new com/sun/jna/Structure$3;
    ((Structure.3)localObject).<init>(0L);
    OooOo00 = (Pointer)localObject;
  }
  
  public Structure()
  {
    this(0);
  }
  
  public Structure(int paramInt)
  {
    this(null, paramInt);
  }
  
  public Structure(Pointer paramPointer, int paramInt)
  {
    this(paramPointer, paramInt, null);
  }
  
  public Structure(Pointer paramPointer, int paramInt, TypeMapper paramTypeMapper)
  {
    int i = -1;
    this.OooO0O0 = i;
    HashMap localHashMap = new java/util/HashMap;
    int j = 8;
    localHashMap.<init>(j);
    this.OooO0oo = localHashMap;
    boolean bool = true;
    this.OooOO0O = bool;
    this.OooOO0o = bool;
    setAlignType(paramInt);
    String str = Native.OooOOo(getClass());
    setStringEncoding(str);
    Oooo00o(paramTypeMapper);
    Oooooo0();
    if (paramPointer != null)
    {
      paramInt = 0;
      str = null;
      OooooO0(paramPointer, 0, bool);
    }
    else
    {
      OooO0o0(i);
    }
    Oooo00O();
  }
  
  public static void OooO(Structure[] paramArrayOfStructure)
  {
    o000oOoO(paramArrayOfStructure);
    int i = 0;
    Structure localStructure = paramArrayOfStructure[0];
    Structure[] arrayOfStructure = localStructure.OooOOO0;
    if (arrayOfStructure == paramArrayOfStructure) {
      localStructure.OooO0oo();
    } else {
      for (;;)
      {
        int j = paramArrayOfStructure.length;
        if (i >= j) {
          break;
        }
        localStructure = paramArrayOfStructure[i];
        if (localStructure != null) {
          localStructure.OooO0oo();
        }
        i += 1;
      }
    }
  }
  
  public static void OooOO0O(Structure[] paramArrayOfStructure)
  {
    o000oOoO(paramArrayOfStructure);
    int i = 0;
    Structure localStructure = paramArrayOfStructure[0];
    Structure[] arrayOfStructure = localStructure.OooOOO0;
    if (arrayOfStructure == paramArrayOfStructure) {
      localStructure.OooOO0();
    } else {
      for (;;)
      {
        int j = paramArrayOfStructure.length;
        if (i >= j) {
          break;
        }
        localStructure = paramArrayOfStructure[i];
        if (localStructure != null) {
          localStructure.OooOO0();
        }
        i += 1;
      }
    }
  }
  
  public static Set OooOO0o()
  {
    return (Set)OooOOoo.get();
  }
  
  public static List OooOOo0(String... paramVarArgs)
  {
    return Collections.unmodifiableList(Arrays.asList(paramVarArgs));
  }
  
  public static Constructor OooOooO(Class paramClass)
  {
    paramClass = paramClass.getConstructors();
    int i = paramClass.length;
    int j = 0;
    while (j < i)
    {
      Constructor localConstructor = paramClass[j];
      Object localObject = localConstructor.getParameterTypes();
      int k = localObject.length;
      int m = 1;
      if (k == m)
      {
        localObject = localObject[0];
        Pointer localPointer = Pointer.class;
        boolean bool = localObject.equals(localPointer);
        if (bool) {
          return localConstructor;
        }
      }
      j += 1;
    }
    return null;
  }
  
  public static Structure.FFIType OooOooo(Object paramObject)
  {
    return Structure.FFIType.ooOO(paramObject);
  }
  
  public static Structure Oooo0O0(Class paramClass)
  {
    paramClass = (Structure)Klass.OooO00o(paramClass);
    boolean bool = paramClass instanceof Structure.ByValue;
    if (bool) {
      ((Structure)paramClass).OooO0Oo();
    }
    return (Structure)paramClass;
  }
  
  public static Structure Oooo0OO(Class paramClass, Pointer paramPointer)
  {
    try
    {
      localObject1 = OooOooO(paramClass);
      if (localObject1 != null)
      {
        localObject2 = new Object[] { paramPointer };
        localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
        return (Structure)localObject1;
      }
    }
    catch (InvocationTargetException paramPointer)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("l+6E544A515F64484B4D14694E65516A541B6D55555B6321595D717965617C60697F63676F2F6F6B326A6E828A7672767D3B757F3E");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramClass);
      paramClass = ((StringBuilder)localObject1).toString();
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>(paramClass, paramPointer);
      throw ((Throwable)localObject1);
    }
    catch (IllegalAccessException paramPointer)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("'s3A1E020A16220D211A10242729602A2463");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramClass);
      paramClass = m54207b69.F54207b69_11("6N6E6720242B2540324470782B2D477C3E3233334C3F3F78853F568842568B5C5A4C43495095");
      ((StringBuilder)localObject1).append(paramClass);
      paramClass = ((StringBuilder)localObject1).toString();
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>(paramClass, paramPointer);
      throw ((Throwable)localObject1);
    }
    catch (InstantiationException paramPointer)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("[[183B377F3380383C303844403B3F483E4E8C");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramClass);
      paramClass = ((StringBuilder)localObject1).toString();
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>(paramClass, paramPointer);
      throw ((Throwable)localObject1);
    }
    catch (SecurityException localSecurityException)
    {
      paramClass = Oooo0O0(paramClass);
      Object localObject1 = OooOo00;
      if (paramPointer != localObject1) {
        paramClass.Ooooo00(paramPointer);
      }
    }
    return paramClass;
  }
  
  public static Map Oooo0oO()
  {
    return (Map)OooOOo.get();
  }
  
  public static List OoooO(Collection paramCollection)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramCollection);
    Collections.sort(localArrayList);
    return localArrayList;
  }
  
  public static int OoooO0(Class paramClass)
  {
    return OoooO0O(paramClass, null);
  }
  
  public static int OoooO0O(Class paramClass, Structure paramStructure)
  {
    synchronized (OooOOOo)
    {
      Object localObject = ???.get(paramClass);
      localObject = (Structure.LayoutInfo)localObject;
      int i = -1;
      if (localObject != null)
      {
        boolean bool = Structure.LayoutInfo.OooO00o((Structure.LayoutInfo)localObject);
        if (!bool)
        {
          j = Structure.LayoutInfo.OooO0OO((Structure.LayoutInfo)localObject);
          break label52;
        }
      }
      int j = i;
      label52:
      if (j == i)
      {
        if (paramStructure == null)
        {
          paramStructure = OooOo00;
          paramStructure = Oooo0OO(paramClass, paramStructure);
        }
        j = paramStructure.OoooO00();
      }
      return j;
    }
  }
  
  public static Structure OoooOoo(Class paramClass, Structure paramStructure, Pointer paramPointer)
  {
    if (paramPointer == null)
    {
      paramStructure = null;
    }
    else
    {
      Object localObject;
      boolean bool;
      if (paramStructure != null)
      {
        localObject = paramStructure.getPointer();
        bool = paramPointer.equals(localObject);
        if (!bool) {}
      }
      do
      {
        paramStructure.OooO0oo();
        return paramStructure;
        paramStructure = (Structure)Oooo0oO().get(paramPointer);
        if (paramStructure == null) {
          break;
        }
        localObject = paramStructure.getClass();
        bool = paramClass.equals(localObject);
      } while (bool);
      paramClass = Oooo0OO(paramClass, paramPointer);
      paramClass.OooOOOo();
      paramStructure = paramClass;
    }
    return paramStructure;
  }
  
  public static void OooooOO(Class paramClass)
  {
    Object localObject = null;
    try
    {
      localObject = new Class[0];
      paramClass.getConstructor((Class[])localObject);
      return;
    }
    catch (NoSuchMethodException|SecurityException localNoSuchMethodException)
    {
      localObject = new java/lang/IllegalArgumentException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = m54207b69.F54207b69_11("C977571B4D5055535F635E6624666365595D5C5E6D616B6130776F667279367D756B3A7C787C6F702A41");
      localStringBuilder.append(str);
      paramClass = paramClass.getName();
      localStringBuilder.append(paramClass);
      paramClass = localStringBuilder.toString();
      ((IllegalArgumentException)localObject).<init>(paramClass);
      throw ((Throwable)localObject);
    }
  }
  
  public static void o000oOoO(Structure[] paramArrayOfStructure)
  {
    Object localObject1 = paramArrayOfStructure.getClass();
    Object localObject2 = [Lcom.sun.jna.Structure.ByReference.class;
    boolean bool1 = ((Class)localObject2).isAssignableFrom((Class)localObject1);
    if (bool1) {
      return;
    }
    localObject2 = paramArrayOfStructure[0].getPointer();
    localObject1 = paramArrayOfStructure[0];
    int i = ((Structure)localObject1).OoooO00();
    int j = 1;
    for (;;)
    {
      int k = paramArrayOfStructure.length;
      if (j >= k) {
        return;
      }
      Pointer localPointer = paramArrayOfStructure[j].getPointer();
      long l1 = localPointer.OooO00o;
      long l2 = ((Pointer)localObject2).OooO00o;
      int m = i * j;
      long l3 = m;
      l2 += l3;
      boolean bool2 = l1 < l2;
      if (bool2) {
        break;
      }
      j += 1;
    }
    paramArrayOfStructure = new java/lang/StringBuilder;
    paramArrayOfStructure.<init>();
    localObject1 = m54207b69.F54207b69_11("<?6C4C4F4D6050505462286858596B542E6A646C656E666163376B6467673C686B7A407E7375707C7F727974774B7F8881807E78524B9294925796989790938F975F9F9D9E919F929367A7956AB8989B99AC9C9CA0AE74B4A4A5B7A07AB2AEB9B9A780");
    paramArrayOfStructure.append((String)localObject1);
    paramArrayOfStructure.append(j);
    paramArrayOfStructure.append(")");
    paramArrayOfStructure = paramArrayOfStructure.toString();
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>(paramArrayOfStructure);
    throw ((Throwable)localObject1);
  }
  
  public final int OooO0OO(int paramInt1, int paramInt2)
  {
    int i = this.OooO0o0;
    int j = 1;
    if (i != j)
    {
      i = paramInt1 % paramInt2;
      if (i != 0)
      {
        paramInt2 -= i;
        paramInt1 += paramInt2;
      }
    }
    return paramInt1;
  }
  
  public void OooO0Oo()
  {
    OooO0o(false);
  }
  
  public final void OooO0o(boolean paramBoolean)
  {
    paramBoolean = OooOOOO(true, paramBoolean);
    OooO0o0(paramBoolean);
  }
  
  public void OooO0o0(int paramInt)
  {
    int i = -1;
    if (paramInt == i)
    {
      str1 = null;
      paramInt = OooOOO(false);
    }
    else
    {
      if (paramInt <= 0) {
        break label67;
      }
    }
    if (paramInt != i)
    {
      localObject = this.OooO00o;
      if (localObject != null)
      {
        boolean bool = localObject instanceof Structure.AutoAllocated;
        if (!bool) {}
      }
      else
      {
        localObject = OooO0oO(paramInt);
        this.OooO00o = ((Pointer)localObject);
      }
      this.OooO0O0 = paramInt;
    }
    return;
    label67:
    Object localObject = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("Ql3F19201C131D1F251155291022165A1029302A5F221E622236222733253B6A37242E246F3A2E442A7E75");
    localStringBuilder.append(str2);
    localStringBuilder.append(paramInt);
    String str1 = localStringBuilder.toString();
    ((IllegalArgumentException)localObject).<init>(str1);
    throw ((Throwable)localObject);
  }
  
  public Memory OooO0oO(int paramInt)
  {
    Structure.AutoAllocated localAutoAllocated = new com/sun/jna/Structure$AutoAllocated;
    localAutoAllocated.<init>(paramInt);
    return localAutoAllocated;
  }
  
  public void OooO0oo()
  {
    int i = getAutoRead();
    if (i != 0)
    {
      Oooo0o0();
      Structure[] arrayOfStructure = this.OooOOO0;
      if (arrayOfStructure != null)
      {
        i = 1;
        for (;;)
        {
          Object localObject = this.OooOOO0;
          int k = localObject.length;
          if (i >= k) {
            break;
          }
          localObject = localObject[i];
          ((Structure)localObject).OooO0oo();
          int j;
          i += 1;
        }
      }
    }
  }
  
  public void OooOO0()
  {
    int i = getAutoWrite();
    if (i != 0)
    {
      Oooooo();
      Structure[] arrayOfStructure = this.OooOOO0;
      if (arrayOfStructure != null)
      {
        i = 1;
        for (;;)
        {
          Object localObject = this.OooOOO0;
          int k = localObject.length;
          if (i >= k) {
            break;
          }
          localObject = localObject[i];
          ((Structure)localObject).OooOO0();
          int j;
          i += 1;
        }
      }
    }
  }
  
  public int OooOOO(boolean paramBoolean)
  {
    return OooOOOO(paramBoolean, false);
  }
  
  public void OooOOO0(Pointer paramPointer)
  {
    long l = paramPointer.OooO00o;
    this.OooOO0 = l;
  }
  
  public int OooOOOO(boolean paramBoolean1, boolean paramBoolean2)
  {
    Class localClass = getClass();
    synchronized (OooOOOo)
    {
      Object localObject1 = ???.get(localClass);
      localObject1 = (Structure.LayoutInfo)localObject1;
      if (localObject1 != null)
      {
        int i = this.OooO0OO;
        int j = Structure.LayoutInfo.OooO0o0((Structure.LayoutInfo)localObject1);
        if (i == j)
        {
          TypeMapper localTypeMapper1 = this.OooO;
          TypeMapper localTypeMapper2 = Structure.LayoutInfo.OooO0oO((Structure.LayoutInfo)localObject1);
          if (localTypeMapper1 == localTypeMapper2) {
            break label86;
          }
        }
      }
      localObject1 = OooOOo(paramBoolean1, paramBoolean2);
      label86:
      if (localObject1 != null)
      {
        paramBoolean1 = Structure.LayoutInfo.OooO((Structure.LayoutInfo)localObject1);
        this.OooO0o = paramBoolean1;
        Object localObject2 = Structure.LayoutInfo.OooOO0O((Structure.LayoutInfo)localObject1);
        this.OooO0oO = ((Map)localObject2);
        paramBoolean1 = Structure.LayoutInfo.OooO00o((Structure.LayoutInfo)localObject1);
        if (!paramBoolean1) {
          try
          {
            paramBoolean1 = ???.containsKey(localClass);
            if (paramBoolean1)
            {
              paramBoolean1 = this.OooO0OO;
              if (!paramBoolean1)
              {
                localObject2 = this.OooO;
                if (localObject2 == null) {
                  break label172;
                }
              }
            }
            ???.put(localClass, localObject1);
          }
          finally {}
        }
        paramBoolean1 = Structure.LayoutInfo.OooO0OO((Structure.LayoutInfo)localObject1);
      }
      else
      {
        paramBoolean1 = true;
      }
      label172:
      return paramBoolean1;
    }
  }
  
  public void OooOOOo()
  {
    boolean bool = this.OooOOO;
    if (!bool) {
      OooO0oo();
    }
  }
  
  public final Structure.LayoutInfo OooOOo(boolean paramBoolean1, boolean paramBoolean2)
  {
    Structure localStructure = this;
    Object localObject1 = OooOoO(paramBoolean1);
    boolean bool1 = false;
    Object localObject2 = null;
    if (localObject1 == null) {
      return null;
    }
    Object localObject3 = new com/sun/jna/Structure$LayoutInfo;
    ((Structure.LayoutInfo)localObject3).<init>(null);
    int i = this.OooO0OO;
    Structure.LayoutInfo.OooO0o((Structure.LayoutInfo)localObject3, i);
    Object localObject4 = this.OooO;
    Structure.LayoutInfo.OooO0oo((Structure.LayoutInfo)localObject3, (TypeMapper)localObject4);
    localObject1 = ((List)localObject1).iterator();
    i = 1;
    int m = i;
    int i1 = 0;
    for (;;)
    {
      boolean bool3 = ((Iterator)localObject1).hasNext();
      if (bool3)
      {
        Field localField = (Field)((Iterator)localObject1).next();
        int i2 = localField.getModifiers();
        Class localClass = localField.getType();
        boolean bool5 = localClass.isArray();
        if (bool5) {
          Structure.LayoutInfo.OooO0O0((Structure.LayoutInfo)localObject3, i);
        }
        Structure.StructField localStructField = new com/sun/jna/Structure$StructField;
        localStructField.<init>();
        boolean bool6 = Modifier.isVolatile(i2);
        localStructField.OooO0o = bool6;
        boolean bool4 = Modifier.isFinal(i2);
        localStructField.OooO0oO = bool4;
        String str1 = m54207b69.F54207b69_11("Ma4642180B190E0E1649");
        if (bool4)
        {
          bool4 = Platform.OooO00o;
          if (bool4)
          {
            localField.setAccessible(i);
          }
          else
          {
            localObject1 = new java/lang/IllegalArgumentException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject3 = m54207b69.F54207b69_11("pm3906062151402654110B1229591010285D2F2A303117353065382227255D202221356F2E282D273046766F3630352F387D7B");
            ((StringBuilder)localObject2).append((String)localObject3);
            localObject3 = localField.getName();
            ((StringBuilder)localObject2).append((String)localObject3);
            ((StringBuilder)localObject2).append(str1);
            localObject3 = getClass();
            ((StringBuilder)localObject2).append(localObject3);
            ((StringBuilder)localObject2).append(")");
            localObject2 = ((StringBuilder)localObject2).toString();
            ((IllegalArgumentException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        localStructField.OooO0OO = localField;
        Object localObject5 = localField.getName();
        localStructField.OooO00o = ((String)localObject5);
        localStructField.OooO0O0 = localClass;
        localObject5 = Callback.class;
        bool4 = ((Class)localObject5).isAssignableFrom(localClass);
        if (bool4)
        {
          bool4 = localClass.isInterface();
          if (!bool4)
          {
            localObject1 = new java/lang/IllegalArgumentException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject3 = m54207b69.F54207b69_11("6&755356564957595B4B0F6F5256575256555E1853635860591E1A");
            ((StringBuilder)localObject2).append((String)localObject3);
            localObject3 = localField.getName();
            ((StringBuilder)localObject2).append((String)localObject3);
            localObject3 = m54207b69.F54207b69_11("yK6C6C28413C44713036743430772F334E3E4A3F3D3C43");
            ((StringBuilder)localObject2).append((String)localObject3);
            localObject2 = ((StringBuilder)localObject2).toString();
            ((IllegalArgumentException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        bool4 = localClass.isArray();
        Object localObject6;
        if (bool4)
        {
          localObject5 = Structure.class;
          localObject6 = localClass.getComponentType();
          bool4 = localObject5.equals(localObject6);
          if (bool4)
          {
            localObject1 = new java/lang/IllegalArgumentException;
            localObject2 = m54207b69.F54207b69_11("~C0D27323A2A2C69173F3A402B43433F3573334344364F467A464F4A527F534E458343854A4A56505C4E508D3B635E644F67676359976C706A5E9C6A679F74696177A4796E6AA87671816FAD7771B0857A76B478827A837C848F89BD7B7E8AC18086C489899B8B979592969092");
            ((IllegalArgumentException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        bool4 = Modifier.isPublic(localField.getModifiers());
        Object localObject7;
        if (bool4)
        {
          localObject5 = localStructField.OooO0OO;
          localObject5 = ((Structure)localStructure).OooOoO0((Field)localObject5);
          if (localObject5 == null)
          {
            bool7 = localClass.isArray();
            if (bool7)
            {
              if (!paramBoolean1) {
                return null;
              }
              localObject1 = new java/lang/IllegalStateException;
              localObject2 = m54207b69.F54207b69_11("&67745465A531B56665B635C5022685154522766662A746E765A7871757B697171");
              ((IllegalStateException)localObject1).<init>((String)localObject2);
              throw ((Throwable)localObject1);
            }
          }
          localObject6 = NativeMapped.class;
          boolean bool7 = ((Class)localObject6).isAssignableFrom(localClass);
          if (bool7)
          {
            localObject6 = NativeMappedConverter.OooO0o0(localClass);
            localObject7 = ((NativeMappedConverter)localObject6).OooO00o();
            localStructField.OooO = ((ToNativeConverter)localObject6);
            localStructField.OooO0oo = ((FromNativeConverter)localObject6);
            localObject6 = new com/sun/jna/StructureReadContext;
            ((StructureReadContext)localObject6).<init>((Structure)localStructure, localField);
            localStructField.OooOO0 = ((FromNativeContext)localObject6);
          }
          else
          {
            localObject6 = ((Structure)localStructure).OooO;
            if (localObject6 != null)
            {
              localObject6 = ((TypeMapper)localObject6).OooO00o(localClass);
              localObject7 = ((Structure)localStructure).OooO.OooO0O0(localClass);
              if ((localObject6 != null) && (localObject7 != null))
              {
                StructureWriteContext localStructureWriteContext = new com/sun/jna/StructureWriteContext;
                localObject4 = localStructField.OooO0OO;
                localStructureWriteContext.<init>((Structure)localStructure, (Field)localObject4);
                localObject5 = ((ToNativeConverter)localObject6).OooO0O0(localObject5, localStructureWriteContext);
                if (localObject5 != null) {
                  localObject4 = localObject5.getClass();
                } else {
                  localObject4 = Pointer.class;
                }
                localStructField.OooO = ((ToNativeConverter)localObject6);
                localStructField.OooO0oo = ((FromNativeConverter)localObject7);
                localObject6 = new com/sun/jna/StructureReadContext;
                ((StructureReadContext)localObject6).<init>((Structure)localStructure, localField);
                localStructField.OooOO0 = ((FromNativeContext)localObject6);
                localObject7 = localObject4;
                break label887;
              }
              if ((localObject6 != null) || (localObject7 != null))
              {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject2 = m54207b69.F54207b69_11("r360484349544C4C485E491D4C624F5469516725646E6C70586E696175787A707E33686C667A387683856E806C6C878A8C43868E7447");
                ((StringBuilder)localObject1).append((String)localObject2);
                ((StringBuilder)localObject1).append(localClass);
                localObject1 = ((StringBuilder)localObject1).toString();
                localObject2 = new java/lang/IllegalArgumentException;
                ((IllegalArgumentException)localObject2).<init>((String)localObject1);
                throw ((Throwable)localObject2);
              }
            }
            localObject7 = localClass;
          }
          label887:
          if (localObject5 == null)
          {
            localObject4 = localStructField.OooO0OO;
            localObject5 = ((Structure)localStructure).Oooo000((Field)localObject4, localClass);
          }
        }
        try
        {
          int j = ((Structure)localStructure).OooOoo((Class)localObject7, localObject5);
          localStructField.OooO0Oo = j;
          j = ((Structure)localStructure).OooOoOO((Class)localObject7, localObject5, m);
          if (j != 0)
          {
            int n = Math.max(Structure.LayoutInfo.OooO((Structure.LayoutInfo)localObject3), j);
            Structure.LayoutInfo.OooOO0((Structure.LayoutInfo)localObject3, n);
            n = i1 % j;
            if (n != 0)
            {
              j -= n;
              i1 += j;
            }
            boolean bool2 = localStructure instanceof Union;
            if (bool2)
            {
              localStructField.OooO0o0 = 0;
              k = localStructField.OooO0Oo;
              k = Math.max(i1, k);
              i1 = k;
            }
            else
            {
              localStructField.OooO0o0 = i1;
              k = localStructField.OooO0Oo;
              i1 += k;
            }
            localObject4 = Structure.LayoutInfo.OooOO0O((Structure.LayoutInfo)localObject3);
            String str2 = localStructField.OooO00o;
            ((Map)localObject4).put(str2, localStructField);
            n = 0;
            str2 = null;
            int k = 1;
          }
          else
          {
            localObject1 = new java/lang/Error;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject3 = m54207b69.F54207b69_11("9A0729263029662634302F3937303C43703843734E384844783F474D7C4345424C458288");
            ((StringBuilder)localObject2).append((String)localObject3);
            localObject3 = localStructField.OooO00o;
            ((StringBuilder)localObject2).append((String)localObject3);
            ((StringBuilder)localObject2).append(str1);
            localObject3 = getClass();
            ((StringBuilder)localObject2).append(localObject3);
            localObject2 = ((StringBuilder)localObject2).toString();
            ((Error)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          if (!paramBoolean1)
          {
            localObject3 = ((Structure)localStructure).OooO;
            if (localObject3 == null) {
              return null;
            }
          }
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = m54207b69.F54207b69_11("kj23051E0E0A0814514127222A152B2D271F5B1E16231B24611B1D64");
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = getClass();
          ((StringBuilder)localObject2).append(localObject3);
          localObject3 = m54207b69.F54207b69_11("as5F54171D1A241D5A251B28215F61");
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = localStructField.OooO00o;
          ((StringBuilder)localObject2).append((String)localObject3);
          ((StringBuilder)localObject2).append("' (");
          localObject3 = localStructField.OooO0O0;
          ((StringBuilder)localObject2).append(localObject3);
          ((StringBuilder)localObject2).append("): ");
          localObject3 = localIllegalArgumentException1.getMessage();
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject3 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject3).<init>((String)localObject2, localIllegalArgumentException1);
          throw ((Throwable)localObject3);
        }
      }
    }
    if (i1 > 0)
    {
      int i3 = Structure.LayoutInfo.OooO((Structure.LayoutInfo)localObject3);
      i3 = ((Structure)localStructure).OooO0OO(i1, i3);
      bool1 = localStructure instanceof Structure.ByValue;
      if ((bool1) && (!paramBoolean2)) {
        getTypeInfo();
      }
      Structure.LayoutInfo.OooO0Oo((Structure.LayoutInfo)localObject3, i3);
      return localObject3;
    }
    IllegalArgumentException localIllegalArgumentException2 = new java/lang/IllegalArgumentException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject3 = m54207b69.F54207b69_11("Y[08302B313C3434304684");
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject3 = getClass();
    ((StringBuilder)localObject2).append(localObject3);
    localObject3 = m54207b69.F54207b69_11("kl4C050F22501E080E0A0C250D58102C5B261A301660341B2D21655E241E3C373D296D2F232471302C3129324A783A4C387C4D4B41343A457C");
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).toString();
    localIllegalArgumentException2.<init>((String)localObject2);
    throw localIllegalArgumentException2;
  }
  
  public void OooOOoo()
  {
    OooOo00(false);
  }
  
  public Structure.FFIType OooOo(Structure.StructField paramStructField)
  {
    Class localClass = paramStructField.OooO0O0;
    paramStructField = paramStructField.OooO0OO;
    paramStructField = OooOoO0(paramStructField);
    Object localObject = this.OooO;
    if (localObject != null)
    {
      localObject = ((TypeMapper)localObject).OooO00o(localClass);
      if (localObject != null)
      {
        localClass = ((ToNativeConverter)localObject).OooO00o();
        ToNativeContext localToNativeContext = new com/sun/jna/ToNativeContext;
        localToNativeContext.<init>();
        paramStructField = ((ToNativeConverter)localObject).OooO0O0(paramStructField, localToNativeContext);
      }
    }
    return Structure.FFIType.o0OoOo0(paramStructField, localClass);
  }
  
  public final List OooOo0()
  {
    Class localClass = getClass();
    synchronized (OooOOo0)
    {
      Object localObject2 = ???.get(localClass);
      localObject2 = (List)localObject2;
      if (localObject2 == null)
      {
        localObject2 = getFieldOrder();
        ???.put(localClass, localObject2);
      }
      return localObject2;
    }
  }
  
  public final void OooOo00(boolean paramBoolean)
  {
    Object localObject = this.OooO00o;
    if (localObject == null)
    {
      OooO0o(paramBoolean);
    }
    else
    {
      int i = this.OooO0O0;
      int j = -1;
      if (i == j)
      {
        i = 1;
        paramBoolean = OooOOOO(i, paramBoolean);
        this.OooO0O0 = paramBoolean;
        localObject = this.OooO00o;
        boolean bool = localObject instanceof Structure.AutoAllocated;
        if (!bool)
        {
          long l1 = paramBoolean;
          long l2 = 0L;
          try
          {
            Pointer localPointer = ((Pointer)localObject).OoooO0O(l2, l1);
            this.OooO00o = localPointer;
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
          {
            localObject = new java/lang/IllegalArgumentException;
            String str = m54207b69.F54207b69_11("0Q02262527362A2A2A3C7A3E343E41424432823336523C4E4C4C4E8B5750595C424892556148645B49");
            ((IllegalArgumentException)localObject).<init>(str, localIndexOutOfBoundsException);
            throw ((Throwable)localObject);
          }
        }
      }
    }
  }
  
  public Map OooOo0O()
  {
    return this.OooO0oO;
  }
  
  public final String OooOo0o(Class paramClass)
  {
    paramClass = paramClass.getName();
    int i = paramClass.lastIndexOf(".") + 1;
    return paramClass.substring(i);
  }
  
  public List OooOoO(boolean paramBoolean)
  {
    Object localObject1 = getFieldList();
    Object localObject2 = new java/util/HashSet;
    ((HashSet)localObject2).<init>();
    Object localObject3 = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject3).hasNext();
      if (!bool) {
        break;
      }
      localObject4 = ((Field)((Iterator)localObject3).next()).getName();
      ((Set)localObject2).add(localObject4);
    }
    localObject3 = OooOo0();
    int i = ((List)localObject3).size();
    int j = ((List)localObject1).size();
    String str1 = ")";
    String str2 = m54207b69.F54207b69_11("h\\0F29302C432D2F35417B454434274348404925414C4E448B8D954D4D98");
    if (i != j)
    {
      i = ((List)localObject1).size();
      j = 1;
      if (i > j)
      {
        if (paramBoolean)
        {
          localObject5 = new java/lang/Error;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append(str2);
          Object localObject6 = getClass();
          ((StringBuilder)localObject4).append(localObject6);
          j = ((List)localObject3).size();
          int k = ((List)localObject1).size();
          if (j < k) {
            localObject6 = m54207b69.F54207b69_11("DE65222C233A6A3131396E3F4236403A303076323E3E453844");
          } else {
            localObject6 = m54207b69.F54207b69_11("yG6738372B353329293C703D3334743835394F");
          }
          ((StringBuilder)localObject4).append((String)localObject6);
          localObject6 = m54207b69.F54207b69_11("Eu551C161B140B5B35");
          ((StringBuilder)localObject4).append((String)localObject6);
          j = ((List)localObject3).size();
          ((StringBuilder)localObject4).append(j);
          localObject6 = "] (";
          ((StringBuilder)localObject4).append((String)localObject6);
          localObject3 = OoooO((Collection)localObject3);
          ((StringBuilder)localObject4).append(localObject3);
          localObject3 = m54207b69.F54207b69_11("JC6A64392F6733283E28346D32322D3D3141373976393F3C463F497D33");
          ((StringBuilder)localObject4).append((String)localObject3);
          int m = ((List)localObject1).size();
          ((StringBuilder)localObject4).append(m);
          ((StringBuilder)localObject4).append((String)localObject6);
          localObject1 = OoooO((Collection)localObject2);
          ((StringBuilder)localObject4).append(localObject1);
          ((StringBuilder)localObject4).append(str1);
          localObject1 = ((StringBuilder)localObject4).toString();
          ((Error)localObject5).<init>((String)localObject1);
          throw ((Throwable)localObject5);
        }
        return null;
      }
    }
    Object localObject5 = new java/util/HashSet;
    ((HashSet)localObject5).<init>((Collection)localObject3);
    paramBoolean = ((Set)localObject5).equals(localObject2);
    if (paramBoolean)
    {
      OoooOO0((List)localObject1, (List)localObject3);
      return localObject1;
    }
    localObject5 = new java/lang/Error;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(str2);
    Object localObject4 = getClass();
    ((StringBuilder)localObject1).append(localObject4);
    localObject4 = m54207b69.F54207b69_11("f[7B2A4032322E3B2F833E44414A358982");
    ((StringBuilder)localObject1).append((String)localObject4);
    localObject3 = OoooO((Collection)localObject3);
    ((StringBuilder)localObject1).append(localObject3);
    localObject3 = m54207b69.F54207b69_11("^]747E2C3838433B84413B873E3E368B3F4C3A5048914E4E5549554953559A595358525BA05761565F56A69F");
    ((StringBuilder)localObject1).append((String)localObject3);
    localObject2 = OoooO((Collection)localObject2);
    ((StringBuilder)localObject1).append(localObject2);
    ((StringBuilder)localObject1).append(str1);
    localObject1 = ((StringBuilder)localObject1).toString();
    ((Error)localObject5).<init>((String)localObject1);
    throw ((Throwable)localObject5);
  }
  
  public Object OooOoO0(Field paramField)
  {
    try
    {
      return paramField.get(this);
    }
    catch (Exception localException)
    {
      Error localError = new java/lang/Error;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = m54207b69.F54207b69_11("3F033F27263A373530306F3E2E332F3D3731773242373F387D79");
      localStringBuilder.append(str);
      paramField = paramField.getName();
      localStringBuilder.append(paramField);
      paramField = m54207b69.F54207b69_11("Ti4E4A020A4D");
      localStringBuilder.append(paramField);
      paramField = getClass();
      localStringBuilder.append(paramField);
      paramField = localStringBuilder.toString();
      localError.<init>(paramField, localException);
      throw localError;
    }
  }
  
  public int OooOoOO(Class paramClass, Object paramObject, boolean paramBoolean)
  {
    Object localObject1 = NativeMapped.class;
    boolean bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
    Object localObject2;
    if (bool1)
    {
      paramClass = NativeMappedConverter.OooO0o0(paramClass);
      localObject1 = paramClass.OooO00o();
      localObject2 = new com/sun/jna/ToNativeContext;
      ((ToNativeContext)localObject2).<init>();
      paramObject = paramClass.OooO0O0(paramObject, (ToNativeContext)localObject2);
      paramClass = (Class)localObject1;
    }
    int i = Native.OooOOO(paramClass, paramObject);
    int k = paramClass.isPrimitive();
    Double localDouble = Double.class;
    int j;
    if (k == 0)
    {
      localObject2 = Long.class;
      if (localObject2 != paramClass)
      {
        localObject2 = Integer.class;
        if (localObject2 != paramClass)
        {
          localObject2 = Short.class;
          if (localObject2 != paramClass)
          {
            localObject2 = Character.class;
            if (localObject2 != paramClass)
            {
              localObject2 = Byte.class;
              if (localObject2 != paramClass)
              {
                localObject2 = Boolean.class;
                if (localObject2 != paramClass)
                {
                  localObject2 = Float.class;
                  if ((localObject2 != paramClass) && (localDouble != paramClass))
                  {
                    localObject1 = Pointer.class;
                    boolean bool2 = ((Class)localObject1).isAssignableFrom(paramClass);
                    if (bool2)
                    {
                      localObject1 = Function.class;
                      bool2 = ((Class)localObject1).isAssignableFrom(paramClass);
                      if (!bool2) {}
                    }
                    else
                    {
                      bool2 = Platform.OooO0O0;
                      if (bool2)
                      {
                        localObject1 = Buffer.class;
                        bool2 = ((Class)localObject1).isAssignableFrom(paramClass);
                        if (bool2) {}
                      }
                      else
                      {
                        localObject1 = Callback.class;
                        bool2 = ((Class)localObject1).isAssignableFrom(paramClass);
                        if (!bool2)
                        {
                          localObject1 = WString.class;
                          if (localObject1 != paramClass)
                          {
                            localObject1 = String.class;
                            if (localObject1 != paramClass)
                            {
                              localObject1 = Structure.class;
                              bool2 = ((Class)localObject1).isAssignableFrom(paramClass);
                              if (bool2)
                              {
                                localObject1 = Structure.ByReference.class;
                                bool2 = ((Class)localObject1).isAssignableFrom(paramClass);
                                if (!bool2)
                                {
                                  if (paramObject == null)
                                  {
                                    paramObject = OooOo00;
                                    paramObject = Oooo0OO(paramClass, paramObject);
                                  }
                                  paramObject = (Structure)paramObject;
                                  j = paramObject.getStructAlignment();
                                  break label431;
                                }
                              }
                              else
                              {
                                boolean bool3 = paramClass.isArray();
                                if (bool3)
                                {
                                  paramObject = paramClass.getComponentType();
                                  localObject1 = null;
                                  j = OooOoOO(paramObject, null, paramBoolean);
                                  break label431;
                                }
                                paramObject = new java/lang/IllegalArgumentException;
                                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                                localStringBuilder.<init>();
                                localObject1 = m54207b69.F54207b69_11("$a3519130745");
                                localStringBuilder.append((String)localObject1);
                                localStringBuilder.append(paramClass);
                                paramClass = m54207b69.F54207b69_11("ST743D372A7826404642442D458047432F4D334387494D534A52524B553C");
                                localStringBuilder.append(paramClass);
                                paramClass = localStringBuilder.toString();
                                paramObject.<init>(paramClass);
                                throw paramObject;
                              }
                            }
                          }
                        }
                      }
                    }
                    j = Native.OooOO0o;
                  }
                }
              }
            }
          }
        }
      }
    }
    label431:
    int n = this.OooO0o0;
    k = 1;
    if (n == k)
    {
      j = k;
    }
    else
    {
      int m = 3;
      if (n == m)
      {
        int i2 = 8;
        j = Math.min(i2, j);
      }
      else
      {
        m = 2;
        if (n == m)
        {
          if (paramBoolean)
          {
            boolean bool4 = Platform.isMac();
            if (bool4)
            {
              bool4 = Platform.isPPC();
              if (bool4) {
                break label528;
              }
            }
          }
          int i1 = Native.OooOOo;
          j = Math.min(i1, j);
          label528:
          if (!paramBoolean)
          {
            boolean bool5 = Platform.isAIX();
            if (bool5)
            {
              paramObject = Double.TYPE;
              if ((paramClass == paramObject) || (paramClass == localDouble)) {
                j = 4;
              }
            }
          }
        }
      }
    }
    return j;
  }
  
  public int OooOoo(Class paramClass, Object paramObject)
  {
    return Native.OooOOO(paramClass, paramObject);
  }
  
  public int OooOoo0(Class paramClass)
  {
    return OooOoo(paramClass, null);
  }
  
  public final void Oooo(Field paramField, Object paramObject, boolean paramBoolean)
  {
    try
    {
      paramField.set(this, paramObject);
      return;
    }
    catch (IllegalAccessException paramObject)
    {
      boolean bool = Modifier.isFinal(paramField.getModifiers());
      String str1 = m54207b69.F54207b69_11("Ma4642180B190E0E1649");
      if (bool)
      {
        if (paramBoolean)
        {
          localObject = new java/lang/UnsupportedOperationException;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          str2 = m54207b69.F54207b69_11("-P04393B26740B23773C483F2E7C4B4D33803437333454383B881C3E3D41504244425645934B5E4A5F985F63695D699E6569666E6757A5AE6D716E766FACB4");
          localStringBuilder.append(str2);
          paramField = paramField.getName();
          localStringBuilder.append(paramField);
          localStringBuilder.append(str1);
          paramField = getClass();
          localStringBuilder.append(paramField);
          localStringBuilder.append(")");
          paramField = localStringBuilder.toString();
          ((UnsupportedOperationException)localObject).<init>(paramField, paramObject);
          throw ((Throwable)localObject);
        }
        localObject = new java/lang/UnsupportedOperationException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        str2 = m54207b69.F54207b69_11("Za2016170710161B481D174B211F152313512620542719161C64272928345E2527242E27646A");
        localStringBuilder.append(str2);
        paramField = paramField.getName();
        localStringBuilder.append(paramField);
        localStringBuilder.append(str1);
        paramField = getClass();
        localStringBuilder.append(paramField);
        paramField = localStringBuilder.toString();
        ((UnsupportedOperationException)localObject).<init>(paramField, paramObject);
        throw ((Throwable)localObject);
      }
      Object localObject = new java/lang/Error;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("=*7F4551555E544F655757505E166C525A5857611D725A2074705C786A267B63296C647169722F33");
      localStringBuilder.append(str2);
      paramField = paramField.getName();
      localStringBuilder.append(paramField);
      localStringBuilder.append(str1);
      paramField = getClass();
      localStringBuilder.append(paramField);
      paramField = localStringBuilder.toString();
      ((Error)localObject).<init>(paramField, paramObject);
      throw ((Throwable)localObject);
    }
  }
  
  public final void Oooo0()
  {
    int i = this.OooO0O0;
    int j = -1;
    if (i != j)
    {
      this.OooO0O0 = j;
      Pointer localPointer = this.OooO00o;
      boolean bool = localPointer instanceof Structure.AutoAllocated;
      if (bool)
      {
        bool = false;
        localPointer = null;
        this.OooO00o = null;
      }
      OooOOoo();
    }
  }
  
  public final Object Oooo000(Field paramField, Class paramClass)
  {
    Object localObject = Structure.class;
    boolean bool = ((Class)localObject).isAssignableFrom(paramClass);
    if (bool)
    {
      localObject = Structure.ByReference.class;
      bool = ((Class)localObject).isAssignableFrom(paramClass);
      if (!bool) {
        try
        {
          localObject = OooOo00;
          paramClass = Oooo0OO(paramClass, (Pointer)localObject);
          Oooo0oo(paramField, paramClass);
        }
        catch (IllegalArgumentException paramField)
        {
          paramClass = new java/lang/IllegalArgumentException;
          localObject = m54207b69.F54207b69_11("cU16353D75257A37372939314348483E84364D4143894F498C5349403C4C4E93454148425945454D57");
          paramClass.<init>((String)localObject, paramField);
          throw paramClass;
        }
      }
    }
    localObject = NativeMapped.class;
    bool = ((Class)localObject).isAssignableFrom(paramClass);
    if (bool)
    {
      paramClass = NativeMappedConverter.OooO0o0(paramClass).OooO0Oo();
      Oooo0oo(paramField, paramClass);
    }
    else
    {
      paramClass = null;
    }
    return paramClass;
  }
  
  public final void Oooo00O()
  {
    Iterator localIterator = getFieldList().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        Object localObject1 = (Field)localIterator.next();
        try
        {
          localObject2 = ((Field)localObject1).get(this);
          if (localObject2 == null)
          {
            localObject2 = ((Field)localObject1).getType();
            Oooo000((Field)localObject1, (Class)localObject2);
          }
        }
        catch (Exception localException)
        {
          Object localObject2 = new java/lang/Error;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = m54207b69.F54207b69_11("3F033F27263A373530306F3E2E332F3D3731773242373F387D79");
          localStringBuilder.append(str);
          localObject1 = ((Field)localObject1).getName();
          localStringBuilder.append((String)localObject1);
          localObject1 = m54207b69.F54207b69_11("Ti4E4A020A4D");
          localStringBuilder.append((String)localObject1);
          localObject1 = getClass();
          localStringBuilder.append(localObject1);
          localObject1 = localStringBuilder.toString();
          ((Error)localObject2).<init>((String)localObject1, localException);
          throw ((Throwable)localObject2);
        }
      }
    }
  }
  
  public final void Oooo00o(TypeMapper paramTypeMapper)
  {
    if (paramTypeMapper == null) {
      paramTypeMapper = Native.OooOo00(getClass());
    }
    this.OooO = paramTypeMapper;
    Oooo0();
  }
  
  public Object Oooo0o(Structure.StructField paramStructField)
  {
    int i = paramStructField.OooO0o0;
    Object localObject1 = paramStructField.OooO0O0;
    Object localObject2 = paramStructField.OooO0oo;
    if (localObject2 != null) {
      localObject1 = ((FromNativeConverter)localObject2).OooO00o();
    }
    Object localObject3 = Structure.class;
    boolean bool2 = ((Class)localObject3).isAssignableFrom((Class)localObject1);
    Object localObject4 = null;
    if (!bool2)
    {
      localObject3 = Callback.class;
      bool2 = ((Class)localObject3).isAssignableFrom((Class)localObject1);
      if (!bool2)
      {
        bool2 = Platform.OooO0O0;
        if (bool2)
        {
          localObject3 = Buffer.class;
          bool2 = ((Class)localObject3).isAssignableFrom((Class)localObject1);
          if (bool2) {}
        }
        else
        {
          localObject3 = Pointer.class;
          bool2 = ((Class)localObject3).isAssignableFrom((Class)localObject1);
          if (!bool2)
          {
            localObject3 = NativeMapped.class;
            bool2 = ((Class)localObject3).isAssignableFrom((Class)localObject1);
            if (!bool2)
            {
              bool2 = ((Class)localObject1).isArray();
              if (!bool2)
              {
                bool2 = false;
                localObject3 = null;
                break label167;
              }
            }
          }
        }
      }
    }
    localObject3 = paramStructField.OooO0OO;
    localObject3 = OooOoO0((Field)localObject3);
    label167:
    String str = String.class;
    Object localObject5;
    long l2;
    if (localObject1 == str)
    {
      Pointer localPointer = this.OooO00o;
      long l1 = i;
      localObject5 = localPointer.OooOO0(l1);
      if (localObject5 != null)
      {
        l2 = 0L;
        localObject4 = this.OooO0Oo;
        localObject4 = ((Pointer)localObject5).OooOOOO(l2, (String)localObject4);
      }
    }
    else
    {
      localObject4 = this.OooO00o;
      l2 = i;
      localObject4 = ((Pointer)localObject4).OooOOo(l2, (Class)localObject1, localObject3);
    }
    if (localObject2 != null)
    {
      localObject5 = paramStructField.OooOO0;
      localObject5 = ((FromNativeConverter)localObject2).OooO0OO(localObject4, (FromNativeContext)localObject5);
      if (localObject3 != null)
      {
        boolean bool3 = localObject3.equals(localObject5);
        if (bool3) {}
      }
      else
      {
        localObject3 = localObject5;
      }
    }
    else
    {
      localObject3 = localObject4;
    }
    boolean bool1 = localObject1.equals(str);
    if (!bool1)
    {
      localObject5 = WString.class;
      bool1 = localObject1.equals(localObject5);
      if (!bool1) {}
    }
    else if (localObject3 != null)
    {
      localObject5 = new com/sun/jna/Structure$NativeStringTracking;
      ((Structure.NativeStringTracking)localObject5).<init>(localObject3);
      localObject1 = this.OooO0oo;
      localObject2 = paramStructField.OooO00o;
      localObject1 = (Structure.NativeStringTracking)((Map)localObject1).put(localObject2, localObject5);
      if (localObject1 != null)
      {
        localObject1 = Structure.NativeStringTracking.OooO00o((Structure.NativeStringTracking)localObject1);
        Structure.NativeStringTracking.OooO0O0((Structure.NativeStringTracking)localObject5, (NativeString)localObject1);
      }
    }
    else
    {
      localObject5 = this.OooO0oo;
      localObject1 = paramStructField.OooO00o;
      ((Map)localObject5).remove(localObject1);
    }
    paramStructField = paramStructField.OooO0OO;
    Oooo(paramStructField, localObject3, true);
    return localObject3;
  }
  
  public void Oooo0o0()
  {
    Object localObject1 = this.OooO00o;
    Object localObject2 = OooOo00;
    if (localObject1 == localObject2) {
      return;
    }
    this.OooOOO = true;
    OooOOoo();
    localObject1 = OooOO0o();
    boolean bool1 = ((Set)localObject1).add(this);
    if (!bool1) {
      return;
    }
    bool1 = this instanceof Structure.ByReference;
    Object localObject4;
    if (bool1)
    {
      localObject2 = Oooo0oO();
      localObject4 = ((Structure)this).getPointer();
      ((Map)localObject2).put(localObject4, this);
    }
    try
    {
      localObject2 = ((Structure)this).OooOo0O();
      localObject2 = ((Map)localObject2).values();
      localObject2 = ((Collection)localObject2).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = ((Iterator)localObject2).next();
        localObject4 = (Structure.StructField)localObject4;
        ((Structure)this).Oooo0o((Structure.StructField)localObject4);
      }
      localObject2 = OooOO0o();
      ((Set)localObject2).remove(this);
      if (bool1)
      {
        localObject1 = Oooo0oO();
        localObject2 = ((Structure)this).getPointer();
        localObject1 = ((Map)localObject1).get(localObject2);
        if (localObject1 == this)
        {
          localObject1 = Oooo0oO();
          localObject2 = ((Structure)this).getPointer();
          ((Map)localObject1).remove(localObject2);
        }
      }
      return;
    }
    finally
    {
      localObject4 = OooOO0o();
      ((Set)localObject4).remove(this);
      if (bool1)
      {
        localObject1 = Oooo0oO();
        localObject4 = ((Structure)this).getPointer();
        localObject1 = ((Map)localObject1).get(localObject4);
        if (localObject1 == this)
        {
          localObject1 = Oooo0oO();
          localObject4 = ((Structure)this).getPointer();
          ((Map)localObject1).remove(localObject4);
        }
      }
    }
  }
  
  public void Oooo0oo(Field paramField, Object paramObject)
  {
    Oooo(paramField, paramObject, false);
  }
  
  public int OoooO00()
  {
    OooOOoo();
    return this.OooO0O0;
  }
  
  public void OoooOO0(List paramList1, List paramList2)
  {
    int i = 0;
    for (;;)
    {
      int j = paramList2.size();
      if (i >= j) {
        break;
      }
      String str1 = (String)paramList2.get(i);
      int k = 0;
      for (;;)
      {
        int m = paramList1.size();
        if (k >= m) {
          break;
        }
        String str2 = ((Field)paramList1.get(k)).getName();
        boolean bool = str1.equals(str2);
        if (bool)
        {
          Collections.swap(paramList1, i, k);
          break;
        }
        k += 1;
      }
      i += 1;
    }
  }
  
  public Structure[] OoooOOO(int paramInt)
  {
    Structure[] arrayOfStructure = (Structure[])Array.newInstance(getClass(), paramInt);
    return OoooOOo(arrayOfStructure);
  }
  
  public Structure[] OoooOOo(Structure[] paramArrayOfStructure)
  {
    OooOOoo();
    Object localObject1 = this.OooO00o;
    boolean bool1 = localObject1 instanceof Structure.AutoAllocated;
    int j;
    long l2;
    if (bool1)
    {
      localObject1 = (Memory)localObject1;
      i = paramArrayOfStructure.length;
      j = OoooO00();
      i *= j;
      long l1 = ((Memory)localObject1).o00O0O();
      l2 = i;
      boolean bool2 = l1 < l2;
      if (bool2)
      {
        localObject1 = OooO0oO(i);
        Ooooo00((Pointer)localObject1);
      }
    }
    localObject1 = null;
    paramArrayOfStructure[0] = this;
    int k = OoooO00();
    int i = 1;
    for (;;)
    {
      j = paramArrayOfStructure.length;
      if (i >= j) {
        break;
      }
      Object localObject2 = getClass();
      Pointer localPointer = this.OooO00o;
      int m = i * k;
      l2 = m;
      long l3 = k;
      localPointer = localPointer.OoooO0O(l2, l3);
      localObject2 = Oooo0OO((Class)localObject2, localPointer);
      paramArrayOfStructure[i] = localObject2;
      ((Structure)localObject2).OooOOOo();
      i += 1;
    }
    boolean bool3 = this instanceof Structure.ByValue;
    if (!bool3) {
      this.OooOOO0 = paramArrayOfStructure;
    }
    return paramArrayOfStructure;
  }
  
  public final String OoooOo0(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    Structure localStructure = this;
    int i = paramInt;
    boolean bool1 = paramBoolean2;
    OooOOoo();
    String str1 = System.getProperty(m54207b69.F54207b69_11("vl0006040C46240F23152717230F2B"));
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = getClass();
    localObject2 = OooOo0o((Class)localObject2);
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append("(");
    localObject2 = getPointer();
    ((StringBuilder)localObject1).append(localObject2);
    ((StringBuilder)localObject1).append(")");
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = getPointer();
    boolean bool2 = localObject2 instanceof Memory;
    if (!bool2)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" (");
      int k = OoooO00();
      ((StringBuilder)localObject2).append(k);
      localObject1 = m54207b69.F54207b69_11("Pq51140A0818075E");
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = ((StringBuilder)localObject2).toString();
    }
    Object localObject3 = "";
    Object localObject4 = localObject3;
    int m = 0;
    String str2 = null;
    while (m < i)
    {
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      ((StringBuilder)localObject5).append((String)localObject4);
      ((StringBuilder)localObject5).append("  ");
      localObject4 = ((StringBuilder)localObject5).toString();
      m += 1;
    }
    str2 = "[";
    Object localObject5 = "]";
    int j;
    if (!paramBoolean1)
    {
      localObject3 = m54207b69.F54207b69_11("UV78797A2E");
    }
    else
    {
      Iterator localIterator = OooOo0O().values().iterator();
      for (Object localObject6 = str1;; localObject6 = localObject2)
      {
        boolean bool3 = localIterator.hasNext();
        if (!bool3) {
          break;
        }
        Object localObject7 = (Structure.StructField)localIterator.next();
        Object localObject8 = ((Structure.StructField)localObject7).OooO0OO;
        localObject8 = localStructure.OooOoO0((Field)localObject8);
        Object localObject9 = ((Structure.StructField)localObject7).OooO0O0;
        localObject9 = localStructure.OooOo0o((Class)localObject9);
        Object localObject10 = new java/lang/StringBuilder;
        ((StringBuilder)localObject10).<init>();
        ((StringBuilder)localObject10).append((String)localObject6);
        ((StringBuilder)localObject10).append((String)localObject4);
        localObject6 = ((StringBuilder)localObject10).toString();
        localObject10 = ((Structure.StructField)localObject7).OooO0O0;
        boolean bool4 = ((Class)localObject10).isArray();
        if ((bool4) && (localObject8 != null))
        {
          localObject9 = ((Structure.StructField)localObject7).OooO0O0.getComponentType();
          localObject9 = localStructure.OooOo0o((Class)localObject9);
          localObject10 = new java/lang/StringBuilder;
          ((StringBuilder)localObject10).<init>();
          ((StringBuilder)localObject10).append(str2);
          j = Array.getLength(localObject8);
          ((StringBuilder)localObject10).append(j);
          ((StringBuilder)localObject10).append((String)localObject5);
          localObject2 = ((StringBuilder)localObject10).toString();
        }
        else
        {
          localObject2 = localObject3;
        }
        localObject10 = new java/lang/StringBuilder;
        ((StringBuilder)localObject10).<init>();
        ((StringBuilder)localObject10).append((String)localObject6);
        localObject6 = ((Structure.StructField)localObject7).OooO00o;
        int n = ((Structure.StructField)localObject7).OooO0o0;
        localObject7 = Integer.valueOf(n);
        Object[] tmp519_516 = new Object[4];
        Object[] tmp520_519 = tmp519_516;
        Object[] tmp520_519 = tmp519_516;
        tmp520_519[0] = localObject9;
        tmp520_519[1] = localObject6;
        tmp520_519[2] = localObject2;
        Object[] tmp533_520 = tmp520_519;
        tmp533_520[3] = localObject7;
        localObject2 = tmp533_520;
        localObject6 = m54207b69.F54207b69_11("e1111216451519481B4A7A0B542076");
        localObject2 = String.format((String)localObject6, (Object[])localObject2);
        ((StringBuilder)localObject10).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject10).toString();
        boolean bool5 = localObject8 instanceof Structure;
        if (bool5)
        {
          localObject6 = localObject8;
          localObject6 = (Structure)localObject8;
          n = i + 1;
          boolean bool6 = localObject8 instanceof Structure.ByReference ^ true;
          localObject8 = ((Structure)localObject6).OoooOo0(n, bool6, bool1);
        }
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        ((StringBuilder)localObject6).append((String)localObject2);
        ((StringBuilder)localObject6).append("=");
        localObject2 = ((StringBuilder)localObject6).toString();
        bool5 = localObject8 instanceof Long;
        if (bool5)
        {
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          ((StringBuilder)localObject6).append((String)localObject2);
          localObject8 = (Long)localObject8;
          localObject2 = new Object[] { localObject8 };
          localObject7 = m54207b69.F54207b69_11("kM7D366A80791A");
          localObject2 = String.format((String)localObject7, (Object[])localObject2);
        }
        for (;;)
        {
          ((StringBuilder)localObject6).append((String)localObject2);
          localObject2 = ((StringBuilder)localObject6).toString();
          break;
          bool5 = localObject8 instanceof Integer;
          if (bool5)
          {
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            ((StringBuilder)localObject6).append((String)localObject2);
            localObject8 = (Integer)localObject8;
            localObject2 = new Object[] { localObject8 };
            localObject7 = m54207b69.F54207b69_11("670750140A0774");
            localObject2 = String.format((String)localObject7, (Object[])localObject2);
          }
          else
          {
            bool5 = localObject8 instanceof Short;
            if (bool5)
            {
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>();
              ((StringBuilder)localObject6).append((String)localObject2);
              localObject8 = (Short)localObject8;
              localObject2 = new Object[] { localObject8 };
              localObject7 = m54207b69.F54207b69_11("]=0D461A10136A");
              localObject2 = String.format((String)localObject7, (Object[])localObject2);
            }
            else
            {
              bool5 = localObject8 instanceof Byte;
              if (bool5)
              {
                localObject6 = new java/lang/StringBuilder;
                ((StringBuilder)localObject6).<init>();
                ((StringBuilder)localObject6).append((String)localObject2);
                localObject8 = (Byte)localObject8;
                localObject2 = new Object[] { localObject8 };
                localObject7 = m54207b69.F54207b69_11("\\]6D267A70700A");
                localObject2 = String.format((String)localObject7, (Object[])localObject2);
              }
              else
              {
                localObject6 = new java/lang/StringBuilder;
                ((StringBuilder)localObject6).<init>();
                ((StringBuilder)localObject6).append((String)localObject2);
                localObject2 = String.valueOf(localObject8).trim();
              }
            }
          }
        }
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        ((StringBuilder)localObject6).append((String)localObject2);
        ((StringBuilder)localObject6).append(str1);
        localObject2 = ((StringBuilder)localObject6).toString();
        bool5 = localIterator.hasNext();
        if (!bool5)
        {
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          ((StringBuilder)localObject6).append((String)localObject2);
          ((StringBuilder)localObject6).append((String)localObject4);
          ((StringBuilder)localObject6).append("}");
          localObject2 = ((StringBuilder)localObject6).toString();
        }
      }
      localObject3 = localObject6;
    }
    if ((i == 0) && (bool1))
    {
      localObject11 = new java/lang/StringBuilder;
      ((StringBuilder)localObject11).<init>();
      ((StringBuilder)localObject11).append((String)localObject3);
      ((StringBuilder)localObject11).append(str1);
      Object localObject12 = m54207b69.F54207b69_11("[G2A232C2B39436D2A3A3341");
      ((StringBuilder)localObject11).append((String)localObject12);
      ((StringBuilder)localObject11).append(str1);
      localObject11 = ((StringBuilder)localObject11).toString();
      localObject12 = getPointer();
      long l = 0L;
      int i1 = OoooO00();
      localObject12 = ((Pointer)localObject12).OooO0OO(l, i1);
      j = 0;
      localObject2 = null;
      for (;;)
      {
        int i2 = localObject12.length;
        if (j >= i2) {
          break;
        }
        i2 = j % 4;
        if (i2 == 0)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append((String)localObject11);
          ((StringBuilder)localObject4).append(str2);
          localObject11 = ((StringBuilder)localObject4).toString();
        }
        i1 = localObject12[j];
        if (i1 >= 0)
        {
          int i3 = 16;
          if (i1 < i3)
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append((String)localObject11);
            ((StringBuilder)localObject4).append("0");
            localObject11 = ((StringBuilder)localObject4).toString();
          }
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append((String)localObject11);
        i = localObject12[j] & 0xFF;
        localObject11 = Integer.toHexString(i);
        ((StringBuilder)localObject4).append((String)localObject11);
        localObject11 = ((StringBuilder)localObject4).toString();
        i1 = 3;
        if (i2 == i1)
        {
          i2 = localObject12.length + -1;
          if (j < i2)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((StringBuilder)localObject3).append((String)localObject11);
            ((StringBuilder)localObject3).append((String)localObject5);
            ((StringBuilder)localObject3).append(str1);
            localObject11 = ((StringBuilder)localObject3).toString();
          }
        }
        j += 1;
      }
      localObject12 = new java/lang/StringBuilder;
      ((StringBuilder)localObject12).<init>();
      ((StringBuilder)localObject12).append((String)localObject11);
      ((StringBuilder)localObject12).append((String)localObject5);
      localObject3 = ((StringBuilder)localObject12).toString();
    }
    Object localObject11 = new java/lang/StringBuilder;
    ((StringBuilder)localObject11).<init>();
    ((StringBuilder)localObject11).append((String)localObject1);
    ((StringBuilder)localObject11).append(" {");
    ((StringBuilder)localObject11).append((String)localObject3);
    return ((StringBuilder)localObject11).toString();
  }
  
  public String OoooOoO(boolean paramBoolean)
  {
    return OoooOo0(0, true, paramBoolean);
  }
  
  public void Ooooo00(Pointer paramPointer)
  {
    Ooooo0o(paramPointer, 0);
  }
  
  public void Ooooo0o(Pointer paramPointer, int paramInt)
  {
    OooooO0(paramPointer, paramInt, false);
  }
  
  public void OooooO0(Pointer paramPointer, int paramInt, boolean paramBoolean)
  {
    try
    {
      Map localMap = this.OooO0oo;
      localMap.clear();
      boolean bool1 = this instanceof Structure.ByValue;
      if ((bool1) && (!paramBoolean))
      {
        paramInt = OoooO00();
        localObject = new byte[paramInt];
        long l1 = 0L;
        Pointer localPointer = paramPointer;
        paramPointer.OooOo0o(l1, (byte[])localObject, 0, paramInt);
        localPointer = this.OooO00o;
        l1 = 0L;
        localPointer.OoooO(l1, (byte[])localObject, 0, paramInt);
      }
      else
      {
        paramBoolean = this.OooO0O0;
        boolean bool2 = true;
        if (paramBoolean == bool2)
        {
          paramBoolean = OooOOO(false);
          this.OooO0O0 = paramBoolean;
        }
        paramBoolean = this.OooO0O0;
        long l2;
        long l3;
        if (paramBoolean != bool2)
        {
          l2 = paramInt;
          l3 = paramBoolean;
        }
        for (paramPointer = paramPointer.OoooO0O(l2, l3);; paramPointer = paramPointer.OoooO0(l3))
        {
          this.OooO00o = paramPointer;
          break;
          l3 = paramInt;
        }
      }
      paramPointer = null;
      this.OooOOO0 = null;
      this.OooOOO = false;
      return;
    }
    catch (IndexOutOfBoundsException paramPointer)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = m54207b69.F54207b69_11("0Q02262527362A2A2A3C7A3E343E41424432823336523C4E4C4C4E8B5750595C424892556148645B49");
      localIllegalArgumentException.<init>((String)localObject, paramPointer);
      throw localIllegalArgumentException;
    }
  }
  
  public final void OooooOo(String paramString, Class paramClass)
  {
    Object localObject1 = this.OooO;
    if (localObject1 != null)
    {
      localObject1 = ((TypeMapper)localObject1).OooO00o(paramClass);
      if (localObject1 != null)
      {
        paramClass = ((ToNativeConverter)localObject1).OooO00o();
        OooooOo(paramString, paramClass);
        return;
      }
    }
    boolean bool = paramClass.isArray();
    if (bool)
    {
      paramClass = paramClass.getComponentType();
      OooooOo(paramString, paramClass);
    }
    try
    {
      OooOoo0(paramClass);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject2 = m54207b69.F54207b69_11("kj23051E0E0A0814514127222A152B2D271F5B1E16231B24611B1D64");
      localStringBuilder.append((String)localObject2);
      localObject2 = getClass();
      localStringBuilder.append(localObject2);
      localObject2 = m54207b69.F54207b69_11("as5F54171D1A241D5A251B28215F61");
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(paramString);
      localStringBuilder.append("' (");
      localStringBuilder.append(paramClass);
      localStringBuilder.append("): ");
      paramString = localIllegalArgumentException.getMessage();
      localStringBuilder.append(paramString);
      paramString = localStringBuilder.toString();
      paramClass = new java/lang/IllegalArgumentException;
      paramClass.<init>(paramString, localIllegalArgumentException);
      throw paramClass;
    }
  }
  
  public void Oooooo()
  {
    Object localObject1 = this.OooO00o;
    Object localObject3 = OooOo00;
    if (localObject1 == localObject3) {
      return;
    }
    OooOOoo();
    boolean bool1 = this instanceof Structure.ByValue;
    if (bool1) {
      ((Structure)this).getTypeInfo();
    }
    localObject1 = OooOO0o();
    bool1 = ((Set)localObject1).add(this);
    if (!bool1) {
      return;
    }
    try
    {
      localObject1 = ((Structure)this).OooOo0O();
      localObject1 = ((Map)localObject1).values();
      localObject1 = ((Collection)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject3 = ((Iterator)localObject1).next();
        localObject3 = (Structure.StructField)localObject3;
        boolean bool3 = ((Structure.StructField)localObject3).OooO0o;
        if (!bool3) {
          ((Structure)this).OoooooO((Structure.StructField)localObject3);
        }
      }
      return;
    }
    finally
    {
      OooOO0o().remove(this);
    }
  }
  
  public final void Oooooo0()
  {
    Iterator localIterator = getFieldList().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (Field)localIterator.next();
      String str = ((Field)localObject).getName();
      localObject = ((Field)localObject).getType();
      OooooOo(str, (Class)localObject);
    }
  }
  
  public void OoooooO(Structure.StructField paramStructField)
  {
    boolean bool = paramStructField.OooO0oO;
    if (bool) {
      return;
    }
    Object localObject = paramStructField.OooO0OO;
    localObject = OooOoO0((Field)localObject);
    Ooooooo(paramStructField, localObject);
  }
  
  public final void Ooooooo(Structure.StructField paramStructField, Object paramObject)
  {
    int i = paramStructField.OooO0o0;
    Object localObject1 = paramStructField.OooO0O0;
    Object localObject2 = paramStructField.OooO;
    if (localObject2 != null)
    {
      localObject1 = new com/sun/jna/StructureWriteContext;
      localObject3 = paramStructField.OooO0OO;
      ((StructureWriteContext)localObject1).<init>(this, (Field)localObject3);
      paramObject = ((ToNativeConverter)localObject2).OooO0O0(paramObject, (ToNativeContext)localObject1);
      localObject1 = ((ToNativeConverter)localObject2).OooO00o();
    }
    localObject2 = String.class;
    Object localObject3 = WString.class;
    if ((localObject2 == localObject1) || (localObject3 == localObject1)) {
      if (paramObject != null)
      {
        localObject2 = new com/sun/jna/Structure$NativeStringTracking;
        ((Structure.NativeStringTracking)localObject2).<init>(paramObject);
        Object localObject4 = this.OooO0oo;
        Object localObject5 = paramStructField.OooO00o;
        localObject4 = (Structure.NativeStringTracking)((Map)localObject4).put(localObject5, localObject2);
        if (localObject4 != null)
        {
          localObject5 = Structure.NativeStringTracking.OooO0OO((Structure.NativeStringTracking)localObject4);
          boolean bool1 = paramObject.equals(localObject5);
          if (bool1)
          {
            paramStructField = Structure.NativeStringTracking.OooO00o((Structure.NativeStringTracking)localObject4);
            Structure.NativeStringTracking.OooO0O0((Structure.NativeStringTracking)localObject2, paramStructField);
            return;
          }
        }
        boolean bool2 = true;
        boolean bool3;
        if (localObject1 == localObject3)
        {
          bool3 = bool2;
        }
        else
        {
          bool3 = false;
          localObject3 = null;
        }
        if (bool3)
        {
          localObject3 = new com/sun/jna/NativeString;
          paramObject = paramObject.toString();
          ((NativeString)localObject3).<init>(paramObject, bool2);
        }
        else
        {
          localObject3 = new com/sun/jna/NativeString;
          paramObject = paramObject.toString();
          localObject4 = this.OooO0Oo;
          ((NativeString)localObject3).<init>(paramObject, (String)localObject4);
        }
        Structure.NativeStringTracking.OooO0O0((Structure.NativeStringTracking)localObject2, (NativeString)localObject3);
        paramObject = ((NativeString)localObject3).getPointer();
      }
      else
      {
        localObject2 = this.OooO0oo;
        localObject3 = paramStructField.OooO00o;
        ((Map)localObject2).remove(localObject3);
      }
    }
    try
    {
      localObject2 = this.OooO00o;
      long l = i;
      ((Pointer)localObject2).Oooo(l, paramObject, (Class)localObject1);
      return;
    }
    catch (IllegalArgumentException paramObject)
    {
      Object localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      localObject2 = m54207b69.F54207b69_11("U360484349544C4C485E1C5F65626C652221");
      ((StringBuilder)localObject6).append((String)localObject2);
      localObject2 = paramStructField.OooO00o;
      ((StringBuilder)localObject6).append((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("CU777624372A7A37373E423E323C3E83433686");
      ((StringBuilder)localObject6).append((String)localObject2);
      localObject2 = paramStructField.OooO0O0;
      ((StringBuilder)localObject6).append(localObject2);
      paramStructField = paramStructField.OooO0O0;
      if (paramStructField == localObject1)
      {
        paramStructField = "";
      }
      else
      {
        paramStructField = new java/lang/StringBuilder;
        paramStructField.<init>();
        localObject2 = m54207b69.F54207b69_11("X[7B74373D3337334583382C364A88");
        paramStructField.append((String)localObject2);
        paramStructField.append(localObject1);
        localObject1 = ")";
        paramStructField.append((String)localObject1);
        paramStructField = paramStructField.toString();
      }
      ((StringBuilder)localObject6).append(paramStructField);
      paramStructField = m54207b69.F54207b69_11("$=111E4C5858635B245C57275E5E562B5D585E5F65635E6E7035636E647171713C7C3E906C736D8470707882");
      ((StringBuilder)localObject6).append(paramStructField);
      paramStructField = ((StringBuilder)localObject6).toString();
      localObject6 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject6).<init>(paramStructField, paramObject);
      throw ((Throwable)localObject6);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Structure;
    if (bool1)
    {
      Object localObject = paramObject.getClass();
      Class localClass = getClass();
      if (localObject == localClass)
      {
        paramObject = ((Structure)paramObject).getPointer();
        localObject = getPointer();
        bool2 = paramObject.equals(localObject);
        if (bool2)
        {
          bool2 = true;
          break label62;
        }
      }
    }
    boolean bool2 = false;
    paramObject = null;
    label62:
    return bool2;
  }
  
  public boolean getAutoRead()
  {
    return this.OooOO0O;
  }
  
  public boolean getAutoWrite()
  {
    return this.OooOO0o;
  }
  
  public List getFieldList()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (Class localClass = getClass();; localClass = localClass.getSuperclass())
    {
      Object localObject = Structure.class;
      boolean bool1 = localClass.equals(localObject);
      if (bool1) {
        break;
      }
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      Field[] arrayOfField = localClass.getDeclaredFields();
      int i = 0;
      for (;;)
      {
        int j = arrayOfField.length;
        if (i >= j) {
          break;
        }
        Field localField = arrayOfField[i];
        j = localField.getModifiers();
        boolean bool3 = Modifier.isStatic(j);
        if (!bool3)
        {
          boolean bool2 = Modifier.isPublic(j);
          if (bool2)
          {
            localField = arrayOfField[i];
            ((List)localObject).add(localField);
          }
        }
        i += 1;
      }
      localArrayList.addAll(0, (Collection)localObject);
    }
    return localArrayList;
  }
  
  public List getFieldOrder()
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    for (Class localClass = getClass();; localClass = localClass.getSuperclass())
    {
      Object localObject = Structure.class;
      if (localClass == localObject) {
        break;
      }
      localObject = (Structure.FieldOrder)localClass.getAnnotation(Structure.FieldOrder.class);
      if (localObject != null)
      {
        localObject = Arrays.asList(((Structure.FieldOrder)localObject).value());
        localLinkedList.addAll(0, (Collection)localObject);
      }
    }
    return Collections.unmodifiableList(localLinkedList);
  }
  
  public Pointer getPointer()
  {
    OooOOoo();
    return this.OooO00o;
  }
  
  public String getStringEncoding()
  {
    return this.OooO0Oo;
  }
  
  public int getStructAlignment()
  {
    int i = this.OooO0O0;
    int j = -1;
    if (i == j)
    {
      i = 1;
      OooOOO(i);
    }
    return this.OooO0o;
  }
  
  public Pointer getTypeInfo()
  {
    Pointer localPointer = OooOooo(this).getPointer();
    OooOOO0(localPointer);
    return localPointer;
  }
  
  public TypeMapper getTypeMapper()
  {
    return this.OooO;
  }
  
  public int hashCode()
  {
    Pointer localPointer = getPointer();
    if (localPointer != null) {
      return getPointer().hashCode();
    }
    return getClass().hashCode();
  }
  
  public void setAlignType(int paramInt)
  {
    this.OooO0OO = paramInt;
    if (paramInt == 0)
    {
      Class localClass = getClass();
      paramInt = Native.OooOOoo(localClass);
      if (paramInt == 0)
      {
        paramInt = Platform.isWindows();
        if (paramInt != 0) {
          paramInt = 3;
        } else {
          paramInt = 2;
        }
      }
    }
    this.OooO0o0 = paramInt;
    Oooo0();
  }
  
  public void setAutoRead(boolean paramBoolean)
  {
    this.OooOO0O = paramBoolean;
  }
  
  public void setAutoSynch(boolean paramBoolean)
  {
    setAutoRead(paramBoolean);
    setAutoWrite(paramBoolean);
  }
  
  public void setAutoWrite(boolean paramBoolean)
  {
    this.OooOO0o = paramBoolean;
  }
  
  public void setStringEncoding(String paramString)
  {
    this.OooO0Oo = paramString;
  }
  
  public String toString()
  {
    boolean bool = Boolean.getBoolean(m54207b69.F54207b69_11("?[31363C7843333C320C3F4841403630"));
    return OoooOoO(bool);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Structure
 * JD-Core Version:    0.7.0.1
 */