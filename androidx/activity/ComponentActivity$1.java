package androidx.activity;

import android.text.TextUtils;

class ComponentActivity$1
  implements Runnable
{
  public ComponentActivity$1(ComponentActivity paramComponentActivity) {}
  
  public void run()
  {
    try
    {
      ComponentActivity localComponentActivity = this.o00OoOoo;
      ComponentActivity.OooOoO(localComponentActivity);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      String str1 = localIllegalStateException.getMessage();
      String str2 = "Can not perform this action after onSaveInstanceState";
      boolean bool = TextUtils.equals(str1, str2);
      if (!bool) {
        break label34;
      }
    }
    return;
    label34:
    throw localIllegalStateException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.ComponentActivity.1
 * JD-Core Version:    0.7.0.1
 */