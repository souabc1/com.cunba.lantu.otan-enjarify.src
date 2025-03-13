package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper
  extends View
{
  public int[] o00OoOoo;
  public Context o00Ooo0;
  public int o00Ooo00;
  public Helper o00Ooo0O;
  public boolean o00Ooo0o;
  public String o00OooO;
  public String o00OooO0;
  public View[] o00OooOO;
  public HashMap o00OooOo;
  
  public ConstraintHelper(Context paramContext)
  {
    super(paramContext);
    int[] arrayOfInt = new int[32];
    this.o00OoOoo = arrayOfInt;
    this.o00Ooo0o = false;
    this.o00OooOO = null;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.o00OooOo = localHashMap;
    this.o00Ooo0 = paramContext;
    OooOOOO(null);
  }
  
  public ConstraintHelper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = new int[32];
    this.o00OoOoo = ((int[])localObject);
    this.o00Ooo0o = false;
    this.o00OooOO = null;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.o00OooOo = ((HashMap)localObject);
    this.o00Ooo0 = paramContext;
    OooOOOO(paramAttributeSet);
  }
  
  public void OooO(ConstraintLayout paramConstraintLayout)
  {
    int i = getVisibility();
    float f1 = getElevation();
    int j = 0;
    for (;;)
    {
      int k = this.o00Ooo00;
      if (j >= k) {
        break;
      }
      k = this.o00OoOoo[j];
      View localView = paramConstraintLayout.getViewById(k);
      if (localView != null)
      {
        localView.setVisibility(i);
        float f2 = 0.0F;
        boolean bool = f1 < 0.0F;
        if (bool)
        {
          f2 = localView.getTranslationZ() + f1;
          localView.setTranslationZ(f2);
        }
      }
      j += 1;
    }
  }
  
  public final void OooO0o(int paramInt)
  {
    int i = getId();
    if (paramInt == i) {
      return;
    }
    i = this.o00Ooo00 + 1;
    int[] arrayOfInt1 = this.o00OoOoo;
    int j = arrayOfInt1.length;
    if (i > j)
    {
      i = arrayOfInt1.length * 2;
      arrayOfInt2 = Arrays.copyOf(arrayOfInt1, i);
      this.o00OoOoo = arrayOfInt2;
    }
    int[] arrayOfInt2 = this.o00OoOoo;
    int k = this.o00Ooo00;
    arrayOfInt2[k] = paramInt;
    k += 1;
    this.o00Ooo00 = k;
  }
  
  public final void OooO0o0(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.length();
      if (i != 0)
      {
        Object localObject1 = this.o00Ooo0;
        if (localObject1 == null) {
          return;
        }
        paramString = paramString.trim();
        localObject1 = getParent();
        boolean bool = localObject1 instanceof ConstraintLayout;
        if (bool) {
          localObject1 = (ConstraintLayout)getParent();
        }
        int j = OooOOO0(paramString);
        Object localObject2;
        if (j != 0)
        {
          localObject2 = this.o00OooOo;
          Integer localInteger = Integer.valueOf(j);
          ((HashMap)localObject2).put(localInteger, paramString);
          OooO0o(j);
        }
        else
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = "Could not find id of \"";
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(paramString);
          paramString = "\"";
          ((StringBuilder)localObject1).append(paramString);
        }
      }
    }
  }
  
  public final void OooO0oO(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.length();
      if (i != 0)
      {
        Object localObject1 = this.o00Ooo0;
        if (localObject1 == null) {
          return;
        }
        paramString = paramString.trim();
        localObject1 = getParent();
        boolean bool1 = localObject1 instanceof ConstraintLayout;
        if (bool1)
        {
          localObject1 = (ConstraintLayout)getParent();
        }
        else
        {
          bool1 = false;
          localObject1 = null;
        }
        if (localObject1 == null) {
          return;
        }
        int j = ((ViewGroup)localObject1).getChildCount();
        int k = 0;
        while (k < j)
        {
          Object localObject2 = ((ViewGroup)localObject1).getChildAt(k);
          Object localObject3 = ((View)localObject2).getLayoutParams();
          boolean bool2 = localObject3 instanceof ConstraintLayout.LayoutParams;
          if (bool2)
          {
            localObject3 = ((ConstraintLayout.LayoutParams)localObject3).Ooooo0o;
            boolean bool3 = paramString.equals(localObject3);
            if (bool3)
            {
              int n = ((View)localObject2).getId();
              int m = -1;
              if (n == m)
              {
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                String str = "to use ConstraintTag view ";
                ((StringBuilder)localObject3).append(str);
                localObject2 = localObject2.getClass().getSimpleName();
                ((StringBuilder)localObject3).append((String)localObject2);
                localObject2 = " must have an ID";
                ((StringBuilder)localObject3).append((String)localObject2);
              }
              else
              {
                int i1 = ((View)localObject2).getId();
                OooO0o(i1);
              }
            }
          }
          k += 1;
        }
      }
    }
  }
  
  public void OooO0oo()
  {
    Object localObject = getParent();
    if (localObject != null)
    {
      boolean bool = localObject instanceof ConstraintLayout;
      if (bool)
      {
        localObject = (ConstraintLayout)localObject;
        OooO((ConstraintLayout)localObject);
      }
    }
  }
  
  public void OooOO0(ConstraintLayout paramConstraintLayout) {}
  
  public final int[] OooOO0O(View paramView, String paramString)
  {
    paramString = paramString.split(",");
    paramView.getContext();
    int i = paramString.length;
    paramView = new int[i];
    int j = 0;
    int k = 0;
    for (;;)
    {
      int m = paramString.length;
      if (j >= m) {
        break;
      }
      String str = paramString[j].trim();
      m = OooOOO0(str);
      if (m != 0)
      {
        int n = k + 1;
        paramView[k] = m;
        k = n;
      }
      j += 1;
    }
    int i1 = paramString.length;
    if (k != i1) {
      paramView = Arrays.copyOf(paramView, k);
    }
    return paramView;
  }
  
  public final int OooOO0o(ConstraintLayout paramConstraintLayout, String paramString)
  {
    if ((paramString != null) && (paramConstraintLayout != null))
    {
      Resources localResources = this.o00Ooo0.getResources();
      if (localResources == null) {
        return 0;
      }
      int i = paramConstraintLayout.getChildCount();
      int j = 0;
      while (j < i)
      {
        View localView = paramConstraintLayout.getChildAt(j);
        int k = localView.getId();
        int m = -1;
        if (k != m)
        {
          String str;
          try
          {
            k = localView.getId();
            str = localResources.getResourceEntryName(k);
          }
          catch (Resources.NotFoundException localNotFoundException)
          {
            k = 0;
            str = null;
          }
          boolean bool = paramString.equals(str);
          if (bool) {
            return localView.getId();
          }
        }
        j += 1;
      }
    }
    return 0;
  }
  
  public View[] OooOOO(ConstraintLayout paramConstraintLayout)
  {
    View[] arrayOfView1 = this.o00OooOO;
    int j;
    if (arrayOfView1 != null)
    {
      i = arrayOfView1.length;
      j = this.o00Ooo00;
      if (i == j) {}
    }
    else
    {
      i = this.o00Ooo00;
      arrayOfView1 = new View[i];
      this.o00OooOO = arrayOfView1;
    }
    int i = 0;
    arrayOfView1 = null;
    for (;;)
    {
      j = this.o00Ooo00;
      if (i >= j) {
        break;
      }
      j = this.o00OoOoo[i];
      View[] arrayOfView2 = this.o00OooOO;
      View localView = paramConstraintLayout.getViewById(j);
      arrayOfView2[i] = localView;
      i += 1;
    }
    return this.o00OooOO;
  }
  
  public final int OooOOO0(String paramString)
  {
    Object localObject1 = getParent();
    boolean bool1 = localObject1 instanceof ConstraintLayout;
    String str = null;
    if (bool1)
    {
      localObject1 = (ConstraintLayout)getParent();
    }
    else
    {
      bool1 = false;
      localObject1 = null;
    }
    boolean bool2 = isInEditMode();
    int i = 0;
    Object localObject2;
    if ((bool2) && (localObject1 != null))
    {
      localObject2 = ((ConstraintLayout)localObject1).getDesignInformation(0, paramString);
      boolean bool3 = localObject2 instanceof Integer;
      if (bool3)
      {
        localObject2 = (Integer)localObject2;
        i = ((Integer)localObject2).intValue();
      }
    }
    if ((i == 0) && (localObject1 != null)) {
      i = OooOO0o((ConstraintLayout)localObject1, paramString);
    }
    if (i == 0) {
      localObject1 = R.id.class;
    }
    try
    {
      localObject1 = ((Class)localObject1).getField(paramString);
      i = ((Field)localObject1).getInt(null);
    }
    catch (Exception localException)
    {
      label122:
      break label122;
    }
    if (i == 0)
    {
      localObject1 = this.o00Ooo0.getResources();
      str = this.o00Ooo0.getPackageName();
      localObject2 = "id";
      i = ((Resources)localObject1).getIdentifier(paramString, (String)localObject2, str);
    }
    return i;
  }
  
  public void OooOOOO(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      Context localContext = getContext();
      int[] arrayOfInt = R.styleable.ConstraintLayout_Layout;
      paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
      int i = paramAttributeSet.getIndexCount();
      int j = 0;
      arrayOfInt = null;
      while (j < i)
      {
        int k = paramAttributeSet.getIndex(j);
        int m = R.styleable.ConstraintLayout_Layout_constraint_referenced_ids;
        String str;
        if (k == m)
        {
          str = paramAttributeSet.getString(k);
          this.o00OooO0 = str;
          setIds(str);
        }
        else
        {
          m = R.styleable.ConstraintLayout_Layout_constraint_referenced_tags;
          if (k == m)
          {
            str = paramAttributeSet.getString(k);
            this.o00OooO = str;
            setReferenceTags(str);
          }
        }
        j += 1;
      }
      paramAttributeSet.recycle();
    }
  }
  
  public void OooOOOo(ConstraintSet.Constraint paramConstraint, HelperWidget paramHelperWidget, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray paramSparseArray)
  {
    paramLayoutParams = paramConstraint.OooO0o0;
    Object localObject = paramLayoutParams.o0OoOo0;
    int i;
    int j;
    if (localObject != null)
    {
      setReferencedIds((int[])localObject);
    }
    else
    {
      paramLayoutParams = paramLayoutParams.ooOO;
      if (paramLayoutParams != null)
      {
        i = paramLayoutParams.length();
        if (i > 0)
        {
          paramLayoutParams = paramConstraint.OooO0o0;
          localObject = paramLayoutParams.ooOO;
          localObject = OooOO0O(this, (String)localObject);
          paramLayoutParams.o0OoOo0 = ((int[])localObject);
        }
        else
        {
          paramLayoutParams = paramConstraint.OooO0o0;
          j = 0;
          localObject = null;
          paramLayoutParams.o0OoOo0 = null;
        }
      }
    }
    if (paramHelperWidget != null)
    {
      paramHelperWidget.OooO00o();
      paramLayoutParams = paramConstraint.OooO0o0.o0OoOo0;
      if (paramLayoutParams != null)
      {
        i = 0;
        paramLayoutParams = null;
        for (;;)
        {
          localObject = paramConstraint.OooO0o0.o0OoOo0;
          int k = localObject.length;
          if (i >= k) {
            break;
          }
          j = localObject[i];
          localObject = (ConstraintWidget)paramSparseArray.get(j);
          if (localObject != null) {
            paramHelperWidget.OooO0O0((ConstraintWidget)localObject);
          }
          i += 1;
        }
      }
    }
  }
  
  public void OooOOo(ConstraintLayout paramConstraintLayout) {}
  
  public void OooOOo0(ConstraintWidget paramConstraintWidget, boolean paramBoolean) {}
  
  public void OooOOoo(ConstraintLayout paramConstraintLayout) {}
  
  public void OooOo0(ConstraintWidgetContainer paramConstraintWidgetContainer, Helper paramHelper, SparseArray paramSparseArray)
  {
    paramHelper.OooO00o();
    int i = 0;
    for (;;)
    {
      int j = this.o00Ooo00;
      if (i >= j) {
        break;
      }
      j = this.o00OoOoo[i];
      ConstraintWidget localConstraintWidget = (ConstraintWidget)paramSparseArray.get(j);
      paramHelper.OooO0O0(localConstraintWidget);
      i += 1;
    }
  }
  
  public void OooOo00(ConstraintLayout paramConstraintLayout) {}
  
  public void OooOo0O(ConstraintLayout paramConstraintLayout)
  {
    int i = isInEditMode();
    if (i != 0)
    {
      localObject1 = this.o00OooO0;
      setIds((String)localObject1);
    }
    Object localObject1 = this.o00Ooo0O;
    if (localObject1 == null) {
      return;
    }
    ((Helper)localObject1).OooO00o();
    i = 0;
    localObject1 = null;
    for (;;)
    {
      int k = this.o00Ooo00;
      if (i >= k) {
        break;
      }
      Object localObject2 = this.o00OoOoo;
      int m = localObject2[i];
      Object localObject3 = paramConstraintLayout.getViewById(m);
      if (localObject3 == null)
      {
        HashMap localHashMap = this.o00OooOo;
        localObject2 = Integer.valueOf(m);
        localObject2 = (String)localHashMap.get(localObject2);
        int n = OooOO0o(paramConstraintLayout, (String)localObject2);
        if (n != 0)
        {
          this.o00OoOoo[i] = n;
          localObject3 = this.o00OooOo;
          Integer localInteger = Integer.valueOf(n);
          ((HashMap)localObject3).put(localInteger, localObject2);
          localObject3 = paramConstraintLayout.getViewById(n);
        }
      }
      if (localObject3 != null)
      {
        localObject2 = this.o00Ooo0O;
        localObject3 = paramConstraintLayout.getViewWidget((View)localObject3);
        ((Helper)localObject2).OooO0O0((ConstraintWidget)localObject3);
      }
      int j;
      i += 1;
    }
    localObject1 = this.o00Ooo0O;
    paramConstraintLayout = paramConstraintLayout.mLayoutWidget;
    ((Helper)localObject1).OooO0OO(paramConstraintLayout);
  }
  
  public void OooOo0o()
  {
    Object localObject = this.o00Ooo0O;
    if (localObject == null) {
      return;
    }
    localObject = getLayoutParams();
    boolean bool = localObject instanceof ConstraintLayout.LayoutParams;
    if (bool)
    {
      localObject = (ConstraintLayout.LayoutParams)localObject;
      ConstraintWidget localConstraintWidget = (ConstraintWidget)this.o00Ooo0O;
      ((ConstraintLayout.LayoutParams)localObject).o0ooOOo = localConstraintWidget;
    }
  }
  
  public int[] getReferencedIds()
  {
    int[] arrayOfInt = this.o00OoOoo;
    int i = this.o00Ooo00;
    return Arrays.copyOf(arrayOfInt, i);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = this.o00OooO0;
    if (str != null) {
      setIds(str);
    }
    str = this.o00OooO;
    if (str != null) {
      setReferenceTags(str);
    }
  }
  
  public void onDraw(Canvas paramCanvas) {}
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = this.o00Ooo0o;
    if (bool)
    {
      super.onMeasure(paramInt1, paramInt2);
    }
    else
    {
      paramInt1 = 0;
      setMeasuredDimension(0, 0);
    }
  }
  
  public void setIds(String paramString)
  {
    this.o00OooO0 = paramString;
    if (paramString == null) {
      return;
    }
    int i = 0;
    String str = null;
    this.o00Ooo00 = 0;
    for (;;)
    {
      int j = paramString.indexOf(',', i);
      int k = -1;
      if (j == k)
      {
        paramString = paramString.substring(i);
        OooO0o0(paramString);
        return;
      }
      str = paramString.substring(i, j);
      OooO0o0(str);
      i = j + 1;
    }
  }
  
  public void setReferenceTags(String paramString)
  {
    this.o00OooO = paramString;
    if (paramString == null) {
      return;
    }
    int i = 0;
    String str = null;
    this.o00Ooo00 = 0;
    for (;;)
    {
      int j = paramString.indexOf(',', i);
      int k = -1;
      if (j == k)
      {
        paramString = paramString.substring(i);
        OooO0oO(paramString);
        return;
      }
      str = paramString.substring(i, j);
      OooO0oO(str);
      i = j + 1;
    }
  }
  
  public void setReferencedIds(int[] paramArrayOfInt)
  {
    this.o00OooO0 = null;
    int i = 0;
    this.o00Ooo00 = 0;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfInt[i];
      OooO0o(j);
      i += 1;
    }
  }
  
  public void setTag(int paramInt, Object paramObject)
  {
    super.setTag(paramInt, paramObject);
    if (paramObject == null)
    {
      paramObject = this.o00OooO0;
      if (paramObject == null) {
        OooO0o(paramInt);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintHelper
 * JD-Core Version:    0.7.0.1
 */