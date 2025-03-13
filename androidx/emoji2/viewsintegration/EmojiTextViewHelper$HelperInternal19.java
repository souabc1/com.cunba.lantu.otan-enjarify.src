package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

class EmojiTextViewHelper$HelperInternal19
  extends EmojiTextViewHelper.HelperInternal
{
  public final TextView OooO00o;
  public final EmojiInputFilter OooO0O0;
  public boolean OooO0OO;
  
  public EmojiTextViewHelper$HelperInternal19(TextView paramTextView)
  {
    this.OooO00o = paramTextView;
    this.OooO0OO = true;
    EmojiInputFilter localEmojiInputFilter = new androidx/emoji2/viewsintegration/EmojiInputFilter;
    localEmojiInputFilter.<init>(paramTextView);
    this.OooO0O0 = localEmojiInputFilter;
  }
  
  public final TransformationMethod OooO(TransformationMethod paramTransformationMethod)
  {
    boolean bool = paramTransformationMethod instanceof EmojiTransformationMethod;
    if (bool) {
      return (TransformationMethod)paramTransformationMethod;
    }
    bool = paramTransformationMethod instanceof PasswordTransformationMethod;
    if (bool) {
      return (TransformationMethod)paramTransformationMethod;
    }
    EmojiTransformationMethod localEmojiTransformationMethod = new androidx/emoji2/viewsintegration/EmojiTransformationMethod;
    localEmojiTransformationMethod.<init>(paramTransformationMethod);
    return localEmojiTransformationMethod;
  }
  
  public InputFilter[] OooO00o(InputFilter[] paramArrayOfInputFilter)
  {
    boolean bool = this.OooO0OO;
    if (!bool) {
      return OooO0o0(paramArrayOfInputFilter);
    }
    return OooO0OO(paramArrayOfInputFilter);
  }
  
  public TransformationMethod OooO0O0(TransformationMethod paramTransformationMethod)
  {
    boolean bool = this.OooO0OO;
    if (bool) {
      return OooO(paramTransformationMethod);
    }
    return OooO0o(paramTransformationMethod);
  }
  
  public final InputFilter[] OooO0OO(InputFilter[] paramArrayOfInputFilter)
  {
    int i = paramArrayOfInputFilter.length;
    int j = 0;
    InputFilter[] arrayOfInputFilter = null;
    while (j < i)
    {
      InputFilter localInputFilter = paramArrayOfInputFilter[j];
      EmojiInputFilter localEmojiInputFilter = this.OooO0O0;
      if (localInputFilter == localEmojiInputFilter) {
        return paramArrayOfInputFilter;
      }
      j += 1;
    }
    arrayOfInputFilter = new InputFilter[paramArrayOfInputFilter.length + 1];
    System.arraycopy(paramArrayOfInputFilter, 0, arrayOfInputFilter, 0, i);
    paramArrayOfInputFilter = this.OooO0O0;
    arrayOfInputFilter[i] = paramArrayOfInputFilter;
    return arrayOfInputFilter;
  }
  
  public final SparseArray OooO0Oo(InputFilter[] paramArrayOfInputFilter)
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>(1);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfInputFilter.length;
      if (i >= j) {
        break;
      }
      InputFilter localInputFilter = paramArrayOfInputFilter[i];
      boolean bool = localInputFilter instanceof EmojiInputFilter;
      if (bool) {
        localSparseArray.put(i, localInputFilter);
      }
      i += 1;
    }
    return localSparseArray;
  }
  
  public final TransformationMethod OooO0o(TransformationMethod paramTransformationMethod)
  {
    boolean bool = paramTransformationMethod instanceof EmojiTransformationMethod;
    if (bool) {
      paramTransformationMethod = ((EmojiTransformationMethod)paramTransformationMethod).getOriginalTransformationMethod();
    }
    return paramTransformationMethod;
  }
  
  public final InputFilter[] OooO0o0(InputFilter[] paramArrayOfInputFilter)
  {
    SparseArray localSparseArray = OooO0Oo(paramArrayOfInputFilter);
    int i = localSparseArray.size();
    if (i == 0) {
      return paramArrayOfInputFilter;
    }
    i = paramArrayOfInputFilter.length;
    int j = paramArrayOfInputFilter.length;
    int k = localSparseArray.size();
    j -= k;
    InputFilter[] arrayOfInputFilter = new InputFilter[j];
    k = 0;
    int m = 0;
    while (k < i)
    {
      int n = localSparseArray.indexOfKey(k);
      if (n < 0)
      {
        InputFilter localInputFilter = paramArrayOfInputFilter[k];
        arrayOfInputFilter[m] = localInputFilter;
        m += 1;
      }
      k += 1;
    }
    return arrayOfInputFilter;
  }
  
  public final void OooO0oO()
  {
    InputFilter[] arrayOfInputFilter = this.OooO00o.getFilters();
    TextView localTextView = this.OooO00o;
    arrayOfInputFilter = OooO00o(arrayOfInputFilter);
    localTextView.setFilters(arrayOfInputFilter);
  }
  
  public void OooO0oo()
  {
    TransformationMethod localTransformationMethod = this.OooO00o.getTransformationMethod();
    localTransformationMethod = OooO0O0(localTransformationMethod);
    this.OooO00o.setTransformationMethod(localTransformationMethod);
  }
  
  public boolean isEnabled()
  {
    return this.OooO0OO;
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    if (paramBoolean) {
      OooO0oo();
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.OooO0OO = paramBoolean;
    OooO0oo();
    OooO0oO();
  }
  
  public void setEnabledUnsafe(boolean paramBoolean)
  {
    this.OooO0OO = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19
 * JD-Core Version:    0.7.0.1
 */