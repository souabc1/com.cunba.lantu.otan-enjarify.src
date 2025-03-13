package androidx.vectordrawable.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import java.util.ArrayList;

class VectorDrawableCompat$VPathRenderer
{
  public static final Matrix OooOOo0;
  public float OooO;
  public final Path OooO00o;
  public final Path OooO0O0;
  public final Matrix OooO0OO;
  public Paint OooO0Oo;
  public PathMeasure OooO0o;
  public Paint OooO0o0;
  public int OooO0oO;
  public final VectorDrawableCompat.VGroup OooO0oo;
  public float OooOO0;
  public float OooOO0O;
  public float OooOO0o;
  public String OooOOO;
  public int OooOOO0;
  public Boolean OooOOOO;
  public final ArrayMap OooOOOo;
  
  static
  {
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    OooOOo0 = localMatrix;
  }
  
  public VectorDrawableCompat$VPathRenderer()
  {
    Object localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.OooO0OO = ((Matrix)localObject);
    this.OooO = 0.0F;
    this.OooOO0 = 0.0F;
    this.OooOO0O = 0.0F;
    this.OooOO0o = 0.0F;
    this.OooOOO0 = 255;
    this.OooOOO = null;
    this.OooOOOO = null;
    localObject = new androidx/collection/ArrayMap;
    ((ArrayMap)localObject).<init>();
    this.OooOOOo = ((ArrayMap)localObject);
    localObject = new androidx/vectordrawable/graphics/drawable/VectorDrawableCompat$VGroup;
    ((VectorDrawableCompat.VGroup)localObject).<init>();
    this.OooO0oo = ((VectorDrawableCompat.VGroup)localObject);
    localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    this.OooO00o = ((Path)localObject);
    localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    this.OooO0O0 = ((Path)localObject);
  }
  
  public VectorDrawableCompat$VPathRenderer(VPathRenderer paramVPathRenderer)
  {
    Object localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    this.OooO0OO = ((Matrix)localObject1);
    this.OooO = 0.0F;
    this.OooOO0 = 0.0F;
    this.OooOO0O = 0.0F;
    this.OooOO0o = 0.0F;
    this.OooOOO0 = 255;
    this.OooOOO = null;
    this.OooOOOO = null;
    localObject1 = new androidx/collection/ArrayMap;
    ((ArrayMap)localObject1).<init>();
    this.OooOOOo = ((ArrayMap)localObject1);
    Object localObject2 = new androidx/vectordrawable/graphics/drawable/VectorDrawableCompat$VGroup;
    Object localObject3 = paramVPathRenderer.OooO0oo;
    ((VectorDrawableCompat.VGroup)localObject2).<init>((VectorDrawableCompat.VGroup)localObject3, (ArrayMap)localObject1);
    this.OooO0oo = ((VectorDrawableCompat.VGroup)localObject2);
    localObject2 = new android/graphics/Path;
    localObject3 = paramVPathRenderer.OooO00o;
    ((Path)localObject2).<init>((Path)localObject3);
    this.OooO00o = ((Path)localObject2);
    localObject2 = new android/graphics/Path;
    localObject3 = paramVPathRenderer.OooO0O0;
    ((Path)localObject2).<init>((Path)localObject3);
    this.OooO0O0 = ((Path)localObject2);
    float f = paramVPathRenderer.OooO;
    this.OooO = f;
    f = paramVPathRenderer.OooOO0;
    this.OooOO0 = f;
    f = paramVPathRenderer.OooOO0O;
    this.OooOO0O = f;
    f = paramVPathRenderer.OooOO0o;
    this.OooOO0o = f;
    int i = paramVPathRenderer.OooO0oO;
    this.OooO0oO = i;
    i = paramVPathRenderer.OooOOO0;
    this.OooOOO0 = i;
    localObject2 = paramVPathRenderer.OooOOO;
    this.OooOOO = ((String)localObject2);
    localObject2 = paramVPathRenderer.OooOOO;
    if (localObject2 != null) {
      ((SimpleArrayMap)localObject1).put(localObject2, this);
    }
    paramVPathRenderer = paramVPathRenderer.OooOOOO;
    this.OooOOOO = paramVPathRenderer;
  }
  
