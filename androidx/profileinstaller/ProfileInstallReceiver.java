package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Process;

public class ProfileInstallReceiver
  extends BroadcastReceiver
{
  public static void OooO00o(ProfileInstaller.DiagnosticsCallback paramDiagnosticsCallback)
  {
    Process.sendSignal(Process.myPid(), 10);
    paramDiagnosticsCallback.OooO0O0(12, null);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    Object localObject = paramIntent.getAction();
    String str = "androidx.profileinstaller.action.INSTALL_PROFILE";
    boolean bool1 = str.equals(localObject);
    if (bool1)
    {
      paramIntent = new androidx/profileinstaller/OooO0O0;
      paramIntent.<init>();
      localObject = new androidx/profileinstaller/ProfileInstallReceiver$ResultDiagnostics;
      ((ProfileInstallReceiver.ResultDiagnostics)localObject).<init>(this);
      bool1 = true;
      ProfileInstaller.OooOO0O(paramContext, paramIntent, (ProfileInstaller.DiagnosticsCallback)localObject, bool1);
    }
    else
    {
      str = "androidx.profileinstaller.action.SKIP_FILE";
      bool1 = str.equals(localObject);
      boolean bool2;
      boolean bool3;
      if (bool1)
      {
        paramIntent = paramIntent.getExtras();
        if (paramIntent != null)
        {
          paramIntent = paramIntent.getString("EXTRA_SKIP_FILE_OPERATION");
          localObject = "WRITE_SKIP_FILE";
          bool2 = ((String)localObject).equals(paramIntent);
          if (bool2)
          {
            paramIntent = new androidx/profileinstaller/OooO0O0;
            paramIntent.<init>();
            localObject = new androidx/profileinstaller/ProfileInstallReceiver$ResultDiagnostics;
            ((ProfileInstallReceiver.ResultDiagnostics)localObject).<init>(this);
            ProfileInstaller.OooOO0o(paramContext, paramIntent, (ProfileInstaller.DiagnosticsCallback)localObject);
          }
          else
          {
            localObject = "DELETE_SKIP_FILE";
            bool3 = ((String)localObject).equals(paramIntent);
            if (bool3)
            {
              paramIntent = new androidx/profileinstaller/OooO0O0;
              paramIntent.<init>();
              localObject = new androidx/profileinstaller/ProfileInstallReceiver$ResultDiagnostics;
              ((ProfileInstallReceiver.ResultDiagnostics)localObject).<init>(this);
              ProfileInstaller.OooO0OO(paramContext, paramIntent, (ProfileInstaller.DiagnosticsCallback)localObject);
            }
          }
        }
      }
      else
      {
        str = "androidx.profileinstaller.action.SAVE_PROFILE";
        bool1 = str.equals(localObject);
        if (bool1)
        {
          paramContext = new androidx/profileinstaller/ProfileInstallReceiver$ResultDiagnostics;
          paramContext.<init>(this);
          OooO00o(paramContext);
        }
        else
        {
          str = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
          bool2 = str.equals(localObject);
          if (bool2)
          {
            paramIntent = paramIntent.getExtras();
            if (paramIntent != null)
            {
              paramIntent = paramIntent.getString("EXTRA_BENCHMARK_OPERATION");
              localObject = new androidx/profileinstaller/ProfileInstallReceiver$ResultDiagnostics;
              ((ProfileInstallReceiver.ResultDiagnostics)localObject).<init>(this);
              str = "DROP_SHADER_CACHE";
              bool3 = str.equals(paramIntent);
              if (bool3)
              {
                BenchmarkOperation.OooO0O0(paramContext, (ProfileInstallReceiver.ResultDiagnostics)localObject);
              }
              else
              {
                int i = 16;
                bool3 = false;
                paramIntent = null;
                ((ProfileInstallReceiver.ResultDiagnostics)localObject).OooO0O0(i, null);
              }
            }
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.ProfileInstallReceiver
 * JD-Core Version:    0.7.0.1
 */