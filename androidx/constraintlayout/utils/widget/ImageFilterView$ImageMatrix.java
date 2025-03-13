package androidx.constraintlayout.utils.widget;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

class ImageFilterView$ImageMatrix
{
  public float[] OooO00o;
  public ColorMatrix OooO0O0;
  public ColorMatrix OooO0OO;
  public float OooO0Oo;
  public float OooO0o;
  public float OooO0o0;
  public float OooO0oO;
  
  public ImageFilterView$ImageMatrix()
  {
    Object localObject = new float[20];
    this.OooO00o = ((float[])localObject);
    localObject = new android/graphics/ColorMatrix;
    ((ColorMatrix)localObject).<init>();
    this.OooO0O0 = ((ColorMatrix)localObject);
    localObject = new android/graphics/ColorMatrix;
    ((ColorMatrix)localObject).<init>();
    this.OooO0OO = ((ColorMatrix)localObject);
    float f = 1.0F;
    this.OooO0Oo = f;
    this.OooO0o0 = f;
    this.OooO0o = f;
    this.OooO0oO = f;
  }
  
  public final void OooO00o(float paramFloat)
  {
    float[] arrayOfFloat = this.OooO00o;
    arrayOfFloat[0] = paramFloat;
    arrayOfFloat[1] = 0.0F;
    arrayOfFloat[2] = 0.0F;
    arrayOfFloat[3] = 0.0F;
    arrayOfFloat[4] = 0.0F;
    arrayOfFloat[5] = 0.0F;
    arrayOfFloat[6] = paramFloat;
    arrayOfFloat[7] = 0.0F;
    arrayOfFloat[8] = 0.0F;
    arrayOfFloat[9] = 0.0F;
    arrayOfFloat[10] = 0.0F;
    arrayOfFloat[11] = 0.0F;
    arrayOfFloat[12] = paramFloat;
    arrayOfFloat[13] = 0.0F;
    arrayOfFloat[14] = 0.0F;
    arrayOfFloat[15] = 0.0F;
    arrayOfFloat[16] = 0.0F;
    arrayOfFloat[17] = 0.0F;
    arrayOfFloat[18] = 1.0F;
    arrayOfFloat[19] = 0.0F;
  }
  
  public final void OooO0O0(float paramFloat)
  {
    float f1 = 1.0F;
    float f2 = f1 - paramFloat;
    float f3 = 0.2999F * f2;
    float f4 = 0.587F * f2;
    f2 *= 0.114F;
    float[] arrayOfFloat = this.OooO00o;
    float f5 = f3 + paramFloat;
    arrayOfFloat[0] = f5;
    arrayOfFloat[1] = f4;
    arrayOfFloat[2] = f2;
    arrayOfFloat[3] = 0.0F;
    arrayOfFloat[4] = 0.0F;
    arrayOfFloat[5] = f3;
    float f6 = f4 + paramFloat;
    arrayOfFloat[6] = f6;
    arrayOfFloat[7] = f2;
    arrayOfFloat[8] = 0.0F;
    arrayOfFloat[9] = 0.0F;
    arrayOfFloat[10] = f3;
    arrayOfFloat[11] = f4;
    f2 += paramFloat;
    arrayOfFloat[12] = f2;
    arrayOfFloat[13] = 0.0F;
    arrayOfFloat[14] = 0.0F;
    arrayOfFloat[15] = 0.0F;
    arrayOfFloat[16] = 0.0F;
    arrayOfFloat[17] = 0.0F;
    arrayOfFloat[18] = f1;
    arrayOfFloat[19] = 0.0F;
  }
  
  public void OooO0OO(ImageView paramImageView)
  {
    Object localObject1 = this.OooO0O0;
    ((ColorMatrix)localObject1).reset();
    float f1 = this.OooO0o0;
    int i = 1065353216;
    float f2 = 1.0F;
    boolean bool2 = f1 < f2;
    int j = 1;
    float f3 = 1.4E-45F;
    Object localObject2;
    int k;
    if (bool2)
    {
      OooO0O0(f1);
      localObject1 = this.OooO0O0;
      localObject2 = this.OooO00o;
      ((ColorMatrix)localObject1).set((float[])localObject2);
      k = j;
      f1 = f3;
    }
    else
    {
      k = 0;
      f1 = 0.0F;
      localObject1 = null;
    }
    float f4 = this.OooO0o;
    boolean bool3 = f4 < f2;
    if (bool3)
    {
      this.OooO0OO.setScale(f4, f4, f4, f2);
      localObject1 = this.OooO0O0;
      localObject2 = this.OooO0OO;
      ((ColorMatrix)localObject1).postConcat((ColorMatrix)localObject2);
      k = j;
      f1 = f3;
    }
    f4 = this.OooO0oO;
    bool3 = f4 < f2;
    if (bool3)
    {
      OooO0Oo(f4);
      localObject1 = this.OooO0OO;
      localObject2 = this.OooO00o;
      ((ColorMatrix)localObject1).set((float[])localObject2);
      localObject1 = this.OooO0O0;
      localObject2 = this.OooO0OO;
      ((ColorMatrix)localObject1).postConcat((ColorMatrix)localObject2);
      k = j;
      f1 = f3;
    }
    f4 = this.OooO0Oo;
    boolean bool1 = f4 < f2;
    Object localObject3;
    if (bool1)
    {
      OooO00o(f4);
      localObject1 = this.OooO0OO;
      localObject3 = this.OooO00o;
      ((ColorMatrix)localObject1).set((float[])localObject3);
      localObject1 = this.OooO0O0;
      localObject3 = this.OooO0OO;
      ((ColorMatrix)localObject1).postConcat((ColorMatrix)localObject3);
    }
    else
    {
      j = k;
      f3 = f1;
    }
    if (j != 0)
    {
      localObject1 = new android/graphics/ColorMatrixColorFilter;
      localObject3 = this.OooO0O0;
      ((ColorMatrixColorFilter)localObject1).<init>((ColorMatrix)localObject3);
      paramImageView.setColorFilter((ColorFilter)localObject1);
    }
    else
    {
      paramImageView.clearColorFilter();
    }
  }
  
