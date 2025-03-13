package androidx.recyclerview.widget;

import android.view.View;

class LayoutState
{
  public boolean OooO;
  public boolean OooO00o = true;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o = 0;
  public int OooO0o0;
  public int OooO0oO = 0;
  public boolean OooO0oo;
  
  public boolean OooO00o(RecyclerView.State paramState)
  {
    int i = this.OooO0OO;
    if (i >= 0)
    {
      j = paramState.getItemCount();
      if (i < j) {
        return 1;
      }
    }
    int j = 0;
    paramState = null;
    return j;
  }
  
  public View OooO0O0(RecyclerView.Recycler paramRecycler)
  {
    int i = this.OooO0OO;
    paramRecycler = paramRecycler.getViewForPosition(i);
    i = this.OooO0OO;
    int j = this.OooO0Oo;
    i += j;
    this.OooO0OO = i;
    return paramRecycler;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("LayoutState{mAvailable=");
    int i = this.OooO0O0;
    localStringBuilder.append(i);
    localStringBuilder.append(", mCurrentPosition=");
    i = this.OooO0OO;
    localStringBuilder.append(i);
    localStringBuilder.append(", mItemDirection=");
    i = this.OooO0Oo;
    localStringBuilder.append(i);
    localStringBuilder.append(", mLayoutDirection=");
    i = this.OooO0o0;
    localStringBuilder.append(i);
    localStringBuilder.append(", mStartLine=");
    i = this.OooO0o;
    localStringBuilder.append(i);
    localStringBuilder.append(", mEndLine=");
    i = this.OooO0oO;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.LayoutState
 * JD-Core Version:    0.7.0.1
 */