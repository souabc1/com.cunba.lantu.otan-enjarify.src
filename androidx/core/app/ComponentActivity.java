package androidx.core.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.BuildCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;

public class ComponentActivity
  extends Activity
  implements LifecycleOwner, KeyEventDispatcher.Component
{
  public SimpleArrayMap o00OoOoo;
  public LifecycleRegistry o00Ooo00;
  
  public ComponentActivity()
  {
    Object localObject = new androidx/collection/SimpleArrayMap;
    ((SimpleArrayMap)localObject).<init>();
    this.o00OoOoo = ((SimpleArrayMap)localObject);
    localObject = new androidx/lifecycle/LifecycleRegistry;
    ((LifecycleRegistry)localObject).<init>(this);
    this.o00Ooo00 = ((LifecycleRegistry)localObject);
  }
  
  public static boolean OooOo0O(String[] paramArrayOfString)
  {
    boolean bool1 = false;
    if (paramArrayOfString != null)
    {
      int i = paramArrayOfString.length;
      if (i > 0)
      {
        paramArrayOfString = paramArrayOfString[0];
        paramArrayOfString.hashCode();
        i = paramArrayOfString.hashCode();
        int j = 1;
        int k = -1;
        String str;
        boolean bool2;
        switch (i)
        {
        default: 
          break;
        case 1455016274: 
          str = "--autofill";
          bool2 = paramArrayOfString.equals(str);
          if (bool2) {
            k = 4;
          }
          break;
        case 1159329357: 
          str = "--contentcapture";
          bool2 = paramArrayOfString.equals(str);
          if (bool2) {
            k = 3;
          }
          break;
        case 472614934: 
          str = "--list-dumpables";
          bool2 = paramArrayOfString.equals(str);
          if (bool2) {
            k = 2;
          }
          break;
        case 100470631: 
          str = "--dump-dumpable";
          bool2 = paramArrayOfString.equals(str);
          if (bool2) {
            k = j;
          }
          break;
        case -645125871: 
          str = "--translation";
          bool2 = paramArrayOfString.equals(str);
          if (bool2) {
            k = 0;
          }
          break;
        }
        int m;
        switch (k)
        {
        default: 
          break;
        case 4: 
          return j;
        case 3: 
          m = Build.VERSION.SDK_INT;
          i = 29;
          if (m >= i) {
            bool1 = j;
          }
          return bool1;
        case 1: 
        case 2: 
          return BuildCompat.isAtLeastT();
        case 0: 
          m = Build.VERSION.SDK_INT;
          i = 31;
          if (m >= i) {
            bool1 = j;
          }
          break;
        }
      }
    }
    return bool1;
  }
  
  public boolean OooOOO(KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final boolean OooOo0(String[] paramArrayOfString)
  {
    return OooOo0O(paramArrayOfString) ^ true;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    if (localView != null)
    {
      boolean bool = KeyEventDispatcher.OooO00o(localView, paramKeyEvent);
      if (bool) {
        return true;
      }
    }
    return KeyEventDispatcher.OooO0O0(this, localView, this, paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    if (localView != null)
    {
      boolean bool = KeyEventDispatcher.OooO00o(localView, paramKeyEvent);
      if (bool) {
        return true;
      }
    }
    return super.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public Lifecycle getLifecycle()
  {
    return this.o00Ooo00;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ReportFragment.OooO0o0(this);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    LifecycleRegistry localLifecycleRegistry = this.o00Ooo00;
    Lifecycle.State localState = Lifecycle.State.o00Ooo0;
    localLifecycleRegistry.OooO0oo(localState);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ComponentActivity
 * JD-Core Version:    0.7.0.1
 */