package androidx.profileinstaller;

import android.view.Choreographer;

class ProfileInstallerInitializer$Choreographer16Impl
{
  public static void OooO0OO(Runnable paramRunnable)
  {
    Choreographer localChoreographer = Choreographer.getInstance();
    OooOO0O localOooOO0O = new androidx/profileinstaller/OooOO0O;
    localOooOO0O.<init>(paramRunnable);
    localChoreographer.postFrameCallback(localOooOO0O);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.ProfileInstallerInitializer.Choreographer16Impl
 * JD-Core Version:    0.7.0.1
 */