package androidx.recyclerview.widget;

public class SortedList
{
  public Object[] OooO00o;
  public Object[] OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o0;
  
  public Object get(int paramInt)
  {
    int i = this.OooO0o0;
    if ((paramInt < i) && (paramInt >= 0))
    {
      localObject = this.OooO0O0;
      if (localObject != null)
      {
        int j = this.OooO0Oo;
        if (paramInt >= j)
        {
          paramInt -= j;
          j = this.OooO0OO;
          paramInt += j;
          return localObject[paramInt];
        }
      }
      return this.OooO00o[paramInt];
    }
    Object localObject = new java/lang/IndexOutOfBoundsException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Asked to get item at ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" but size is ");
    paramInt = this.OooO0o0;
    localStringBuilder.append(paramInt);
    String str = localStringBuilder.toString();
    ((IndexOutOfBoundsException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.SortedList
 * JD-Core Version:    0.7.0.1
 */