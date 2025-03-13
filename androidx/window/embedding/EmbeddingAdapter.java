package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule.Builder;
import androidx.window.extensions.embedding.SplitPairRule.Builder;
import androidx.window.extensions.embedding.SplitPlaceholderRule.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class EmbeddingAdapter
{
  public static final boolean OooOO0o(EmbeddingAdapter paramEmbeddingAdapter, Set paramSet, Pair paramPair)
  {
    Intrinsics.OooO0o(paramEmbeddingAdapter, "this$0");
    Intrinsics.OooO0o(paramSet, "$splitPairFilters");
    Intrinsics.OooO0o0(paramPair, "(first, second)");
    Activity localActivity = (Activity)paramEmbeddingAdapter.OooO0o(paramPair);
    paramEmbeddingAdapter = (Intent)paramEmbeddingAdapter.OooO0oO(paramPair);
    boolean bool1 = paramSet instanceof Collection;
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = paramSet.isEmpty();
      if (bool1) {}
    }
    else
    {
      paramSet = paramSet.iterator();
      do
      {
        bool1 = paramSet.hasNext();
        if (!bool1) {
          break;
        }
        paramPair = (SplitPairFilter)paramSet.next();
        bool1 = paramPair.OooO00o(localActivity, paramEmbeddingAdapter);
      } while (!bool1);
      bool2 = true;
    }
    return bool2;
  }
  
  public static final boolean OooOOO(EmbeddingAdapter paramEmbeddingAdapter, Set paramSet, Pair paramPair)
  {
    Intrinsics.OooO0o(paramEmbeddingAdapter, "this$0");
    Intrinsics.OooO0o(paramSet, "$splitPairFilters");
    Intrinsics.OooO0o0(paramPair, "(first, second)");
    Activity localActivity = (Activity)paramEmbeddingAdapter.OooO0o(paramPair);
    paramEmbeddingAdapter = (Activity)paramEmbeddingAdapter.OooO0oO(paramPair);
    boolean bool1 = paramSet instanceof Collection;
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = paramSet.isEmpty();
      if (bool1) {}
    }
    else
    {
      paramSet = paramSet.iterator();
      do
      {
        bool1 = paramSet.hasNext();
        if (!bool1) {
          break;
        }
        paramPair = (SplitPairFilter)paramSet.next();
        bool1 = paramPair.OooO0O0(localActivity, paramEmbeddingAdapter);
      } while (!bool1);
      bool2 = true;
    }
    return bool2;
  }
  
  public static final boolean OooOOOo(Set paramSet, Activity paramActivity)
  {
    Object localObject = "$activityFilters";
    Intrinsics.OooO0o(paramSet, (String)localObject);
    boolean bool1 = paramSet instanceof Collection;
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = paramSet.isEmpty();
      if (bool1) {}
    }
    else
    {
      paramSet = paramSet.iterator();
      do
      {
        bool1 = paramSet.hasNext();
        if (!bool1) {
          break;
        }
        localObject = (ActivityFilter)paramSet.next();
        String str = "activity";
        Intrinsics.OooO0o0(paramActivity, str);
        bool1 = ((ActivityFilter)localObject).OooO00o(paramActivity);
      } while (!bool1);
      bool2 = true;
    }
    return bool2;
  }
  
  public static final boolean OooOOo(Set paramSet, Intent paramIntent)
  {
    Object localObject = "$activityFilters";
    Intrinsics.OooO0o(paramSet, (String)localObject);
    boolean bool1 = paramSet instanceof Collection;
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = paramSet.isEmpty();
      if (bool1) {}
    }
    else
    {
      paramSet = paramSet.iterator();
      do
      {
        bool1 = paramSet.hasNext();
        if (!bool1) {
          break;
        }
        localObject = (ActivityFilter)paramSet.next();
        String str = "intent";
        Intrinsics.OooO0o0(paramIntent, str);
        bool1 = ((ActivityFilter)localObject).OooO0O0(paramIntent);
      } while (!bool1);
      bool2 = true;
    }
    return bool2;
  }
  
  public static final boolean OooOo00(SplitRule paramSplitRule, WindowMetrics paramWindowMetrics)
  {
    Intrinsics.OooO0o(paramSplitRule, "$splitRule");
    Intrinsics.OooO0o0(paramWindowMetrics, "windowMetrics");
    return paramSplitRule.OooO00o(paramWindowMetrics);
  }
  
  public final List OooO(List paramList)
  {
    Intrinsics.OooO0o(paramList, "splitInfoList");
    ArrayList localArrayList = new java/util/ArrayList;
    int i = CollectionsKt.OooOOo0(paramList, 10);
    localArrayList.<init>(i);
    paramList = paramList.iterator();
    for (;;)
    {
      boolean bool = paramList.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (androidx.window.extensions.embedding.SplitInfo)paramList.next();
      localObject = OooO0oo((androidx.window.extensions.embedding.SplitInfo)localObject);
      localArrayList.add(localObject);
    }
    return localArrayList;
  }
  
  public final Object OooO0o(Pair paramPair)
  {
    Intrinsics.OooO0o(paramPair, "<this>");
    return paramPair.first;
  }
  
  public final Object OooO0oO(Pair paramPair)
  {
    Intrinsics.OooO0o(paramPair, "<this>");
    return paramPair.second;
  }
  
  public final SplitInfo OooO0oo(androidx.window.extensions.embedding.SplitInfo paramSplitInfo)
  {
    Object localObject1 = paramSplitInfo.getPrimaryActivityStack();
    Intrinsics.OooO0o0(localObject1, "splitInfo.primaryActivityStack");
    boolean bool1 = false;
    boolean bool2;
    try
    {
      bool2 = ((androidx.window.extensions.embedding.ActivityStack)localObject1).isEmpty();
    }
    catch (NoSuchMethodError localNoSuchMethodError1)
    {
      bool2 = false;
      localObject2 = null;
    }
    ActivityStack localActivityStack = new androidx/window/embedding/ActivityStack;
    localObject1 = ((androidx.window.extensions.embedding.ActivityStack)localObject1).getActivities();
    String str = "primaryActivityStack.activities";
    Intrinsics.OooO0o0(localObject1, str);
    localActivityStack.<init>((List)localObject1, bool2);
    localObject1 = paramSplitInfo.getSecondaryActivityStack();
    Object localObject2 = "splitInfo.secondaryActivityStack";
    Intrinsics.OooO0o0(localObject1, (String)localObject2);
    try
    {
      bool1 = ((androidx.window.extensions.embedding.ActivityStack)localObject1).isEmpty();
    }
    catch (NoSuchMethodError localNoSuchMethodError2)
    {
      label77:
      float f;
      break label77;
    }
    localObject2 = new androidx/window/embedding/ActivityStack;
    localObject1 = ((androidx.window.extensions.embedding.ActivityStack)localObject1).getActivities();
    Intrinsics.OooO0o0(localObject1, "secondaryActivityStack.activities");
    ((ActivityStack)localObject2).<init>((List)localObject1, bool1);
    localObject1 = new androidx/window/embedding/SplitInfo;
    f = paramSplitInfo.getSplitRatio();
    ((SplitInfo)localObject1).<init>(localActivityStack, (ActivityStack)localObject2, f);
    return localObject1;
  }
  
  public final Set OooOO0(Set paramSet)
  {
    Intrinsics.OooO0o(paramSet, "rules");
    ArrayList localArrayList = new java/util/ArrayList;
    float f = 1.401299E-044F;
    int i = CollectionsKt.OooOOo0(paramSet, 10);
    localArrayList.<init>(i);
    paramSet = paramSet.iterator();
    for (;;)
    {
      boolean bool1 = paramSet.hasNext();
      if (!bool1) {
        break label493;
      }
      Object localObject1 = (EmbeddingRule)paramSet.next();
      boolean bool2 = localObject1 instanceof SplitPairRule;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      boolean bool3;
      if (bool2)
      {
        localObject2 = new androidx/window/extensions/embedding/SplitPairRule$Builder;
        localObject3 = localObject1;
        localObject3 = (SplitPairRule)localObject1;
        localObject4 = ((SplitPairRule)localObject3).getFilters();
        localObject4 = OooOOO0((Set)localObject4);
        localObject5 = ((SplitPairRule)localObject3).getFilters();
        localObject5 = OooOO0O((Set)localObject5);
        localObject1 = (SplitRule)localObject1;
        localObject1 = OooOOoo((SplitRule)localObject1);
        ((SplitPairRule.Builder)localObject2).<init>((Predicate)localObject4, (Predicate)localObject5, (Predicate)localObject1);
        f = ((SplitRule)localObject3).getSplitRatio();
        localObject1 = ((SplitPairRule.Builder)localObject2).setSplitRatio(f);
        int j = ((SplitRule)localObject3).getLayoutDirection();
        localObject1 = ((SplitPairRule.Builder)localObject1).setLayoutDirection(j);
        bool3 = ((SplitPairRule)localObject3).getFinishPrimaryWithSecondary();
        localObject1 = ((SplitPairRule.Builder)localObject1).setShouldFinishPrimaryWithSecondary(bool3);
        bool3 = ((SplitPairRule)localObject3).getFinishSecondaryWithPrimary();
        localObject1 = ((SplitPairRule.Builder)localObject1).setShouldFinishSecondaryWithPrimary(bool3);
        bool3 = ((SplitPairRule)localObject3).getClearTop();
        localObject1 = ((SplitPairRule.Builder)localObject1).setShouldClearTop(bool3).build();
        localObject2 = "SplitPairRuleBuilder(\n  …                 .build()";
      }
      for (;;)
      {
        Intrinsics.OooO0o0(localObject1, (String)localObject2);
        localObject1 = (androidx.window.extensions.embedding.EmbeddingRule)localObject1;
        break;
        bool3 = localObject1 instanceof SplitPlaceholderRule;
        if (bool3)
        {
          localObject2 = new androidx/window/extensions/embedding/SplitPlaceholderRule$Builder;
          localObject3 = localObject1;
          localObject3 = (SplitPlaceholderRule)localObject1;
          localObject4 = ((SplitPlaceholderRule)localObject3).getPlaceholderIntent();
          localObject5 = ((SplitPlaceholderRule)localObject3).getFilters();
          localObject5 = OooOOOO((Set)localObject5);
          Object localObject6 = ((SplitPlaceholderRule)localObject3).getFilters();
          localObject6 = OooOOo0((Set)localObject6);
          localObject1 = (SplitRule)localObject1;
          localObject1 = OooOOoo((SplitRule)localObject1);
          ((SplitPlaceholderRule.Builder)localObject2).<init>((Intent)localObject4, (Predicate)localObject5, (Predicate)localObject6, (Predicate)localObject1);
          f = ((SplitRule)localObject3).getSplitRatio();
          localObject1 = ((SplitPlaceholderRule.Builder)localObject2).setSplitRatio(f);
          int k = ((SplitRule)localObject3).getLayoutDirection();
          localObject1 = ((SplitPlaceholderRule.Builder)localObject1).setLayoutDirection(k).build();
          localObject2 = "SplitPlaceholderRuleBuil…                 .build()";
        }
        else
        {
          boolean bool4 = localObject1 instanceof ActivityRule;
          if (!bool4) {
            break label480;
          }
          localObject2 = new androidx/window/extensions/embedding/ActivityRule$Builder;
          localObject1 = (ActivityRule)localObject1;
          localObject3 = ((ActivityRule)localObject1).getFilters();
          localObject3 = OooOOOO((Set)localObject3);
          localObject4 = ((ActivityRule)localObject1).getFilters();
          localObject4 = OooOOo0((Set)localObject4);
          ((ActivityRule.Builder)localObject2).<init>((Predicate)localObject3, (Predicate)localObject4);
          bool1 = ((ActivityRule)localObject1).getAlwaysExpand();
          localObject1 = ((ActivityRule.Builder)localObject2).setShouldAlwaysExpand(bool1).build();
          localObject2 = "ActivityRuleBuilder(\n   …                 .build()";
        }
      }
      localArrayList.add(localObject1);
    }
    label480:
    paramSet = new java/lang/IllegalArgumentException;
    paramSet.<init>("Unsupported rule type");
    throw paramSet;
    label493:
    return CollectionsKt.o00O0O(localArrayList);
  }
  
  public final Predicate OooOO0O(Set paramSet)
  {
    Intrinsics.OooO0o(paramSet, "splitPairFilters");
    OooO00o localOooO00o = new androidx/window/embedding/OooO00o;
    localOooO00o.<init>(this, paramSet);
    return localOooO00o;
  }
  
  public final Predicate OooOOO0(Set paramSet)
  {
    Intrinsics.OooO0o(paramSet, "splitPairFilters");
    OooO localOooO = new androidx/window/embedding/OooO;
    localOooO.<init>(this, paramSet);
    return localOooO;
  }
  
  public final Predicate OooOOOO(Set paramSet)
  {
    Intrinsics.OooO0o(paramSet, "activityFilters");
    OooO0O0 localOooO0O0 = new androidx/window/embedding/OooO0O0;
    localOooO0O0.<init>(paramSet);
    return localOooO0O0;
  }
  
  public final Predicate OooOOo0(Set paramSet)
  {
    Intrinsics.OooO0o(paramSet, "activityFilters");
    OooO0o localOooO0o = new androidx/window/embedding/OooO0o;
    localOooO0o.<init>(paramSet);
    return localOooO0o;
  }
  
  public final Predicate OooOOoo(SplitRule paramSplitRule)
  {
    Intrinsics.OooO0o(paramSplitRule, "splitRule");
    OooO0OO localOooO0OO = new androidx/window/embedding/OooO0OO;
    localOooO0OO.<init>(paramSplitRule);
    return localOooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.EmbeddingAdapter
 * JD-Core Version:    0.7.0.1
 */