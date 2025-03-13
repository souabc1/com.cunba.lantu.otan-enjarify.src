package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.swiperefreshlayout.R.styleable;

class CircleImageView
  extends ImageView
{
  public Animation.AnimationListener o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  
  public CircleImageView(Context paramContext)
  {
    super(paramContext);
    paramContext = getContext().getResources().getDisplayMetrics();
    float f1 = paramContext.density;
    float f2 = 1.75F * f1;
    int i = (int)f2;
    OvalShape localOvalShape = null;
    float f3 = 0.0F * f1;
    int j = (int)f3;
    float f4 = 3.5F * f1;
    int k = (int)f4;
    this.o00Ooo00 = k;
    Object localObject1 = getContext();
    Object localObject2 = R.styleable.SwipeRefreshLayout;
    localObject1 = ((Context)localObject1).obtainStyledAttributes((int[])localObject2);
    int n = R.styleable.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor;
    int i1 = -328966;
    n = ((TypedArray)localObject1).getColor(n, i1);
    this.o00Ooo0 = n;
    ((TypedArray)localObject1).recycle();
    int m = OooO00o();
    Object localObject3;
    if (m != 0)
    {
      localObject3 = new android/graphics/drawable/ShapeDrawable;
      localOvalShape = new android/graphics/drawable/shapes/OvalShape;
      localOvalShape.<init>();
      ((ShapeDrawable)localObject3).<init>(localOvalShape);
      j = 1082130432;
      f3 = 4.0F;
      f1 *= f3;
      ViewCompat.oo0o0Oo(this, f1);
    }
    else
    {
      paramContext = new android/graphics/drawable/ShapeDrawable;
      localObject1 = new androidx/swiperefreshlayout/widget/CircleImageView$OvalShadow;
      n = this.o00Ooo00;
      ((CircleImageView.OvalShadow)localObject1).<init>(this, n);
      paramContext.<init>((Shape)localObject1);
      m = 1;
      f4 = 1.4E-45F;
      localObject2 = paramContext.getPaint();
      setLayerType(m, (Paint)localObject2);
      localObject1 = paramContext.getPaint();
      n = this.o00Ooo00;
      float f5 = n;
      f3 = j;
      f2 = i;
      i1 = 503316480;
      ((Paint)localObject1).setShadowLayer(f5, f3, f2, i1);
      i = this.o00Ooo00;
      setPadding(i, i, i, i);
      localObject3 = paramContext;
    }
    paramContext = ((ShapeDrawable)localObject3).getPaint();
    j = this.o00Ooo0;
    paramContext.setColor(j);
    ViewCompat.o0ooOoO(this, (Drawable)localObject3);
  }
  
  public final boolean OooO00o()
  {
    return true;
  }
  
  public int getBackgroundColor()
  {
    return this.o00Ooo0;
  }
  
  public void onAnimationEnd()
  {
    super.onAnimationEnd();
    Animation.AnimationListener localAnimationListener = this.o00OoOoo;
    if (localAnimationListener != null)
    {
      Animation localAnimation = getAnimation();
      localAnimationListener.onAnimationEnd(localAnimation);
    }
  }
  
  public void onAnimationStart()
  {
    super.onAnimationStart();
    Animation.AnimationListener localAnimationListener = this.o00OoOoo;
    if (localAnimationListener != null)
    {
      Animation localAnimation = getAnimation();
      localAnimationListener.onAnimationStart(localAnimation);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = OooO00o();
    if (paramInt1 == 0)
    {
      paramInt1 = getMeasuredWidth();
      paramInt2 = this.o00Ooo00 * 2;
      paramInt1 += paramInt2;
      paramInt2 = getMeasuredHeight();
      int i = this.o00Ooo00 * 2;
      paramInt2 += i;
      setMeasuredDimension(paramInt1, paramInt2);
    }
  }
  
  public void setAnimationListener(Animation.AnimationListener paramAnimationListener)
  {
    this.o00OoOoo = paramAnimationListener;
  }
  
  public void setBackgroundColor(int paramInt)
  {
    Object localObject = getBackground();
    boolean bool = localObject instanceof ShapeDrawable;
    if (bool)
    {
      localObject = ((ShapeDrawable)getBackground()).getPaint();
      ((Paint)localObject).setColor(paramInt);
      this.o00Ooo0 = paramInt;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircleImageView
 * JD-Core Version:    0.7.0.1
 */