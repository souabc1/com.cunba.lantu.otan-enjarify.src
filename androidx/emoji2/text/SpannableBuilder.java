package androidx.emoji2.text;

import android.text.SpannableStringBuilder;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class SpannableBuilder
  extends SpannableStringBuilder
{
  public final Class o00OoOoo;
  public final List o00Ooo00;
  
  public SpannableBuilder(Class paramClass, CharSequence paramCharSequence)
  {
    super(paramCharSequence);
    paramCharSequence = new java/util/ArrayList;
    paramCharSequence.<init>();
    this.o00Ooo00 = paramCharSequence;
    Preconditions.OooO(paramClass, "watcherClass cannot be null");
    this.o00OoOoo = paramClass;
  }
  
  public SpannableBuilder(Class paramClass, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super(paramCharSequence, paramInt1, paramInt2);
    paramCharSequence = new java/util/ArrayList;
    paramCharSequence.<init>();
    this.o00Ooo00 = paramCharSequence;
    Preconditions.OooO(paramClass, "watcherClass cannot be null");
    this.o00OoOoo = paramClass;
  }
  
  public static SpannableBuilder OooO0OO(Class paramClass, CharSequence paramCharSequence)
  {
    SpannableBuilder localSpannableBuilder = new androidx/emoji2/text/SpannableBuilder;
    localSpannableBuilder.<init>(paramClass, paramCharSequence);
    return localSpannableBuilder;
  }
  
  public final void OooO()
  {
    int i = 0;
    for (;;)
    {
      Object localObject = this.o00Ooo00;
      int j = ((List)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (SpannableBuilder.WatcherWrapper)this.o00Ooo00.get(i);
      ((SpannableBuilder.WatcherWrapper)localObject).OooO0OO();
      i += 1;
    }
  }
  
  public void OooO00o()
  {
    OooO0O0();
  }
  
  public final void OooO0O0()
  {
    int i = 0;
    for (;;)
    {
      Object localObject = this.o00Ooo00;
      int j = ((List)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (SpannableBuilder.WatcherWrapper)this.o00Ooo00.get(i);
      ((SpannableBuilder.WatcherWrapper)localObject).OooO00o();
      i += 1;
    }
  }
  
  public void OooO0Oo()
  {
    OooO();
    OooO0o0();
  }
  
  public final SpannableBuilder.WatcherWrapper OooO0o(Object paramObject)
  {
    int i = 0;
    for (;;)
    {
      Object localObject1 = this.o00Ooo00;
      int j = ((List)localObject1).size();
      if (i >= j) {
        break;
      }
      localObject1 = (SpannableBuilder.WatcherWrapper)this.o00Ooo00.get(i);
      Object localObject2 = ((SpannableBuilder.WatcherWrapper)localObject1).o00OoOoo;
      if (localObject2 == paramObject) {
        return localObject1;
      }
      i += 1;
    }
    return null;
  }
  
  public final void OooO0o0()
  {
    int i = 0;
    for (;;)
    {
      Object localObject = this.o00Ooo00;
      int j = ((List)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (SpannableBuilder.WatcherWrapper)this.o00Ooo00.get(i);
      int k = length();
      int m = length();
      ((SpannableBuilder.WatcherWrapper)localObject).onTextChanged(this, 0, k, m);
      i += 1;
    }
  }
  
  public final boolean OooO0oO(Class paramClass)
  {
    Class localClass = this.o00OoOoo;
    boolean bool;
    if (localClass == paramClass)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramClass = null;
    }
    return bool;
  }
  
  public final boolean OooO0oo(Object paramObject)
  {
    if (paramObject != null)
    {
      paramObject = paramObject.getClass();
      bool = OooO0oO(paramObject);
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    paramObject = null;
    return bool;
  }
  
  public SpannableStringBuilder append(char paramChar)
  {
    super.append(paramChar);
    return this;
  }
  
  public SpannableStringBuilder append(CharSequence paramCharSequence)
  {
    super.append(paramCharSequence);
    return this;
  }
  
  public SpannableStringBuilder append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public SpannableStringBuilder append(CharSequence paramCharSequence, Object paramObject, int paramInt)
  {
    super.append(paramCharSequence, paramObject, paramInt);
    return this;
  }
  
  public SpannableStringBuilder delete(int paramInt1, int paramInt2)
  {
    super.delete(paramInt1, paramInt2);
    return this;
  }
  
  public int getSpanEnd(Object paramObject)
  {
    boolean bool = OooO0oo(paramObject);
    if (bool)
    {
      SpannableBuilder.WatcherWrapper localWatcherWrapper = OooO0o(paramObject);
      if (localWatcherWrapper != null) {
        paramObject = localWatcherWrapper;
      }
    }
    return super.getSpanEnd(paramObject);
  }
  
  public int getSpanFlags(Object paramObject)
  {
    boolean bool = OooO0oo(paramObject);
    if (bool)
    {
      SpannableBuilder.WatcherWrapper localWatcherWrapper = OooO0o(paramObject);
      if (localWatcherWrapper != null) {
        paramObject = localWatcherWrapper;
      }
    }
    return super.getSpanFlags(paramObject);
  }
  
  public int getSpanStart(Object paramObject)
  {
    boolean bool = OooO0oo(paramObject);
    if (bool)
    {
      SpannableBuilder.WatcherWrapper localWatcherWrapper = OooO0o(paramObject);
      if (localWatcherWrapper != null) {
        paramObject = localWatcherWrapper;
      }
    }
    return super.getSpanStart(paramObject);
  }
  
  public Object[] getSpans(int paramInt1, int paramInt2, Class paramClass)
  {
    boolean bool = OooO0oO(paramClass);
    if (bool)
    {
      Object localObject = SpannableBuilder.WatcherWrapper.class;
      SpannableBuilder.WatcherWrapper[] arrayOfWatcherWrapper = (SpannableBuilder.WatcherWrapper[])super.getSpans(paramInt1, paramInt2, (Class)localObject);
      paramInt2 = arrayOfWatcherWrapper.length;
      Object[] arrayOfObject = (Object[])Array.newInstance(paramClass, paramInt2);
      int j = 0;
      paramClass = null;
      for (;;)
      {
        int i = arrayOfWatcherWrapper.length;
        if (j >= i) {
          break;
        }
        localObject = arrayOfWatcherWrapper[j].o00OoOoo;
        arrayOfObject[j] = localObject;
        j += 1;
      }
      return arrayOfObject;
    }
    return super.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public SpannableStringBuilder insert(int paramInt, CharSequence paramCharSequence)
  {
    super.insert(paramInt, paramCharSequence);
    return this;
  }
  
  public SpannableStringBuilder insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3)
  {
    super.insert(paramInt1, paramCharSequence, paramInt2, paramInt3);
    return this;
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    if (paramClass != null)
    {
      boolean bool = OooO0oO(paramClass);
      if (!bool) {}
    }
    else
    {
      paramClass = SpannableBuilder.WatcherWrapper.class;
    }
    return super.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public void removeSpan(Object paramObject)
  {
    boolean bool = OooO0oo(paramObject);
    SpannableBuilder.WatcherWrapper localWatcherWrapper;
    if (bool)
    {
      localWatcherWrapper = OooO0o(paramObject);
      if (localWatcherWrapper != null) {
        paramObject = localWatcherWrapper;
      }
    }
    else
    {
      bool = false;
      localWatcherWrapper = null;
    }
    super.removeSpan(paramObject);
    if (localWatcherWrapper != null)
    {
      paramObject = this.o00Ooo00;
      paramObject.remove(localWatcherWrapper);
    }
  }
  
  public SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence)
  {
    OooO0O0();
    super.replace(paramInt1, paramInt2, paramCharSequence);
    OooO();
    return this;
  }
  
  public SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4)
  {
    OooO0O0();
    super.replace(paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
    OooO();
    return this;
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = OooO0oo(paramObject);
    if (bool)
    {
      SpannableBuilder.WatcherWrapper localWatcherWrapper = new androidx/emoji2/text/SpannableBuilder$WatcherWrapper;
      localWatcherWrapper.<init>(paramObject);
      this.o00Ooo00.add(localWatcherWrapper);
      paramObject = localWatcherWrapper;
    }
    super.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    SpannableBuilder localSpannableBuilder = new androidx/emoji2/text/SpannableBuilder;
    Class localClass = this.o00OoOoo;
    localSpannableBuilder.<init>(localClass, this, paramInt1, paramInt2);
    return localSpannableBuilder;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.SpannableBuilder
 * JD-Core Version:    0.7.0.1
 */