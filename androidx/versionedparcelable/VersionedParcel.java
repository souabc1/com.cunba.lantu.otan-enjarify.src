package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class VersionedParcel
{
  public final ArrayMap OooO00o;
  public final ArrayMap OooO0O0;
  public final ArrayMap OooO0OO;
  
  public VersionedParcel(ArrayMap paramArrayMap1, ArrayMap paramArrayMap2, ArrayMap paramArrayMap3)
  {
    this.OooO00o = paramArrayMap1;
    this.OooO0O0 = paramArrayMap2;
    this.OooO0OO = paramArrayMap3;
  }
  
  public byte[] OooO(byte[] paramArrayOfByte, int paramInt)
  {
    paramInt = OooOO0o(paramInt);
    if (paramInt == 0) {
      return paramArrayOfByte;
    }
    return OooO0oo();
  }
  
  public abstract void OooO00o();
  
  public abstract VersionedParcel OooO0O0();
  
  public final Class OooO0OO(Class paramClass)
  {
    Object localObject1 = this.OooO0OO;
    Object localObject2 = paramClass.getName();
    localObject1 = (Class)((SimpleArrayMap)localObject1).get(localObject2);
    if (localObject1 == null)
    {
      localObject1 = paramClass.getPackage().getName();
      localObject2 = paramClass.getSimpleName();
      localObject1 = new Object[] { localObject1, localObject2 };
      localObject1 = String.format("%s.%sParcelizer", (Object[])localObject1);
      ClassLoader localClassLoader = paramClass.getClassLoader();
      localObject1 = Class.forName((String)localObject1, false, localClassLoader);
      localObject2 = this.OooO0OO;
      paramClass = paramClass.getName();
      ((SimpleArrayMap)localObject2).put(paramClass, localObject1);
    }
    return localObject1;
  }
  
  public final Method OooO0Oo(String paramString)
  {
    Object localObject1 = (Method)this.OooO00o.get(paramString);
    if (localObject1 == null)
    {
      System.currentTimeMillis();
      localObject1 = VersionedParcel.class;
      Object localObject2 = ((Class)localObject1).getClassLoader();
      boolean bool = true;
      localObject2 = Class.forName(paramString, bool, (ClassLoader)localObject2);
      Class[] arrayOfClass = new Class[bool];
      arrayOfClass[0] = localObject1;
      localObject1 = ((Class)localObject2).getDeclaredMethod("read", arrayOfClass);
      localObject2 = this.OooO00o;
      ((SimpleArrayMap)localObject2).put(paramString, localObject1);
    }
    return localObject1;
  }
  
  public abstract boolean OooO0o();
  
  public final Method OooO0o0(Class paramClass)
  {
    Object localObject1 = this.OooO0O0;
    Object localObject2 = paramClass.getName();
    localObject1 = (Method)((SimpleArrayMap)localObject1).get(localObject2);
    if (localObject1 == null)
    {
      localObject1 = OooO0OO(paramClass);
      System.currentTimeMillis();
      int i = 2;
      localObject2 = new Class[i];
      localObject2[0] = paramClass;
      int j = 1;
      VersionedParcel localVersionedParcel = VersionedParcel.class;
      localObject2[j] = localVersionedParcel;
      String str = "write";
      localObject1 = ((Class)localObject1).getDeclaredMethod(str, (Class[])localObject2);
      localObject2 = this.OooO0O0;
      paramClass = paramClass.getName();
      ((SimpleArrayMap)localObject2).put(paramClass, localObject1);
    }
    return localObject1;
  }
  
  public boolean OooO0oO(boolean paramBoolean, int paramInt)
  {
    paramInt = OooOO0o(paramInt);
    if (paramInt == 0) {
      return paramBoolean;
    }
    return OooO0o();
  }
  
  public abstract byte[] OooO0oo();
  
  public abstract CharSequence OooOO0();
  
  public CharSequence OooOO0O(CharSequence paramCharSequence, int paramInt)
  {
    paramInt = OooOO0o(paramInt);
    if (paramInt == 0) {
      return paramCharSequence;
    }
    return OooOO0();
  }
  
  public abstract boolean OooOO0o(int paramInt);
  
  public abstract int OooOOO();
  
  public VersionedParcelable OooOOO0(String paramString, VersionedParcel paramVersionedParcel)
  {
    try
    {
      paramString = OooO0Oo(paramString);
      paramVersionedParcel = new Object[] { paramVersionedParcel };
      paramString = paramString.invoke(null, paramVersionedParcel);
      return (VersionedParcelable)paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      paramVersionedParcel = new java/lang/RuntimeException;
      paramVersionedParcel.<init>("VersionedParcel encountered ClassNotFoundException", paramString);
      throw paramVersionedParcel;
    }
    catch (NoSuchMethodException paramString)
    {
      paramVersionedParcel = new java/lang/RuntimeException;
      paramVersionedParcel.<init>("VersionedParcel encountered NoSuchMethodException", paramString);
      throw paramVersionedParcel;
    }
    catch (InvocationTargetException paramString)
    {
      paramVersionedParcel = paramString.getCause();
      boolean bool = paramVersionedParcel instanceof RuntimeException;
      if (bool) {
        throw ((RuntimeException)paramString.getCause());
      }
      paramVersionedParcel = new java/lang/RuntimeException;
      paramVersionedParcel.<init>("VersionedParcel encountered InvocationTargetException", paramString);
      throw paramVersionedParcel;
    }
    catch (IllegalAccessException paramString)
    {
      paramVersionedParcel = new java/lang/RuntimeException;
      paramVersionedParcel.<init>("VersionedParcel encountered IllegalAccessException", paramString);
      throw paramVersionedParcel;
    }
  }
  
  public int OooOOOO(int paramInt1, int paramInt2)
  {
    paramInt2 = OooOO0o(paramInt2);
    if (paramInt2 == 0) {
      return paramInt1;
    }
    return OooOOO();
  }
  
  public abstract Parcelable OooOOOo();
  
  public abstract String OooOOo();
  
  public Parcelable OooOOo0(Parcelable paramParcelable, int paramInt)
  {
    paramInt = OooOO0o(paramInt);
    if (paramInt == 0) {
      return paramParcelable;
    }
    return OooOOOo();
  }
  
  public String OooOOoo(String paramString, int paramInt)
  {
    paramInt = OooOO0o(paramInt);
    if (paramInt == 0) {
      return paramString;
    }
    return OooOOo();
  }
  
  public void OooOo(boolean paramBoolean, int paramInt)
  {
    setOutputField(paramInt);
    OooOo0o(paramBoolean);
  }
  
  public VersionedParcelable OooOo0(VersionedParcelable paramVersionedParcelable, int paramInt)
  {
    paramInt = OooOO0o(paramInt);
    if (paramInt == 0) {
      return paramVersionedParcelable;
    }
    return OooOo00();
  }
  
  public VersionedParcelable OooOo00()
  {
    String str = OooOOo();
    if (str == null) {
      return null;
    }
    VersionedParcel localVersionedParcel = OooO0O0();
    return OooOOO0(str, localVersionedParcel);
  }
  
  public void OooOo0O(boolean paramBoolean1, boolean paramBoolean2) {}
  
  public abstract void OooOo0o(boolean paramBoolean);
  
  public void OooOoO(byte[] paramArrayOfByte, int paramInt)
  {
    setOutputField(paramInt);
    OooOoO0(paramArrayOfByte);
  }
  
  public abstract void OooOoO0(byte[] paramArrayOfByte);
  
  public abstract void OooOoOO(CharSequence paramCharSequence);
  
  public abstract void OooOoo(int paramInt);
  
  public void OooOoo0(CharSequence paramCharSequence, int paramInt)
  {
    setOutputField(paramInt);
    OooOoOO(paramCharSequence);
  }
  
  public void OooOooO(int paramInt1, int paramInt2)
  {
    setOutputField(paramInt2);
    OooOoo(paramInt1);
  }
  
  public abstract void OooOooo(Parcelable paramParcelable);
  
  public void Oooo0(VersionedParcelable paramVersionedParcelable, VersionedParcel paramVersionedParcel)
  {
    try
    {
      Object localObject = paramVersionedParcelable.getClass();
      localObject = OooO0o0((Class)localObject);
      paramVersionedParcelable = new Object[] { paramVersionedParcelable, paramVersionedParcel };
      bool = false;
      paramVersionedParcel = null;
      ((Method)localObject).invoke(null, paramVersionedParcelable);
      return;
    }
    catch (ClassNotFoundException paramVersionedParcelable)
    {
      paramVersionedParcel = new java/lang/RuntimeException;
      paramVersionedParcel.<init>("VersionedParcel encountered ClassNotFoundException", paramVersionedParcelable);
      throw paramVersionedParcel;
    }
    catch (NoSuchMethodException paramVersionedParcelable)
    {
      paramVersionedParcel = new java/lang/RuntimeException;
      paramVersionedParcel.<init>("VersionedParcel encountered NoSuchMethodException", paramVersionedParcelable);
      throw paramVersionedParcel;
    }
    catch (InvocationTargetException paramVersionedParcelable)
    {
      paramVersionedParcel = paramVersionedParcelable.getCause();
      boolean bool = paramVersionedParcel instanceof RuntimeException;
      if (bool) {
        throw ((RuntimeException)paramVersionedParcelable.getCause());
      }
      paramVersionedParcel = new java/lang/RuntimeException;
      paramVersionedParcel.<init>("VersionedParcel encountered InvocationTargetException", paramVersionedParcelable);
      throw paramVersionedParcel;
    }
    catch (IllegalAccessException paramVersionedParcelable)
    {
      paramVersionedParcel = new java/lang/RuntimeException;
      paramVersionedParcel.<init>("VersionedParcel encountered IllegalAccessException", paramVersionedParcelable);
      throw paramVersionedParcel;
    }
  }
  
  public void Oooo000(Parcelable paramParcelable, int paramInt)
  {
    setOutputField(paramInt);
    OooOooo(paramParcelable);
  }
  
  public abstract void Oooo00O(String paramString);
  
  public void Oooo00o(String paramString, int paramInt)
  {
    setOutputField(paramInt);
    Oooo00O(paramString);
  }
  
  public void Oooo0O0(VersionedParcelable paramVersionedParcelable)
  {
    if (paramVersionedParcelable == null)
    {
      Oooo00O(null);
      return;
    }
    Oooo0o0(paramVersionedParcelable);
    VersionedParcel localVersionedParcel = OooO0O0();
    Oooo0(paramVersionedParcelable, localVersionedParcel);
    localVersionedParcel.OooO00o();
  }
  
  public void Oooo0OO(VersionedParcelable paramVersionedParcelable, int paramInt)
  {
    setOutputField(paramInt);
    Oooo0O0(paramVersionedParcelable);
  }
  
  public final void Oooo0o0(VersionedParcelable paramVersionedParcelable)
  {
    try
    {
      Class localClass = paramVersionedParcelable.getClass();
      paramVersionedParcelable = OooO0OO(localClass).getName();
      Oooo00O(paramVersionedParcelable);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      paramVersionedParcelable = paramVersionedParcelable.getClass().getSimpleName();
      localStringBuilder.append(paramVersionedParcelable);
      localStringBuilder.append(" does not have a Parcelizer");
      paramVersionedParcelable = localStringBuilder.toString();
      localRuntimeException.<init>(paramVersionedParcelable, localClassNotFoundException);
      throw localRuntimeException;
    }
  }
  
  public boolean isStream()
  {
    return false;
  }
  
  public abstract void setOutputField(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.versionedparcelable.VersionedParcel
 * JD-Core Version:    0.7.0.1
 */