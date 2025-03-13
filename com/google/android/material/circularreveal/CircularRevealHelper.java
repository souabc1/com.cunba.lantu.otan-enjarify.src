package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.math.MathUtils;
import m54207b69;

public class CircularRevealHelper
{
  public static final int BITMAP_SHADER = 0;
  public static final int CLIP_PATH = 1;
  private static final boolean DEBUG = false;
  public static final int REVEAL_ANIMATOR = 2;
  public static final int STRATEGY = 2;
  private boolean buildingCircularRevealCache;
  private Paint debugPaint;
  private final CircularRevealHelper.Delegate delegate;
  private boolean hasCircularRevealCache;
  private Drawable overlayDrawable;
  private CircularRevealWidget.RevealInfo revealInfo;
  private final Paint revealPaint;
  private final Path revealPath;
  private final Paint scrimPaint;
  private final View view;
  
  public CircularRevealHelper(CircularRevealHelper.Delegate paramDelegate)
  {
    this.delegate = paramDelegate;
    paramDelegate = (View)paramDelegate;
    this.view = paramDelegate;
    paramDelegate.setWillNotDraw(false);
    paramDelegate = new android/graphics/Path;
    paramDelegate.<init>();
    this.revealPath = paramDelegate;
    paramDelegate = new android/graphics/Paint;
    paramDelegate.<init>(7);
    this.revealPaint = paramDelegate;
    paramDelegate = new android/graphics/Paint;
    paramDelegate.<init>(1);
    this.scrimPaint = paramDelegate;
    paramDelegate.setColor(0);
  }
  
  private void drawDebugCircle(Canvas paramCanvas, int paramInt, float paramFloat)
  {
    this.debugPaint.setColor(paramInt);
    this.debugPaint.setStrokeWidth(paramFloat);
    CircularRevealWidget.RevealInfo localRevealInfo = this.revealInfo;
    float f1 = localRevealInfo.centerX;
    float f2 = localRevealInfo.centerY;
    float f3 = localRevealInfo.radius;
    paramFloat /= 2.0F;
    f3 -= paramFloat;
    Paint localPaint = this.debugPaint;
    paramCanvas.drawCircle(f1, f2, f3, localPaint);
  }
  
  private void drawDebugMode(Canvas paramCanvas)
  {
    Object localObject = this.delegate;
    ((CircularRevealHelper.Delegate)localObject).actualDraw(paramCanvas);
    boolean bool = shouldDrawScrim();
    float f1;
    float f3;
    if (bool)
    {
      localObject = this.revealInfo;
      f1 = ((CircularRevealWidget.RevealInfo)localObject).centerX;
      float f2 = ((CircularRevealWidget.RevealInfo)localObject).centerY;
      f3 = ((CircularRevealWidget.RevealInfo)localObject).radius;
      Paint localPaint = this.scrimPaint;
      paramCanvas.drawCircle(f1, f2, f3, localPaint);
    }
    bool = shouldDrawCircularReveal();
    if (bool)
    {
      drawDebugCircle(paramCanvas, -16777216, 10.0F);
      int i = -65536;
      f3 = 0.0F / 0.0F;
      f1 = 5.0F;
      drawDebugCircle(paramCanvas, i, f1);
    }
    drawOverlayDrawable(paramCanvas);
  }
  
  private void drawOverlayDrawable(Canvas paramCanvas)
  {
    boolean bool = shouldDrawOverlayDrawable();
    if (bool)
    {
      Object localObject = this.overlayDrawable.getBounds();
      CircularRevealWidget.RevealInfo localRevealInfo1 = this.revealInfo;
      float f1 = localRevealInfo1.centerX;
      int j = ((Rect)localObject).width();
      float f2 = j;
      float f3 = 2.0F;
      f2 /= f3;
      f1 -= f2;
      CircularRevealWidget.RevealInfo localRevealInfo2 = this.revealInfo;
      f2 = localRevealInfo2.centerY;
      int i = ((Rect)localObject).height();
      float f4 = i / f3;
      f2 -= f4;
      paramCanvas.translate(f1, f2);
      localObject = this.overlayDrawable;
      ((Drawable)localObject).draw(paramCanvas);
      f4 = -f1;
      f1 = -f2;
      paramCanvas.translate(f4, f1);
    }
  }
  
  private float getDistanceToFurthestCorner(CircularRevealWidget.RevealInfo paramRevealInfo)
  {
    float f1 = paramRevealInfo.centerX;
    float f2 = paramRevealInfo.centerY;
    float f3 = this.view.getWidth();
    float f4 = this.view.getHeight();
    return MathUtils.distanceToFurthestCorner(f1, f2, 0.0F, 0.0F, f3, f4);
  }
  
