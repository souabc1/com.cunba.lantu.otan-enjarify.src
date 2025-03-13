package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AbsSpinner;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;

public class AppCompatSpinner
  extends Spinner
  implements TintableBackgroundView
{
  public static final int[] o00OooOo = { 16843505 };
  public final AppCompatBackgroundHelper o00OoOoo;
  public ForwardingListener o00Ooo0;
  public final Context o00Ooo00;
  public SpinnerAdapter o00Ooo0O;
  public final boolean o00Ooo0o;
  public int o00OooO;
  public AppCompatSpinner.SpinnerPopup o00OooO0;
  public final Rect o00OooOO;
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this(paramContext, paramAttributeSet, paramInt1, paramInt2, null);
  }
  
  /* Error */
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, Resources.Theme paramTheme)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 44	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: new 46	android/graphics/Rect
    //   10: astore 6
    //   12: aload 6
    //   14: invokespecial 49	android/graphics/Rect:<init>	()V
    //   17: aload_0
    //   18: aload 6
    //   20: putfield 51	androidx/appcompat/widget/AppCompatSpinner:o00OooOO	Landroid/graphics/Rect;
    //   23: aload_0
    //   24: invokevirtual 57	android/view/View:getContext	()Landroid/content/Context;
    //   27: astore 6
    //   29: aload_0
    //   30: aload 6
    //   32: invokestatic 63	androidx/appcompat/widget/ThemeUtils:OooO00o	(Landroid/view/View;Landroid/content/Context;)V
    //   35: getstatic 68	androidx/appcompat/R$styleable:Spinner	[I
    //   38: astore 6
    //   40: iconst_0
    //   41: istore 7
    //   43: aconst_null
    //   44: astore 8
    //   46: aload_1
    //   47: aload_2
    //   48: aload 6
    //   50: iload_3
    //   51: iconst_0
    //   52: invokestatic 74	androidx/appcompat/widget/TintTypedArray:OooOOOO	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/TintTypedArray;
    //   55: astore 6
    //   57: new 76	androidx/appcompat/widget/AppCompatBackgroundHelper
    //   60: astore 9
    //   62: aload 9
    //   64: aload_0
    //   65: invokespecial 79	androidx/appcompat/widget/AppCompatBackgroundHelper:<init>	(Landroid/view/View;)V
    //   68: aload_0
    //   69: aload 9
    //   71: putfield 81	androidx/appcompat/widget/AppCompatSpinner:o00OoOoo	Landroidx/appcompat/widget/AppCompatBackgroundHelper;
    //   74: aload 5
    //   76: ifnull +25 -> 101
    //   79: new 83	androidx/appcompat/view/ContextThemeWrapper
    //   82: astore 9
    //   84: aload 9
    //   86: aload_1
    //   87: aload 5
    //   89: invokespecial 86	androidx/appcompat/view/ContextThemeWrapper:<init>	(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   92: aload_0
    //   93: aload 9
    //   95: putfield 88	androidx/appcompat/widget/AppCompatSpinner:o00Ooo00	Landroid/content/Context;
    //   98: goto +44 -> 142
    //   101: getstatic 91	androidx/appcompat/R$styleable:Spinner_popupTheme	I
    //   104: istore 10
    //   106: aload 6
    //   108: iload 10
    //   110: iconst_0
    //   111: invokevirtual 95	androidx/appcompat/widget/TintTypedArray:OooOO0O	(II)I
    //   114: istore 10
    //   116: iload 10
    //   118: ifeq +19 -> 137
    //   121: new 83	androidx/appcompat/view/ContextThemeWrapper
    //   124: astore 9
    //   126: aload 9
    //   128: aload_1
    //   129: iload 10
    //   131: invokespecial 98	androidx/appcompat/view/ContextThemeWrapper:<init>	(Landroid/content/Context;I)V
    //   134: goto -42 -> 92
    //   137: aload_0
    //   138: aload_1
    //   139: putfield 88	androidx/appcompat/widget/AppCompatSpinner:o00Ooo00	Landroid/content/Context;
    //   142: iconst_m1
    //   143: istore 10
    //   145: aconst_null
    //   146: astore 9
    //   148: iload 4
    //   150: iload 10
    //   152: if_icmpne +85 -> 237
    //   155: getstatic 28	androidx/appcompat/widget/AppCompatSpinner:o00OooOo	[I
    //   158: astore 5
    //   160: aload_1
    //   161: aload_2
    //   162: aload 5
    //   164: iload_3
    //   165: iconst_0
    //   166: invokevirtual 104	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   169: astore 5
    //   171: aload 5
    //   173: iconst_0
    //   174: invokevirtual 110	android/content/res/TypedArray:hasValue	(I)Z
    //   177: istore 11
    //   179: iload 11
    //   181: ifeq +12 -> 193
    //   184: aload 5
    //   186: iconst_0
    //   187: iconst_0
    //   188: invokevirtual 113	android/content/res/TypedArray:getInt	(II)I
    //   191: istore 4
    //   193: aload 5
    //   195: invokevirtual 116	android/content/res/TypedArray:recycle	()V
    //   198: goto +39 -> 237
    //   201: astore_1
    //   202: aload 5
    //   204: astore 9
    //   206: goto +4 -> 210
    //   209: astore_1
    //   210: aload 9
    //   212: ifnull +8 -> 220
    //   215: aload 9
    //   217: invokevirtual 116	android/content/res/TypedArray:recycle	()V
    //   220: aload_1
    //   221: athrow
    //   222: pop
    //   223: iconst_0
    //   224: istore 10
    //   226: aconst_null
    //   227: astore 5
    //   229: aload 5
    //   231: ifnull +6 -> 237
    //   234: goto -41 -> 193
    //   237: iconst_1
    //   238: istore 10
    //   240: iload 4
    //   242: ifeq +159 -> 401
    //   245: iload 4
    //   247: iload 10
    //   249: if_icmpeq +6 -> 255
    //   252: goto +189 -> 441
    //   255: new 119	androidx/appcompat/widget/AppCompatSpinner$DropdownPopup
    //   258: astore 12
    //   260: aload_0
    //   261: getfield 88	androidx/appcompat/widget/AppCompatSpinner:o00Ooo00	Landroid/content/Context;
    //   264: astore 13
    //   266: aload 12
    //   268: aload_0
    //   269: aload 13
    //   271: aload_2
    //   272: iload_3
    //   273: invokespecial 122	androidx/appcompat/widget/AppCompatSpinner$DropdownPopup:<init>	(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   276: aload_0
    //   277: getfield 88	androidx/appcompat/widget/AppCompatSpinner:o00Ooo00	Landroid/content/Context;
    //   280: astore 13
    //   282: getstatic 68	androidx/appcompat/R$styleable:Spinner	[I
    //   285: astore 14
    //   287: aload 13
    //   289: aload_2
    //   290: aload 14
    //   292: iload_3
    //   293: iconst_0
    //   294: invokestatic 74	androidx/appcompat/widget/TintTypedArray:OooOOOO	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/TintTypedArray;
    //   297: astore 8
    //   299: getstatic 125	androidx/appcompat/R$styleable:Spinner_android_dropDownWidth	I
    //   302: istore 11
    //   304: bipush 254
    //   306: istore 15
    //   308: aload 8
    //   310: iload 11
    //   312: iload 15
    //   314: invokevirtual 128	androidx/appcompat/widget/TintTypedArray:OooOO0	(II)I
    //   317: istore 11
    //   319: aload_0
    //   320: iload 11
    //   322: putfield 130	androidx/appcompat/widget/AppCompatSpinner:o00OooO	I
    //   325: getstatic 133	androidx/appcompat/R$styleable:Spinner_android_popupBackground	I
    //   328: istore 11
    //   330: aload 8
    //   332: iload 11
    //   334: invokevirtual 137	androidx/appcompat/widget/TintTypedArray:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   337: astore 13
    //   339: aload 12
    //   341: aload 13
    //   343: invokevirtual 143	androidx/appcompat/widget/ListPopupWindow:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   346: getstatic 146	androidx/appcompat/R$styleable:Spinner_android_prompt	I
    //   349: istore 11
    //   351: aload 6
    //   353: iload 11
    //   355: invokevirtual 150	androidx/appcompat/widget/TintTypedArray:getString	(I)Ljava/lang/String;
    //   358: astore 13
    //   360: aload 12
    //   362: aload 13
    //   364: invokevirtual 154	androidx/appcompat/widget/AppCompatSpinner$DropdownPopup:setPromptText	(Ljava/lang/CharSequence;)V
    //   367: aload 8
    //   369: invokevirtual 157	androidx/appcompat/widget/TintTypedArray:OooOOOo	()V
    //   372: aload_0
    //   373: aload 12
    //   375: putfield 159	androidx/appcompat/widget/AppCompatSpinner:o00OooO0	Landroidx/appcompat/widget/AppCompatSpinner$SpinnerPopup;
    //   378: new 161	androidx/appcompat/widget/AppCompatSpinner$1
    //   381: astore 8
    //   383: aload 8
    //   385: aload_0
    //   386: aload_0
    //   387: aload 12
    //   389: invokespecial 164	androidx/appcompat/widget/AppCompatSpinner$1:<init>	(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/view/View;Landroidx/appcompat/widget/AppCompatSpinner$DropdownPopup;)V
    //   392: aload_0
    //   393: aload 8
    //   395: putfield 166	androidx/appcompat/widget/AppCompatSpinner:o00Ooo0	Landroidx/appcompat/widget/ForwardingListener;
    //   398: goto +43 -> 441
    //   401: new 168	androidx/appcompat/widget/AppCompatSpinner$DialogPopup
    //   404: astore 12
    //   406: aload 12
    //   408: aload_0
    //   409: invokespecial 171	androidx/appcompat/widget/AppCompatSpinner$DialogPopup:<init>	(Landroidx/appcompat/widget/AppCompatSpinner;)V
    //   412: aload_0
    //   413: aload 12
    //   415: putfield 159	androidx/appcompat/widget/AppCompatSpinner:o00OooO0	Landroidx/appcompat/widget/AppCompatSpinner$SpinnerPopup;
    //   418: getstatic 146	androidx/appcompat/R$styleable:Spinner_android_prompt	I
    //   421: istore 7
    //   423: aload 6
    //   425: iload 7
    //   427: invokevirtual 150	androidx/appcompat/widget/TintTypedArray:getString	(I)Ljava/lang/String;
    //   430: astore 8
    //   432: aload 12
    //   434: aload 8
    //   436: invokeinterface 174 2 0
    //   441: getstatic 177	androidx/appcompat/R$styleable:Spinner_android_entries	I
    //   444: istore 4
    //   446: aload 6
    //   448: iload 4
    //   450: invokevirtual 181	androidx/appcompat/widget/TintTypedArray:getTextArray	(I)[Ljava/lang/CharSequence;
    //   453: astore 12
    //   455: aload 12
    //   457: ifnull +40 -> 497
    //   460: new 183	android/widget/ArrayAdapter
    //   463: astore 8
    //   465: ldc 184
    //   467: istore 11
    //   469: aload 8
    //   471: aload_1
    //   472: iload 11
    //   474: aload 12
    //   476: invokespecial 188	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   479: getstatic 193	androidx/appcompat/R$layout:support_simple_spinner_dropdown_item	I
    //   482: istore 16
    //   484: aload 8
    //   486: iload 16
    //   488: invokevirtual 197	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   491: aload_0
    //   492: aload 8
    //   494: invokevirtual 201	androidx/appcompat/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   497: aload 6
    //   499: invokevirtual 157	androidx/appcompat/widget/TintTypedArray:OooOOOo	()V
    //   502: aload_0
    //   503: iload 10
    //   505: putfield 203	androidx/appcompat/widget/AppCompatSpinner:o00Ooo0o	Z
    //   508: aload_0
    //   509: getfield 205	androidx/appcompat/widget/AppCompatSpinner:o00Ooo0O	Landroid/widget/SpinnerAdapter;
    //   512: astore_1
    //   513: aload_1
    //   514: ifnull +13 -> 527
    //   517: aload_0
    //   518: aload_1
    //   519: invokevirtual 201	androidx/appcompat/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   522: aload_0
    //   523: aconst_null
    //   524: putfield 205	androidx/appcompat/widget/AppCompatSpinner:o00Ooo0O	Landroid/widget/SpinnerAdapter;
    //   527: aload_0
    //   528: getfield 81	androidx/appcompat/widget/AppCompatSpinner:o00OoOoo	Landroidx/appcompat/widget/AppCompatBackgroundHelper;
    //   531: aload_2
    //   532: iload_3
    //   533: invokevirtual 209	androidx/appcompat/widget/AppCompatBackgroundHelper:OooO0OO	(Landroid/util/AttributeSet;I)V
    //   536: return
    //   537: pop
    //   538: goto -309 -> 229
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	541	0	this	AppCompatSpinner
    //   0	541	1	paramContext	Context
    //   0	541	2	paramAttributeSet	AttributeSet
    //   0	541	3	paramInt1	int
    //   0	541	4	paramInt2	int
    //   0	541	5	paramTheme	Resources.Theme
    //   10	488	6	localObject1	Object
    //   41	385	7	i	int
    //   44	449	8	localObject2	Object
    //   60	156	9	localObject3	Object
    //   104	400	10	j	int
    //   177	3	11	bool	boolean
    //   302	171	11	k	int
    //   258	217	12	localObject4	Object
    //   264	99	13	localObject5	Object
    //   285	6	14	arrayOfInt	int[]
    //   306	7	15	m	int
    //   482	5	16	n	int
    //   222	1	18	localException1	java.lang.Exception
    //   537	1	19	localException2	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   173	177	201	finally
    //   187	191	201	finally
    //   155	158	209	finally
    //   165	169	209	finally
    //   155	158	222	java/lang/Exception
    //   165	169	222	java/lang/Exception
    //   173	177	537	java/lang/Exception
    //   187	191	537	java/lang/Exception
  }
  
  public int OooO00o(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    int i = 0;
    if (paramSpinnerAdapter == null) {
      return 0;
    }
    int j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int k = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int m = getSelectedItemPosition();
    m = Math.max(0, m);
    int n = paramSpinnerAdapter.getCount();
    int i1 = m + 15;
    n = Math.min(n, i1);
    i1 = n - m;
    i1 = 15 - i1;
    m -= i1;
    m = Math.max(0, m);
    i1 = 0;
    int i2 = m;
    View localView = null;
    m = 0;
    while (i2 < n)
    {
      int i3 = paramSpinnerAdapter.getItemViewType(i2);
      if (i3 != i)
      {
        localView = null;
        i = i3;
      }
      localView = paramSpinnerAdapter.getView(i2, localView, this);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      if (localLayoutParams == null)
      {
        localLayoutParams = new android/view/ViewGroup$LayoutParams;
        int i4 = -2;
        localLayoutParams.<init>(i4, i4);
        localView.setLayoutParams(localLayoutParams);
      }
      localView.measure(j, k);
      i3 = localView.getMeasuredWidth();
      m = Math.max(m, i3);
      i2 += 1;
    }
    if (paramDrawable != null)
    {
      paramSpinnerAdapter = this.o00OooOO;
      paramDrawable.getPadding(paramSpinnerAdapter);
      paramSpinnerAdapter = this.o00OooOO;
      int i5 = paramSpinnerAdapter.left;
      int i6 = paramSpinnerAdapter.right;
      i5 += i6;
      m += i5;
    }
    return m;
  }
  
  public void OooO0O0()
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    int i = AppCompatSpinner.Api17Impl.OooO0O0(this);
    int j = AppCompatSpinner.Api17Impl.OooO00o(this);
    localSpinnerPopup.OooO0OO(i, j);
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00OoOoo;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0O0();
    }
  }
  
  public int getDropDownHorizontalOffset()
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null) {
      return localSpinnerPopup.getHorizontalOffset();
    }
    return super.getDropDownHorizontalOffset();
  }
  
  public int getDropDownVerticalOffset()
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null) {
      return localSpinnerPopup.getVerticalOffset();
    }
    return super.getDropDownVerticalOffset();
  }
  
  public int getDropDownWidth()
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null) {
      return this.o00OooO;
    }
    return super.getDropDownWidth();
  }
  
  public final AppCompatSpinner.SpinnerPopup getInternalPopup()
  {
    return this.o00OooO0;
  }
  
  public Drawable getPopupBackground()
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null) {
      return localSpinnerPopup.getBackground();
    }
    return super.getPopupBackground();
  }
  
  public Context getPopupContext()
  {
    return this.o00Ooo00;
  }
  
  public CharSequence getPrompt()
  {
    Object localObject = this.o00OooO0;
    if (localObject != null) {
      localObject = ((AppCompatSpinner.SpinnerPopup)localObject).getHintText();
    } else {
      localObject = super.getPrompt();
    }
    return localObject;
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.o00OoOoo;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintList();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.o00OoOoo;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintMode();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null)
    {
      boolean bool = localSpinnerPopup.isShowing();
      if (bool)
      {
        localSpinnerPopup = this.o00OooO0;
        localSpinnerPopup.dismiss();
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null)
    {
      paramInt2 = View.MeasureSpec.getMode(paramInt1);
      int i = -1 << -1;
      if (paramInt2 == i)
      {
        paramInt2 = getMeasuredWidth();
        SpinnerAdapter localSpinnerAdapter = getAdapter();
        Drawable localDrawable = getBackground();
        i = OooO00o(localSpinnerAdapter, localDrawable);
        paramInt2 = Math.max(paramInt2, i);
        paramInt1 = View.MeasureSpec.getSize(paramInt1);
        paramInt1 = Math.min(paramInt2, paramInt1);
        paramInt2 = getMeasuredHeight();
        setMeasuredDimension(paramInt1, paramInt2);
      }
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (AppCompatSpinner.SavedState)paramParcelable;
    Object localObject = paramParcelable.getSuperState();
    super.onRestoreInstanceState((Parcelable)localObject);
    boolean bool = paramParcelable.o00OoOoo;
    if (bool)
    {
      paramParcelable = getViewTreeObserver();
      if (paramParcelable != null)
      {
        localObject = new androidx/appcompat/widget/AppCompatSpinner$2;
        ((AppCompatSpinner.2)localObject).<init>(this);
        paramParcelable.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject);
      }
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    AppCompatSpinner.SavedState localSavedState = new androidx/appcompat/widget/AppCompatSpinner$SavedState;
    Object localObject = super.onSaveInstanceState();
    localSavedState.<init>((Parcelable)localObject);
    localObject = this.o00OooO0;
    if (localObject != null)
    {
      bool = ((AppCompatSpinner.SpinnerPopup)localObject).isShowing();
      if (bool)
      {
        bool = true;
        break label43;
      }
    }
    boolean bool = false;
    localObject = null;
    label43:
    localSavedState.o00OoOoo = bool;
    return localSavedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    ForwardingListener localForwardingListener = this.o00Ooo0;
    if (localForwardingListener != null)
    {
      boolean bool = localForwardingListener.onTouch(this, paramMotionEvent);
      if (bool) {
        return true;
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean performClick()
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null)
    {
      boolean bool = localSpinnerPopup.isShowing();
      if (!bool) {
        OooO0O0();
      }
      return true;
    }
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    boolean bool = this.o00Ooo0o;
    if (!bool)
    {
      this.o00Ooo0O = paramSpinnerAdapter;
      return;
    }
    super.setAdapter(paramSpinnerAdapter);
    Object localObject = this.o00OooO0;
    if (localObject != null)
    {
      localObject = this.o00Ooo00;
      if (localObject == null) {
        localObject = getContext();
      }
      AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
      AppCompatSpinner.DropDownAdapter localDropDownAdapter = new androidx/appcompat/widget/AppCompatSpinner$DropDownAdapter;
      localObject = ((Context)localObject).getTheme();
      localDropDownAdapter.<init>(paramSpinnerAdapter, (Resources.Theme)localObject);
      localSpinnerPopup.setAdapter(localDropDownAdapter);
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00OoOoo;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0Oo(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00OoOoo;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0o0(paramInt);
    }
  }
  
  public void setDropDownHorizontalOffset(int paramInt)
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null)
    {
      localSpinnerPopup.setHorizontalOriginalOffset(paramInt);
      localSpinnerPopup = this.o00OooO0;
      localSpinnerPopup.setHorizontalOffset(paramInt);
    }
    else
    {
      super.setDropDownHorizontalOffset(paramInt);
    }
  }
  
  public void setDropDownVerticalOffset(int paramInt)
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null) {
      localSpinnerPopup.setVerticalOffset(paramInt);
    } else {
      super.setDropDownVerticalOffset(paramInt);
    }
  }
  
  public void setDropDownWidth(int paramInt)
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null) {
      this.o00OooO = paramInt;
    } else {
      super.setDropDownWidth(paramInt);
    }
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null) {
      localSpinnerPopup.setBackgroundDrawable(paramDrawable);
    } else {
      super.setPopupBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setPopupBackgroundResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getPopupContext(), paramInt);
    setPopupBackgroundDrawable(localDrawable);
  }
  
  public void setPrompt(CharSequence paramCharSequence)
  {
    AppCompatSpinner.SpinnerPopup localSpinnerPopup = this.o00OooO0;
    if (localSpinnerPopup != null) {
      localSpinnerPopup.setPromptText(paramCharSequence);
    } else {
      super.setPrompt(paramCharSequence);
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00OoOoo;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00OoOoo;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner
 * JD-Core Version:    0.7.0.1
 */