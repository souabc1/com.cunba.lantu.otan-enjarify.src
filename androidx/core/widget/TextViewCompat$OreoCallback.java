package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TextViewCompat$OreoCallback
  implements ActionMode.Callback
{
  public final ActionMode.Callback OooO00o;
  public final TextView OooO0O0;
  public Class OooO0OO;
  public Method OooO0Oo;
  public boolean OooO0o;
  public boolean OooO0o0;
  
  public final Intent OooO00o()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    return localIntent.setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
  }
  
  public final Intent OooO0O0(ResolveInfo paramResolveInfo, TextView paramTextView)
  {
    Object localObject = OooO00o();
    boolean bool = OooO0Oo(paramTextView) ^ true;
    paramTextView = ((Intent)localObject).putExtra("android.intent.extra.PROCESS_TEXT_READONLY", bool);
    paramResolveInfo = paramResolveInfo.activityInfo;
    localObject = paramResolveInfo.packageName;
    paramResolveInfo = paramResolveInfo.name;
    return paramTextView.setClassName((String)localObject, paramResolveInfo);
  }
  
  public final List OooO0OO(Context paramContext, PackageManager paramPackageManager)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = paramContext instanceof Activity;
    if (!bool1) {
      return localArrayList;
    }
    Object localObject = OooO00o();
    boolean bool2 = false;
    paramPackageManager = paramPackageManager.queryIntentActivities((Intent)localObject, 0).iterator();
    for (;;)
    {
      bool1 = paramPackageManager.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (ResolveInfo)paramPackageManager.next();
      bool2 = OooO0o0((ResolveInfo)localObject, (Context)paramContext);
      if (bool2) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public final boolean OooO0Oo(TextView paramTextView)
  {
    boolean bool1 = paramTextView instanceof Editable;
    if (bool1)
    {
      bool1 = ((TextView)paramTextView).onCheckIsTextEditor();
      if (bool1)
      {
        bool2 = ((View)paramTextView).isEnabled();
        if (bool2) {
          return true;
        }
      }
    }
    boolean bool2 = false;
    paramTextView = null;
    return bool2;
  }
  
  public final void OooO0o(Menu paramMenu)
  {
    Object localObject1 = this.OooO0O0.getContext();
    PackageManager localPackageManager = ((Context)localObject1).getPackageManager();
    int i = this.OooO0o;
    Object localObject2 = "removeItemAt";
    int k = 1;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (i == 0)
    {
      this.OooO0o = k;
      localObject3 = "com.android.internal.view.menu.MenuBuilder";
      try
      {
        localObject3 = Class.forName((String)localObject3);
        this.OooO0OO = ((Class)localObject3);
        localObject4 = new Class[k];
        localObject5 = Integer.TYPE;
        localObject4[0] = localObject5;
        localObject3 = ((Class)localObject3).getDeclaredMethod((String)localObject2, (Class[])localObject4);
        this.OooO0Oo = ((Method)localObject3);
        this.OooO0o0 = k;
      }
      catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException)
      {
        i = 0;
        localObject3 = null;
        this.OooO0OO = null;
        this.OooO0Oo = null;
        this.OooO0o0 = false;
      }
    }
    try
    {
      i = this.OooO0o0;
      if (i != 0)
      {
        localObject3 = this.OooO0OO;
        i = ((Class)localObject3).isInstance(paramMenu);
        if (i != 0)
        {
          localObject3 = this.OooO0Oo;
          break label194;
        }
      }
      localObject3 = paramMenu.getClass();
      localObject4 = new Class[k];
      localObject5 = Integer.TYPE;
      localObject4[0] = localObject5;
      localObject3 = ((Class)localObject3).getDeclaredMethod((String)localObject2, (Class[])localObject4);
      label194:
      int m = paramMenu.size() - k;
      while (m >= 0)
      {
        localObject4 = paramMenu.getItem(m);
        localObject5 = ((MenuItem)localObject4).getIntent();
        if (localObject5 != null)
        {
          localObject5 = "android.intent.action.PROCESS_TEXT";
          localObject4 = ((MenuItem)localObject4).getIntent();
          localObject4 = ((Intent)localObject4).getAction();
          boolean bool = ((String)localObject5).equals(localObject4);
          if (bool)
          {
            localObject4 = new Object[k];
            localObject5 = Integer.valueOf(m);
            localObject4[0] = localObject5;
            ((Method)localObject3).invoke(paramMenu, (Object[])localObject4);
          }
        }
        m += -1;
      }
      localObject1 = OooO0OO((Context)localObject1, localPackageManager);
      i = 0;
      localObject3 = null;
      for (;;)
      {
        m = ((List)localObject1).size();
        if (i >= m) {
          break;
        }
        localObject2 = (ResolveInfo)((List)localObject1).get(i);
        int n = i + 100;
        localObject5 = ((ResolveInfo)localObject2).loadLabel(localPackageManager);
        localObject4 = paramMenu.add(0, 0, n, (CharSequence)localObject5);
        localObject5 = this.OooO0O0;
        localObject2 = OooO0O0((ResolveInfo)localObject2, (TextView)localObject5);
        localObject2 = ((MenuItem)localObject4).setIntent((Intent)localObject2);
        ((MenuItem)localObject2).setShowAsAction(k);
        int j;
        i += 1;
      }
      return;
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException) {}
  }
  
  public final boolean OooO0o0(ResolveInfo paramResolveInfo, Context paramContext)
  {
    String str1 = paramContext.getPackageName();
    String str2 = paramResolveInfo.activityInfo.packageName;
    boolean bool1 = str1.equals(str2);
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    paramResolveInfo = paramResolveInfo.activityInfo;
    bool1 = paramResolveInfo.exported;
    if (!bool1) {
      return false;
    }
    paramResolveInfo = paramResolveInfo.permission;
    if (paramResolveInfo != null)
    {
      int i = paramContext.checkSelfPermission(paramResolveInfo);
      if (i != 0)
      {
        bool2 = false;
        str2 = null;
      }
    }
    return bool2;
  }
  
  public ActionMode.Callback getWrappedCallback()
  {
    return this.OooO00o;
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return this.OooO00o.onActionItemClicked(paramActionMode, paramMenuItem);
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return this.OooO00o.onCreateActionMode(paramActionMode, paramMenu);
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode)
  {
    this.OooO00o.onDestroyActionMode(paramActionMode);
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    OooO0o(paramMenu);
    return this.OooO00o.onPrepareActionMode(paramActionMode, paramMenu);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TextViewCompat.OreoCallback
 * JD-Core Version:    0.7.0.1
 */