  private void invalidateRevealInfo()
  {
    int i = STRATEGY;
    int j = 1;
    if (i == j)
    {
      this.revealPath.rewind();
      CircularRevealWidget.RevealInfo localRevealInfo = this.revealInfo;
      if (localRevealInfo != null)
      {
        Path localPath = this.revealPath;
        float f1 = localRevealInfo.centerX;
        float f2 = localRevealInfo.centerY;
        float f3 = localRevealInfo.radius;
        Path.Direction localDirection = Path.Direction.CW;
        localPath.addCircle(f1, f2, f3, localDirection);
      }
    }
    this.view.invalidate();
  }
  
  private boolean shouldDrawCircularReveal()
  {
    CircularRevealWidget.RevealInfo localRevealInfo = this.revealInfo;
    boolean bool1 = false;
    boolean bool2 = true;
    if (localRevealInfo != null)
    {
      bool3 = localRevealInfo.isInvalid();
      if (!bool3)
      {
        bool3 = false;
        localRevealInfo = null;
        break label38;
      }
    }
    boolean bool3 = bool2;
    label38:
    int i = STRATEGY;
    if (i == 0)
    {
      if (!bool3)
      {
        bool3 = this.hasCircularRevealCache;
        if (bool3) {
          bool1 = bool2;
        }
      }
      return bool1;
    }
    return bool3 ^ bool2;
  }
  
  private boolean shouldDrawOverlayDrawable()
  {
    boolean bool = this.buildingCircularRevealCache;
    if (!bool)
    {
      localObject = this.overlayDrawable;
      if (localObject != null)
      {
        localObject = this.revealInfo;
        if (localObject != null) {
          return true;
        }
      }
    }
    bool = false;
    Object localObject = null;
    return bool;
  }
  
  private boolean shouldDrawScrim()
  {
    boolean bool = this.buildingCircularRevealCache;
    if (!bool)
    {
      localPaint = this.scrimPaint;
      i = Color.alpha(localPaint.getColor());
      if (i != 0) {
        return 1;
      }
    }
    int i = 0;
    Paint localPaint = null;
    return i;
  }
  
  public void buildCircularRevealCache()
  {
    int i = STRATEGY;
    if (i == 0)
    {
      i = 1;
      this.buildingCircularRevealCache = i;
      this.hasCircularRevealCache = false;
      this.view.buildDrawingCache();
      Bitmap localBitmap = this.view.getDrawingCache();
      Object localObject1;
      Object localObject2;
      if (localBitmap == null)
      {
        localObject1 = this.view;
        int j = ((View)localObject1).getWidth();
        if (j != 0)
        {
          localObject1 = this.view;
          j = ((View)localObject1).getHeight();
          if (j != 0)
          {
            int k = this.view.getWidth();
            j = this.view.getHeight();
            localObject2 = Bitmap.Config.ARGB_8888;
            localBitmap = Bitmap.createBitmap(k, j, (Bitmap.Config)localObject2);
            localObject1 = new android/graphics/Canvas;
            ((Canvas)localObject1).<init>(localBitmap);
            localObject2 = this.view;
            ((View)localObject2).draw((Canvas)localObject1);
          }
        }
      }
      if (localBitmap != null)
      {
        localObject1 = this.revealPaint;
        localObject2 = new android/graphics/BitmapShader;
        Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
        ((BitmapShader)localObject2).<init>(localBitmap, localTileMode, localTileMode);
        ((Paint)localObject1).setShader((Shader)localObject2);
      }
      this.buildingCircularRevealCache = false;
      this.hasCircularRevealCache = i;
    }
  }
  
