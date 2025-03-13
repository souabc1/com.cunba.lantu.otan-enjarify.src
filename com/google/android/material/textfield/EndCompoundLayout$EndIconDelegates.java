package com.google.android.material.textfield;

import android.util.SparseArray;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.styleable;
import m54207b69;

class EndCompoundLayout$EndIconDelegates
{
  private final int customEndIconDrawableId;
  private final SparseArray delegates;
  private final EndCompoundLayout endLayout;
  private final int passwordIconDrawableId;
  
  public EndCompoundLayout$EndIconDelegates(EndCompoundLayout paramEndCompoundLayout, TintTypedArray paramTintTypedArray)
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    this.delegates = localSparseArray;
    this.endLayout = paramEndCompoundLayout;
    int i = R.styleable.TextInputLayout_endIconDrawable;
    i = paramTintTypedArray.OooOO0O(i, 0);
    this.customEndIconDrawableId = i;
    i = R.styleable.TextInputLayout_passwordToggleDrawable;
    i = paramTintTypedArray.OooOO0O(i, 0);
    this.passwordIconDrawableId = i;
  }
  
  private EndIconDelegate create(int paramInt)
  {
    int i = -1;
    if (paramInt != i)
    {
      if (paramInt != 0)
      {
        i = 1;
        if (paramInt != i)
        {
          i = 2;
          if (paramInt != i)
          {
            i = 3;
            if (paramInt == i)
            {
              localObject1 = new com/google/android/material/textfield/DropdownMenuEndIconDelegate;
              localObject2 = this.endLayout;
              ((DropdownMenuEndIconDelegate)localObject1).<init>((EndCompoundLayout)localObject2);
              return localObject1;
            }
            localObject2 = new java/lang/IllegalArgumentException;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            String str = m54207b69.F54207b69_11("VD0D2B34282C32266B29332A6F39343939743A3D3335937A");
            localStringBuilder.append(str);
            localStringBuilder.append(paramInt);
            localObject1 = localStringBuilder.toString();
            ((IllegalArgumentException)localObject2).<init>((String)localObject1);
            throw ((Throwable)localObject2);
          }
          localObject1 = new com/google/android/material/textfield/ClearTextEndIconDelegate;
          localObject2 = this.endLayout;
          ((ClearTextEndIconDelegate)localObject1).<init>((EndCompoundLayout)localObject2);
          return localObject1;
        }
        localObject1 = new com/google/android/material/textfield/PasswordToggleEndIconDelegate;
        localObject2 = this.endLayout;
        int j = this.passwordIconDrawableId;
        ((PasswordToggleEndIconDelegate)localObject1).<init>((EndCompoundLayout)localObject2, j);
        return localObject1;
      }
      localObject1 = new com/google/android/material/textfield/NoEndIconDelegate;
      localObject2 = this.endLayout;
      ((NoEndIconDelegate)localObject1).<init>((EndCompoundLayout)localObject2);
      return localObject1;
    }
    Object localObject1 = new com/google/android/material/textfield/CustomEndIconDelegate;
    Object localObject2 = this.endLayout;
    ((CustomEndIconDelegate)localObject1).<init>((EndCompoundLayout)localObject2);
    return localObject1;
  }
  
  public EndIconDelegate get(int paramInt)
  {
    EndIconDelegate localEndIconDelegate = (EndIconDelegate)this.delegates.get(paramInt);
    if (localEndIconDelegate == null)
    {
      localEndIconDelegate = create(paramInt);
      SparseArray localSparseArray = this.delegates;
      localSparseArray.append(paramInt, localEndIconDelegate);
    }
    return localEndIconDelegate;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.EndCompoundLayout.EndIconDelegates
 * JD-Core Version:    0.7.0.1
 */