package androidx.customview.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

class FocusStrategy
{
  public static boolean OooO(Rect paramRect1, Rect paramRect2, int paramInt)
  {
    int i = 17;
    boolean bool = true;
    int j;
    int k;
    if (paramInt != i)
    {
      i = 33;
      if (paramInt != i)
      {
        i = 66;
        if (paramInt != i)
        {
          i = 130;
          if (paramInt == i)
          {
            paramInt = paramRect1.top;
            i = paramRect2.top;
            if (paramInt >= i)
            {
              paramInt = paramRect1.bottom;
              if (paramInt > i) {}
            }
            else
            {
              j = paramRect1.bottom;
              k = paramRect2.bottom;
              if (j < k) {
                break label86;
              }
            }
            bool = false;
            label86:
            return bool;
          }
          paramRect1 = new java/lang/IllegalArgumentException;
          paramRect1.<init>("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
          throw paramRect1;
        }
        paramInt = paramRect1.left;
        i = paramRect2.left;
        if (paramInt >= i)
        {
          paramInt = paramRect1.right;
          if (paramInt > i) {}
        }
        else
        {
          j = paramRect1.right;
          k = paramRect2.right;
          if (j < k) {
            break label151;
          }
        }
        bool = false;
        label151:
        return bool;
      }
      paramInt = paramRect1.bottom;
      i = paramRect2.bottom;
      if (paramInt <= i)
      {
        paramInt = paramRect1.top;
        if (paramInt < i) {}
      }
      else
      {
        j = paramRect1.top;
        k = paramRect2.top;
        if (j > k) {
          break label204;
        }
      }
      bool = false;
      label204:
      return bool;
    }
    paramInt = paramRect1.right;
    i = paramRect2.right;
    if (paramInt <= i)
    {
      paramInt = paramRect1.left;
      if (paramInt < i) {}
    }
    else
    {
      j = paramRect1.left;
      k = paramRect2.left;
      if (j > k) {
        break label257;
      }
    }
    bool = false;
    label257:
    return bool;
  }
  
  public static boolean OooO00o(int paramInt, Rect paramRect1, Rect paramRect2, Rect paramRect3)
  {
    boolean bool1 = OooO0O0(paramInt, paramRect1, paramRect2);
    boolean bool2 = OooO0O0(paramInt, paramRect1, paramRect3);
    boolean bool3 = false;
    if ((!bool2) && (bool1))
    {
      bool1 = OooOO0(paramInt, paramRect1, paramRect3);
      bool2 = true;
      if (!bool1) {
        return bool2;
      }
      int i = 17;
      if (paramInt != i)
      {
        i = 66;
        if (paramInt != i)
        {
          int j = OooOO0O(paramInt, paramRect1, paramRect2);
          paramInt = OooOOO0(paramInt, paramRect1, paramRect3);
          if (j < paramInt) {
            bool3 = bool2;
          }
          return bool3;
        }
      }
      return bool2;
    }
    return false;
  }
  
  public static boolean OooO0O0(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    int i = 17;
    boolean bool = true;
    int j;
    if (paramInt != i)
    {
      i = 33;
      if (paramInt != i)
      {
        i = 66;
        if (paramInt == i) {
          break label95;
        }
        i = 130;
        if (paramInt != i)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
          throw localIllegalArgumentException;
        }
      }
      paramInt = paramRect2.right;
      i = paramRect1.left;
      if (paramInt >= i)
      {
        paramInt = paramRect2.left;
        j = paramRect1.right;
        if (paramInt <= j) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    label95:
    paramInt = paramRect2.bottom;
    i = paramRect1.top;
    if (paramInt >= i)
    {
      paramInt = paramRect2.top;
      j = paramRect1.bottom;
      if (paramInt <= j) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public static Object OooO0OO(Object paramObject1, FocusStrategy.CollectionAdapter paramCollectionAdapter, FocusStrategy.BoundsAdapter paramBoundsAdapter, Object paramObject2, Rect paramRect, int paramInt)
  {
    Rect localRect1 = new android/graphics/Rect;
    localRect1.<init>(paramRect);
    int i = 17;
    int j = 0;
    if (paramInt != i)
    {
      i = 33;
      if (paramInt != i)
      {
        i = 66;
        if (paramInt != i)
        {
          i = 130;
          if (paramInt == i)
          {
            i = -(paramRect.height() + 1);
          }
          else
          {
            paramObject1 = new java/lang/IllegalArgumentException;
            paramObject1.<init>("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            throw paramObject1;
          }
        }
        else
        {
          i = -(paramRect.width() + 1);
          break label127;
        }
      }
      else
      {
        i = paramRect.height() + 1;
      }
      localRect1.offset(0, i);
      break label135;
    }
    else
    {
      i = paramRect.width() + 1;
    }
    label127:
    localRect1.offset(i, 0);
    label135:
    i = paramCollectionAdapter.OooO0O0(paramObject1);
    Rect localRect2 = new android/graphics/Rect;
    localRect2.<init>();
    Object localObject1 = null;
    while (j < i)
    {
      Object localObject2 = paramCollectionAdapter.OooO00o(paramObject1, j);
      if (localObject2 != paramObject2)
      {
        paramBoundsAdapter.OooO00o(localObject2, localRect2);
        boolean bool = OooO0oo(paramInt, paramRect, localRect2, localRect1);
        if (bool)
        {
          localRect1.set(localRect2);
          localObject1 = localObject2;
        }
      }
      j += 1;
    }
    return localObject1;
  }
  
  public static Object OooO0Oo(Object paramObject1, FocusStrategy.CollectionAdapter paramCollectionAdapter, FocusStrategy.BoundsAdapter paramBoundsAdapter, Object paramObject2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramCollectionAdapter.OooO0O0(paramObject1);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(i);
    int j = 0;
    while (j < i)
    {
      Object localObject = paramCollectionAdapter.OooO00o(paramObject1, j);
      localArrayList.add(localObject);
      j += 1;
    }
    paramObject1 = new androidx/customview/widget/FocusStrategy$SequentialComparator;
    paramObject1.<init>(paramBoolean1, paramBoundsAdapter);
    Collections.sort(localArrayList, paramObject1);
    int k = 1;
    if (paramInt != k)
    {
      k = 2;
      if (paramInt == k) {
        return OooO0o0(paramObject2, localArrayList, paramBoolean2);
      }
      paramObject1 = new java/lang/IllegalArgumentException;
      paramObject1.<init>("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
      throw paramObject1;
    }
    return OooO0o(paramObject2, localArrayList, paramBoolean2);
  }
  
  public static Object OooO0o(Object paramObject, ArrayList paramArrayList, boolean paramBoolean)
  {
    int i = paramArrayList.size();
    int j;
    if (paramObject == null) {
      j = i;
    } else {
      j = paramArrayList.indexOf(paramObject);
    }
    j += -1;
    if (j >= 0) {
      return paramArrayList.get(j);
    }
    if ((paramBoolean) && (i > 0))
    {
      i += -1;
      return paramArrayList.get(i);
    }
    return null;
  }
  
  public static Object OooO0o0(Object paramObject, ArrayList paramArrayList, boolean paramBoolean)
  {
    int i = paramArrayList.size();
    int j;
    if (paramObject == null) {
      j = -1;
    } else {
      j = paramArrayList.lastIndexOf(paramObject);
    }
    j += 1;
    if (j < i) {
      return paramArrayList.get(j);
    }
    if ((paramBoolean) && (i > 0)) {
      return paramArrayList.get(0);
    }
    return null;
  }
  
  public static int OooO0oO(int paramInt1, int paramInt2)
  {
    int i = paramInt1 * 13 * paramInt1;
    paramInt2 *= paramInt2;
    return i + paramInt2;
  }
  
  public static boolean OooO0oo(int paramInt, Rect paramRect1, Rect paramRect2, Rect paramRect3)
  {
    boolean bool1 = OooO(paramRect1, paramRect2, paramInt);
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    bool1 = OooO(paramRect1, paramRect3, paramInt);
    boolean bool3 = true;
    if (!bool1) {
      return bool3;
    }
    bool1 = OooO00o(paramInt, paramRect1, paramRect2, paramRect3);
    if (bool1) {
      return bool3;
    }
    bool1 = OooO00o(paramInt, paramRect1, paramRect3, paramRect2);
    if (bool1) {
      return false;
    }
    int i = OooOO0O(paramInt, paramRect1, paramRect2);
    int j = OooOOOO(paramInt, paramRect1, paramRect2);
    j = OooO0oO(i, j);
    i = OooOO0O(paramInt, paramRect1, paramRect3);
    paramInt = OooOOOO(paramInt, paramRect1, paramRect3);
    paramInt = OooO0oO(i, paramInt);
    if (j < paramInt) {
      bool2 = bool3;
    }
    return bool2;
  }
  
  public static boolean OooOO0(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    int i = 17;
    boolean bool = true;
    if (paramInt != i)
    {
      i = 33;
      if (paramInt != i)
      {
        i = 66;
        if (paramInt != i)
        {
          i = 130;
          if (paramInt == i)
          {
            paramInt = paramRect1.bottom;
            j = paramRect2.top;
            if (paramInt > j) {
              bool = false;
            }
            return bool;
          }
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
          throw localIllegalArgumentException;
        }
        paramInt = paramRect1.right;
        j = paramRect2.left;
        if (paramInt > j) {
          bool = false;
        }
        return bool;
      }
      paramInt = paramRect1.top;
      j = paramRect2.bottom;
      if (paramInt < j) {
        bool = false;
      }
      return bool;
    }
    paramInt = paramRect1.left;
    int j = paramRect2.right;
    if (paramInt < j) {
      bool = false;
    }
    return bool;
  }
  
  public static int OooOO0O(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    paramInt = OooOO0o(paramInt, paramRect1, paramRect2);
    return Math.max(0, paramInt);
  }
  
  public static int OooOO0o(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    int i = 17;
    int j;
    if (paramInt != i)
    {
      i = 33;
      if (paramInt != i)
      {
        i = 66;
        if (paramInt != i)
        {
          i = 130;
          if (paramInt == i)
          {
            paramInt = paramRect2.top;
            j = paramRect1.bottom;
          }
        }
      }
    }
    for (;;)
    {
      return paramInt - j;
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
      throw localIllegalArgumentException;
      paramInt = paramRect2.left;
      j = paramRect1.right;
      continue;
      paramInt = paramRect1.top;
      j = paramRect2.bottom;
      continue;
      paramInt = paramRect1.left;
      j = paramRect2.right;
    }
  }
  
  public static int OooOOO(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    int i = 17;
    int j;
    if (paramInt != i)
    {
      i = 33;
      if (paramInt != i)
      {
        i = 66;
        if (paramInt != i)
        {
          i = 130;
          if (paramInt == i)
          {
            paramInt = paramRect2.bottom;
            j = paramRect1.bottom;
          }
        }
      }
    }
    for (;;)
    {
      return paramInt - j;
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
      throw localIllegalArgumentException;
      paramInt = paramRect2.right;
      j = paramRect1.right;
      continue;
      paramInt = paramRect1.top;
      j = paramRect2.top;
      continue;
      paramInt = paramRect1.left;
      j = paramRect2.left;
    }
  }
  
  public static int OooOOO0(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    paramInt = OooOOO(paramInt, paramRect1, paramRect2);
    return Math.max(1, paramInt);
  }
  
  public static int OooOOOO(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    int i = 17;
    int j;
    if (paramInt != i)
    {
      i = 33;
      if (paramInt != i)
      {
        i = 66;
        if (paramInt == i) {
          break label102;
        }
        i = 130;
        if (paramInt != i)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
          throw localIllegalArgumentException;
        }
      }
      paramInt = paramRect1.left;
      j = paramRect1.width() / 2;
      paramInt += j;
      j = paramRect2.left;
    }
    for (int k = paramRect2.width();; k = paramRect2.height())
    {
      k /= 2;
      j += k;
      return Math.abs(paramInt - j);
      label102:
      paramInt = paramRect1.top;
      j = paramRect1.height() / 2;
      paramInt += j;
      j = paramRect2.top;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.customview.widget.FocusStrategy
 * JD-Core Version:    0.7.0.1
 */