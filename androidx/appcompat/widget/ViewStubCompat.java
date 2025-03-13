package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.R.styleable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
  extends View
{
  public int o00OoOoo = 0;
  public WeakReference o00Ooo0;
  public int o00Ooo00;
  public LayoutInflater o00Ooo0O;
  public ViewStubCompat.OnInflateListener o00Ooo0o;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int[] arrayOfInt = R.styleable.ViewStubCompat;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    int i = R.styleable.ViewStubCompat_android_inflatedId;
    paramInt = -1;
    i = paramContext.getResourceId(i, paramInt);
    this.o00Ooo00 = i;
    i = R.styleable.ViewStubCompat_android_layout;
    i = paramContext.getResourceId(i, 0);
    this.o00OoOoo = i;
    i = R.styleable.ViewStubCompat_android_id;
    i = paramContext.getResourceId(i, paramInt);
    setId(i);
    paramContext.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public View OooO00o()
  {
    Object localObject1 = getParent();
    boolean bool = localObject1 instanceof ViewGroup;
    if (bool)
    {
      int i = this.o00OoOoo;
      if (i != 0)
      {
        localObject1 = (ViewGroup)localObject1;
        Object localObject2 = this.o00Ooo0O;
        if (localObject2 == null) {
          localObject2 = LayoutInflater.from(getContext());
        }
        int j = this.o00OoOoo;
        ViewGroup.LayoutParams localLayoutParams = null;
        localObject2 = ((LayoutInflater)localObject2).inflate(j, (ViewGroup)localObject1, false);
        j = this.o00Ooo00;
        int k = -1;
        if (j != k) {
          ((View)localObject2).setId(j);
        }
        j = ((ViewGroup)localObject1).indexOfChild(this);
        ((ViewGroup)localObject1).removeViewInLayout(this);
        localLayoutParams = getLayoutParams();
        if (localLayoutParams != null) {
          ((ViewGroup)localObject1).addView((View)localObject2, j, localLayoutParams);
        } else {
          ((ViewGroup)localObject1).addView((View)localObject2, j);
        }
        localObject1 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject1).<init>(localObject2);
        this.o00Ooo0 = ((WeakReference)localObject1);
        localObject1 = this.o00Ooo0o;
        if (localObject1 != null) {
          ((ViewStubCompat.OnInflateListener)localObject1).OooO00o(this, (View)localObject2);
        }
        return localObject2;
      }
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("ViewStub must have a valid layoutResource");
      throw ((Throwable)localObject1);
    }
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("ViewStub must have a non-null ViewGroup viewParent");
    throw ((Throwable)localObject1);
  }
  
  public void dispatchDraw(Canvas paramCanvas) {}
  
  public void draw(Canvas paramCanvas) {}
  
  public int getInflatedId()
  {
    return this.o00Ooo00;
  }
  
  public LayoutInflater getLayoutInflater()
  {
    return this.o00Ooo0O;
  }
  
  public int getLayoutResource()
  {
    return this.o00OoOoo;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void setInflatedId(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public void setLayoutInflater(LayoutInflater paramLayoutInflater)
  {
    this.o00Ooo0O = paramLayoutInflater;
  }
  
  public void setLayoutResource(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setOnInflateListener(ViewStubCompat.OnInflateListener paramOnInflateListener)
  {
    this.o00Ooo0o = paramOnInflateListener;
  }
  
  public void setVisibility(int paramInt)
  {
    Object localObject = this.o00Ooo0;
    if (localObject != null)
    {
      localObject = (View)((Reference)localObject).get();
      if (localObject != null)
      {
        ((View)localObject).setVisibility(paramInt);
      }
      else
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("setVisibility called on un-referenced view");
        throw localIllegalStateException;
      }
    }
    else
    {
      super.setVisibility(paramInt);
      if (paramInt != 0)
      {
        int i = 4;
        if (paramInt != i) {}
      }
      else
      {
        OooO00o();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ViewStubCompat
 * JD-Core Version:    0.7.0.1
 */