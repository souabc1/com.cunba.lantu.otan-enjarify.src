package androidx.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PrintAttributes;
import android.print.PrintAttributes.Builder;
import android.print.PrintAttributes.Margins;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintAttributes.Resolution;
import android.print.PrintDocumentAdapter.WriteResultCallback;

public final class PrintHelper
{
  public static final boolean OooO0oO;
  public static final boolean OooO0oo;
  public final Context OooO00o;
  public BitmapFactory.Options OooO0O0;
  public final Object OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  
  static
  {
    boolean bool = true;
    OooO0oO = bool;
    OooO0oo = bool;
  }
  
  public static Bitmap OooO00o(Bitmap paramBitmap, int paramInt)
  {
    int i = 1;
    if (paramInt != i) {
      return paramBitmap;
    }
    paramInt = paramBitmap.getWidth();
    i = paramBitmap.getHeight();
    Object localObject = Bitmap.Config.ARGB_8888;
    Bitmap localBitmap = Bitmap.createBitmap(paramInt, i, (Bitmap.Config)localObject);
    Canvas localCanvas = new android/graphics/Canvas;
    localCanvas.<init>(localBitmap);
    localObject = new android/graphics/Paint;
    ((Paint)localObject).<init>();
    ColorMatrix localColorMatrix = new android/graphics/ColorMatrix;
    localColorMatrix.<init>();
    localColorMatrix.setSaturation(0.0F);
    ColorMatrixColorFilter localColorMatrixColorFilter = new android/graphics/ColorMatrixColorFilter;
    localColorMatrixColorFilter.<init>(localColorMatrix);
    ((Paint)localObject).setColorFilter(localColorMatrixColorFilter);
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, (Paint)localObject);
    localCanvas.setBitmap(null);
    return localBitmap;
  }
  
  public static PrintAttributes.Builder OooO0O0(PrintAttributes paramPrintAttributes)
  {
    PrintAttributes.Builder localBuilder = new android/print/PrintAttributes$Builder;
    localBuilder.<init>();
    Object localObject = paramPrintAttributes.getMediaSize();
    localBuilder = localBuilder.setMediaSize((PrintAttributes.MediaSize)localObject);
    localObject = paramPrintAttributes.getResolution();
    localBuilder = localBuilder.setResolution((PrintAttributes.Resolution)localObject);
    localObject = paramPrintAttributes.getMinMargins();
    localBuilder = localBuilder.setMinMargins((PrintAttributes.Margins)localObject);
    int i = paramPrintAttributes.getColorMode();
    if (i != 0)
    {
      i = paramPrintAttributes.getColorMode();
      localBuilder.setColorMode(i);
    }
    i = paramPrintAttributes.getDuplexMode();
    if (i != 0)
    {
      int j = paramPrintAttributes.getDuplexMode();
      localBuilder.setDuplexMode(j);
    }
    return localBuilder;
  }
  
  public static Matrix OooO0OO(int paramInt1, int paramInt2, RectF paramRectF, int paramInt3)
  {
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    float f1 = paramRectF.width();
    float f2 = paramInt1;
    f1 /= f2;
    int i = 2;
    float f3 = 2.802597E-045F;
    float f4;
    if (paramInt3 == i)
    {
      f4 = paramRectF.height();
      f3 = paramInt2;
      f4 /= f3;
      f4 = Math.max(f1, f4);
    }
    else
    {
      f4 = paramRectF.height();
      f3 = paramInt2;
      f4 /= f3;
      f4 = Math.min(f1, f4);
    }
    localMatrix.postScale(f4, f4);
    f1 = paramRectF.width();
    f2 *= f4;
    f1 -= f2;
    f2 = 2.0F;
    f1 /= f2;
    float f5 = paramRectF.height();
    float f6 = paramInt2 * f4;
    f5 = (f5 - f6) / f2;
    localMatrix.postTranslate(f1, f5);
    return localMatrix;
  }
  
  public static boolean OooO0Oo(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    if (i <= j)
    {
      j = 1;
    }
    else
    {
      j = 0;
      paramBitmap = null;
    }
    return j;
  }
  
  public Bitmap OooO0o(Uri paramUri)
  {
    if (paramUri != null)
    {
      ??? = this.OooO00o;
      if (??? != null)
      {
        ??? = new android/graphics/BitmapFactory$Options;
        ((BitmapFactory.Options)???).<init>();
        int i = 1;
        ((BitmapFactory.Options)???).inJustDecodeBounds = i;
        OooO0o0(paramUri, (BitmapFactory.Options)???);
        int j = ((BitmapFactory.Options)???).outWidth;
        int k = ((BitmapFactory.Options)???).outHeight;
        if ((j > 0) && (k > 0))
        {
          int m = Math.max(j, k);
          int n = i;
          for (;;)
          {
            int i1 = 3500;
            if (m <= i1) {
              break;
            }
            m >>>= 1;
            n <<= 1;
          }
          if (n > 0)
          {
            k = Math.min(j, k) / n;
            if (k > 0) {
              synchronized (this.OooO0OO)
              {
                BitmapFactory.Options localOptions = new android/graphics/BitmapFactory$Options;
                localOptions.<init>();
                this.OooO0O0 = localOptions;
                localOptions.inMutable = i;
                localOptions.inSampleSize = n;
                try
                {
                  paramUri = OooO0o0(paramUri, localOptions);
                  synchronized (this.OooO0OO)
                  {
                    this.OooO0O0 = null;
                    return paramUri;
                  }
                  paramUri = finally;
                }
                finally {}
              }
            }
          }
        }
        return null;
      }
    }
    paramUri = new java/lang/IllegalArgumentException;
    paramUri.<init>("bad argument to getScaledBitmap");
  }
  
  /* Error */
  public final Bitmap OooO0o0(Uri paramUri, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +63 -> 64
    //   4: aload_0
    //   5: getfield 150	androidx/print/PrintHelper:OooO00o	Landroid/content/Context;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnull +54 -> 64
    //   13: aconst_null
    //   14: astore 4
    //   16: aload_3
    //   17: invokevirtual 194	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   20: astore_3
    //   21: aload_3
    //   22: aload_1
    //   23: invokevirtual 200	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   26: astore_1
    //   27: aload_1
    //   28: aconst_null
    //   29: aload_2
    //   30: invokestatic 206	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   33: astore_2
    //   34: aload_1
    //   35: ifnull +7 -> 42
    //   38: aload_1
    //   39: invokevirtual 211	java/io/InputStream:close	()V
    //   42: aload_2
    //   43: areturn
    //   44: astore_2
    //   45: aload_1
    //   46: astore 4
    //   48: goto +4 -> 52
    //   51: astore_2
    //   52: aload 4
    //   54: ifnull +8 -> 62
    //   57: aload 4
    //   59: invokevirtual 211	java/io/InputStream:close	()V
    //   62: aload_2
    //   63: athrow
    //   64: new 183	java/lang/IllegalArgumentException
    //   67: astore_1
    //   68: aload_1
    //   69: ldc 213
    //   71: invokespecial 188	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   74: aload_1
    //   75: athrow
    //   76: pop
    //   77: goto -35 -> 42
    //   80: pop
    //   81: goto -19 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	PrintHelper
    //   0	84	1	paramUri	Uri
    //   0	84	2	paramOptions	BitmapFactory.Options
    //   8	14	3	localObject	Object
    //   14	44	4	localUri	Uri
    //   76	1	5	localIOException1	java.io.IOException
    //   80	1	6	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   29	33	44	finally
    //   16	20	51	finally
    //   22	26	51	finally
    //   38	42	76	java/io/IOException
    //   57	62	80	java/io/IOException
  }
  
  public void OooO0oO(PrintAttributes paramPrintAttributes, int paramInt, Bitmap paramBitmap, ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
  {
    boolean bool = OooO0oo;
    Void[] arrayOfVoid = null;
    Object localObject1;
    if (bool)
    {
      localObject1 = paramPrintAttributes;
    }
    else
    {
      localObject2 = OooO0O0(paramPrintAttributes);
      localObject3 = new android/print/PrintAttributes$Margins;
      ((PrintAttributes.Margins)localObject3).<init>(0, 0, 0, 0);
      localObject2 = ((PrintAttributes.Builder)localObject2).setMinMargins((PrintAttributes.Margins)localObject3).build();
      localObject1 = localObject2;
    }
    Object localObject2 = new androidx/print/PrintHelper$1;
    Object localObject3 = localObject2;
    ((PrintHelper.1)localObject2).<init>(this, paramCancellationSignal, (PrintAttributes)localObject1, paramBitmap, paramPrintAttributes, paramInt, paramParcelFileDescriptor, paramWriteResultCallback);
    arrayOfVoid = new Void[0];
    ((AsyncTask)localObject2).execute(arrayOfVoid);
  }
  
  public int getColorMode()
  {
    return this.OooO0o0;
  }
  
  public int getOrientation()
  {
    int i = this.OooO0o;
    if (i == 0) {
      i = 1;
    }
    return i;
  }
  
  public int getScaleMode()
  {
    return this.OooO0Oo;
  }
  
  public void setColorMode(int paramInt)
  {
    this.OooO0o0 = paramInt;
  }
  
  public void setOrientation(int paramInt)
  {
    this.OooO0o = paramInt;
  }
  
  public void setScaleMode(int paramInt)
  {
    this.OooO0Oo = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.print.PrintHelper
 * JD-Core Version:    0.7.0.1
 */