  public final void OooO0Oo(float paramFloat)
  {
    boolean bool1 = paramFloat < 0.0F;
    if (!bool1)
    {
      j = 1008981770;
      paramFloat = 0.01F;
    }
    int i = 1167867904;
    float f1 = 5000.0F / paramFloat / 100.0F;
    int j = 1115947008;
    paramFloat = 66.0F;
    boolean bool3 = f1 < paramFloat;
    float f2 = 161.11957F;
    float f3 = 99.470802F;
    int n = 1132396544;
    float f4 = 255.0F;
    int m;
    double d1;
    if (bool3)
    {
      m = 1114636288;
      d1 = f1 - 60.0F;
      f5 = (float)Math.pow(d1, -0.1332047581672669D);
      f6 = 329.69873F;
      f5 *= f6;
      double d2 = 0.07551484555006027D;
      d1 = Math.pow(d1, d2);
      f7 = (float)d1;
      f8 = 288.12216F;
      f7 *= f8;
    }
    else
    {
      d1 = Math.log(f1);
      f7 = (float)d1 * f3 - f2;
      m = n;
      f5 = f4;
    }
    boolean bool2 = f1 < paramFloat;
    float f8 = 305.0448F;
    float f6 = 138.51773F;
    int k;
    if (bool2)
    {
      paramFloat = 19.0F;
      bool2 = f1 < paramFloat;
      if (bool2)
      {
        k = 1092616192;
        f1 -= 10.0F;
        double d3 = Math.log(f1);
        paramFloat = (float)d3 * f6 - f8;
      }
      else
      {
        k = 0;
        paramFloat = 0.0F;
      }
    }
    else
    {
      k = n;
      paramFloat = f4;
    }
    f1 = Math.max(f5, 0.0F);
    f1 = Math.min(f4, f1);
    float f5 = Math.max(f7, 0.0F);
    f5 = Math.min(f4, f5);
    paramFloat = Math.max(paramFloat, 0.0F);
    paramFloat = Math.min(f4, paramFloat);
    float f7 = (float)Math.log(50.0F) * f3 - f2;
    f2 = (float)Math.log(40.0F) * f6 - f8;
    f3 = Math.max(f4, 0.0F);
    f3 = Math.min(f4, f3);
    f7 = Math.max(f7, 0.0F);
    f7 = Math.min(f4, f7);
    f2 = Math.max(f2, 0.0F);
    f2 = Math.min(f4, f2);
    f1 /= f3;
    f5 /= f7;
    paramFloat /= f2;
    float[] arrayOfFloat = this.OooO00o;
    arrayOfFloat[0] = f1;
    arrayOfFloat[1] = 0.0F;
    arrayOfFloat[2] = 0.0F;
    arrayOfFloat[3] = 0.0F;
    arrayOfFloat[4] = 0.0F;
    arrayOfFloat[5] = 0.0F;
    arrayOfFloat[6] = f5;
    arrayOfFloat[7] = 0.0F;
    arrayOfFloat[8] = 0.0F;
    arrayOfFloat[9] = 0.0F;
    arrayOfFloat[10] = 0.0F;
    arrayOfFloat[11] = 0.0F;
    arrayOfFloat[12] = paramFloat;
    arrayOfFloat[13] = 0.0F;
    arrayOfFloat[14] = 0.0F;
    arrayOfFloat[15] = 0.0F;
    arrayOfFloat[16] = 0.0F;
    arrayOfFloat[17] = 0.0F;
    arrayOfFloat[18] = 1.0F;
    arrayOfFloat[19] = 0.0F;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix
 * JD-Core Version:    0.7.0.1
 */