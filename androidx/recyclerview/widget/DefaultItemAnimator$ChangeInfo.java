package androidx.recyclerview.widget;

class DefaultItemAnimator$ChangeInfo
{
  public RecyclerView.ViewHolder OooO00o;
  public RecyclerView.ViewHolder OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  
  public DefaultItemAnimator$ChangeInfo(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2)
  {
    this.OooO00o = paramViewHolder1;
    this.OooO0O0 = paramViewHolder2;
  }
  
  public DefaultItemAnimator$ChangeInfo(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramViewHolder1, paramViewHolder2);
    this.OooO0OO = paramInt1;
    this.OooO0Oo = paramInt2;
    this.OooO0o0 = paramInt3;
    this.OooO0o = paramInt4;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("ChangeInfo{oldHolder=");
    RecyclerView.ViewHolder localViewHolder = this.OooO00o;
    localStringBuilder.append(localViewHolder);
    localStringBuilder.append(", newHolder=");
    localViewHolder = this.OooO0O0;
    localStringBuilder.append(localViewHolder);
    localStringBuilder.append(", fromX=");
    int i = this.OooO0OO;
    localStringBuilder.append(i);
    localStringBuilder.append(", fromY=");
    i = this.OooO0Oo;
    localStringBuilder.append(i);
    localStringBuilder.append(", toX=");
    i = this.OooO0o0;
    localStringBuilder.append(i);
    localStringBuilder.append(", toY=");
    i = this.OooO0o;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo
 * JD-Core Version:    0.7.0.1
 */