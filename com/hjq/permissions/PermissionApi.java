package com.hjq.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class PermissionApi
{
  public static final PermissionDelegate OooO00o;
  
  static
  {
    boolean bool = AndroidVersion.isAndroid14();
    Object localObject;
    if (bool)
    {
      localObject = new com/hjq/permissions/PermissionDelegateImplV34;
      ((PermissionDelegateImplV34)localObject).<init>();
    }
    for (;;)
    {
      OooO00o = (PermissionDelegate)localObject;
      break;
      bool = AndroidVersion.isAndroid13();
      if (bool)
      {
        localObject = new com/hjq/permissions/PermissionDelegateImplV33;
        ((PermissionDelegateImplV33)localObject).<init>();
      }
      else
      {
        bool = AndroidVersion.isAndroid12();
        if (bool)
        {
          localObject = new com/hjq/permissions/PermissionDelegateImplV31;
          ((PermissionDelegateImplV31)localObject).<init>();
        }
        else
        {
          bool = AndroidVersion.isAndroid11();
          if (bool)
          {
            localObject = new com/hjq/permissions/PermissionDelegateImplV30;
            ((PermissionDelegateImplV30)localObject).<init>();
          }
          else
          {
            bool = AndroidVersion.isAndroid10();
            if (bool)
            {
              localObject = new com/hjq/permissions/PermissionDelegateImplV29;
              ((PermissionDelegateImplV29)localObject).<init>();
            }
            else
            {
              bool = AndroidVersion.isAndroid9();
              if (bool)
              {
                localObject = new com/hjq/permissions/PermissionDelegateImplV28;
                ((PermissionDelegateImplV28)localObject).<init>();
              }
              else
              {
                bool = AndroidVersion.isAndroid8();
                if (bool)
                {
                  localObject = new com/hjq/permissions/PermissionDelegateImplV26;
                  ((PermissionDelegateImplV26)localObject).<init>();
                }
                else
                {
                  bool = AndroidVersion.isAndroid6();
                  if (bool)
                  {
                    localObject = new com/hjq/permissions/PermissionDelegateImplV23;
                    ((PermissionDelegateImplV23)localObject).<init>();
                  }
                  else
                  {
                    bool = AndroidVersion.isAndroid5();
                    if (bool)
                    {
                      localObject = new com/hjq/permissions/PermissionDelegateImplV21;
                      ((PermissionDelegateImplV21)localObject).<init>();
                    }
                    else
                    {
                      bool = AndroidVersion.isAndroid4_4();
                      if (bool)
                      {
                        localObject = new com/hjq/permissions/PermissionDelegateImplV19;
                        ((PermissionDelegateImplV19)localObject).<init>();
                      }
                      else
                      {
                        bool = AndroidVersion.isAndroid4_3();
                        if (bool)
                        {
                          localObject = new com/hjq/permissions/PermissionDelegateImplV18;
                          ((PermissionDelegateImplV18)localObject).<init>();
                        }
                        else
                        {
                          localObject = new com/hjq/permissions/PermissionDelegateImplV14;
                          ((PermissionDelegateImplV14)localObject).<init>();
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
  
  public static boolean OooO(Context paramContext, String paramString)
  {
    return OooO00o.OooO0OO(paramContext, paramString);
  }
  
  public static boolean OooO00o(List paramList)
  {
    if (paramList != null)
    {
      boolean bool = paramList.isEmpty();
      if (!bool)
      {
        paramList = paramList.iterator();
        do
        {
          bool = paramList.hasNext();
          if (!bool) {
            break;
          }
          String str = (String)paramList.next();
          bool = OooOO0O(str);
        } while (!bool);
        return true;
      }
    }
    return false;
  }
  
  public static List OooO0O0(List paramList, int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfInt[i];
      int k = -1;
      if (j == k)
      {
        Object localObject = paramList.get(i);
        localArrayList.add(localObject);
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public static List OooO0OO(Context paramContext, List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramList.size();
    localArrayList.<init>(i);
    paramList = paramList.iterator();
    for (;;)
    {
      boolean bool1 = paramList.hasNext();
      if (!bool1) {
        break;
      }
      String str = (String)paramList.next();
      boolean bool2 = OooO(paramContext, str);
      if (bool2) {
        localArrayList.add(str);
      }
    }
    return localArrayList;
  }
  
  public static List OooO0Oo(List paramList, int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfInt[i];
      if (j == 0)
      {
        Object localObject = paramList.get(i);
        localArrayList.add(localObject);
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public static int OooO0o(Context paramContext, String paramString)
  {
    boolean bool = OooO(paramContext, paramString);
    int i;
    if (bool)
    {
      bool = false;
      paramContext = null;
    }
    else
    {
      i = -1;
    }
    return i;
  }
  
  public static Intent OooO0o0(Context paramContext, String paramString)
  {
    return OooO00o.OooO0O0(paramContext, paramString);
  }
  
  public static boolean OooO0oO(Activity paramActivity, String paramString)
  {
    return OooO00o.OooO00o(paramActivity, paramString);
  }
  
  public static boolean OooO0oo(Activity paramActivity, List paramList)
  {
    paramList = paramList.iterator();
    boolean bool;
    do
    {
      bool = paramList.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)paramList.next();
      bool = OooO0oO(paramActivity, str);
    } while (!bool);
    return true;
    return false;
  }
  
  public static boolean OooOO0(Context paramContext, List paramList)
  {
    boolean bool = paramList.isEmpty();
    if (bool) {
      return false;
    }
    paramList = paramList.iterator();
    do
    {
      bool = paramList.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)paramList.next();
      bool = OooO(paramContext, str);
    } while (bool);
    return false;
    return true;
  }
  
  public static boolean OooOO0O(String paramString)
  {
    return Permission.OooO0o0(paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.PermissionApi
 * JD-Core Version:    0.7.0.1
 */