package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class FragmentHostCallback
  extends FragmentContainer
{
  public final Activity o00OoOoo;
  public final Handler o00Ooo0;
  public final Context o00Ooo00;
  public final int o00Ooo0O;
  public final FragmentManager o00Ooo0o;
  
  public FragmentHostCallback(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt)
  {
    FragmentManagerImpl localFragmentManagerImpl = new androidx/fragment/app/FragmentManagerImpl;
    localFragmentManagerImpl.<init>();
    this.o00Ooo0o = localFragmentManagerImpl;
    this.o00OoOoo = paramActivity;
    paramActivity = (Context)Preconditions.OooO(paramContext, "context == null");
    this.o00Ooo00 = paramActivity;
    paramActivity = (Handler)Preconditions.OooO(paramHandler, "handler == null");
    this.o00Ooo0 = paramActivity;
    this.o00Ooo0O = paramInt;
  }
  
  public FragmentHostCallback(FragmentActivity paramFragmentActivity)
  {
    this(paramFragmentActivity, paramFragmentActivity, localHandler, 0);
  }
  
  public View OooO0OO(int paramInt)
  {
    return null;
  }
  
  public boolean OooO0o0()
  {
    return true;
  }
  
  public void OooO0oo(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public abstract Object OooOO0();
  
  public LayoutInflater OooOO0o()
  {
    return LayoutInflater.from(this.o00Ooo00);
  }
  
  public void OooOOO(Fragment paramFragment, String[] paramArrayOfString, int paramInt) {}
  
  public boolean OooOOOO(String paramString)
  {
    return false;
  }
  
  public void OooOOOo(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    int i = -1;
    if (paramInt == i)
    {
      ContextCompat.OooOO0o(this.o00Ooo00, paramIntent, paramBundle);
      return;
    }
    paramFragment = new java/lang/IllegalStateException;
    paramFragment.<init>("Starting activity with a requestCode requires a FragmentActivity host");
    throw paramFragment;
  }
  
  public void OooOOo(Fragment paramFragment, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    int i = -1;
    if (paramInt1 == i)
    {
      ActivityCompat.OooOo00(this.o00OoOoo, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Starting intent sender with a requestCode requires a FragmentActivity host");
    throw localIllegalStateException;
  }
  
  public void OooOOoo() {}
  
  Activity getActivity()
  {
    return this.o00OoOoo;
  }
  
  Context getContext()
  {
    return this.o00Ooo00;
  }
  
  public Handler getHandler()
  {
    return this.o00Ooo0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentHostCallback
 * JD-Core Version:    0.7.0.1
 */