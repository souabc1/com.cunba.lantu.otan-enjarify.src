package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

public class ActivityNavigator
  extends Navigator
{
  public static final ActivityNavigator.Companion OooO0o0;
  public final Context OooO0OO;
  public final Activity OooO0Oo;
  
  static
  {
    ActivityNavigator.Companion localCompanion = new androidx/navigation/ActivityNavigator$Companion;
    localCompanion.<init>(null);
    OooO0o0 = localCompanion;
  }
  
  public ActivityNavigator(Context paramContext)
  {
    this.OooO0OO = paramContext;
    Object localObject1 = ActivityNavigator.hostActivity.1.o00OoOoo;
    paramContext = SequencesKt.OooO0o(paramContext, (Function1)localObject1).iterator();
    boolean bool2;
    do
    {
      bool1 = paramContext.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = paramContext.next();
      Object localObject2 = localObject1;
      localObject2 = (Context)localObject1;
      bool2 = localObject2 instanceof Activity;
    } while (!bool2);
    break label76;
    boolean bool1 = false;
    localObject1 = null;
    label76:
    localObject1 = (Activity)localObject1;
    this.OooO0Oo = ((Activity)localObject1);
  }
  
  public boolean OooO()
  {
    Activity localActivity = this.OooO0Oo;
    if (localActivity != null)
    {
      localActivity.finish();
      return true;
    }
    return false;
  }
  
  public ActivityNavigator.Destination OooOO0()
  {
    ActivityNavigator.Destination localDestination = new androidx/navigation/ActivityNavigator$Destination;
    localDestination.<init>(this);
    return localDestination;
  }
  
  public NavDestination OooOO0O(ActivityNavigator.Destination paramDestination, Bundle paramBundle, NavOptions paramNavOptions, Navigator.Extras paramExtras)
  {
    Intrinsics.OooO0o(paramDestination, "destination");
    Object localObject1 = paramDestination.getIntent();
    if (localObject1 != null)
    {
      localObject1 = new android/content/Intent;
      Intent localIntent = paramDestination.getIntent();
      ((Intent)localObject1).<init>(localIntent);
      localIntent = null;
      int j;
      Object localObject3;
      label93:
      boolean bool1;
      Object localObject4;
      String str1;
      if (paramBundle != null)
      {
        ((Intent)localObject1).putExtras(paramBundle);
        localObject2 = paramDestination.getDataPattern();
        int i = 1;
        if (localObject2 != null)
        {
          j = ((CharSequence)localObject2).length();
          if (j != 0)
          {
            j = 0;
            localObject3 = null;
            break label93;
          }
        }
        j = i;
        if (j == 0)
        {
          localObject3 = new java/lang/StringBuffer;
          ((StringBuffer)localObject3).<init>();
          Matcher localMatcher = Pattern.compile("\\{(.+?)\\}").matcher((CharSequence)localObject2);
          for (;;)
          {
            bool1 = localMatcher.find();
            if (!bool1) {
              break label258;
            }
            localObject4 = localMatcher.group(i);
            boolean bool2 = paramBundle.containsKey((String)localObject4);
            if (!bool2) {
              break;
            }
            str1 = "";
            localMatcher.appendReplacement((StringBuffer)localObject3, str1);
            localObject4 = Uri.encode(String.valueOf(paramBundle.get((String)localObject4)));
            ((StringBuffer)localObject3).append((String)localObject4);
          }
          paramDestination = new java/lang/IllegalArgumentException;
          paramNavOptions = new java/lang/StringBuilder;
          paramNavOptions.<init>();
          paramNavOptions.append("Could not find ");
          paramNavOptions.append((String)localObject4);
          paramNavOptions.append(" in ");
          paramNavOptions.append(paramBundle);
          paramNavOptions.append(" to fill data pattern ");
          paramNavOptions.append((String)localObject2);
          paramBundle = paramNavOptions.toString();
          paramDestination.<init>(paramBundle);
          throw paramDestination;
          label258:
          localMatcher.appendTail((StringBuffer)localObject3);
          paramBundle = Uri.parse(((StringBuffer)localObject3).toString());
          ((Intent)localObject1).setData(paramBundle);
        }
      }
      boolean bool3 = paramExtras instanceof ActivityNavigator.Extras;
      int m;
      if (bool3)
      {
        localObject2 = paramExtras;
        localObject2 = (ActivityNavigator.Extras)paramExtras;
        m = ((ActivityNavigator.Extras)localObject2).getFlags();
        ((Intent)localObject1).addFlags(m);
      }
      Object localObject2 = this.OooO0Oo;
      if (localObject2 == null)
      {
        m = 268435456;
        ((Intent)localObject1).addFlags(m);
      }
      if (paramNavOptions != null)
      {
        boolean bool4 = paramNavOptions.OooO00o();
        if (bool4)
        {
          n = 536870912;
          ((Intent)localObject1).addFlags(n);
        }
      }
      localObject2 = this.OooO0Oo;
      String str2 = "android-support-navigation:ActivityNavigator:current";
      if (localObject2 != null)
      {
        localObject2 = ((Activity)localObject2).getIntent();
        if (localObject2 != null)
        {
          n = ((Intent)localObject2).getIntExtra(str2, 0);
          if (n != 0)
          {
            localObject3 = "android-support-navigation:ActivityNavigator:source";
            ((Intent)localObject1).putExtra((String)localObject3, n);
          }
        }
      }
      int n = paramDestination.getId();
      ((Intent)localObject1).putExtra(str2, n);
      localObject2 = this.OooO0OO.getResources();
      str2 = "animator";
      if (paramNavOptions != null)
      {
        j = paramNavOptions.getPopEnterAnim();
        int i1 = paramNavOptions.getPopExitAnim();
        if (j > 0)
        {
          localObject4 = ((Resources)localObject2).getResourceTypeName(j);
          bool1 = Intrinsics.OooO00o(localObject4, str2);
          if (bool1) {}
        }
        else
        {
          if (i1 <= 0) {
            break label616;
          }
          localObject4 = ((Resources)localObject2).getResourceTypeName(i1);
          bool1 = Intrinsics.OooO00o(localObject4, str2);
          if (!bool1) {
            break label616;
          }
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        str1 = "Activity destinations do not support Animator resource. Ignoring popEnter resource ";
        ((StringBuilder)localObject4).append(str1);
        localObject3 = ((Resources)localObject2).getResourceName(j);
        ((StringBuilder)localObject4).append((String)localObject3);
        ((StringBuilder)localObject4).append(" and popExit resource ");
        localObject3 = ((Resources)localObject2).getResourceName(i1);
        ((StringBuilder)localObject4).append((String)localObject3);
        localObject3 = " when launching ";
        ((StringBuilder)localObject4).append((String)localObject3);
        ((StringBuilder)localObject4).append(paramDestination);
        break label646;
        label616:
        localObject4 = "android-support-navigation:ActivityNavigator:popEnterAnim";
        ((Intent)localObject1).putExtra((String)localObject4, j);
        localObject3 = "android-support-navigation:ActivityNavigator:popExitAnim";
        ((Intent)localObject1).putExtra((String)localObject3, i1);
      }
      label646:
      if (bool3)
      {
        paramExtras = (ActivityNavigator.Extras)paramExtras;
        paramBundle = paramExtras.getActivityOptions();
        if (paramBundle != null)
        {
          paramExtras = this.OooO0OO;
          paramBundle = paramBundle.OooO00o();
          ContextCompat.OooOO0o(paramExtras, (Intent)localObject1, paramBundle);
          break label701;
        }
      }
      paramBundle = this.OooO0OO;
      paramBundle.startActivity((Intent)localObject1);
      label701:
      if (paramNavOptions != null)
      {
        paramBundle = this.OooO0Oo;
        if (paramBundle != null)
        {
          int k = paramNavOptions.getEnterAnim();
          int i2 = paramNavOptions.getExitAnim();
          boolean bool5;
          if (k > 0)
          {
            paramExtras = ((Resources)localObject2).getResourceTypeName(k);
            bool5 = Intrinsics.OooO00o(paramExtras, str2);
            if (bool5) {}
          }
          else
          {
            if (i2 <= 0) {
              break label865;
            }
            paramExtras = ((Resources)localObject2).getResourceTypeName(i2);
            bool5 = Intrinsics.OooO00o(paramExtras, str2);
            if (!bool5) {
              break label865;
            }
          }
          paramExtras = new java/lang/StringBuilder;
          paramExtras.<init>();
          localObject1 = "Activity destinations do not support Animator resource. Ignoring enter resource ";
          paramExtras.append((String)localObject1);
          paramBundle = ((Resources)localObject2).getResourceName(k);
          paramExtras.append(paramBundle);
          paramExtras.append(" and exit resource ");
          paramBundle = ((Resources)localObject2).getResourceName(i2);
          paramExtras.append(paramBundle);
          paramBundle = "when launching ";
          paramExtras.append(paramBundle);
          paramExtras.append(paramDestination);
          break label904;
          label865:
          if ((k >= 0) || (i2 >= 0))
          {
            i3 = RangesKt.OooO00o(k, 0);
            k = RangesKt.OooO00o(i2, 0);
            paramNavOptions = this.OooO0Oo;
            paramNavOptions.overridePendingTransition(i3, k);
          }
        }
      }
      label904:
      return null;
    }
    paramBundle = new java/lang/StringBuilder;
    paramBundle.<init>();
    paramBundle.append("Destination ");
    int i3 = paramDestination.getId();
    paramBundle.append(i3);
    paramBundle.append(" does not have an Intent set.");
    paramDestination = paramBundle.toString();
    paramBundle = new java/lang/IllegalStateException;
    paramDestination = paramDestination.toString();
    paramBundle.<init>(paramDestination);
    throw paramBundle;
  }
  
  public final Context getContext()
  {
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.ActivityNavigator
 * JD-Core Version:    0.7.0.1
 */