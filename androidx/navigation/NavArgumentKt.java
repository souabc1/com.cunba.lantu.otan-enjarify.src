package androidx.navigation;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class NavArgumentKt
{
  public static final List OooO00o(Map paramMap, Function1 paramFunction1)
  {
    Intrinsics.OooO0o(paramMap, "<this>");
    Intrinsics.OooO0o(paramFunction1, "isArgumentMissing");
    Object localObject1 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject1).<init>();
    paramMap = paramMap.entrySet().iterator();
    boolean bool1;
    Object localObject2;
    Object localObject3;
    boolean bool3;
    for (;;)
    {
      bool1 = paramMap.hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (Map.Entry)paramMap.next();
      localObject3 = (NavArgument)((Map.Entry)localObject2).getValue();
      int i = 0;
      if (localObject3 != null)
      {
        boolean bool2 = ((NavArgument)localObject3).isNullable();
        if (!bool2)
        {
          bool3 = ((NavArgument)localObject3).isDefaultValuePresent();
          if (!bool3) {
            i = 1;
          }
        }
      }
      if (i != 0)
      {
        localObject3 = ((Map.Entry)localObject2).getKey();
        localObject2 = ((Map.Entry)localObject2).getValue();
        ((AbstractMap)localObject1).put(localObject3, localObject2);
      }
    }
    paramMap = ((Map)localObject1).keySet();
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    paramMap = paramMap.iterator();
    for (;;)
    {
      bool1 = paramMap.hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = paramMap.next();
      localObject3 = localObject2;
      localObject3 = (String)localObject2;
      localObject3 = (Boolean)paramFunction1.invoke(localObject3);
      bool3 = ((Boolean)localObject3).booleanValue();
      if (bool3) {
        ((Collection)localObject1).add(localObject2);
      }
    }
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavArgumentKt
 * JD-Core Version:    0.7.0.1
 */