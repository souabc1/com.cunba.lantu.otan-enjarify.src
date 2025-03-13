package androidx.profileinstaller;

import android.content.Context;
import java.io.File;

class BenchmarkOperation
{
  public static boolean OooO00o(File paramFile)
  {
    boolean bool1 = paramFile.isDirectory();
    boolean bool2 = true;
    if (bool1)
    {
      paramFile = paramFile.listFiles();
      bool1 = false;
      if (paramFile == null) {
        return false;
      }
      int i = paramFile.length;
      int j = 0;
      boolean bool3 = bool2;
      while (j < i)
      {
        File localFile = paramFile[j];
        boolean bool4 = OooO00o(localFile);
        if ((bool4) && (bool3)) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }
        j += 1;
      }
      return bool3;
    }
    paramFile.delete();
    return bool2;
  }
  
  public static void OooO0O0(Context paramContext, ProfileInstallReceiver.ResultDiagnostics paramResultDiagnostics)
  {
    paramContext = BenchmarkOperation.Api24ContextHelper.OooO00o(paramContext);
    boolean bool = OooO00o(paramContext);
    int i;
    if (bool) {
      i = 14;
    } else {
      i = 15;
    }
    paramResultDiagnostics.OooO0O0(i, null);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.BenchmarkOperation
 * JD-Core Version:    0.7.0.1
 */