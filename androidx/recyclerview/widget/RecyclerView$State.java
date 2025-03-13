package androidx.recyclerview.widget;

import android.util.SparseArray;

public class RecyclerView$State
{
  public boolean OooO = false;
  public int OooO00o = -1;
  public SparseArray OooO0O0;
  public int OooO0OO = 0;
  public int OooO0Oo = 0;
  public int OooO0o = 0;
  public int OooO0o0 = 1;
  public boolean OooO0oO = false;
  public boolean OooO0oo = false;
  public boolean OooOO0 = false;
  public boolean OooOO0O = false;
  public boolean OooOO0o = false;
  public long OooOOO;
  public int OooOOO0;
  public int OooOOOO;
  public int OooOOOo;
  public int OooOOo0;
  
  public void OooO00o(int paramInt)
  {
    int i = this.OooO0o0 & paramInt;
    if (i != 0) {
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Layout state should be one of ");
    String str = Integer.toBinaryString(paramInt);
    localStringBuilder.append(str);
    localStringBuilder.append(" but it is ");
    str = Integer.toBinaryString(this.OooO0o0);
    localStringBuilder.append(str);
    str = localStringBuilder.toString();
    localIllegalStateException.<init>(str);
    throw localIllegalStateException;
  }
  
  public boolean OooO0O0()
  {
    int i = this.OooO00o;
    int j = -1;
    if (i != j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void OooO0OO(RecyclerView.Adapter paramAdapter)
  {
    this.OooO0o0 = 1;
    int i = paramAdapter.getItemCount();
    this.OooO0o = i;
    this.OooO0oo = false;
    this.OooO = false;
    this.OooOO0 = false;
  }
  
  public boolean OooO0Oo()
  {
    return this.OooOO0o;
  }
  
  public Object get(int paramInt)
  {
    SparseArray localSparseArray = this.OooO0O0;
    if (localSparseArray == null) {
      return null;
    }
    return localSparseArray.get(paramInt);
  }
  
  public int getItemCount()
  {
    boolean bool = this.OooO0oo;
    int i;
    if (bool)
    {
      i = this.OooO0OO;
      int j = this.OooO0Oo;
      i -= j;
    }
    else
    {
      i = this.OooO0o;
    }
    return i;
  }
  
  public int getRemainingScrollHorizontal()
  {
    return this.OooOOOo;
  }
  
  public int getRemainingScrollVertical()
  {
    return this.OooOOo0;
  }
  
  public int getTargetScrollPosition()
  {
    return this.OooO00o;
  }
  
  public boolean isMeasuring()
  {
    return this.OooOO0;
  }
  
  public boolean isPreLayout()
  {
    return this.OooO0oo;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("State{mTargetPosition=");
    int i = this.OooO00o;
    localStringBuilder.append(i);
    localStringBuilder.append(", mData=");
    SparseArray localSparseArray = this.OooO0O0;
    localStringBuilder.append(localSparseArray);
    localStringBuilder.append(", mItemCount=");
    i = this.OooO0o;
    localStringBuilder.append(i);
    localStringBuilder.append(", mIsMeasuring=");
    boolean bool1 = this.OooOO0;
    localStringBuilder.append(bool1);
    localStringBuilder.append(", mPreviousLayoutItemCount=");
    int j = this.OooO0OO;
    localStringBuilder.append(j);
    localStringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
    j = this.OooO0Oo;
    localStringBuilder.append(j);
    localStringBuilder.append(", mStructureChanged=");
    boolean bool2 = this.OooO0oO;
    localStringBuilder.append(bool2);
    localStringBuilder.append(", mInPreLayout=");
    bool2 = this.OooO0oo;
    localStringBuilder.append(bool2);
    localStringBuilder.append(", mRunSimpleAnimations=");
    bool2 = this.OooOO0O;
    localStringBuilder.append(bool2);
    localStringBuilder.append(", mRunPredictiveAnimations=");
    bool2 = this.OooOO0o;
    localStringBuilder.append(bool2);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.State
 * JD-Core Version:    0.7.0.1
 */