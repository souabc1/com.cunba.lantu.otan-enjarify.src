package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;

public class AppCompatViewInflater
{
  private static final String LOG_TAG = "AppCompatViewInflater";
  private static final int[] sAccessibilityHeading;
  private static final int[] sAccessibilityPaneTitle;
  private static final String[] sClassPrefixList;
  private static final SimpleArrayMap sConstructorMap;
  private static final Class[] sConstructorSignature;
  private static final int[] sOnClickAttrs;
  private static final int[] sScreenReaderFocusable;
  private final Object[] mConstructorArgs;
  
  static
  {
    Object localObject = new Class[2];
    localObject[0] = Context.class;
    localObject[1] = AttributeSet.class;
    sConstructorSignature = (Class[])localObject;
    sOnClickAttrs = new int[] { 16843375 };
    sAccessibilityHeading = new int[] { 16844160 };
    sAccessibilityPaneTitle = new int[] { 16844156 };
    sScreenReaderFocusable = new int[] { 16844148 };
    String[] tmp67_64 = new String[3];
    String[] tmp68_67 = tmp67_64;
    String[] tmp68_67 = tmp67_64;
    tmp68_67[0] = "android.widget.";
    tmp68_67[1] = "android.view.";
    tmp68_67[2] = "android.webkit.";
    sClassPrefixList = tmp68_67;
    localObject = new androidx/collection/SimpleArrayMap;
    ((SimpleArrayMap)localObject).<init>();
    sConstructorMap = (SimpleArrayMap)localObject;
  }
  
  public AppCompatViewInflater()
  {
    Object[] arrayOfObject = new Object[2];
    this.mConstructorArgs = arrayOfObject;
  }
  
