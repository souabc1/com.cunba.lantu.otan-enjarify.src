package androidx.appcompat.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class ActivityChooserModel$HistoricalRecord
{
  public final ComponentName OooO00o;
  public final long OooO0O0;
  public final float OooO0OO;
  
  public ActivityChooserModel$HistoricalRecord(ComponentName paramComponentName, long paramLong, float paramFloat)
  {
    this.OooO00o = paramComponentName;
    this.OooO0O0 = paramLong;
    this.OooO0OO = paramFloat;
  }
  
  public ActivityChooserModel$HistoricalRecord(String paramString, long paramLong, float paramFloat)
  {
    this(paramString, paramLong, paramFloat);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    if (paramObject == null) {
      return false;
    }
    Object localObject1 = HistoricalRecord.class;
    Object localObject2 = paramObject.getClass();
    if (localObject1 != localObject2) {
      return false;
    }
    paramObject = (HistoricalRecord)paramObject;
    localObject1 = this.OooO00o;
    if (localObject1 == null)
    {
      localObject1 = paramObject.OooO00o;
      if (localObject1 != null) {
        return false;
      }
    }
    else
    {
      localObject2 = paramObject.OooO00o;
      bool2 = ((ComponentName)localObject1).equals(localObject2);
      if (!bool2) {
        return false;
      }
    }
    long l1 = this.OooO0O0;
    long l2 = paramObject.OooO0O0;
    boolean bool2 = l1 < l2;
    if (bool2) {
      return false;
    }
    float f1 = this.OooO0OO;
    int i = Float.floatToIntBits(f1);
    float f2 = paramObject.OooO0OO;
    int j = Float.floatToIntBits(f2);
    if (i != j) {
      return false;
    }
    return bool1;
  }
  
  public int hashCode()
  {
    ComponentName localComponentName = this.OooO00o;
    if (localComponentName == null)
    {
      i = 0;
      localComponentName = null;
    }
    else
    {
      i = localComponentName.hashCode();
    }
    int j = 31;
    int i = (i + j) * j;
    long l1 = this.OooO0O0;
    long l2 = l1 >>> 32;
    int k = (int)(l1 ^ l2);
    i = (i + k) * j;
    j = Float.floatToIntBits(this.OooO0OO);
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[");
    localStringBuilder.append("; activity:");
    Object localObject = this.OooO00o;
    localStringBuilder.append(localObject);
    localStringBuilder.append("; time:");
    long l = this.OooO0O0;
    localStringBuilder.append(l);
    localStringBuilder.append("; weight:");
    localObject = new java/math/BigDecimal;
    double d = this.OooO0OO;
    ((BigDecimal)localObject).<init>(d);
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord
 * JD-Core Version:    0.7.0.1
 */