package com.qinggan.analytics.wbtech;

import android.app.Dialog;
import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import m54207b69;

class UpdateManager$6
  implements Runnable
{
  public UpdateManager$6(UpdateManager paramUpdateManager) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = new java/net/URL;
      Object localObject2 = this.o00OoOoo;
      localObject2 = UpdateManager.OooOO0((UpdateManager)localObject2);
      ((URL)localObject1).<init>((String)localObject2);
      localObject1 = ((URL)localObject1).openConnection();
      localObject1 = (HttpURLConnection)localObject1;
      ((URLConnection)localObject1).connect();
      int i = ((URLConnection)localObject1).getContentLength();
      localObject1 = ((URLConnection)localObject1).getInputStream();
      Object localObject3 = Environment.getExternalStorageState();
      Object localObject4 = "DZ37363137324444";
      localObject4 = m54207b69.F54207b69_11((String)localObject4);
      boolean bool1 = ((String)localObject3).equals(localObject4);
      if (!bool1)
      {
        localObject3 = this.o00OoOoo;
        localObject4 = UpdateManager.OooOO0O((UpdateManager)localObject3);
        UpdateManager.OooOO0o((UpdateManager)localObject3, (Context)localObject4);
      }
      localObject3 = this.o00OoOoo;
      localObject3 = UpdateManager.OooOOO0((UpdateManager)localObject3);
      localObject4 = new java/io/File;
      ((File)localObject4).<init>((String)localObject3);
      localObject3 = new java/io/FileOutputStream;
      ((FileOutputStream)localObject3).<init>((File)localObject4);
      int j = 1024;
      localObject4 = new byte[j];
      int k = 0;
      boolean bool2;
      do
      {
        int m = ((InputStream)localObject1).read((byte[])localObject4);
        k += m;
        float f1 = k;
        float f2 = i;
        f1 /= f2;
        int n = 1120403456;
        f2 = 100.0F;
        f1 *= f2;
        int i1 = (int)f1;
        UpdateManager.OooO0O0(i1);
        Object localObject5 = this.o00OoOoo;
        localObject5 = UpdateManager.OooO0Oo((UpdateManager)localObject5);
        n = 1;
        f2 = 1.4E-45F;
        ((Handler)localObject5).sendEmptyMessage(n);
        if (m <= 0)
        {
          localObject2 = UpdateManager.OooO0OO();
          ((Dialog)localObject2).dismiss();
          localObject2 = this.o00OoOoo;
          localObject2 = UpdateManager.OooO0Oo((UpdateManager)localObject2);
          j = 2;
          ((Handler)localObject2).sendEmptyMessage(j);
          break;
        }
        ((FileOutputStream)localObject3).write((byte[])localObject4, 0, m);
        bool2 = UpdateManager.OooO0oo();
      } while (!bool2);
      ((FileOutputStream)localObject3).close();
      ((InputStream)localObject1).close();
    }
    catch (IOException localIOException) {}catch (MalformedURLException localMalformedURLException) {}
    localMalformedURLException.printStackTrace();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.UpdateManager.6
 * JD-Core Version:    0.7.0.1
 */