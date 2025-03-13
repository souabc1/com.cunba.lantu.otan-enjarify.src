package androidx.print;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentInfo.Builder;
import java.io.FileNotFoundException;

class PrintHelper$PrintUriAdapter$1
  extends AsyncTask
{
  public PrintHelper$PrintUriAdapter$1(PrintHelper.PrintUriAdapter paramPrintUriAdapter, CancellationSignal paramCancellationSignal, PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback) {}
  
  public Bitmap OooO00o(Uri... paramVarArgs)
  {
    try
    {
      paramVarArgs = this.OooO0o0;
      PrintHelper localPrintHelper = paramVarArgs.OooO0oo;
      paramVarArgs = paramVarArgs.OooO0O0;
      return localPrintHelper.OooO0o(paramVarArgs);
    }
    catch (FileNotFoundException localFileNotFoundException) {}
    return null;
  }
  
  public void OooO0O0(Bitmap paramBitmap)
  {
    this.OooO0Oo.onLayoutCancelled();
    this.OooO0o0.OooO0o = null;
  }
  
  public void OooO0OO(Bitmap paramBitmap)
  {
    super.onPostExecute(paramBitmap);
    int k;
    PrintAttributes localPrintAttributes;
    Object localObject2;
    if (paramBitmap != null)
    {
      boolean bool1 = PrintHelper.OooO0oO;
      if (bool1)
      {
        localObject1 = this.OooO0o0.OooO0oo;
        int i = ((PrintHelper)localObject1).OooO0o;
        if (i != 0) {}
      }
      else
      {
        try
        {
          localObject1 = this.OooO0o0;
          localObject1 = ((PrintHelper.PrintUriAdapter)localObject1).OooO0o0;
          localObject1 = ((PrintAttributes)localObject1).getMediaSize();
          if (localObject1 != null)
          {
            boolean bool2 = ((PrintAttributes.MediaSize)localObject1).isPortrait();
            k = PrintHelper.OooO0Oo(paramBitmap);
            if (bool2 != k)
            {
              Matrix localMatrix = new android/graphics/Matrix;
              localMatrix.<init>();
              j = 1119092736;
              f = 90.0F;
              localMatrix.postRotate(f);
              localPrintAttributes = null;
              int m = paramBitmap.getWidth();
              int n = paramBitmap.getHeight();
              boolean bool3 = true;
              localObject2 = paramBitmap;
              paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, m, n, localMatrix, bool3);
            }
          }
        }
        finally {}
      }
    }
    this.OooO0o0.OooO0oO = paramBitmap;
    int j = 0;
    float f = 0.0F;
    Object localObject1 = null;
    if (paramBitmap != null)
    {
      paramBitmap = new android/print/PrintDocumentInfo$Builder;
      String str = this.OooO0o0.OooO00o;
      paramBitmap.<init>(str);
      k = 1;
      paramBitmap = paramBitmap.setContentType(k).setPageCount(k).build();
      localObject2 = this.OooO0O0;
      localPrintAttributes = this.OooO0OO;
      int i1 = ((PrintAttributes)localObject2).equals(localPrintAttributes);
      k ^= i1;
      localObject2 = this.OooO0Oo;
      ((PrintDocumentAdapter.LayoutResultCallback)localObject2).onLayoutFinished(paramBitmap, k);
    }
    else
    {
      paramBitmap = this.OooO0Oo;
      paramBitmap.onLayoutFailed(null);
    }
    this.OooO0o0.OooO0o = null;
  }
  
  public void onPreExecute()
  {
    CancellationSignal localCancellationSignal = this.OooO00o;
    PrintHelper.PrintUriAdapter.1.1 local1 = new androidx/print/PrintHelper$PrintUriAdapter$1$1;
    local1.<init>(this);
    localCancellationSignal.setOnCancelListener(local1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.print.PrintHelper.PrintUriAdapter.1
 * JD-Core Version:    0.7.0.1
 */