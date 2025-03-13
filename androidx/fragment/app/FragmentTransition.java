package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.transition.FragmentTransitionSupport;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class FragmentTransition
{
  public static final FragmentTransition OooO00o;
  public static final FragmentTransitionImpl OooO0O0;
  public static final FragmentTransitionImpl OooO0OO;
  
  static
  {
    FragmentTransition localFragmentTransition = new androidx/fragment/app/FragmentTransition;
    localFragmentTransition.<init>();
    OooO00o = localFragmentTransition;
    FragmentTransitionCompat21 localFragmentTransitionCompat21 = new androidx/fragment/app/FragmentTransitionCompat21;
    localFragmentTransitionCompat21.<init>();
    OooO0O0 = localFragmentTransitionCompat21;
    OooO0OO = localFragmentTransition.OooO0OO();
  }
  
  public static final void OooO00o(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean1, ArrayMap paramArrayMap, boolean paramBoolean2)
  {
    Intrinsics.OooO0o(paramFragment1, "inFragment");
    Intrinsics.OooO0o(paramFragment2, "outFragment");
    Object localObject1 = "sharedElements";
    Intrinsics.OooO0o(paramArrayMap, (String)localObject1);
    if (paramBoolean1) {
      paramFragment1 = paramFragment2.getEnterTransitionCallback();
    } else {
      paramFragment1 = paramFragment1.getEnterTransitionCallback();
    }
    if (paramFragment1 != null)
    {
      paramFragment2 = new java/util/ArrayList;
      paramBoolean1 = paramArrayMap.size();
      paramFragment2.<init>(paramBoolean1);
      Object localObject2 = paramArrayMap.entrySet().iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (View)((Map.Entry)((Iterator)localObject2).next()).getValue();
        paramFragment2.add(localObject1);
      }
      localObject2 = new java/util/ArrayList;
      int i = paramArrayMap.size();
      ((ArrayList)localObject2).<init>(i);
      paramArrayMap = paramArrayMap.entrySet().iterator();
      for (;;)
      {
        boolean bool2 = paramArrayMap.hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (String)((Map.Entry)paramArrayMap.next()).getKey();
        ((Collection)localObject2).add(localObject1);
      }
      paramArrayMap = null;
      if (paramBoolean2) {
        paramFragment1.OooO0oO((List)localObject2, paramFragment2, null);
      } else {
        paramFragment1.OooO0o((List)localObject2, paramFragment2, null);
      }
    }
  }
  
  public static final String OooO0O0(ArrayMap paramArrayMap, String paramString)
  {
    Intrinsics.OooO0o(paramArrayMap, "<this>");
    Intrinsics.OooO0o(paramString, "value");
    Object localObject1 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject1).<init>();
    paramArrayMap = paramArrayMap.entrySet().iterator();
    for (;;)
    {
      boolean bool1 = paramArrayMap.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (Map.Entry)paramArrayMap.next();
      Object localObject3 = ((Map.Entry)localObject2).getValue();
      boolean bool2 = Intrinsics.OooO00o(localObject3, paramString);
      if (bool2)
      {
        localObject3 = ((Map.Entry)localObject2).getKey();
        localObject2 = ((Map.Entry)localObject2).getValue();
        ((Map)localObject1).put(localObject3, localObject2);
      }
    }
    paramArrayMap = new java/util/ArrayList;
    int i = ((Map)localObject1).size();
    paramArrayMap.<init>(i);
    paramString = ((Map)localObject1).entrySet().iterator();
    for (;;)
    {
      boolean bool3 = paramString.hasNext();
      if (!bool3) {
        break;
      }
      localObject1 = (String)((Map.Entry)paramString.next()).getKey();
      paramArrayMap.add(localObject1);
    }
    return (String)CollectionsKt.Oooo0oO(paramArrayMap);
  }
  
  public static final void OooO0Oo(ArrayMap paramArrayMap1, ArrayMap paramArrayMap2)
  {
    Intrinsics.OooO0o(paramArrayMap1, "<this>");
    String str1 = "namedViews";
    Intrinsics.OooO0o(paramArrayMap2, str1);
    int i = paramArrayMap1.size() + -1;
    for (;;)
    {
      int j = -1;
      if (j >= i) {
        break;
      }
      String str2 = (String)paramArrayMap1.OooOOO0(i);
      boolean bool = paramArrayMap2.containsKey(str2);
      if (!bool) {
        paramArrayMap1.OooOO0O(i);
      }
      i += -1;
    }
  }
  
  public static final boolean OooO0o()
  {
    FragmentTransitionImpl localFragmentTransitionImpl = OooO0O0;
    if (localFragmentTransitionImpl == null)
    {
      localFragmentTransitionImpl = OooO0OO;
      if (localFragmentTransitionImpl == null)
      {
        bool = false;
        localFragmentTransitionImpl = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static final void OooO0o0(List paramList, int paramInt)
  {
    Object localObject = "views";
    Intrinsics.OooO0o(paramList, (String)localObject);
    paramList = paramList.iterator();
    for (;;)
    {
      boolean bool = paramList.hasNext();
      if (!bool) {
        break;
      }
      localObject = (View)paramList.next();
      ((View)localObject).setVisibility(paramInt);
    }
  }
  
  public final FragmentTransitionImpl OooO0OO()
  {
    Object localObject1 = FragmentTransitionSupport.class;
    Object localObject2 = "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>";
    try
    {
      Intrinsics.OooO0Oo(localObject1, (String)localObject2);
      localObject2 = null;
      Class[] arrayOfClass = new Class[0];
      localObject1 = ((Class)localObject1).getDeclaredConstructor(arrayOfClass);
      localObject2 = new Object[0];
      localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
      localObject1 = (FragmentTransitionImpl)localObject1;
    }
    catch (Exception localException)
    {
      localObject1 = null;
    }
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTransition
 * JD-Core Version:    0.7.0.1
 */