  public static Context OooO0o0(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    int[] arrayOfInt = R.styleable.View;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, 0, 0);
    if (paramBoolean1)
    {
      paramBoolean1 = R.styleable.View_android_theme;
      paramBoolean1 = paramAttributeSet.getResourceId(paramBoolean1, 0);
    }
    else
    {
      paramBoolean1 = false;
    }
    if ((paramBoolean2) && (!paramBoolean1))
    {
      paramBoolean1 = R.styleable.View_theme;
      paramBoolean1 = paramAttributeSet.getResourceId(paramBoolean1, 0);
    }
    paramAttributeSet.recycle();
    if (paramBoolean1)
    {
      boolean bool1 = paramContext instanceof ContextThemeWrapper;
      if (bool1)
      {
        paramAttributeSet = paramContext;
        paramAttributeSet = (ContextThemeWrapper)paramContext;
        boolean bool2 = paramAttributeSet.getThemeResId();
        if (bool2 == paramBoolean1) {}
      }
      else
      {
        paramAttributeSet = new androidx/appcompat/view/ContextThemeWrapper;
        paramAttributeSet.<init>((Context)paramContext, paramBoolean1);
        paramContext = paramAttributeSet;
      }
    }
    return (Context)paramContext;
  }
  
  public final void OooO00o(Context paramContext, View paramView, AttributeSet paramAttributeSet)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 28;
    if (i > j) {
      return;
    }
    Object localObject = sAccessibilityHeading;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    j = 0;
    boolean bool1 = ((TypedArray)localObject).hasValue(0);
    if (bool1)
    {
      bool1 = ((TypedArray)localObject).getBoolean(0, false);
      ViewCompat.o00oO0O(paramView, bool1);
    }
    ((TypedArray)localObject).recycle();
    localObject = sAccessibilityPaneTitle;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    bool1 = ((TypedArray)localObject).hasValue(0);
    if (bool1)
    {
      String str = ((TypedArray)localObject).getString(0);
      ViewCompat.o0ooOOo(paramView, str);
    }
    ((TypedArray)localObject).recycle();
    localObject = sScreenReaderFocusable;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    boolean bool2 = paramContext.hasValue(0);
    if (bool2)
    {
      bool2 = paramContext.getBoolean(0, false);
      ViewCompat.o00000Oo(paramView, bool2);
    }
    paramContext.recycle();
  }
  
  public final void OooO0O0(View paramView, AttributeSet paramAttributeSet)
  {
    Object localObject1 = paramView.getContext();
    boolean bool = localObject1 instanceof ContextWrapper;
    if (bool)
    {
      bool = ViewCompat.OoooO0(paramView);
      if (bool)
      {
        Object localObject2 = sOnClickAttrs;
        paramAttributeSet = ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, (int[])localObject2);
        localObject1 = paramAttributeSet.getString(0);
        if (localObject1 != null)
        {
          localObject2 = new androidx/appcompat/app/AppCompatViewInflater$DeclaredOnClickListener;
          ((AppCompatViewInflater.DeclaredOnClickListener)localObject2).<init>(paramView, (String)localObject1);
          paramView.setOnClickListener((View.OnClickListener)localObject2);
        }
        paramAttributeSet.recycle();
      }
    }
  }
  
  public final View OooO0OO(Context paramContext, String paramString1, String paramString2)
  {
    SimpleArrayMap localSimpleArrayMap = sConstructorMap;
    Object localObject = (Constructor)localSimpleArrayMap.get(paramString1);
    if ((localObject != null) || (paramString2 != null)) {}
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(paramString2);
      ((StringBuilder)localObject).append(paramString1);
      paramString2 = ((StringBuilder)localObject).toString();
      break label60;
      paramString2 = paramString1;
      label60:
      paramContext = paramContext.getClassLoader();
      localObject = null;
      paramContext = Class.forName(paramString2, false, paramContext);
      paramString2 = View.class;
      paramContext = paramContext.asSubclass(paramString2);
      paramString2 = sConstructorSignature;
      localObject = paramContext.getConstructor(paramString2);
      localSimpleArrayMap.put(paramString1, localObject);
      boolean bool = true;
      ((AccessibleObject)localObject).setAccessible(bool);
      paramContext = this.mConstructorArgs;
      paramContext = ((Constructor)localObject).newInstance(paramContext);
      return (View)paramContext;
    }
    catch (Exception localException) {}
    return null;
  }
  
  /* Error */
  public final View OooO0Oo(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: ldc 209
    //   2: astore 4
    //   4: aload_2
    //   5: aload 4
    //   7: invokevirtual 213	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   10: istore 5
    //   12: iload 5
    //   14: ifeq +13 -> 27
    //   17: aload_3
    //   18: aconst_null
    //   19: ldc 215
    //   21: invokeinterface 219 3 0
    //   26: astore_2
    //   27: iconst_1
    //   28: istore 5
    //   30: aload_0
    //   31: getfield 69	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   34: astore 6
    //   36: aload 6
    //   38: iconst_0
    //   39: aload_1
    //   40: aastore
    //   41: aload 6
    //   43: iload 5
    //   45: aload_3
    //   46: aastore
    //   47: bipush 46
    //   49: istore 7
    //   51: aload_2
    //   52: iload 7
    //   54: invokevirtual 224	java/lang/String:indexOf	(I)I
    //   57: istore 7
    //   59: iconst_m1
    //   60: istore 8
    //   62: iload 8
    //   64: iload 7
    //   66: if_icmpne +89 -> 155
    //   69: iconst_0
    //   70: istore 7
    //   72: aconst_null
    //   73: astore_3
    //   74: getstatic 58	androidx/appcompat/app/AppCompatViewInflater:sClassPrefixList	[Ljava/lang/String;
    //   77: astore 6
    //   79: aload 6
    //   81: arraylength
    //   82: istore 9
    //   84: iload 7
    //   86: iload 9
    //   88: if_icmpge +51 -> 139
    //   91: aload 6
    //   93: iload 7
    //   95: aaload
    //   96: astore 6
    //   98: aload_0
    //   99: aload_1
    //   100: aload_2
    //   101: aload 6
    //   103: invokevirtual 228	androidx/appcompat/app/AppCompatViewInflater:OooO0OO	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   106: astore 6
    //   108: aload 6
    //   110: ifnull +20 -> 130
    //   113: aload_0
    //   114: getfield 69	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   117: astore_1
    //   118: aload_1
    //   119: iconst_0
    //   120: aconst_null
    //   121: aastore
    //   122: aload_1
    //   123: iload 5
    //   125: aconst_null
    //   126: aastore
    //   127: aload 6
    //   129: areturn
    //   130: iload 7
    //   132: iconst_1
    //   133: iadd
    //   134: istore 7
    //   136: goto -62 -> 74
    //   139: aload_0
    //   140: getfield 69	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   143: astore_1
    //   144: aload_1
    //   145: iconst_0
    //   146: aconst_null
    //   147: aastore
    //   148: aload_1
    //   149: iload 5
    //   151: aconst_null
    //   152: aastore
    //   153: aconst_null
    //   154: areturn
    //   155: aload_0
    //   156: aload_1
    //   157: aload_2
    //   158: aconst_null
    //   159: invokevirtual 228	androidx/appcompat/app/AppCompatViewInflater:OooO0OO	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   162: astore_1
    //   163: aload_0
    //   164: getfield 69	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   167: astore_2
    //   168: aload_2
    //   169: iconst_0
    //   170: aconst_null
    //   171: aastore
    //   172: aload_2
    //   173: iload 5
    //   175: aconst_null
    //   176: aastore
    //   177: aload_1
    //   178: areturn
    //   179: astore_1
    //   180: aload_0
    //   181: getfield 69	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   184: astore_2
    //   185: aload_2
    //   186: iconst_0
    //   187: aconst_null
    //   188: aastore
    //   189: aload_2
    //   190: iload 5
    //   192: aconst_null
    //   193: aastore
    //   194: aload_1
    //   195: athrow
    //   196: pop
    //   197: aload_0
    //   198: getfield 69	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   201: astore_1
    //   202: aload_1
    //   203: iconst_0
    //   204: aconst_null
    //   205: aastore
    //   206: aload_1
    //   207: iload 5
    //   209: aconst_null
    //   210: aastore
    //   211: aconst_null
    //   212: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	213	0	this	AppCompatViewInflater
    //   0	213	1	paramContext	Context
    //   0	213	2	paramString	String
    //   0	213	3	paramAttributeSet	AttributeSet
    //   2	4	4	str	String
    //   10	198	5	bool	boolean
    //   34	94	6	localObject	Object
    //   49	86	7	i	int
    //   60	7	8	j	int
    //   82	7	9	k	int
    //   196	1	10	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   30	34	179	finally
    //   39	41	179	finally
    //   45	47	179	finally
    //   52	57	179	finally
    //   74	77	179	finally
    //   79	82	179	finally
    //   93	96	179	finally
    //   101	106	179	finally
    //   158	162	179	finally
    //   30	34	196	java/lang/Exception
    //   39	41	196	java/lang/Exception
    //   45	47	196	java/lang/Exception
    //   52	57	196	java/lang/Exception
    //   74	77	196	java/lang/Exception
    //   79	82	196	java/lang/Exception
    //   93	96	196	java/lang/Exception
    //   101	106	196	java/lang/Exception
    //   158	162	196	java/lang/Exception
  }
  
  public final void OooO0o(View paramView, String paramString)
  {
    if (paramView != null) {
      return;
    }
    paramView = new java/lang/IllegalStateException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = getClass().getName();
    localStringBuilder.append(str);
    localStringBuilder.append(" asked to inflate view for <");
    localStringBuilder.append(paramString);
    localStringBuilder.append(">, but returned null");
    paramString = localStringBuilder.toString();
    paramView.<init>(paramString);
    throw paramView;
  }
  
  public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatAutoCompleteTextView localAppCompatAutoCompleteTextView = new androidx/appcompat/widget/AppCompatAutoCompleteTextView;
    localAppCompatAutoCompleteTextView.<init>(paramContext, paramAttributeSet);
    return localAppCompatAutoCompleteTextView;
  }
  
  public AppCompatButton createButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatButton localAppCompatButton = new androidx/appcompat/widget/AppCompatButton;
    localAppCompatButton.<init>(paramContext, paramAttributeSet);
    return localAppCompatButton;
  }
  
  public AppCompatCheckBox createCheckBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatCheckBox localAppCompatCheckBox = new androidx/appcompat/widget/AppCompatCheckBox;
    localAppCompatCheckBox.<init>(paramContext, paramAttributeSet);
    return localAppCompatCheckBox;
  }
  
  public AppCompatCheckedTextView createCheckedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatCheckedTextView localAppCompatCheckedTextView = new androidx/appcompat/widget/AppCompatCheckedTextView;
    localAppCompatCheckedTextView.<init>(paramContext, paramAttributeSet);
    return localAppCompatCheckedTextView;
  }
  
  public AppCompatEditText createEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatEditText localAppCompatEditText = new androidx/appcompat/widget/AppCompatEditText;
    localAppCompatEditText.<init>(paramContext, paramAttributeSet);
    return localAppCompatEditText;
  }
  
  public AppCompatImageButton createImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatImageButton localAppCompatImageButton = new androidx/appcompat/widget/AppCompatImageButton;
    localAppCompatImageButton.<init>(paramContext, paramAttributeSet);
    return localAppCompatImageButton;
  }
  
  public AppCompatImageView createImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatImageView localAppCompatImageView = new androidx/appcompat/widget/AppCompatImageView;
    localAppCompatImageView.<init>(paramContext, paramAttributeSet);
    return localAppCompatImageView;
  }
  
  public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatMultiAutoCompleteTextView localAppCompatMultiAutoCompleteTextView = new androidx/appcompat/widget/AppCompatMultiAutoCompleteTextView;
    localAppCompatMultiAutoCompleteTextView.<init>(paramContext, paramAttributeSet);
    return localAppCompatMultiAutoCompleteTextView;
  }
  
  public AppCompatRadioButton createRadioButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatRadioButton localAppCompatRadioButton = new androidx/appcompat/widget/AppCompatRadioButton;
    localAppCompatRadioButton.<init>(paramContext, paramAttributeSet);
    return localAppCompatRadioButton;
  }
  
  public AppCompatRatingBar createRatingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatRatingBar localAppCompatRatingBar = new androidx/appcompat/widget/AppCompatRatingBar;
    localAppCompatRatingBar.<init>(paramContext, paramAttributeSet);
    return localAppCompatRatingBar;
  }
  
  public AppCompatSeekBar createSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatSeekBar localAppCompatSeekBar = new androidx/appcompat/widget/AppCompatSeekBar;
    localAppCompatSeekBar.<init>(paramContext, paramAttributeSet);
    return localAppCompatSeekBar;
  }
  
  public AppCompatSpinner createSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatSpinner localAppCompatSpinner = new androidx/appcompat/widget/AppCompatSpinner;
    localAppCompatSpinner.<init>(paramContext, paramAttributeSet);
    return localAppCompatSpinner;
  }
  
  public AppCompatTextView createTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatTextView localAppCompatTextView = new androidx/appcompat/widget/AppCompatTextView;
    localAppCompatTextView.<init>(paramContext, paramAttributeSet);
    return localAppCompatTextView;
  }
  
  public AppCompatToggleButton createToggleButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatToggleButton localAppCompatToggleButton = new androidx/appcompat/widget/AppCompatToggleButton;
    localAppCompatToggleButton.<init>(paramContext, paramAttributeSet);
    return localAppCompatToggleButton;
  }
  
  public View createView(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    return null;
  }
  
  public final View createView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if ((paramBoolean1) && (paramView != null)) {
      paramView = paramView.getContext();
    } else {
      paramView = paramContext;
    }
    if ((paramBoolean2) || (paramBoolean3)) {
      paramView = OooO0o0(paramView, paramAttributeSet, paramBoolean2, paramBoolean3);
    }
    if (paramBoolean4) {
      paramView = TintContextWrapper.OooO0O0(paramView);
    }
    paramString.hashCode();
    paramBoolean1 = paramString.hashCode();
    paramBoolean2 = true;
    Object localObject;
    switch (paramBoolean1)
    {
    default: 
      break;
    case 2001146706: 
      localObject = "Button";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case 1666676343: 
      localObject = "EditText";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case 1601505219: 
      localObject = "CheckBox";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case 1413872058: 
      localObject = "AutoCompleteTextView";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case 1125864064: 
      localObject = "ImageView";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case 799298502: 
      localObject = "ToggleButton";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case 776382189: 
      localObject = "RadioButton";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case -339785223: 
      localObject = "Spinner";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case -658531749: 
      localObject = "SeekBar";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case -937446323: 
      localObject = "ImageButton";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case -938935918: 
      localObject = "TextView";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case -1346021293: 
      localObject = "MultiAutoCompleteTextView";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case -1455429095: 
      localObject = "CheckedTextView";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = true;
      }
      break;
    case -1946472170: 
      localObject = "RatingBar";
      paramBoolean1 = paramString.equals(localObject);
      if (paramBoolean1) {
        paramBoolean2 = false;
      }
      break;
    }
    switch (paramBoolean2)
    {
    default: 
      localObject = createView(paramView, paramString, paramAttributeSet);
      break;
    case 13: 
      localObject = createButton(paramView, paramAttributeSet);
      break;
    case 12: 
      localObject = createEditText(paramView, paramAttributeSet);
      break;
    case 11: 
      localObject = createCheckBox(paramView, paramAttributeSet);
      break;
    case 10: 
      localObject = createAutoCompleteTextView(paramView, paramAttributeSet);
      break;
    case 9: 
      localObject = createImageView(paramView, paramAttributeSet);
      break;
    case 8: 
      localObject = createToggleButton(paramView, paramAttributeSet);
      break;
    case 7: 
      localObject = createRadioButton(paramView, paramAttributeSet);
      break;
    case 6: 
      localObject = createSpinner(paramView, paramAttributeSet);
      break;
    case 5: 
      localObject = createSeekBar(paramView, paramAttributeSet);
      break;
    case 4: 
      localObject = createImageButton(paramView, paramAttributeSet);
      break;
    case 3: 
      localObject = createTextView(paramView, paramAttributeSet);
    }
    for (;;)
    {
      OooO0o((View)localObject, paramString);
      break;
      localObject = createMultiAutoCompleteTextView(paramView, paramAttributeSet);
      continue;
      localObject = createCheckedTextView(paramView, paramAttributeSet);
      continue;
      localObject = createRatingBar(paramView, paramAttributeSet);
    }
    if ((localObject == null) && (paramContext != paramView)) {
      localObject = OooO0Oo(paramView, paramString, paramAttributeSet);
    }
    if (localObject != null)
    {
      OooO0O0((View)localObject, paramAttributeSet);
      OooO00o(paramView, (View)localObject, paramAttributeSet);
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatViewInflater
 * JD-Core Version:    0.7.0.1
 */