package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ViewCompat;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;

public class ListPopupWindow
  implements ShowableListMenu
{
  public static Method o00o0Oo;
  public static Method o00o0Oo0;
  public Context o00OoOoo;
  public DropDownListView o00Ooo0;
  public ListAdapter o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  public int o00OooOO;
  public boolean o00OooOo;
  public boolean o00OoooO;
  public int o00Ooooo;
  public final ListPopupWindow.PopupScrollListener o00o0;
  public DataSetObserver o00o00;
  public boolean o00o000;
  public boolean o00o0000;
  public int o00o000O;
  public View o00o000o;
  public View o00o00O0;
  public Drawable o00o00Oo;
  public AdapterView.OnItemSelectedListener o00o00o;
  public AdapterView.OnItemClickListener o00o00o0;
  public final ListPopupWindow.ResizePopupRunnable o00o00oO;
  public final ListPopupWindow.PopupTouchInterceptor o00o00oo;
  public Runnable o00o0O0;
  public final ListPopupWindow.ListSelectorHider o00o0O00;
  public final Handler o00o0O0O;
  public Rect o00o0OO;
  public final Rect o00o0OO0;
  public boolean o00o0OOO;
  public PopupWindow o00o0OOo;
  public boolean o0O00o0;
  public int oo00oO;
  
  static
  {
    localObject1 = PopupWindow.class;
    int i = Build.VERSION.SDK_INT;
    j = 28;
    if (i <= j)
    {
      i = 0;
      j = 1;
      localObject2 = "setClipToScreenEnabled";
    }
    try
    {
      localObject3 = new Class[j];
      Class localClass = Boolean.TYPE;
      localObject3[0] = localClass;
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
      o00o0Oo0 = (Method)localObject2;
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      for (;;)
      {
        try
        {
          Class[] arrayOfClass = new Class[j];
          Object localObject3 = Rect.class;
          arrayOfClass[0] = localObject3;
          localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
          o00o0Oo = (Method)localObject1;
          return;
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          continue;
        }
        localNoSuchMethodException1;
      }
    }
    localObject2 = "setEpicenterBounds";
  }
  
  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, i);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    int i = -2;
    this.o00Ooo0O = i;
    this.o00Ooo0o = i;
    this.o00OooOO = 1002;
    AppCompatPopupWindow localAppCompatPopupWindow = null;
    this.o00Ooooo = 0;
    this.o00o0000 = false;
    this.o00o000 = false;
    int j = -1 >>> 1;
    this.o00o000O = j;
    this.oo00oO = 0;
    Object localObject = new androidx/appcompat/widget/ListPopupWindow$ResizePopupRunnable;
    ((ListPopupWindow.ResizePopupRunnable)localObject).<init>(this);
    this.o00o00oO = ((ListPopupWindow.ResizePopupRunnable)localObject);
    localObject = new androidx/appcompat/widget/ListPopupWindow$PopupTouchInterceptor;
    ((ListPopupWindow.PopupTouchInterceptor)localObject).<init>(this);
    this.o00o00oo = ((ListPopupWindow.PopupTouchInterceptor)localObject);
    localObject = new androidx/appcompat/widget/ListPopupWindow$PopupScrollListener;
    ((ListPopupWindow.PopupScrollListener)localObject).<init>(this);
    this.o00o0 = ((ListPopupWindow.PopupScrollListener)localObject);
    localObject = new androidx/appcompat/widget/ListPopupWindow$ListSelectorHider;
    ((ListPopupWindow.ListSelectorHider)localObject).<init>(this);
    this.o00o0O00 = ((ListPopupWindow.ListSelectorHider)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.o00o0OO0 = ((Rect)localObject);
    this.o00OoOoo = paramContext;
    localObject = new android/os/Handler;
    Looper localLooper = paramContext.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    this.o00o0O0O = ((Handler)localObject);
    localObject = R.styleable.ListPopupWindow;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt1, paramInt2);
    int k = R.styleable.ListPopupWindow_android_dropDownHorizontalOffset;
    k = ((TypedArray)localObject).getDimensionPixelOffset(k, 0);
    this.o00OooO0 = k;
    k = R.styleable.ListPopupWindow_android_dropDownVerticalOffset;
    i = ((TypedArray)localObject).getDimensionPixelOffset(k, 0);
    this.o00OooO = i;
    k = 1;
    if (i != 0) {
      this.o00OooOo = k;
    }
    ((TypedArray)localObject).recycle();
    localAppCompatPopupWindow = new androidx/appcompat/widget/AppCompatPopupWindow;
    localAppCompatPopupWindow.<init>(paramContext, paramAttributeSet, paramInt1, paramInt2);
    this.o00o0OOo = localAppCompatPopupWindow;
    localAppCompatPopupWindow.setInputMethodMode(k);
  }
  
  private static boolean isConfirmKey(int paramInt)
  {
    int i = 66;
    if (paramInt != i)
    {
      i = 23;
      if (paramInt != i) {
        return 0;
      }
    }
    paramInt = 1;
    return paramInt;
  }
  
  private void setPopupClipToScreenEnabled(boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 28;
    if (i <= j)
    {
      localObject = o00o0Oo0;
      if (localObject == null) {
        break label75;
      }
    }
    try
    {
      PopupWindow localPopupWindow = this.o00o0OOo;
      int k = 1;
      Object[] arrayOfObject = new Object[k];
      Boolean localBoolean = Boolean.valueOf(paramBoolean);
      arrayOfObject[0] = localBoolean;
      ((Method)localObject).invoke(localPopupWindow, arrayOfObject);
    }
    catch (Exception localException)
    {
      label75:
      break label75;
    }
    Object localObject = this.o00o0OOo;
    ListPopupWindow.Api29Impl.OooO0O0((PopupWindow)localObject, paramBoolean);
  }
  
  public final int OooO0Oo()
  {
    Object localObject1 = this.o00Ooo0;
    int i = -1 << -1;
    int j = -1;
    int k = 1;
    boolean bool2 = false;
    Object localObject2 = null;
    float f;
    int i1;
    int i4;
    if (localObject1 == null)
    {
      localObject1 = this.o00OoOoo;
      localObject3 = new androidx/appcompat/widget/ListPopupWindow$2;
      ((ListPopupWindow.2)localObject3).<init>(this);
      this.o00o0O0 = ((Runnable)localObject3);
      boolean bool3 = this.o00o0OOO ^ k;
      localObject3 = OooO0o((Context)localObject1, bool3);
      this.o00Ooo0 = ((DropDownListView)localObject3);
      localObject4 = this.o00o00Oo;
      if (localObject4 != null) {
        ((DropDownListView)localObject3).setSelector((Drawable)localObject4);
      }
      localObject3 = this.o00Ooo0;
      localObject4 = this.o00Ooo00;
      ((AbsListView)localObject3).setAdapter((ListAdapter)localObject4);
      localObject3 = this.o00Ooo0;
      localObject4 = this.o00o00o0;
      ((AdapterView)localObject3).setOnItemClickListener((AdapterView.OnItemClickListener)localObject4);
      this.o00Ooo0.setFocusable(k);
      this.o00Ooo0.setFocusableInTouchMode(k);
      localObject3 = this.o00Ooo0;
      localObject4 = new androidx/appcompat/widget/ListPopupWindow$3;
      ((ListPopupWindow.3)localObject4).<init>(this);
      ((AdapterView)localObject3).setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject4);
      localObject3 = this.o00Ooo0;
      localObject4 = this.o00o0;
      ((AbsListView)localObject3).setOnScrollListener((AbsListView.OnScrollListener)localObject4);
      localObject3 = this.o00o00o;
      if (localObject3 != null)
      {
        localObject4 = this.o00Ooo0;
        ((AdapterView)localObject4).setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject3);
      }
      localObject3 = this.o00Ooo0;
      localObject4 = this.o00o000o;
      if (localObject4 != null)
      {
        LinearLayout localLinearLayout = new android/widget/LinearLayout;
        localLinearLayout.<init>((Context)localObject1);
        localLinearLayout.setOrientation(k);
        localObject1 = new android/widget/LinearLayout$LayoutParams;
        f = 1.0F;
        ((LinearLayout.LayoutParams)localObject1).<init>(j, 0, f);
        int i2 = this.oo00oO;
        if (i2 != 0)
        {
          if (i2 != k)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject3 = "Invalid hint position ";
            ((StringBuilder)localObject1).append((String)localObject3);
            i1 = this.oo00oO;
            ((StringBuilder)localObject1).append(i1);
          }
          else
          {
            localLinearLayout.addView((View)localObject3, (ViewGroup.LayoutParams)localObject1);
            localLinearLayout.addView((View)localObject4);
          }
        }
        else
        {
          localLinearLayout.addView((View)localObject4);
          localLinearLayout.addView((View)localObject3, (ViewGroup.LayoutParams)localObject1);
        }
        i4 = this.o00Ooo0o;
        if (i4 >= 0)
        {
          i1 = i;
        }
        else
        {
          i4 = 0;
          localObject1 = null;
          i1 = 0;
          localObject3 = null;
        }
        i4 = View.MeasureSpec.makeMeasureSpec(i4, i1);
        ((View)localObject4).measure(i4, 0);
        localObject1 = (LinearLayout.LayoutParams)((View)localObject4).getLayoutParams();
        i1 = ((View)localObject4).getMeasuredHeight();
        i5 = ((LinearLayout.LayoutParams)localObject1).topMargin;
        i1 += i5;
        i4 = ((LinearLayout.LayoutParams)localObject1).bottomMargin;
        i1 += i4;
        i4 = i1;
        localObject3 = localLinearLayout;
      }
      else
      {
        i4 = 0;
        localObject1 = null;
      }
      localObject4 = this.o00o0OOo;
      ((PopupWindow)localObject4).setContentView((View)localObject3);
    }
    else
    {
      localObject1 = (ViewGroup)this.o00o0OOo.getContentView();
      localObject1 = this.o00o000o;
      if (localObject1 != null)
      {
        localObject3 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
        i4 = ((View)localObject1).getMeasuredHeight();
        i5 = ((LinearLayout.LayoutParams)localObject3).topMargin;
        i4 += i5;
        i1 = ((LinearLayout.LayoutParams)localObject3).bottomMargin;
        i4 += i1;
      }
      else
      {
        i4 = 0;
        localObject1 = null;
      }
    }
    Object localObject3 = this.o00o0OOo.getBackground();
    if (localObject3 != null)
    {
      localObject4 = this.o00o0OO0;
      ((Drawable)localObject3).getPadding((Rect)localObject4);
      localObject3 = this.o00o0OO0;
      i5 = ((Rect)localObject3).top;
      i1 = ((Rect)localObject3).bottom + i5;
      boolean bool4 = this.o00OooOo;
      if (!bool4)
      {
        i5 = -i5;
        this.o00OooO = i5;
      }
    }
    else
    {
      this.o00o0OO0.setEmpty();
      i1 = 0;
      localObject3 = null;
    }
    Object localObject4 = this.o00o0OOo;
    int i5 = ((PopupWindow)localObject4).getInputMethodMode();
    int i6 = 2;
    boolean bool1;
    DropDownListView localDropDownListView;
    if (i5 != i6)
    {
      bool1 = false;
      localDropDownListView = null;
    }
    localObject2 = getAnchorView();
    i5 = this.o00OooO;
    int m = OooO0oO((View)localObject2, i5, bool1);
    bool2 = this.o00o0000;
    if (!bool2)
    {
      int n = this.o00Ooo0O;
      if (n != j)
      {
        n = this.o00Ooo0o;
        i5 = -2;
        if (n != i5)
        {
          i = 1073741824;
          if (n != j)
          {
            i = View.MeasureSpec.makeMeasureSpec(n, i);
            break label804;
          }
        }
        Object localObject5 = this.o00OoOoo.getResources().getDisplayMetrics();
        j = ((DisplayMetrics)localObject5).widthPixels;
        localObject2 = this.o00o0OO0;
        i5 = ((Rect)localObject2).left;
        n = ((Rect)localObject2).right;
        i5 += n;
        j -= i5;
        i = View.MeasureSpec.makeMeasureSpec(j, i);
        label804:
        i6 = i;
        localObject4 = this.o00Ooo0;
        int i3 = 0;
        f = 0.0F;
        int i7 = -1;
        int i8 = m - i4;
        int i9 = -1;
        i = ((DropDownListView)localObject4).OooO0Oo(i, 0, i7, i8, i9);
        if (i > 0)
        {
          localObject5 = this.o00Ooo0;
          j = ((View)localObject5).getPaddingTop();
          localDropDownListView = this.o00Ooo0;
          m = localDropDownListView.getPaddingBottom();
          j += m;
          i1 += j;
          i4 += i1;
        }
        return i + i4;
      }
    }
    return m + i1;
  }
  
  public DropDownListView OooO0o(Context paramContext, boolean paramBoolean)
  {
    DropDownListView localDropDownListView = new androidx/appcompat/widget/DropDownListView;
    localDropDownListView.<init>(paramContext, paramBoolean);
    return localDropDownListView;
  }
  
  public void OooO0o0()
  {
    DropDownListView localDropDownListView = this.o00Ooo0;
    if (localDropDownListView != null)
    {
      boolean bool = true;
      localDropDownListView.setListSelectionHidden(bool);
      localDropDownListView.requestLayout();
    }
  }
  
  public final int OooO0oO(View paramView, int paramInt, boolean paramBoolean)
  {
    return ListPopupWindow.Api24Impl.OooO00o(this.o00o0OOo, paramView, paramInt, paramBoolean);
  }
  
  public final void OooO0oo()
  {
    Object localObject = this.o00o000o;
    if (localObject != null)
    {
      localObject = ((View)localObject).getParent();
      boolean bool = localObject instanceof ViewGroup;
      if (bool)
      {
        localObject = (ViewGroup)localObject;
        View localView = this.o00o000o;
        ((ViewGroup)localObject).removeView(localView);
      }
    }
  }
  
  public void dismiss()
  {
    this.o00o0OOo.dismiss();
    OooO0oo();
    this.o00o0OOo.setContentView(null);
    this.o00Ooo0 = null;
    Handler localHandler = this.o00o0O0O;
    ListPopupWindow.ResizePopupRunnable localResizePopupRunnable = this.o00o00oO;
    localHandler.removeCallbacks(localResizePopupRunnable);
  }
  
  public View getAnchorView()
  {
    return this.o00o00O0;
  }
  
  public int getAnimationStyle()
  {
    return this.o00o0OOo.getAnimationStyle();
  }
  
  public Drawable getBackground()
  {
    return this.o00o0OOo.getBackground();
  }
  
  public Rect getEpicenterBounds()
  {
    Rect localRect1 = this.o00o0OO;
    if (localRect1 != null)
    {
      localRect1 = new android/graphics/Rect;
      Rect localRect2 = this.o00o0OO;
      localRect1.<init>(localRect2);
    }
    else
    {
      localRect1 = null;
    }
    return localRect1;
  }
  
  public int getHeight()
  {
    return this.o00Ooo0O;
  }
  
  public int getHorizontalOffset()
  {
    return this.o00OooO0;
  }
  
  public int getInputMethodMode()
  {
    return this.o00o0OOo.getInputMethodMode();
  }
  
  public ListView getListView()
  {
    return this.o00Ooo0;
  }
  
  public int getPromptPosition()
  {
    return this.oo00oO;
  }
  
  public Object getSelectedItem()
  {
    boolean bool = isShowing();
    if (!bool) {
      return null;
    }
    return this.o00Ooo0.getSelectedItem();
  }
  
  public long getSelectedItemId()
  {
    boolean bool = isShowing();
    if (!bool) {
      return -9223372036854775808L;
    }
    return this.o00Ooo0.getSelectedItemId();
  }
  
  public int getSelectedItemPosition()
  {
    boolean bool = isShowing();
    if (!bool) {
      return -1;
    }
    return this.o00Ooo0.getSelectedItemPosition();
  }
  
  public View getSelectedView()
  {
    boolean bool = isShowing();
    if (!bool) {
      return null;
    }
    return this.o00Ooo0.getSelectedView();
  }
  
  public int getSoftInputMode()
  {
    return this.o00o0OOo.getSoftInputMode();
  }
  
  public int getVerticalOffset()
  {
    boolean bool = this.o00OooOo;
    if (!bool) {
      return 0;
    }
    return this.o00OooO;
  }
  
  public int getWidth()
  {
    return this.o00Ooo0o;
  }
  
  public boolean isDropDownAlwaysVisible()
  {
    return this.o00o0000;
  }
  
  public boolean isInputMethodNotNeeded()
  {
    PopupWindow localPopupWindow = this.o00o0OOo;
    int i = localPopupWindow.getInputMethodMode();
    int j = 2;
    if (i == j)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localPopupWindow = null;
    }
    return i;
  }
  
  public boolean isModal()
  {
    return this.o00o0OOO;
  }
  
  public boolean isShowing()
  {
    return this.o00o0OOo.isShowing();
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    Object localObject = this.o00o00;
    if (localObject == null)
    {
      localObject = new androidx/appcompat/widget/ListPopupWindow$PopupDataSetObserver;
      ((ListPopupWindow.PopupDataSetObserver)localObject).<init>(this);
      this.o00o00 = ((DataSetObserver)localObject);
    }
    else
    {
      ListAdapter localListAdapter = this.o00Ooo00;
      if (localListAdapter != null) {
        localListAdapter.unregisterDataSetObserver((DataSetObserver)localObject);
      }
    }
    this.o00Ooo00 = paramListAdapter;
    if (paramListAdapter != null)
    {
      localObject = this.o00o00;
      paramListAdapter.registerDataSetObserver((DataSetObserver)localObject);
    }
    paramListAdapter = this.o00Ooo0;
    if (paramListAdapter != null)
    {
      localObject = this.o00Ooo00;
      paramListAdapter.setAdapter((ListAdapter)localObject);
    }
  }
  
  public void setAnchorView(View paramView)
  {
    this.o00o00O0 = paramView;
  }
  
  public void setAnimationStyle(int paramInt)
  {
    this.o00o0OOo.setAnimationStyle(paramInt);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.o00o0OOo.setBackgroundDrawable(paramDrawable);
  }
  
  public void setContentWidth(int paramInt)
  {
    Object localObject = this.o00o0OOo.getBackground();
    if (localObject != null)
    {
      Rect localRect = this.o00o0OO0;
      ((Drawable)localObject).getPadding(localRect);
      localObject = this.o00o0OO0;
      int i = ((Rect)localObject).left;
      int j = ((Rect)localObject).right;
      i = i + j + paramInt;
      this.o00Ooo0o = i;
    }
    else
    {
      setWidth(paramInt);
    }
  }
  
  public void setDropDownAlwaysVisible(boolean paramBoolean)
  {
    this.o00o0000 = paramBoolean;
  }
  
  public void setDropDownGravity(int paramInt)
  {
    this.o00Ooooo = paramInt;
  }
  
  public void setEpicenterBounds(Rect paramRect)
  {
    Rect localRect;
    if (paramRect != null)
    {
      localRect = new android/graphics/Rect;
      localRect.<init>(paramRect);
    }
    else
    {
      localRect = null;
    }
    this.o00o0OO = localRect;
  }
  
  public void setForceIgnoreOutsideTouch(boolean paramBoolean)
  {
    this.o00o000 = paramBoolean;
  }
  
  public void setHeight(int paramInt)
  {
    if (paramInt < 0)
    {
      int i = -2;
      if (i != paramInt)
      {
        i = -1;
        if (i != paramInt)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
          throw localIllegalArgumentException;
        }
      }
    }
    this.o00Ooo0O = paramInt;
  }
  
  public void setHorizontalOffset(int paramInt)
  {
    this.o00OooO0 = paramInt;
  }
  
  public void setInputMethodMode(int paramInt)
  {
    this.o00o0OOo.setInputMethodMode(paramInt);
  }
  
  public void setListItemExpandMax(int paramInt)
  {
    this.o00o000O = paramInt;
  }
  
  public void setListSelector(Drawable paramDrawable)
  {
    this.o00o00Oo = paramDrawable;
  }
  
  public void setModal(boolean paramBoolean)
  {
    this.o00o0OOO = paramBoolean;
    this.o00o0OOo.setFocusable(paramBoolean);
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.o00o0OOo.setOnDismissListener(paramOnDismissListener);
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.o00o00o0 = paramOnItemClickListener;
  }
  
  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.o00o00o = paramOnItemSelectedListener;
  }
  
  public void setOverlapAnchor(boolean paramBoolean)
  {
    this.o00OoooO = true;
    this.o0O00o0 = paramBoolean;
  }
  
  public void setPromptPosition(int paramInt)
  {
    this.oo00oO = paramInt;
  }
  
  public void setPromptView(View paramView)
  {
    boolean bool = isShowing();
    if (bool) {
      OooO0oo();
    }
    this.o00o000o = paramView;
    if (bool) {
      show();
    }
  }
  
  public void setSelection(int paramInt)
  {
    DropDownListView localDropDownListView = this.o00Ooo0;
    boolean bool = isShowing();
    if ((bool) && (localDropDownListView != null))
    {
      localDropDownListView.setListSelectionHidden(false);
      localDropDownListView.setSelection(paramInt);
      int i = localDropDownListView.getChoiceMode();
      if (i != 0)
      {
        i = 1;
        localDropDownListView.setItemChecked(paramInt, i);
      }
    }
  }
  
  public void setSoftInputMode(int paramInt)
  {
    this.o00o0OOo.setSoftInputMode(paramInt);
  }
  
  public void setVerticalOffset(int paramInt)
  {
    this.o00OooO = paramInt;
    this.o00OooOo = true;
  }
  
  public void setWidth(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setWindowLayoutType(int paramInt)
  {
    this.o00OooOO = paramInt;
  }
  
  public void show()
  {
    int i = OooO0Oo();
    boolean bool3 = isInputMethodNotNeeded();
    Object localObject1 = this.o00o0OOo;
    int n = this.o00OooOO;
    PopupWindowCompat.OooO0O0((PopupWindow)localObject1, n);
    localObject1 = this.o00o0OOo;
    boolean bool5 = ((PopupWindow)localObject1).isShowing();
    n = 1;
    int i3 = -2;
    int i6 = -1;
    int i4;
    Rect localRect;
    if (bool5)
    {
      localObject1 = getAnchorView();
      bool5 = ViewCompat.o000oOoO((View)localObject1);
      if (!bool5) {
        return;
      }
      i2 = this.o00Ooo0o;
      if (i2 == i6)
      {
        i2 = i6;
      }
      else if (i2 == i3)
      {
        localObject1 = getAnchorView();
        i2 = ((View)localObject1).getWidth();
      }
      int i7 = this.o00Ooo0O;
      if (i7 == i6)
      {
        if (!bool3) {
          i = i6;
        }
        if (bool3)
        {
          localObject2 = this.o00o0OOo;
          i3 = this.o00Ooo0o;
          if (i3 == i6) {
            i3 = i6;
          } else {
            i3 = 0;
          }
          ((PopupWindow)localObject2).setWidth(i3);
          localObject2 = this.o00o0OOo;
          ((PopupWindow)localObject2).setHeight(0);
        }
        else
        {
          localObject2 = this.o00o0OOo;
          i3 = this.o00Ooo0o;
          if (i3 == i6) {
            i3 = i6;
          } else {
            i3 = 0;
          }
          ((PopupWindow)localObject2).setWidth(i3);
          localObject2 = this.o00o0OOo;
          ((PopupWindow)localObject2).setHeight(i6);
        }
      }
      else if (i7 != i3)
      {
        i = i7;
      }
      localObject2 = this.o00o0OOo;
      i4 = this.o00o000;
      if (i4 == 0)
      {
        i4 = this.o00o0000;
        if (i4 == 0) {}
      }
      else
      {
        n = 0;
        localRect = null;
      }
      ((PopupWindow)localObject2).setOutsideTouchable(n);
      PopupWindow localPopupWindow = this.o00o0OOo;
      View localView = getAnchorView();
      int i8 = this.o00OooO0;
      int i9 = this.o00OooO;
      int i10;
      if (i2 < 0) {
        i10 = i6;
      } else {
        i10 = i2;
      }
      int i11;
      if (i < 0) {
        i11 = i6;
      } else {
        i11 = i;
      }
      localPopupWindow.update(localView, i8, i9, i10, i11);
    }
    else
    {
      int k = this.o00Ooo0o;
      if (k == i6)
      {
        k = i6;
      }
      else if (k == i4)
      {
        localObject2 = getAnchorView();
        k = ((View)localObject2).getWidth();
      }
      i2 = this.o00Ooo0O;
      if (i2 == i6) {
        i = i6;
      } else if (i2 != i4) {
        i = i2;
      }
      localObject1 = this.o00o0OOo;
      ((PopupWindow)localObject1).setWidth(k);
      localObject2 = this.o00o0OOo;
      ((PopupWindow)localObject2).setHeight(i);
      setPopupClipToScreenEnabled(n);
      localObject3 = this.o00o0OOo;
      boolean bool4 = this.o00o000;
      if (!bool4)
      {
        bool4 = this.o00o0000;
        if (!bool4)
        {
          bool4 = n;
          break label497;
        }
      }
      bool4 = false;
      localObject2 = null;
      label497:
      ((PopupWindow)localObject3).setOutsideTouchable(bool4);
      localObject3 = this.o00o0OOo;
      localObject2 = this.o00o00oo;
      ((PopupWindow)localObject3).setTouchInterceptor((View.OnTouchListener)localObject2);
      boolean bool1 = this.o00OoooO;
      if (bool1)
      {
        localObject3 = this.o00o0OOo;
        bool4 = this.o0O00o0;
        PopupWindowCompat.OooO00o((PopupWindow)localObject3, bool4);
      }
      int j = Build.VERSION.SDK_INT;
      int m = 28;
      if (j <= m)
      {
        localObject3 = o00o0Oo;
        if (localObject3 == null) {
          break label624;
        }
      }
    }
    try
    {
      localObject2 = this.o00o0OOo;
      localObject1 = new Object[n];
      localRect = this.o00o0OO;
      localObject1[0] = localRect;
      ((Method)localObject3).invoke(localObject2, (Object[])localObject1);
    }
    catch (Exception localException)
    {
      int i1;
      int i5;
      boolean bool2;
      break label624;
    }
    Object localObject3 = this.o00o0OOo;
    Object localObject2 = this.o00o0OO;
    ListPopupWindow.Api29Impl.OooO00o((PopupWindow)localObject3, (Rect)localObject2);
    label624:
    localObject3 = this.o00o0OOo;
    localObject2 = getAnchorView();
    int i2 = this.o00OooO0;
    i1 = this.o00OooO;
    i5 = this.o00Ooooo;
    PopupWindowCompat.OooO0OO((PopupWindow)localObject3, (View)localObject2, i2, i1, i5);
    localObject3 = this.o00Ooo0;
    ((AdapterView)localObject3).setSelection(i6);
    bool2 = this.o00o0OOO;
    if (bool2)
    {
      localObject3 = this.o00Ooo0;
      bool2 = ((DropDownListView)localObject3).isInTouchMode();
      if (!bool2) {}
    }
    else
    {
      OooO0o0();
    }
    bool2 = this.o00o0OOO;
    if (!bool2)
    {
      localObject3 = this.o00o0O0O;
      localObject2 = this.o00o0O00;
      ((Handler)localObject3).post((Runnable)localObject2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow
 * JD-Core Version:    0.7.0.1
 */