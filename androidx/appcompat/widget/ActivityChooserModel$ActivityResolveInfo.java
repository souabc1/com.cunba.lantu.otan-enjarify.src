package androidx.appcompat.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class ActivityChooserModel$ActivityResolveInfo
  implements Comparable
{
  public final ResolveInfo o00OoOoo;
  public float o00Ooo00;
  
  public ActivityChooserModel$ActivityResolveInfo(ResolveInfo paramResolveInfo)
  {
    this.o00OoOoo = paramResolveInfo;
  }
  
  public int OooO0O0(ActivityResolveInfo paramActivityResolveInfo)
  {
    int i = Float.floatToIntBits(paramActivityResolveInfo.o00Ooo00);
    int j = Float.floatToIntBits(this.o00Ooo00);
    return i - j;
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
    ActivityResolveInfo localActivityResolveInfo = ActivityResolveInfo.class;
    Class localClass = paramObject.getClass();
    if (localActivityResolveInfo != localClass) {
      return false;
    }
    paramObject = (ActivityResolveInfo)paramObject;
    float f1 = this.o00Ooo00;
    int i = Float.floatToIntBits(f1);
    float f2 = paramObject.o00Ooo00;
    int j = Float.floatToIntBits(f2);
    if (i != j) {
      return false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return Float.floatToIntBits(this.o00Ooo00) + 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[");
    localStringBuilder.append("resolveInfo:");
    Object localObject = this.o00OoOoo.toString();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("; weight:");
    localObject = new java/math/BigDecimal;
    double d = this.o00Ooo00;
    ((BigDecimal)localObject).<init>(d);
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo
 * JD-Core Version:    0.7.0.1
 */