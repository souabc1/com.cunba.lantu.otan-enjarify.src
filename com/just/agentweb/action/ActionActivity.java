package com.just.agentweb.action;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.just.agentweb.utils.AgentWebUtils;
import com.just.agentweb.utils.LogUtils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import m54207b69;

public final class ActionActivity
  extends Activity
{
  public static ActionActivity.RationaleListener o00Ooo0;
  public static ActionActivity.PermissionListener o00Ooo0O;
  public static ActionActivity.ChooserListener o00Ooo0o;
  public static final String o00OooO0 = "ActionActivity";
  public Action o00OoOoo;
  public Uri o00Ooo00;
  
  public static void OooO0oO(Activity paramActivity, Action paramAction)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramActivity, ActionActivity.class);
    String str = m54207b69.F54207b69_11("B>757C69648382707E7979");
    localIntent.putExtra(str, paramAction);
    paramActivity.startActivity(localIntent);
  }
  
  public static void setChooserListener(ActionActivity.ChooserListener paramChooserListener)
  {
    o00Ooo0o = paramChooserListener;
  }
  
  public static void setPermissionListener(ActionActivity.PermissionListener paramPermissionListener)
  {
    o00Ooo0O = paramPermissionListener;
  }
  
  public final void OooO00o()
  {
    o00Ooo0o = null;
    o00Ooo0O = null;
    o00Ooo0 = null;
  }
  
  public final void OooO0O0(int paramInt, Intent paramIntent)
  {
    ActionActivity.ChooserListener localChooserListener = o00Ooo0o;
    if (localChooserListener != null)
    {
      int i = 596;
      localChooserListener.OooO00o(i, paramInt, paramIntent);
      paramInt = 0;
      o00Ooo0o = null;
    }
    finish();
  }
  
  public final void OooO0OO(Action paramAction)
  {
    paramAction = o00Ooo0o;
    if (paramAction == null) {
      finish();
    }
    OooO0o();
  }
  
  public final void OooO0Oo(Action paramAction)
  {
    paramAction = paramAction.getPermissions();
    int i = AgentWebUtils.OooOo0O(paramAction);
    if (i != 0) {
      o00Ooo0O = null;
    }
    for (;;)
    {
      o00Ooo0 = null;
      finish();
      return;
      localObject = o00Ooo0;
      boolean bool = false;
      if (localObject == null) {
        break;
      }
      paramAction = paramAction.iterator();
      do
      {
        i = paramAction.hasNext();
        if (i == 0) {
          break;
        }
        localObject = (String)paramAction.next();
        bool = shouldShowRequestPermissionRationale((String)localObject);
      } while (!bool);
      paramAction = o00Ooo0;
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      paramAction.OooO00o(bool, (Bundle)localObject);
    }
    Object localObject = o00Ooo0O;
    if (localObject != null)
    {
      localObject = new String[0];
      paramAction = (String[])paramAction.toArray((Object[])localObject);
      i = 1;
      requestPermissions(paramAction, i);
    }
  }
  
  public final void OooO0o()
  {
    try
    {
      Object localObject1 = o00Ooo0o;
      if (localObject1 == null)
      {
        finish();
        return;
      }
      localObject1 = getIntent();
      str = "L}363926253F39373F2A473F3D3E3B463E3245453C4C483F";
      str = m54207b69.F54207b69_11(str);
      localObject1 = ((Intent)localObject1).getParcelableExtra(str);
      localObject1 = (Intent)localObject1;
      if (localObject1 == null)
      {
        OooO00o();
        return;
      }
      int i = 596;
      startActivityForResult((Intent)localObject1, i);
    }
    finally
    {
      String str = o00OooO0;
      LogUtils.OooO0OO(str, "找不到文件选择器");
      OooO0O0(-1, null);
      boolean bool = LogUtils.isDebug();
      if (bool) {
        localObject2.printStackTrace();
      }
    }
  }
  
  public final void OooO0o0()
  {
    boolean bool = false;
    int i = 596;
    try
    {
      Object localObject1 = o00Ooo0o;
      if (localObject1 == null) {
        finish();
      }
      localObject1 = AgentWebUtils.OooO0oO(this);
      if (localObject1 == null)
      {
        localObject3 = o00Ooo0o;
        ((ActionActivity.ChooserListener)localObject3).OooO00o(i, 0, null);
        o00Ooo0o = null;
        finish();
      }
      localObject1 = AgentWebUtils.OooOOOO(this, (File)localObject1);
      localObject3 = ".c0C1719161A1C";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      localObject3 = ((Intent)localObject1).getParcelableExtra((String)localObject3);
      localObject3 = (Uri)localObject3;
      this.o00Ooo00 = ((Uri)localObject3);
      startActivityForResult((Intent)localObject1, i);
    }
    finally
    {
      Object localObject3 = o00OooO0;
      String str = "找不到系统相机";
      LogUtils.OooO00o((String)localObject3, str);
      localObject3 = o00Ooo0o;
      if (localObject3 != null) {
        ((ActionActivity.ChooserListener)localObject3).OooO00o(i, 0, null);
      }
      o00Ooo0o = null;
      bool = LogUtils.isDebug();
      if (bool) {
        localObject2.printStackTrace();
      }
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 596;
    if (paramInt1 == i)
    {
      Object localObject = this.o00Ooo00;
      if (localObject != null)
      {
        localObject = new android/content/Intent;
        ((Intent)localObject).<init>();
        paramIntent = m54207b69.F54207b69_11("hx333E232A312F37");
        Uri localUri = this.o00Ooo00;
        paramIntent = ((Intent)localObject).putExtra(paramIntent, localUri);
      }
      OooO0O0(paramInt2, paramIntent);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      str1 = o00OooO0;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11(":64558425656845E4C4A6062605F72506652641E");
      localStringBuilder.append(str2);
      localStringBuilder.append(paramBundle);
      paramBundle = localStringBuilder.toString();
      LogUtils.OooO0OO(str1, paramBundle);
      return;
    }
    paramBundle = getIntent();
    String str1 = m54207b69.F54207b69_11("B>757C69648382707E7979");
    paramBundle = (Action)paramBundle.getParcelableExtra(str1);
    this.o00OoOoo = paramBundle;
    if (paramBundle == null)
    {
      OooO00o();
      finish();
      return;
    }
    int i = paramBundle.getAction();
    int j = 1;
    if (i == j)
    {
      paramBundle = this.o00OoOoo;
      OooO0Oo(paramBundle);
    }
    else
    {
      paramBundle = this.o00OoOoo;
      i = paramBundle.getAction();
      j = 3;
      if (i == j)
      {
        OooO0o0();
      }
      else
      {
        paramBundle = this.o00OoOoo;
        OooO0OO(paramBundle);
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    Object localObject = o00Ooo0O;
    if (localObject != null)
    {
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      int i = this.o00OoOoo.getFromIntention();
      String str = m54207b69.F54207b69_11("j?747B68637D727679687F7B76867E79858082");
      ((BaseBundle)localObject).putInt(str, i);
      ActionActivity.PermissionListener localPermissionListener = o00Ooo0O;
      localPermissionListener.OooO00o(paramArrayOfString, paramArrayOfInt, (Bundle)localObject);
    }
    o00Ooo0O = null;
    finish();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.action.ActionActivity
 * JD-Core Version:    0.7.0.1
 */