package androidx.navigation;

import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class NavType$Companion
{
  public NavType OooO00o(String paramString1, String paramString2)
  {
    Object localObject1 = NavType.OooO0Oo;
    Object localObject2 = ((NavType)localObject1).getName();
    boolean bool1 = Intrinsics.OooO00o(localObject2, paramString1);
    if (bool1) {
      return localObject1;
    }
    localObject1 = NavType.OooO0o;
    localObject2 = ((NavType)localObject1).getName();
    bool1 = Intrinsics.OooO00o(localObject2, paramString1);
    if (bool1) {
      return localObject1;
    }
    localObject1 = NavType.OooO0oO;
    localObject2 = ((NavType)localObject1).getName();
    bool1 = Intrinsics.OooO00o(localObject2, paramString1);
    if (bool1) {
      return localObject1;
    }
    localObject1 = NavType.OooO0oo;
    localObject2 = ((NavType)localObject1).getName();
    bool1 = Intrinsics.OooO00o(localObject2, paramString1);
    if (bool1) {
      return localObject1;
    }
    localObject1 = NavType.OooOO0O;
    localObject2 = ((NavType)localObject1).getName();
    bool1 = Intrinsics.OooO00o(localObject2, paramString1);
    if (bool1) {
      return localObject1;
    }
    localObject1 = NavType.OooOO0o;
    localObject2 = ((NavType)localObject1).getName();
    bool1 = Intrinsics.OooO00o(localObject2, paramString1);
    if (bool1) {
      return localObject1;
    }
    localObject1 = NavType.OooOOO0;
    localObject2 = ((NavType)localObject1).getName();
    bool1 = Intrinsics.OooO00o(localObject2, paramString1);
    if (bool1) {
      return localObject1;
    }
    localObject2 = NavType.OooOOO;
    Object localObject3 = ((NavType)localObject2).getName();
    boolean bool2 = Intrinsics.OooO00o(localObject3, paramString1);
    if (bool2) {
      return localObject2;
    }
    localObject2 = NavType.OooO;
    localObject3 = ((NavType)localObject2).getName();
    bool2 = Intrinsics.OooO00o(localObject3, paramString1);
    if (bool2) {
      return localObject2;
    }
    localObject2 = NavType.OooOO0;
    localObject3 = ((NavType)localObject2).getName();
    bool2 = Intrinsics.OooO00o(localObject3, paramString1);
    if (bool2) {
      return localObject2;
    }
    localObject2 = NavType.OooO0o0;
    localObject3 = ((NavType)localObject2).getName();
    bool2 = Intrinsics.OooO00o(localObject3, paramString1);
    if (bool2) {
      return localObject2;
    }
    bool1 = false;
    localObject2 = null;
    if (paramString1 != null)
    {
      i = paramString1.length();
      if (i != 0)
      {
        i = 0;
        localObject3 = null;
        break label325;
      }
    }
    int i = 1;
    label325:
    if (i == 0)
    {
      localObject1 = ".";
      i = 0;
      localObject3 = null;
      int j = 2;
      try
      {
        boolean bool3 = StringsKt.OooOOo0(paramString1, (String)localObject1, false, j, null);
        if ((bool3) && (paramString2 != null))
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append(paramString2);
          ((StringBuilder)localObject1).append(paramString1);
          paramString2 = ((StringBuilder)localObject1).toString();
        }
        else
        {
          paramString2 = paramString1;
        }
        localObject1 = "[]";
        boolean bool4 = StringsKt.OooO(paramString1, (String)localObject1, false, j, null);
        localObject1 = "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>";
        localObject3 = Serializable.class;
        Parcelable localParcelable = Parcelable.class;
        if (bool4)
        {
          int k = paramString2.length() - j;
          paramString2 = paramString2.substring(0, k);
          paramString1 = "this as java.lang.String…ing(startIndex, endIndex)";
          Intrinsics.OooO0o0(paramString2, paramString1);
          paramString1 = Class.forName(paramString2);
          bool1 = localParcelable.isAssignableFrom(paramString1);
          if (bool1)
          {
            paramString2 = new androidx/navigation/NavType$ParcelableArrayType;
            localObject1 = "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>";
            Intrinsics.OooO0Oo(paramString1, (String)localObject1);
            paramString2.<init>(paramString1);
            return paramString2;
          }
          bool1 = ((Class)localObject3).isAssignableFrom(paramString1);
          if (bool1)
          {
            paramString2 = new androidx/navigation/NavType$SerializableArrayType;
            Intrinsics.OooO0Oo(paramString1, (String)localObject1);
            paramString2.<init>(paramString1);
            return paramString2;
          }
        }
        else
        {
          paramString1 = Class.forName(paramString2);
          bool1 = localParcelable.isAssignableFrom(paramString1);
          if (bool1)
          {
            paramString2 = new androidx/navigation/NavType$ParcelableType;
            localObject1 = "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>";
            Intrinsics.OooO0Oo(paramString1, (String)localObject1);
            paramString2.<init>(paramString1);
            return paramString2;
          }
          localObject2 = Enum.class;
          bool1 = ((Class)localObject2).isAssignableFrom(paramString1);
          if (bool1)
          {
            paramString2 = new androidx/navigation/NavType$EnumType;
            localObject1 = "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>";
            Intrinsics.OooO0Oo(paramString1, (String)localObject1);
            paramString2.<init>(paramString1);
            return paramString2;
          }
          bool1 = ((Class)localObject3).isAssignableFrom(paramString1);
          if (bool1)
          {
            paramString2 = new androidx/navigation/NavType$SerializableType;
            Intrinsics.OooO0Oo(paramString1, (String)localObject1);
            paramString2.<init>(paramString1);
            return paramString2;
          }
        }
        paramString1 = new java/lang/IllegalArgumentException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(paramString2);
        paramString2 = " is not Serializable or Parcelable.";
        ((StringBuilder)localObject1).append(paramString2);
        paramString2 = ((StringBuilder)localObject1).toString();
        paramString1.<init>(paramString2);
        throw paramString1;
      }
      catch (ClassNotFoundException paramString1)
      {
        paramString2 = new java/lang/RuntimeException;
        paramString2.<init>(paramString1);
        throw paramString2;
      }
    }
    return localObject1;
  }
  
  public final NavType OooO0O0(String paramString)
  {
    String str = "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>";
    Object localObject = "value";
    Intrinsics.OooO0o(paramString, (String)localObject);
    try
    {
      localObject = NavType.OooO0Oo;
      ((NavType)localObject).OooO0Oo(paramString);
      Intrinsics.OooO0Oo(localObject, str);
      return localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException1)
    {
      try
      {
        localObject = NavType.OooO0oO;
        ((NavType)localObject).OooO0Oo(paramString);
        Intrinsics.OooO0Oo(localObject, str);
        return localObject;
      }
      catch (IllegalArgumentException localIllegalArgumentException2)
      {
        try
        {
          localObject = NavType.OooO;
          ((NavType)localObject).OooO0Oo(paramString);
          Intrinsics.OooO0Oo(localObject, str);
          return localObject;
        }
        catch (IllegalArgumentException localIllegalArgumentException3)
        {
          try
          {
            localObject = NavType.OooOO0O;
            ((NavType)localObject).OooO0Oo(paramString);
            Intrinsics.OooO0Oo(localObject, str);
            return localObject;
          }
          catch (IllegalArgumentException localIllegalArgumentException4)
          {
            paramString = NavType.OooOOO0;
            Intrinsics.OooO0Oo(paramString, str);
          }
        }
      }
    }
    return paramString;
  }
  
  public final NavType OooO0OO(Object paramObject)
  {
    boolean bool = paramObject instanceof Integer;
    Object localObject1 = "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>";
    if (bool) {
      paramObject = NavType.OooO0Oo;
    }
    for (;;)
    {
      Intrinsics.OooO0Oo(paramObject, (String)localObject1);
      break;
      bool = paramObject instanceof int[];
      if (bool)
      {
        paramObject = NavType.OooO0o;
      }
      else
      {
        bool = paramObject instanceof Long;
        if (bool)
        {
          paramObject = NavType.OooO0oO;
        }
        else
        {
          bool = paramObject instanceof long[];
          if (bool)
          {
            paramObject = NavType.OooO0oo;
          }
          else
          {
            bool = paramObject instanceof Float;
            if (bool)
            {
              paramObject = NavType.OooO;
            }
            else
            {
              bool = paramObject instanceof float[];
              if (bool)
              {
                paramObject = NavType.OooOO0;
              }
              else
              {
                bool = paramObject instanceof Boolean;
                if (bool)
                {
                  paramObject = NavType.OooOO0O;
                }
                else
                {
                  bool = paramObject instanceof boolean[];
                  if (bool)
                  {
                    paramObject = NavType.OooOO0o;
                  }
                  else
                  {
                    bool = paramObject instanceof String;
                    if ((!bool) && (paramObject != null))
                    {
                      bool = paramObject instanceof Object[];
                      if (bool)
                      {
                        localObject2 = paramObject;
                        localObject2 = (Object[])paramObject;
                        bool = localObject2 instanceof String[];
                        if (bool)
                        {
                          paramObject = NavType.OooOOO;
                          continue;
                        }
                      }
                      Object localObject2 = paramObject.getClass();
                      bool = ((Class)localObject2).isArray();
                      if (bool)
                      {
                        localObject2 = paramObject.getClass().getComponentType();
                        Intrinsics.OooO0OO(localObject2);
                        localObject1 = Parcelable.class;
                        bool = ((Class)localObject1).isAssignableFrom((Class)localObject2);
                        if (bool)
                        {
                          localObject2 = new androidx/navigation/NavType$ParcelableArrayType;
                          paramObject = paramObject.getClass().getComponentType();
                          localObject1 = "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>";
                          Intrinsics.OooO0Oo(paramObject, (String)localObject1);
                          ((NavType.ParcelableArrayType)localObject2).<init>(paramObject);
                        }
                      }
                      for (;;)
                      {
                        return localObject2;
                        localObject2 = paramObject.getClass();
                        bool = ((Class)localObject2).isArray();
                        if (bool)
                        {
                          localObject2 = paramObject.getClass().getComponentType();
                          Intrinsics.OooO0OO(localObject2);
                          localObject1 = Serializable.class;
                          bool = ((Class)localObject1).isAssignableFrom((Class)localObject2);
                          if (bool)
                          {
                            localObject2 = new androidx/navigation/NavType$SerializableArrayType;
                            paramObject = paramObject.getClass().getComponentType();
                            localObject1 = "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>";
                            Intrinsics.OooO0Oo(paramObject, (String)localObject1);
                            ((NavType.SerializableArrayType)localObject2).<init>(paramObject);
                            continue;
                          }
                        }
                        bool = paramObject instanceof Parcelable;
                        if (bool)
                        {
                          localObject2 = new androidx/navigation/NavType$ParcelableType;
                          paramObject = paramObject.getClass();
                          ((NavType.ParcelableType)localObject2).<init>(paramObject);
                        }
                        else
                        {
                          bool = paramObject instanceof Enum;
                          if (bool)
                          {
                            localObject2 = new androidx/navigation/NavType$EnumType;
                            paramObject = paramObject.getClass();
                            ((NavType.EnumType)localObject2).<init>(paramObject);
                          }
                          else
                          {
                            bool = paramObject instanceof Serializable;
                            if (!bool) {
                              break;
                            }
                            localObject2 = new androidx/navigation/NavType$SerializableType;
                            paramObject = paramObject.getClass();
                            ((NavType.SerializableType)localObject2).<init>(paramObject);
                          }
                        }
                      }
                      localObject2 = new java/lang/IllegalArgumentException;
                      localObject1 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject1).<init>();
                      ((StringBuilder)localObject1).append("Object of type ");
                      paramObject = paramObject.getClass().getName();
                      ((StringBuilder)localObject1).append(paramObject);
                      ((StringBuilder)localObject1).append(" is not supported for navigation arguments.");
                      paramObject = ((StringBuilder)localObject1).toString();
                      ((IllegalArgumentException)localObject2).<init>(paramObject);
                      throw ((Throwable)localObject2);
                    }
                    else
                    {
                      paramObject = NavType.OooOOO0;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return paramObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavType.Companion
 * JD-Core Version:    0.7.0.1
 */