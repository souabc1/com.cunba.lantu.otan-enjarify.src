package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;

public final class TaskStackBuilder
  implements Iterable
{
  public final ArrayList o00OoOoo;
  public final Context o00Ooo00;
  
  public TaskStackBuilder(Context paramContext)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o00OoOoo = localArrayList;
    this.o00Ooo00 = paramContext;
  }
  
  public static TaskStackBuilder OooO0o0(Context paramContext)
  {
    TaskStackBuilder localTaskStackBuilder = new androidx/core/app/TaskStackBuilder;
    localTaskStackBuilder.<init>(paramContext);
    return localTaskStackBuilder;
  }
  
  public TaskStackBuilder OooO00o(Intent paramIntent)
  {
    this.o00OoOoo.add(paramIntent);
    return this;
  }
  
  public TaskStackBuilder OooO0O0(Intent paramIntent)
  {
    Object localObject = paramIntent.getComponent();
    if (localObject == null)
    {
      localObject = this.o00Ooo00.getPackageManager();
      localObject = paramIntent.resolveActivity((PackageManager)localObject);
    }
    if (localObject != null) {
      OooO0Oo((ComponentName)localObject);
    }
    OooO00o(paramIntent);
    return this;
  }
  
  public TaskStackBuilder OooO0OO(Activity paramActivity)
  {
    boolean bool = paramActivity instanceof TaskStackBuilder.SupportParentable;
    Object localObject;
    if (bool)
    {
      localObject = paramActivity;
      localObject = ((TaskStackBuilder.SupportParentable)paramActivity).getSupportParentActivityIntent();
    }
    else
    {
      bool = false;
      localObject = null;
    }
    if (localObject == null) {
      localObject = NavUtils.OooO00o((Activity)paramActivity);
    }
    if (localObject != null)
    {
      paramActivity = ((Intent)localObject).getComponent();
      if (paramActivity == null)
      {
        paramActivity = this.o00Ooo00.getPackageManager();
        paramActivity = ((Intent)localObject).resolveActivity(paramActivity);
      }
      OooO0Oo(paramActivity);
      OooO00o((Intent)localObject);
    }
    return this;
  }
  
  public TaskStackBuilder OooO0Oo(ComponentName paramComponentName)
  {
    Object localObject1 = this.o00OoOoo;
    int i = ((ArrayList)localObject1).size();
    try
    {
      Object localObject2 = this.o00Ooo00;
      for (;;)
      {
        paramComponentName = NavUtils.OooO0O0((Context)localObject2, paramComponentName);
        if (paramComponentName == null) {
          break;
        }
        localObject2 = this.o00OoOoo;
        ((ArrayList)localObject2).add(i, paramComponentName);
        localObject2 = this.o00Ooo00;
        paramComponentName = paramComponentName.getComponent();
      }
      return this;
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>(paramComponentName);
      throw ((Throwable)localObject1);
    }
  }
  
  public Intent OooO0o(int paramInt)
  {
    return (Intent)this.o00OoOoo.get(paramInt);
  }
  
  public void OooO0oO()
  {
    OooO0oo(null);
  }
  
  public void OooO0oo(Bundle paramBundle)
  {
    Object localObject1 = this.o00OoOoo;
    boolean bool1 = ((ArrayList)localObject1).isEmpty();
    if (!bool1)
    {
      localObject1 = this.o00OoOoo;
      int j = 0;
      Object localObject2 = new Intent[0];
      localObject1 = (Intent[])((ArrayList)localObject1).toArray((Object[])localObject2);
      localObject2 = new android/content/Intent;
      Intent localIntent = localObject1[0];
      ((Intent)localObject2).<init>(localIntent);
      int k = 268484608;
      localObject2 = ((Intent)localObject2).addFlags(k);
      localObject1[0] = localObject2;
      Context localContext = this.o00Ooo00;
      boolean bool2 = ContextCompat.OooOO0O(localContext, (Intent[])localObject1, paramBundle);
      if (!bool2)
      {
        paramBundle = new android/content/Intent;
        j = localObject1.length + -1;
        localObject1 = localObject1[j];
        paramBundle.<init>((Intent)localObject1);
        int i = 268435456;
        paramBundle.addFlags(i);
        localObject1 = this.o00Ooo00;
        ((Context)localObject1).startActivity(paramBundle);
      }
      return;
    }
    paramBundle = new java/lang/IllegalStateException;
    paramBundle.<init>("No intents added to TaskStackBuilder; cannot startActivities");
    throw paramBundle;
  }
  
  public Intent getIntent(int paramInt)
  {
    return OooO0o(paramInt);
  }
  
  public int getIntentCount()
  {
    return this.o00OoOoo.size();
  }
  
  public Intent[] getIntents()
  {
    ArrayList localArrayList = this.o00OoOoo;
    int i = localArrayList.size();
    Intent[] arrayOfIntent = new Intent[i];
    if (i == 0) {
      return arrayOfIntent;
    }
    Intent localIntent1 = new android/content/Intent;
    Object localObject = this.o00OoOoo;
    Intent localIntent2 = null;
    localObject = (Intent)((ArrayList)localObject).get(0);
    localIntent1.<init>((Intent)localObject);
    int j = 268484608;
    localIntent1 = localIntent1.addFlags(j);
    arrayOfIntent[0] = localIntent1;
    int k = 1;
    while (k < i)
    {
      localObject = new android/content/Intent;
      localIntent2 = (Intent)this.o00OoOoo.get(k);
      ((Intent)localObject).<init>(localIntent2);
      arrayOfIntent[k] = localObject;
      k += 1;
    }
    return arrayOfIntent;
  }
  
  public Iterator iterator()
  {
    return this.o00OoOoo.iterator();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.TaskStackBuilder
 * JD-Core Version:    0.7.0.1
 */