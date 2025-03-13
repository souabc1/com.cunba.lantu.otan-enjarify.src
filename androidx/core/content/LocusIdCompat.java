package androidx.core.content;

import android.content.LocusId;

public final class LocusIdCompat
{
  public final String OooO00o;
  public final LocusId OooO0O0;
  
  private String getSanitizedId()
  {
    int i = this.OooO00o.length();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(i);
    localStringBuilder.append("_chars");
    return localStringBuilder.toString();
  }
  
  public LocusId OooO00o()
  {
    return this.OooO0O0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return bool;
    }
    if (paramObject == null) {
      return false;
    }
    Object localObject = LocusIdCompat.class;
    Class localClass = paramObject.getClass();
    if (localObject != localClass) {
      return false;
    }
    paramObject = (LocusIdCompat)paramObject;
    localObject = this.OooO00o;
    paramObject = paramObject.OooO00o;
    if (localObject == null)
    {
      if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    return ((String)localObject).equals(paramObject);
  }
  
  public String getId()
  {
    return this.OooO00o;
  }
  
  public int hashCode()
  {
    String str = this.OooO00o;
    int i;
    if (str == null)
    {
      i = 0;
      str = null;
    }
    else
    {
      i = str.hashCode();
    }
    return 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("LocusIdCompat[");
    String str = getSanitizedId();
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.LocusIdCompat
 * JD-Core Version:    0.7.0.1
 */