  public void destroyCircularRevealCache()
  {
    int i = STRATEGY;
    if (i == 0)
    {
      i = 0;
      this.hasCircularRevealCache = false;
      this.view.destroyDrawingCache();
      this.revealPaint.setShader(null);
      View localView = this.view;
      localView.invalidate();
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    boolean bool1 = shouldDrawCircularReveal();
    boolean bool2;
    if (bool1)
    {
      int i = STRATEGY;
      float f1;
      if (i != 0)
      {
        int n = 1;
        f1 = 1.4E-45F;
        if (i != n)
        {
          n = 2;
          f1 = 2.802597E-045F;
          int j;
          if (i == n)
          {
            localObject1 = this.delegate;
            ((CircularRevealHelper.Delegate)localObject1).actualDraw(paramCanvas);
            j = shouldDrawScrim();
            if (j == 0) {
              break label399;
            }
          }
          else
          {
            paramCanvas = new java/lang/IllegalStateException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject3 = m54207b69.F54207b69_11("+h3D071D201C1D0D2124161653272928182C1E21245C");
            ((StringBuilder)localObject2).append((String)localObject3);
            ((StringBuilder)localObject2).append(j);
            localObject1 = ((StringBuilder)localObject2).toString();
            paramCanvas.<init>((String)localObject1);
            throw paramCanvas;
          }
        }
        else
        {
          int k = paramCanvas.save();
          localObject2 = this.revealPath;
          paramCanvas.clipPath((Path)localObject2);
          localObject2 = this.delegate;
          ((CircularRevealHelper.Delegate)localObject2).actualDraw(paramCanvas);
          boolean bool3 = shouldDrawScrim();
          if (bool3)
          {
            localPaint1 = null;
            f2 = 0.0F;
            f3 = this.view.getWidth();
            localObject2 = this.view;
            int i1 = ((View)localObject2).getHeight();
            float f4 = i1;
            Paint localPaint2 = this.scrimPaint;
            localObject3 = paramCanvas;
            paramCanvas.drawRect(0.0F, 0.0F, f3, f4, localPaint2);
          }
          paramCanvas.restoreToCount(k);
          break label399;
        }
      }
      else
      {
        localObject1 = this.revealInfo;
        f1 = ((CircularRevealWidget.RevealInfo)localObject1).centerX;
        f5 = ((CircularRevealWidget.RevealInfo)localObject1).centerY;
        float f6 = ((CircularRevealWidget.RevealInfo)localObject1).radius;
        localPaint1 = this.revealPaint;
        paramCanvas.drawCircle(f1, f5, f6, localPaint1);
        bool2 = shouldDrawScrim();
        if (!bool2) {
          break label399;
        }
        localObject1 = this.revealInfo;
        f1 = ((CircularRevealWidget.RevealInfo)localObject1).centerX;
        f5 = ((CircularRevealWidget.RevealInfo)localObject1).centerY;
        f6 = ((CircularRevealWidget.RevealInfo)localObject1).radius;
        localPaint1 = this.scrimPaint;
        paramCanvas.drawCircle(f1, f5, f6, localPaint1);
        break label399;
      }
    }
    else
    {
      localObject1 = this.delegate;
      ((CircularRevealHelper.Delegate)localObject1).actualDraw(paramCanvas);
      bool2 = shouldDrawScrim();
      if (!bool2) {
        break label399;
      }
    }
    float f5 = 0.0F;
    Object localObject3 = null;
    Paint localPaint1 = null;
    float f2 = this.view.getWidth();
    Object localObject1 = this.view;
    int m = ((View)localObject1).getHeight();
    float f3 = m;
    Paint localPaint3 = this.scrimPaint;
    Object localObject2 = paramCanvas;
    paramCanvas.drawRect(0.0F, 0.0F, f2, f3, localPaint3);
    label399:
    drawOverlayDrawable(paramCanvas);
  }
  
  public Drawable getCircularRevealOverlayDrawable()
  {
    return this.overlayDrawable;
  }
  
  public int getCircularRevealScrimColor()
  {
    return this.scrimPaint.getColor();
  }
  
  public CircularRevealWidget.RevealInfo getRevealInfo()
  {
    CircularRevealWidget.RevealInfo localRevealInfo1 = this.revealInfo;
    if (localRevealInfo1 == null) {
      return null;
    }
    CircularRevealWidget.RevealInfo localRevealInfo2 = new com/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;
    localRevealInfo2.<init>(localRevealInfo1);
    boolean bool = localRevealInfo2.isInvalid();
    if (bool)
    {
      float f = getDistanceToFurthestCorner(localRevealInfo2);
      localRevealInfo2.radius = f;
    }
    return localRevealInfo2;
  }
  
  public boolean isOpaque()
  {
    CircularRevealHelper.Delegate localDelegate = this.delegate;
    boolean bool = localDelegate.actualIsOpaque();
    if (bool)
    {
      bool = shouldDrawCircularReveal();
      if (!bool) {
        return true;
      }
    }
    bool = false;
    localDelegate = null;
    return bool;
  }
  
  public void setCircularRevealOverlayDrawable(Drawable paramDrawable)
  {
    this.overlayDrawable = paramDrawable;
    this.view.invalidate();
  }
  
  public void setCircularRevealScrimColor(int paramInt)
  {
    this.scrimPaint.setColor(paramInt);
    this.view.invalidate();
  }
  
  public void setRevealInfo(CircularRevealWidget.RevealInfo paramRevealInfo)
  {
    boolean bool;
    float f1;
    if (paramRevealInfo == null)
    {
      bool = false;
      f1 = 0.0F;
      paramRevealInfo = null;
      this.revealInfo = null;
    }
    else
    {
      CircularRevealWidget.RevealInfo localRevealInfo = this.revealInfo;
      if (localRevealInfo == null)
      {
        localRevealInfo = new com/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;
        localRevealInfo.<init>(paramRevealInfo);
        this.revealInfo = localRevealInfo;
      }
      else
      {
        localRevealInfo.set(paramRevealInfo);
      }
      float f2 = paramRevealInfo.radius;
      f1 = getDistanceToFurthestCorner(paramRevealInfo);
      float f3 = 1.0E-004F;
      bool = MathUtils.geq(f2, f1, f3);
      if (bool)
      {
        paramRevealInfo = this.revealInfo;
        f2 = 3.4028235E+38F;
        paramRevealInfo.radius = f2;
      }
    }
    invalidateRevealInfo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.circularreveal.CircularRevealHelper
 * JD-Core Version:    0.7.0.1
 */