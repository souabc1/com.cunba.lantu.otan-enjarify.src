package androidx.print;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.PrintDocumentInfo.Builder;

class PrintHelper$PrintUriAdapter
  extends PrintDocumentAdapter
{
  public final String OooO00o;
  public final Uri OooO0O0;
  public final PrintHelper.OnPrintFinishCallback OooO0OO;
  public final int OooO0Oo;
  public AsyncTask OooO0o;
  public PrintAttributes OooO0o0;
  public Bitmap OooO0oO;
  
  public void OooO00o()
  {
    synchronized (this.OooO0oo.OooO0OO)
    {
      PrintHelper localPrintHelper = this.OooO0oo;
      BitmapFactory.Options localOptions = localPrintHelper.OooO0O0;
      if (localOptions != null)
      {
        localOptions = null;
        localPrintHelper.OooO0O0 = null;
      }
      return;
    }
  }
  
  public void onFinish()
  {
    super.onFinish();
    OooO00o();
    Object localObject = this.OooO0o;
    if (localObject != null)
    {
      boolean bool = true;
      ((AsyncTask)localObject).cancel(bool);
    }
    localObject = this.OooO0OO;
    if (localObject != null) {
      ((PrintHelper.OnPrintFinishCallback)localObject).OooO00o();
    }
    localObject = this.OooO0oO;
    if (localObject != null)
    {
      ((Bitmap)localObject).recycle();
      localObject = null;
      this.OooO0oO = null;
    }
  }
  
  public void onLayout(PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback, Bundle paramBundle)
  {
    try
    {
      this.OooO0o0 = paramPrintAttributes2;
      int i = paramCancellationSignal.isCanceled();
      if (i != 0)
      {
        paramLayoutResultCallback.onLayoutCancelled();
        return;
      }
      paramBundle = this.OooO0oO;
      if (paramBundle != null)
      {
        paramCancellationSignal = new android/print/PrintDocumentInfo$Builder;
        paramBundle = this.OooO00o;
        paramCancellationSignal.<init>(paramBundle);
        i = 1;
        paramCancellationSignal = paramCancellationSignal.setContentType(i).setPageCount(i).build();
        boolean bool = paramPrintAttributes2.equals(paramPrintAttributes1) ^ i;
        paramLayoutResultCallback.onLayoutFinished(paramCancellationSignal, bool);
        return;
      }
      paramBundle = new androidx/print/PrintHelper$PrintUriAdapter$1;
      paramBundle.<init>(this, paramCancellationSignal, paramPrintAttributes2, paramPrintAttributes1, paramLayoutResultCallback);
      paramPrintAttributes1 = new Uri[0];
      paramPrintAttributes1 = paramBundle.execute(paramPrintAttributes1);
      this.OooO0o = paramPrintAttributes1;
      return;
    }
    finally {}
  }
  
  public void onWrite(PageRange[] paramArrayOfPageRange, ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
  {
    PrintHelper localPrintHelper = this.OooO0oo;
    PrintAttributes localPrintAttributes = this.OooO0o0;
    int i = this.OooO0Oo;
    Bitmap localBitmap = this.OooO0oO;
    localPrintHelper.OooO0oO(localPrintAttributes, i, localBitmap, paramParcelFileDescriptor, paramCancellationSignal, paramWriteResultCallback);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.print.PrintHelper.PrintUriAdapter
 * JD-Core Version:    0.7.0.1
 */