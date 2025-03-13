package androidx.print;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.PrintDocumentInfo.Builder;

class PrintHelper$PrintBitmapAdapter
  extends PrintDocumentAdapter
{
  public final String OooO00o;
  public final int OooO0O0;
  public final Bitmap OooO0OO;
  public final PrintHelper.OnPrintFinishCallback OooO0Oo;
  public PrintAttributes OooO0o0;
  
  public void onFinish()
  {
    PrintHelper.OnPrintFinishCallback localOnPrintFinishCallback = this.OooO0Oo;
    if (localOnPrintFinishCallback != null) {
      localOnPrintFinishCallback.OooO00o();
    }
  }
  
  public void onLayout(PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback, Bundle paramBundle)
  {
    this.OooO0o0 = paramPrintAttributes2;
    paramCancellationSignal = new android/print/PrintDocumentInfo$Builder;
    paramBundle = this.OooO00o;
    paramCancellationSignal.<init>(paramBundle);
    int i = 1;
    paramCancellationSignal = paramCancellationSignal.setContentType(i).setPageCount(i).build();
    boolean bool = paramPrintAttributes2.equals(paramPrintAttributes1) ^ i;
    paramLayoutResultCallback.onLayoutFinished(paramCancellationSignal, bool);
  }
  
  public void onWrite(PageRange[] paramArrayOfPageRange, ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
  {
    PrintHelper localPrintHelper = this.OooO0o;
    PrintAttributes localPrintAttributes = this.OooO0o0;
    int i = this.OooO0O0;
    Bitmap localBitmap = this.OooO0OO;
    localPrintHelper.OooO0oO(localPrintAttributes, i, localBitmap, paramParcelFileDescriptor, paramCancellationSignal, paramWriteResultCallback);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.print.PrintHelper.PrintBitmapAdapter
 * JD-Core Version:    0.7.0.1
 */