  public static float OooO00o(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat1 *= paramFloat4;
    paramFloat2 *= paramFloat3;
    return paramFloat1 - paramFloat2;
  }
  
  public void OooO0O0(Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    VectorDrawableCompat.VGroup localVGroup = this.OooO0oo;
    Matrix localMatrix = OooOOo0;
    OooO0OO(localVGroup, localMatrix, paramCanvas, paramInt1, paramInt2, paramColorFilter);
  }
  
  public final void OooO0OO(VectorDrawableCompat.VGroup paramVGroup, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    paramVGroup.OooO00o.set(paramMatrix);
    paramMatrix = paramVGroup.OooO00o;
    Object localObject1 = paramVGroup.OooOO0;
    paramMatrix.preConcat((Matrix)localObject1);
    paramCanvas.save();
    int i = 0;
    paramMatrix = null;
    for (;;)
    {
      localObject1 = paramVGroup.OooO0O0;
      int j = ((ArrayList)localObject1).size();
      if (i >= j) {
        break;
      }
      localObject1 = (VectorDrawableCompat.VObject)paramVGroup.OooO0O0.get(i);
      boolean bool = localObject1 instanceof VectorDrawableCompat.VGroup;
      Object localObject2;
      Object localObject3;
      if (bool)
      {
        localObject2 = localObject1;
        localObject2 = (VectorDrawableCompat.VGroup)localObject1;
        localObject3 = paramVGroup.OooO00o;
        OooO0OO((VectorDrawableCompat.VGroup)localObject2, (Matrix)localObject3, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      }
      else
      {
        bool = localObject1 instanceof VectorDrawableCompat.VPath;
        if (bool)
        {
          localObject3 = localObject1;
          localObject3 = (VectorDrawableCompat.VPath)localObject1;
          localObject2 = paramVGroup;
          OooO0Oo(paramVGroup, (VectorDrawableCompat.VPath)localObject3, paramCanvas, paramInt1, paramInt2, paramColorFilter);
        }
      }
      i += 1;
    }
    paramCanvas.restore();
  }
  
  public final void OooO0Oo(VectorDrawableCompat.VGroup paramVGroup, VectorDrawableCompat.VPath paramVPath, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    float f1 = paramInt1;
    float f2 = this.OooOO0O;
    f1 /= f2;
    float f3 = paramInt2;
    f2 = this.OooOO0o;
    f3 /= f2;
    f2 = Math.min(f1, f3);
    paramVGroup = paramVGroup.OooO00o;
    this.OooO0OO.set(paramVGroup);
    Object localObject1 = this.OooO0OO;
    ((Matrix)localObject1).postScale(f1, f3);
    float f4 = OooO0o0(paramVGroup);
    paramInt1 = 0;
    f1 = 0.0F;
    Object localObject2 = null;
    paramInt2 = f4 < 0.0F;
    if (paramInt2 == 0) {
      return;
    }
    Path localPath = this.OooO00o;
    paramVPath.OooO0O0(localPath);
    localPath = this.OooO00o;
    localObject1 = this.OooO0O0;
    ((Path)localObject1).reset();
    boolean bool1 = paramVPath.isClipPath();
    if (bool1)
    {
      paramVGroup = this.OooO0O0;
      int j = paramVPath.OooO0OO;
      if (j == 0) {
        paramVPath = Path.FillType.WINDING;
      } else {
        paramVPath = Path.FillType.EVEN_ODD;
      }
      paramVGroup.setFillType(paramVPath);
      paramVGroup = this.OooO0O0;
      paramVPath = this.OooO0OO;
      paramVGroup.addPath(localPath, paramVPath);
      paramVGroup = this.OooO0O0;
      paramCanvas.clipPath(paramVGroup);
    }
    else
    {
      paramVPath = (VectorDrawableCompat.VFullPath)paramVPath;
      float f5 = paramVPath.OooOO0O;
      boolean bool2 = f5 < 0.0F;
      int k = 1065353216;
      float f6 = 1.0F;
      int m = 1;
      float f7 = 1.4E-45F;
      float f9;
      Object localObject3;
      if (!bool2)
      {
        f8 = paramVPath.OooOO0o;
        bool2 = f8 < f6;
        if (!bool2) {}
      }
      else
      {
        f8 = paramVPath.OooOOO0;
        f5 = (f5 + f8) % f6;
        f9 = (paramVPath.OooOO0o + f8) % f6;
        localPathMeasure = this.OooO0o;
        if (localPathMeasure == null)
        {
          localPathMeasure = new android/graphics/PathMeasure;
          localPathMeasure.<init>();
          this.OooO0o = localPathMeasure;
        }
        localPathMeasure = this.OooO0o;
        localObject3 = this.OooO00o;
        localPathMeasure.setPath((Path)localObject3, false);
        localPathMeasure = this.OooO0o;
        f8 = localPathMeasure.getLength();
        f5 *= f8;
        f9 *= f8;
        localPath.reset();
        boolean bool3 = f5 < f9;
        if (bool3)
        {
          localObject3 = this.OooO0o;
          ((PathMeasure)localObject3).getSegment(f5, f8, localPath, m);
          localObject1 = this.OooO0o;
          ((PathMeasure)localObject1).getSegment(0.0F, f9, localPath, m);
        }
        else
        {
          localPathMeasure = this.OooO0o;
          localPathMeasure.getSegment(f5, f9, localPath, m);
        }
        localPath.rLineTo(0.0F, 0.0F);
      }
      localObject2 = this.OooO0O0;
      localObject1 = this.OooO0OO;
      ((Path)localObject2).addPath(localPath, (Matrix)localObject1);
      localObject2 = paramVPath.OooO0oo;
      paramInt1 = ((ComplexColorCompat)localObject2).OooO0oO();
      paramInt2 = 1132396544;
      f3 = 255.0F;
      int i = 255;
      f5 = 3.573311E-043F;
      bool2 = false;
      float f8 = 0.0F;
      PathMeasure localPathMeasure = null;
      if (paramInt1 != 0)
      {
        localObject2 = paramVPath.OooO0oo;
        localObject3 = this.OooO0o0;
        Object localObject4;
        if (localObject3 == null)
        {
          localObject3 = new android/graphics/Paint;
          ((Paint)localObject3).<init>(m);
          this.OooO0o0 = ((Paint)localObject3);
          localObject4 = Paint.Style.FILL;
          ((Paint)localObject3).setStyle((Paint.Style)localObject4);
        }
        localObject3 = this.OooO0o0;
        boolean bool5 = ((ComplexColorCompat)localObject2).isGradient();
        if (bool5)
        {
          localObject2 = ((ComplexColorCompat)localObject2).getShader();
          localObject4 = this.OooO0OO;
          ((Shader)localObject2).setLocalMatrix((Matrix)localObject4);
          ((Paint)localObject3).setShader((Shader)localObject2);
          f1 = paramVPath.OooOO0 * f3;
          paramInt1 = Math.round(f1);
          ((Paint)localObject3).setAlpha(paramInt1);
        }
        else
        {
          ((Paint)localObject3).setShader(null);
          ((Paint)localObject3).setAlpha(i);
          paramInt1 = ((ComplexColorCompat)localObject2).getColor();
          f9 = paramVPath.OooOO0;
          paramInt1 = VectorDrawableCompat.OooO00o(paramInt1, f9);
          ((Paint)localObject3).setColor(paramInt1);
        }
        ((Paint)localObject3).setColorFilter(paramColorFilter);
        localObject2 = this.OooO0O0;
        int n = paramVPath.OooO0OO;
        if (n == 0) {
          localObject4 = Path.FillType.WINDING;
        } else {
          localObject4 = Path.FillType.EVEN_ODD;
        }
        ((Path)localObject2).setFillType((Path.FillType)localObject4);
        localObject2 = this.OooO0O0;
        paramCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      }
      localObject2 = paramVPath.OooO0o;
      paramInt1 = ((ComplexColorCompat)localObject2).OooO0oO();
      if (paramInt1 != 0)
      {
        localObject2 = paramVPath.OooO0o;
        localObject3 = this.OooO0Oo;
        if (localObject3 == null)
        {
          localObject3 = new android/graphics/Paint;
          ((Paint)localObject3).<init>(m);
          this.OooO0Oo = ((Paint)localObject3);
          localObject5 = Paint.Style.STROKE;
          ((Paint)localObject3).setStyle((Paint.Style)localObject5);
        }
        localObject3 = this.OooO0Oo;
        Object localObject5 = paramVPath.OooOOOO;
        if (localObject5 != null) {
          ((Paint)localObject3).setStrokeJoin((Paint.Join)localObject5);
        }
        localObject5 = paramVPath.OooOOO;
        if (localObject5 != null) {
          ((Paint)localObject3).setStrokeCap((Paint.Cap)localObject5);
        }
        f7 = paramVPath.OooOOOo;
        ((Paint)localObject3).setStrokeMiter(f7);
        boolean bool4 = ((ComplexColorCompat)localObject2).isGradient();
        if (bool4)
        {
          localObject2 = ((ComplexColorCompat)localObject2).getShader();
          localObject1 = this.OooO0OO;
          ((Shader)localObject2).setLocalMatrix((Matrix)localObject1);
          ((Paint)localObject3).setShader((Shader)localObject2);
          f1 = paramVPath.OooO * f3;
          paramInt1 = Math.round(f1);
          ((Paint)localObject3).setAlpha(paramInt1);
        }
        else
        {
          ((Paint)localObject3).setShader(null);
          ((Paint)localObject3).setAlpha(i);
          paramInt1 = ((ComplexColorCompat)localObject2).getColor();
          f3 = paramVPath.OooO;
          paramInt1 = VectorDrawableCompat.OooO00o(paramInt1, f3);
          ((Paint)localObject3).setColor(paramInt1);
        }
        ((Paint)localObject3).setColorFilter(paramColorFilter);
        f2 *= f4;
        f4 = paramVPath.OooO0oO * f2;
        ((Paint)localObject3).setStrokeWidth(f4);
        paramVGroup = this.OooO0O0;
        paramCanvas.drawPath(paramVGroup, (Paint)localObject3);
      }
    }
  }
  
  public boolean OooO0o(int[] paramArrayOfInt)
  {
    return this.OooO0oo.OooO00o(paramArrayOfInt);
  }
  
  public final float OooO0o0(Matrix paramMatrix)
  {
    int i = 4;
    float[] arrayOfFloat = new float[i];
    float[] tmp7_6 = arrayOfFloat;
    float[] tmp8_7 = tmp7_6;
    float[] tmp8_7 = tmp7_6;
    tmp8_7[0] = 0.0F;
    tmp8_7[1] = 1.0F;
    tmp8_7[2] = 1.0F;
    tmp8_7[3] = 0.0F;
    paramMatrix.mapVectors(arrayOfFloat);
    paramMatrix = null;
    double d1 = arrayOfFloat[0];
    int j = 1;
    double d2 = arrayOfFloat[j];
    d1 = Math.hypot(d1, d2);
    float f1 = (float)d1;
    int k = 2;
    d2 = arrayOfFloat[k];
    int m = 3;
    float f2 = arrayOfFloat[m];
    double d3 = f2;
    d2 = Math.hypot(d2, d3);
    float f3 = (float)d2;
    float f4 = arrayOfFloat[0];
    float f5 = arrayOfFloat[j];
    float f6 = arrayOfFloat[k];
    float f7 = arrayOfFloat[m];
    f4 = OooO00o(f4, f5, f6, f7);
    f7 = Math.max(f1, f3);
    f1 = 0.0F;
    boolean bool = f7 < 0.0F;
    if (bool)
    {
      f4 = Math.abs(f4);
      f1 = f4 / f7;
    }
    return f1;
  }
  
  public float getAlpha()
  {
    return getRootAlpha() / 255.0F;
  }
  
  public int getRootAlpha()
  {
    return this.OooOOO0;
  }
  
  public boolean isStateful()
  {
    Boolean localBoolean = this.OooOOOO;
    if (localBoolean == null)
    {
      boolean bool = this.OooO0oo.isStateful();
      localBoolean = Boolean.valueOf(bool);
      this.OooOOOO = localBoolean;
    }
    return this.OooOOOO.booleanValue();
  }
  
  public void setAlpha(float paramFloat)
  {
    int i = (int)(paramFloat * 255.0F);
    setRootAlpha(i);
  }
  
  public void setRootAlpha(int paramInt)
  {
    this.OooOOO0 = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer
 * JD-Core Version:    0.7.0.1
 */