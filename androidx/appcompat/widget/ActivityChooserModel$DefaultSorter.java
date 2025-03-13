package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ActivityChooserModel$DefaultSorter
  implements ActivityChooserModel.ActivitySorter
{
  public final Map OooO00o;
  
  public ActivityChooserModel$DefaultSorter()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO00o = localHashMap;
  }
  
  public void OooO00o(Intent paramIntent, List paramList1, List paramList2)
  {
    paramIntent = this.OooO00o;
    paramIntent.clear();
    int i = paramList1.size();
    int j = 0;
    float f1 = 0.0F;
    Object localObject1;
    Object localObject2;
    while (j < i)
    {
      localObject1 = (ActivityChooserModel.ActivityResolveInfo)paramList1.get(j);
      ((ActivityChooserModel.ActivityResolveInfo)localObject1).o00Ooo00 = 0.0F;
      localObject2 = new android/content/ComponentName;
      Object localObject3 = ((ActivityChooserModel.ActivityResolveInfo)localObject1).o00OoOoo.activityInfo;
      String str = ((ActivityInfo)localObject3).packageName;
      localObject3 = ((ActivityInfo)localObject3).name;
      ((ComponentName)localObject2).<init>(str, (String)localObject3);
      paramIntent.put(localObject2, localObject1);
      j += 1;
    }
    i = paramList2.size() + -1;
    j = 1065353216;
    f1 = 1.0F;
    while (i >= 0)
    {
      localObject1 = (ActivityChooserModel.HistoricalRecord)paramList2.get(i);
      localObject2 = ((ActivityChooserModel.HistoricalRecord)localObject1).OooO00o;
      localObject2 = (ActivityChooserModel.ActivityResolveInfo)paramIntent.get(localObject2);
      if (localObject2 != null)
      {
        float f2 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).o00Ooo00;
        float f3 = ((ActivityChooserModel.HistoricalRecord)localObject1).OooO0OO * f1;
        f2 += f3;
        ((ActivityChooserModel.ActivityResolveInfo)localObject2).o00Ooo00 = f2;
        f3 = 0.95F;
        f1 *= f3;
      }
      i += -1;
    }
    Collections.sort(paramList1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserModel.DefaultSorter
 * JD-Core Version:    0.7.0.1
 */