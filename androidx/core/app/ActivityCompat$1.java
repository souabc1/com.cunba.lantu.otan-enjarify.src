package androidx.core.app;

import android.content.Context;
import android.content.pm.PackageManager;

class ActivityCompat$1
  implements Runnable
{
  public void run()
  {
    int i = this.o00OoOoo.length;
    int[] arrayOfInt = new int[i];
    Object localObject = this.o00Ooo00.getPackageManager();
    String str1 = this.o00Ooo00.getPackageName();
    String[] arrayOfString = this.o00OoOoo;
    int j = arrayOfString.length;
    int k = 0;
    while (k < j)
    {
      String str2 = this.o00OoOoo[k];
      int m = ((PackageManager)localObject).checkPermission(str2, str1);
      arrayOfInt[k] = m;
      k += 1;
    }
    localObject = (ActivityCompat.OnRequestPermissionsResultCallback)this.o00Ooo00;
    int n = this.o00Ooo0;
    arrayOfString = this.o00OoOoo;
    ((ActivityCompat.OnRequestPermissionsResultCallback)localObject).onRequestPermissionsResult(n, arrayOfString, arrayOfInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityCompat.1
 * JD-Core Version:    0.7.0.1
 */